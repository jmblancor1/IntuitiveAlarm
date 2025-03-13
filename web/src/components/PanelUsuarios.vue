<template>
  <div class="container-center-horizontal">
    <div class="panel-usuarios screen">
      <div class="rectangle-1478"></div>
      <sidebar-panel3
          :reloj1Props="sidebarPanel3Props.reloj1Props"
          :frame30068Props="sidebarPanel3Props.frame30068Props"
          :panel3Props="sidebarPanel3Props.panel3Props"
      />
      <div class="flex-col-4">
        <div class="buttonfilled-container-2">
          <button-filled1
              :className="buttonFilled1Props.className"
              :xButtonProps="buttonFilled1Props.xButtonProps"
          />
          <button
              style="
              margin-left: 16px;
              padding: 12px 32px;
              border-radius: 11px;
              border: none;
              background: #00796b;
              color: #fff;
              cursor: pointer;
            "
              @click="abrirModalAgregar"
          >
            Agregar Usuario
          </button>
        </div>
        <div class="tabla-usuarios">
          <table>
            <thead>
            <tr>
              <th>Nombres</th>
              <th>Correo</th>
              <th>Acciones</th>
            </tr>
            </thead>
            <tbody>
            <tr
                v-for="(usuario, index) in listaUsuarios"
                :key="index"
            >
              <td>{{ usuario.nombre }}</td>
              <td>{{ usuario.correo }}</td>
              <td class="acciones-cell">
                <img
                    class="icono-accion icono-eliminar"
                    :src="iconEliminar"
                    alt="Eliminar"
                    @click="eliminarUsuario(usuario.id)"
                />
                <img
                    class="icono-accion icono-editar"
                    :src="iconEditar"
                    alt="Editar"
                    @click="abrirModal(usuario)"
                />
              </td>
            </tr>
            </tbody>
          </table>
        </div>
      </div>
      <modal-editar-usuario
          v-if="showModal"
          :usuario="usuarioSeleccionado"
          @guardar="actualizarUsuario"
          @cerrar="cerrarModal"
      />
      <modal-agregar-usuario
          v-if="showModalAgregar"
          @guardar="crearUsuario"
          @cerrar="cerrarModalAgregar"
      />
    </div>
  </div>
</template>

<script>
import SidebarPanel3 from "./SidebarPanel3";
import ButtonFilled1 from "./BotonLlenoSecundario.vue";
import ButtonFilled12 from "./BotonLlenoPrimario.vue";
import ModalEditarUsuario from "./ModalEditarUsuario";
import ModalAgregarUsuario from "./ModalAgregarUsuario";

export default {
  name: "PanelUsuarios",
  components: {
    SidebarPanel3,
    ButtonFilled1,
    ButtonFilled12,
    ModalEditarUsuario,
    ModalAgregarUsuario,
  },
  props: [
    "sidebarPanel3Props",
    "buttonFilled1Props",
    "buttonFilled12Props",
  ],
  data() {
    return {
      listaUsuarios: [
        { id: 1, nombre: "Corinna", correo: "corinna@gmail.com" },
        { id: 2, nombre: "Mom", correo: "mom@yahoo.es" },
      ],
      showModal: false,
      showModalAgregar: false,
      usuarioSeleccionado: null,
      iconEliminar: "/img/icon-3.svg",
      iconEditar: "/img/edit.svg",
    };
  },
  methods: {
    eliminarUsuario(id) {
      this.listaUsuarios = this.listaUsuarios.filter(u => u.id !== id);
    },
    abrirModal(usuario) {
      this.usuarioSeleccionado = { ...usuario };
      this.showModal = true;
    },
    cerrarModal() {
      this.showModal = false;
      this.usuarioSeleccionado = null;
    },
    actualizarUsuario(usuarioEditado) {
      const idx = this.listaUsuarios.findIndex(u => u.id === usuarioEditado.id);
      if (idx >= 0) {
        this.listaUsuarios.splice(idx, 1, usuarioEditado);
      }
      this.cerrarModal();
    },
    abrirModalAgregar() {
      this.showModalAgregar = true;
    },
    cerrarModalAgregar() {
      this.showModalAgregar = false;
    },
    crearUsuario(nuevoUsuario) {
      const nuevoId = this.listaUsuarios.length
          ? Math.max(...this.listaUsuarios.map(u => u.id)) + 1
          : 1;
      this.listaUsuarios.push({
        id: nuevoId,
        ...nuevoUsuario,
      });
      this.cerrarModalAgregar();
    },
  },
};
</script>

<style scoped>
.panel-usuarios {
  align-items: flex-start;
  background-color: var(--white);
  display: flex;
  height: 789px;
  overflow: hidden;
  position: relative;
  width: 1440px;
}
.rectangle-1478 {
  background-color: #96797940;
  height: 4032px;
  margin-left: -7331px;
  margin-top: -782px;
  width: 5376px;
}
.flex-col-4 {
  align-items: center;
  display: flex;
  flex-direction: column;
  margin-top: -2px;
  min-height: 316px;
  width: 1199px;
}
.buttonfilled-container-2 {
  align-items: flex-start;
  background-color: var(--grey-5);
  display: flex;
  gap: 8px;
  height: 104px;
  justify-content: flex-end;
  min-width: 1199px;
  padding: 12px 7px;
  position: relative;
}
.tabla-usuarios {
  margin-top: 32px;
  width: 100%;
  padding: 0 24px;
  display: flex;
  justify-content: center;
}
.tabla-usuarios table {
  max-width: 900px;
  width: 100%;
  border-collapse: collapse;
  border: 1px solid #ccc;
  border-radius: 8px;
  overflow: hidden;
  background-color: #fff;
  font-family: "Archivo", sans-serif;
}
.tabla-usuarios thead {
  background-color: var(--color-panel);
}
.tabla-usuarios thead tr {
  border-bottom: 2px solid var(--color-panel-izq);
}
.tabla-usuarios th {
  text-align: left;
  padding: 12px;
  font-weight: 600;
  color: #333;
  font-size: 14px;
}
.tabla-usuarios td {
  padding: 12px;
  border-bottom: 1px solid #ccc;
  font-size: 14px;
  color: #444;
}
.tabla-usuarios tr:nth-child(even) {
  background-color: #fafafa;
}
.acciones-cell {
  display: flex;
  align-items: center;
  gap: 12px;
}
.icono-accion {
  cursor: pointer;
  width: 24px;
  height: 24px;
  transition: opacity 0.2s;
}
.icono-accion:hover {
  opacity: 0.8;
}
</style>
