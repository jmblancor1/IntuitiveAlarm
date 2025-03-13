<template>
  <div class="sidebar-panel-5">
    <reloj1 :src="reloj1Props.src" :className="reloj1Props.className" />
    <frame30068 :className="frame30068Props.className" />
    <img
      class="line-8-6"
      src="https://cdn.animaapp.com/projects/67c5e64470ac176be1731efe/releases/67c5e7f0ddf86de7e8d5d499/img/line-8.svg"
      alt="Line 8"
    />
    <panel3

      :frame301951Props="panel3Props.frame301951Props"
      :frame30197Props="panel3Props.frame30197Props"
      :frame301952Props="panel3Props.frame301952Props"
    />
  </div>
</template>

<script>
import Reloj1 from "./RelojIcono.vue";
import Frame30068 from "./HeaderBrand.vue";
import Panel3 from "./PanelSidebarModulos.vue";
export default {
  name: "SidebarPanel3",
  components: {
    Reloj1,
    Frame30068,
    Panel3,
  },
  props: ["reloj1Props", "frame30068Props", "panel3Props"],
};
</script>

<style>
.sidebar-panel-5 {
  align-items: center;
  background-color: var(--color-panel-izq);
  display: flex;
  flex-direction: column;
  height: 789px;
  margin-left: 1955px;
  overflow: hidden;
  padding: 21px 0;
  position: relative;
  width: 241px;
}

.line-8-6 {
  height: 1px;
  margin-top: 26px;
  width: 241px;
}
</style>
