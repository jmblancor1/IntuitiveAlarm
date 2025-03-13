<template>
  <div class="title-content-2"><x-title3 :title="xTitle3Props.title" /></div>
</template>

<script>
import xTitle3 from "./TituloSecundario.vue";
export default {
  name: "TitleContent2",
  components: {
    xTitle3,
  },
  props: ["xTitle3Props"],
};
</script>

<style>
.title-content-2 {
  align-items: flex-start;
  display: flex;
  height: 28px;
  left: 720px;
  min-width: 281px;
  position: absolute;
  top: 168px;
}
</style>
