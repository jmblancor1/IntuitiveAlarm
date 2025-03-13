<template>
  <div class="button-filled1-15">
    <button-filled1 :className="buttonFilled1Props.className" :xButtonProps="buttonFilled1Props.xButtonProps" />
  </div>
</template>

<script>
import ButtonFilled1 from "./BotonLlenoSecundario.vue";
export default {
  name: "ButtonFilled13",
  components: {
    ButtonFilled1,
  },
  props: ["buttonFilled1Props"],
};
</script>

<style>
.button-filled1-15,
.button-filled1-16,
.button-filled1-17,
.button-filled1-18,
.button-filled1-19 {
  align-items: flex-start;
  display: inline-flex;
  flex: 0 0 auto;
  flex-direction: column;
  position: relative;
}
</style>
