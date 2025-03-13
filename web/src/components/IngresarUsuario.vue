<template>
  <div class="ingresar-usuario container-center-horizontal screen">
    <div class="frame-30115-DDOnCk">
      <div class="reloj-2-RsbCNj">
        <img
            class="reloj-1-xggj9X"
            src="/img/reloj-1.png"
            alt="reloj 1"
        />
      </div>
      <input
          class="component-5-RsbCNj"
          type="text"
          placeholder="Ingrese su Usuario"
      />
      <input
          class="component-6-RsbCNj"
          type="password"
          placeholder="Contraseña"
      />
      <button
          class="button-RsbCNj"
          type="button"
          @click="handleIngresar"
      >
        Ingresar
      </button>
      <p class="ya-tienes-una-cuenta-registrate-RsbCNj">
        ¿Ya tienes una cuenta?
        <router-link to="/crear-cuenta">Registrate</router-link>
      </p>
      <p class="restablecer-clave-RsbCNj">
        <router-link to="/recuperar-clave">Restablecer clave</router-link>
      </p>
    </div>
    <img
        class="rectangle-1481-DDOnCk"
        src="img/rectangle-1481.png"
        alt="Rectangle 1481"
    />
  </div>
</template>

<script>
export default {
  name: "IngresarUsuario",
  methods: {
    handleIngresar() {
      this.$router.push("/panel-principal");
    },
  },
};
</script>

<style scoped>
.ingresar-usuario {
  width: 1440px;
  height: 789px;
  background-color: #ffffff;
  position: relative;
  margin: 0 auto;
  overflow: hidden;
}

.frame-30115-DDOnCk {
  position: absolute;
  width: 512px;
  height: 585px;
  left: 464px;
  top: 102px;
  background-color: #e2f2f4;
  border-radius: 10px;
  overflow: hidden;
}

.reloj-2-RsbCNj {
  position: absolute;
  top: 44px;
  left: 199px;
  width: 105px;
  height: 105px;
}

.reloj-1-xggj9X {
  width: 105px;
  height: 105px;
  object-fit: cover;
}

.component-5-RsbCNj {
  position: absolute;
  top: 196px;
  left: 92px;
  width: 330px;
  height: 56px;
  border: 1px solid #666;
  border-radius: 4px;
  padding: 10px;
}

.component-6-RsbCNj {
  position: absolute;
  top: 282px;
  left: 92px;
  width: 330px;
  height: 56px;
  border: 1px solid #666;
  border-radius: 4px;
  padding: 10px;
}

.button-RsbCNj {
  position: absolute;
  top: 393px;
  left: 176px;
  width: 150px;
  height: 40px;
  background-color: #3c7263;
  border: none;
  border-radius: 10px;
  color: #fff;
  cursor: pointer;
  font-size: 14px;
}

.ya-tienes-una-cuenta-registrate-RsbCNj {
  position: absolute;
  top: 477px;
  left: 125px;
  width: 253px;
  text-align: center;
  color: #49454f;
  font-size: 14px;
  line-height: 20px;
  margin: 0;
}

.restablecer-clave-RsbCNj {
  position: absolute;
  top: 509px;
  left: 125px;
  width: 253px;
  text-align: center;
  color: #49454f;
  font-size: 14px;
  line-height: 20px;
  margin: 0;
}

.rectangle-1481-DDOnCk {
  display: none;
}
</style>
