<template>
  <div class="title-content-5"><x-title4 :title="xTitle4Props.title" /></div>
</template>

<script>
import xTitle4 from "./TituloSeccion.vue";
export default {
  name: "TitleContent5",
  components: {
    xTitle4,
  },
  props: ["xTitle4Props"],
};
</script>

<style>
.title-content-5 {
  align-items: flex-start;
  display: flex;
  height: 28px;
  min-width: 281px;
  position: relative;
}
</style>
