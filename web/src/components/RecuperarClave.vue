<template>
  <div class="container-center-horizontal">
    <div class="recuperar-clave screen">
      <div class="frame-30115-2">
        <x-title2 :title="xTitle2Props.title" />
        <text-field2
          :labelText="textField2Props.labelText"
          :className="textField2Props.className"
          :inputTextContainerProps="textField2Props.inputTextContainerProps"
        />
        <div class="buttonfilled-container-1">
          <button-filled1 :className="buttonFilled1Props.className" :xButtonProps="buttonFilled1Props.xButtonProps" />
          <button-filled12
            :className="buttonFilled12Props.className"
            :buttonFilled13Props="buttonFilled12Props.buttonFilled13Props"
          />
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import xTitle2 from "./TituloRecuperar.vue";
import TextField2 from "./CampoTexto.vue";
import ButtonFilled1 from "./BotonLlenoSecundario.vue";
import ButtonFilled12 from "./BotonLlenoPrimario.vue";
export default {
  name: "RecuperarClave",
  components: {
    xTitle2,
    TextField2,
    ButtonFilled1,
    ButtonFilled12,
  },
  props: ["xTitle2Props", "textField2Props", "buttonFilled1Props", "buttonFilled12Props"],
};
</script>

<style>
.recuperar-clave {
  align-items: flex-start;
  background-color: var(--grey-5);
  display: flex;
  height: 789px;
  padding: 245px 444px;
  width: 1440px;
}

.frame-30115-2 {
  align-items: center;
  background-color: var(--color-panel);
  border-radius: 10px;
  display: flex;
  flex-direction: column;
  height: 298px;
  overflow: hidden;
  padding: 36.2px 93.1px;
  position: relative;
  width: 551px;
}

.buttonfilled-container-1 {
  align-items: flex-start;
  display: flex;
  gap: 30px;
  height: 40px;
  margin-left: 1px;
  margin-top: 44px;
  min-width: 330px;
  position: relative;
}
</style>
