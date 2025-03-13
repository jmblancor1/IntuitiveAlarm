<template>
  <div class="overlay" @click.self="cerrarModal">
    <div class="modal-contenido">
      <h2 class="titulo">Agregar usuario</h2>
      <div class="campo">
        <label class="etiqueta">Nombres</label>
        <input
            type="text"
            v-model="usuarioLocal.nombre"
            class="input-text"
        />
        <div class="supporting-text">Supporting text</div>
      </div>
      <div class="campo">
        <label class="etiqueta">Correo</label>
        <input
            type="email"
            v-model="usuarioLocal.correo"
            class="input-text"
        />
        <div class="supporting-text">Supporting text</div>
      </div>
      <div class="campo">
        <label class="etiqueta">Teléfono</label>
        <input
            type="text"
            v-model="usuarioLocal.telefono"
            class="input-text"
        />
        <div class="supporting-text">Supporting text</div>
      </div>
      <div class="botones-accion">
        <button class="btn-cancelar" @click="cerrarModal">Cancelar</button>
        <button class="btn-editar" @click="guardarCambios">Guardar</button>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "ModalAgregarUsuario",
  data() {
    return {
      usuarioLocal: {
        nombre: "",
        correo: "",
        telefono: ""
      }
    };
  },
  methods: {
    guardarCambios() {
      this.$emit("guardar", this.usuarioLocal);
    },
    cerrarModal() {
      this.$emit("cerrar");
    }
  }
};
</script>

<style scoped>
.overlay {
  position: fixed;
  top: 0;
  left: 0;
  width: 100vw;
  height: 100vh;
  background-color: rgba(0,0,0,0.3);
  display: flex;
  align-items: center;
  justify-content: center;
  z-index: 9999;
}
.modal-contenido {
  background: #fff;
  border-radius: 16px;
  width: 400px;
  max-width: 90vw;
  padding: 24px;
  box-shadow: 0 4px 10px rgba(0,0,0,0.2);
}
.titulo {
  margin-top: 0;
  margin-bottom: 24px;
  font-size: 20px;
  font-weight: 600;
  text-align: center;
}
.campo {
  margin-bottom: 24px;
}
.etiqueta {
  display: block;
  font-weight: 600;
  margin-bottom: 6px;
}
.input-text {
  width: 100%;
  padding: 8px 12px;
  border-radius: 4px;
  border: 1.5px solid #ccc;
  font-size: 14px;
  outline: none;
}
.input-text:focus {
  border-color: #999;
}
.supporting-text {
  font-size: 12px;
  color: #79747e;
  margin-top: 4px;
}
.botones-accion {
  display: flex;
  justify-content: center;
  gap: 16px;
  width: 100%;
}
.btn-cancelar {
  background-color: #8d6e63;
  color: #fff;
  border: none;
  border-radius: 8px;
  padding: 10px 20px;
  cursor: pointer;
}
.btn-editar {
  background-color: #00796b;
  color: #fff;
  border: none;
  border-radius: 8px;
  padding: 10px 20px;
  cursor: pointer;
}
.btn-cancelar:hover,
.btn-editar:hover {
  opacity: 0.9;
}
</style>
