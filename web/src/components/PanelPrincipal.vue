<template>
  <div class="container-center-horizontal">
    <div class="panel-principal screen">
      <div class="overlap-group2-1">
        <div class="overlap-group-2">
          <panel-mensaje-inicio />
          <p class="alarma-reunin-con">
            <span class="archivo-normal-abbey-16px">{{ spanText1 }}</span
            ><span class="span1">{{ spanText2 }}</span
            ><span class="archivo-normal-abbey-16px">{{ spanText3 }}</span>
          </p>
          <p class="alarma-tomar-medica body2--regular-15">
            <span class="span-1 archivo-normal-abbey-15px">{{ spanText4 }}</span
            ><span class="span1-1">{{ spanText5 }}</span
            ><span class="span-1 archivo-normal-abbey-15px">{{ spanText6 }}</span>
          </p>
        </div>
        <div class="overlap-group1-1">
          <sidebar-panel4
            :reloj1Props="sidebarPanel4Props.reloj1Props"
            :frame30068Props="sidebarPanel4Props.frame30068Props"
            :panel4Props="sidebarPanel4Props.panel4Props"
          />
          <div class="frame-30075">
            <button-filled1 :className="buttonFilled1Props.className" :xButtonProps="buttonFilled1Props.xButtonProps" />
          </div>
        </div>
        <title-content2 :xTitle3Props="titleContent2Props.xTitle3Props" />
        <title-content3 :titleContent4Props="titleContent3Props.titleContent4Props" />
      </div>
    </div>
  </div>
</template>

<script>
import PanelMensajeInicio from "./PanelMensajeInicio";
import SidebarPanel4 from "./SidebarPanel4";
import ButtonFilled1 from "./BotonLlenoSecundario.vue";
import TitleContent2 from "./PanelTituloA.vue";
import TitleContent3 from "./PanelTituloB.vue";
export default {
  name: "PanelPrincipal",
  components: {
    PanelMensajeInicio,
    SidebarPanel4,
    ButtonFilled1,
    TitleContent2,
    TitleContent3,
  },
  props: [
    "spanText1",
    "spanText2",
    "spanText3",
    "spanText4",
    "spanText5",
    "spanText6",
    "sidebarPanel4Props",
    "buttonFilled1Props",
    "titleContent2Props",
    "titleContent3Props",
  ],
};
</script>

<style>
.panel-principal {
  align-items: flex-start;
  background-color: var(--white);
  display: flex;
  width: 1440px;
}

.overlap-group2-1 {
  height: 789px;
  position: relative;
  width: 1439px;
}

.overlap-group-2 {
  border-radius: 5px;
  height: 283px;
  left: 582px;
  position: absolute;
  top: 327px;
  width: 516px;
}

.alarma-reunin-con {
  color: transparent;
  font-family: var(--font-family-archivo);
  font-size: var(--font-size-s);
  font-weight: 400;
  left: 9px;
  letter-spacing: 0;
  line-height: 10px;
  position: absolute;
  top: 49px;
  width: 349px;
}

.span1 {
  color: var(--projectprimary900);
}

.alarma-tomar-medica {
  color: transparent;
  font-weight: 400;
  left: 9px;
  line-height: 28px;
  position: absolute;
  top: 114px;
  width: 343px;
}

.span-1 {
  letter-spacing: 0.05px;
}

.span1-1 {
  color: var(--projectprimary900);
  font-family: var(--font-family-archivo);
  font-size: var(--font-size-15px);
  letter-spacing: 0.05px;
}

.overlap-group1-1 {
  height: 789px;
  left: 0;
  position: absolute;
  top: 0;
  width: 1439px;
}

.icon-10 {
  height: 20px;
  left: 38px;
  position: absolute;
  top: 193px;
  width: 14px;
}

.frame-30075 {
  align-items: flex-start;
  background-color: var(--grey-5);
  display: flex;
  height: 104px;
  left: 240px;
  padding: 8px 7px;
  position: absolute;
  top: 0;
  width: 1199px;
}
</style>
