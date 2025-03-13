<template>
  <div class="sidebar-panel-6">
    <reloj1 :src="reloj1Props.src" :className="reloj1Props.className" />
    <frame30068 :className="frame30068Props.className" />
    <img
      class="line-8-7"
      src="https://cdn.animaapp.com/projects/67c5e64470ac176be1731efe/releases/67c5e7f0ddf86de7e8d5d499/img/line-8.svg"
      alt="Line 8"
    />
    <panel4
      :usuarios="panel4Props.usuarios"
      :alarmas="panel4Props.alarmas"
      :frame30197Props="panel4Props.frame30197Props"
    />
  </div>
</template>

<script>
import Reloj1 from "./RelojIcono.vue";
import Frame30068 from "./HeaderBrand.vue";
import Panel4 from "./PanelSidebarAlarmas.vue";
export default {
  name: "SidebarPanel4",
  components: {
    Reloj1,
    Frame30068,
    Panel4,
  },
  props: ["reloj1Props", "frame30068Props", "panel4Props"],
};
</script>

<style>
.sidebar-panel-6 {
  align-items: center;
  background-color: var(--color-panel-izq);
  display: flex;
  flex-direction: column;
  height: 789px;
  left: 0;
  overflow: hidden;
  padding: 21px 0;
  position: absolute;
  top: 0;
  width: 241px;
}

.line-8-7 {
  height: 1px;
  margin-top: 26px;
  width: 241px;
}
</style>
