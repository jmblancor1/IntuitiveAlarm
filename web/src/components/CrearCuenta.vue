<template>
  <div class="container-center-horizontal">
    <div class="crear-cuenta screen">
      <div class="frame-30115-1">

        <h1 class="title-6 button---semibold-24">{{ title }}</h1>

        <text-field2
            v-model="form.nombres"
            :labelText="textField21Props.labelText"
            :className="textField21Props.className"
        />

        <text-field2
            v-model="form.correo"
            :labelText="textField22Props.labelText"
            :className="textField22Props.className"
        />

        <text-field2
            v-model="form.clave"
            :labelText="textField23Props.labelText"
            :className="textField23Props.className"
        />

        <text-field2
            v-model="form.confirmacion"
            :labelText="textField24Props.labelText"
            :className="textField24Props.className"
        />

        <div class="button-container">

          <button
              class="cancel-button"
              type="button"
              @click="cancelar"
          >
            Cancelar
          </button>

          <button-filled12
              :className="buttonFilled12Props.className"
              :buttonFilled13Props="buttonFilled12Props.buttonFilled13Props"
              @click="crearCuenta"
          />
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import TextField2 from "./CampoTexto.vue";
import ButtonFilled12 from "./BotonLlenoPrimario.vue";

export default {
  name: "CrearCuenta",
  components: {
    TextField2,
    ButtonFilled12,
  },
  props: [
    "title",
    "textField21Props",
    "textField22Props",
    "textField23Props",
    "textField24Props",
    "buttonFilled12Props",
  ],
  data() {
    return {
      form: {
        nombres: "",
        correo: "",
        clave: "",
        confirmacion: "",
      },
    };
  },
  methods: {
    cancelar() {
      this.$router.push("/ingresar-usuario");
      console.log("Se canceló la creación de cuenta");
    },
    crearCuenta() {
      console.log("Datos del formulario:", this.form);
      alert(`Cuenta creada para: ${this.form.nombres}`);
    },
  },
};
</script>

<style scoped>
.crear-cuenta {
  align-items: flex-start;
  background-color: var(--grey-5);
  display: flex;
  height: 789px;
  padding: 0 435px;
  width: 1440px;
}

.frame-30115-1 {
  align-items: center;
  background-color: var(--color-panel);
  border-radius: 10px;
  display: flex;
  flex-direction: column;
  height: 655px;
  margin-top: 67px;
  overflow: hidden;
  padding: 41px 109px;
  position: relative;
  width: 570px;
}

.title-6 {
  align-self: flex-end;
  color: var(--eerie-black-2);
  font-weight: 600;
  line-height: 20px;
  position: relative;
  width: 330px;
}

.button-container {
  align-items: flex-start;
  display: flex;
  gap: 29px;
  height: 40px;
  margin-left: 1px;
  margin-top: 47px;
  min-width: 329px;
  position: relative;
}

.cancel-button {
  width: 150px;
  height: 40px;
  background-color: #8d6e63;
  color: #fff;
  border: none;
  border-radius: 10px;
  cursor: pointer;
  font-family: "Archivo", sans-serif;
  font-size: 14px;
  font-weight: 500;
  display: flex;
  align-items: center;
  justify-content: center;
}

.cancel-button:hover {
  opacity: 0.9;
}
</style>
