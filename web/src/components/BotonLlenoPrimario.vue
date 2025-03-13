<template>
  <div :class="[`button-filled1-10`, className || ``]">
    <button-filled13 :buttonFilled1Props="buttonFilled13Props.buttonFilled1Props" />
  </div>
</template>

<script>
import ButtonFilled13 from "./BotonLlenoTerciario.vue";
export default {
  name: "ButtonFilled12",
  components: {
    ButtonFilled13,
  },
  props: ["className", "buttonFilled13Props"],
};
</script>

<style>
.button-filled1-10 {
  align-items: flex-start;
  display: inline-flex;
  flex-direction: column;
  margin-left: 13px;
  margin-top: 35px;
  position: relative;
}

.button-filled1-10.button-filled1-11 {
  cursor: pointer;
  margin-left: unset;
  margin-top: unset;
}

.button-filled1-10.button-filled1-12,
.button-filled1-10.button-filled1-13 {
  margin-left: unset;
  margin-top: unset;
}

.button-filled1-10.button-filled1-14 {
  cursor: pointer;
  left: 646px;
  margin-left: unset;
  margin-top: unset;
  position: absolute;
  top: 544px;
}
</style>
