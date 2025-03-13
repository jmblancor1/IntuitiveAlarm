<template>
  <div class="title-content-3"><title-content4 :titleContent5Props="titleContent4Props.titleContent5Props" /></div>
</template>

<script>
import TitleContent4 from "./PanelTituloC.vue";
export default {
  name: "TitleContent3",
  components: {
    TitleContent4,
  },
  props: ["titleContent4Props"],
};
</script>

<style>
.title-content-3 {
  align-items: flex-start;
  display: flex;
  height: 28px;
  left: 736px;
  min-width: 281px;
  position: absolute;
  top: 244px;
}
</style>
