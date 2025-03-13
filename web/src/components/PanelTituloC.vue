<template>
  <div class="title-content-4"><title-content5 :xTitle4Props="titleContent5Props.xTitle4Props" /></div>
</template>

<script>
import TitleContent5 from "./PanelTituloD.vue";
export default {
  name: "TitleContent4",
  components: {
    TitleContent5,
  },
  props: ["titleContent5Props"],
};
</script>

<style>
.title-content-4 {
  align-items: flex-start;
  display: flex;
  height: 28px;
  min-width: 281px;
  position: relative;
}
</style>
