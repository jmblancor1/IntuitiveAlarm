<template>
  <div
      :class="['button-filled1', className || '']"
      @click="$router.push('/ingresar-usuario')"
  >
    <x-button
        :labelText="xButtonProps.labelText"
        :className="xButtonProps.className"
    />
  </div>
</template>

<script>
import XButton from "./BotonBase.vue";

export default {
  name: "ButtonFilled1",
  components: {
    XButton,
  },
  props: ["className", "xButtonProps"],
};
</script>

<style>
.button-filled1 {
  align-items: flex-start;
  align-self: flex-end;
  background-color: var(--boton-cancelar);
  border-radius: 10px;
  display: inline-flex;
  flex-direction: column;
  position: relative;
}

.button-filled1.button-filled1-1,
.button-filled1.button-filled1-4,
.button-filled1.button-filled1-6,
.button-filled1.button-filled1-8 {
  align-self: unset;
  cursor: pointer;
  flex: 0 0 auto;
}

.button-filled1.button-filled1-2 {
  align-self: unset;
  flex: 0 0 auto;
}

.button-filled1.button-filled1-3,
.button-filled1.button-filled1-5 {
  align-self: unset;
  cursor: pointer;
}

.button-filled1.button-filled1-7 {
  align-self: unset;
  cursor: pointer;
  margin-left: 1035px;
}

.button-filled1.button-filled1-9 {
  align-self: unset;
  cursor: pointer;
  left: 468px;
  position: absolute;
  top: 544px;
}
</style>
