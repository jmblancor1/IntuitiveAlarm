<template>
  <div :class="[`button`, className || ``]">
    <div class="state-layer">
      <div class="label-text valign-text-middle m3labellarge">{{ labelText }}</div>
    </div>
  </div>
</template>

<script>
export default {
  name: "XButton",
  props: ["labelText", "className"],
};
</script>

<style>
.button {
  align-items: center;
  background-color: var(--boton-cancelar);
  border-radius: 10px;
  display: flex;
  flex-direction: column;
  gap: 8px;
  height: 40px;
  justify-content: center;
  overflow: hidden;
  position: relative;
  width: 150px;
}

.state-layer {
  align-items: center;
  align-self: stretch;
  display: flex;
  flex: 1;
  flex-grow: 1;
  gap: 8px;
  justify-content: center;
  padding: 10px 24px;
  position: relative;
  width: 100%;
}

.label-text {
  color: var(--white);
  font-weight: 500;
  line-height: 20px;
  margin-top: -1px;
  position: relative;
  text-align: center;
  white-space: nowrap;
  width: fit-content;
}

.button.button-1,
.button.button-3,
.button.button-5,
.button.button-7,
.button.button-9 {
  background-color: var(--color-panel-izq);
}

.button.button-7 .label-text {
  margin-left: -1px;
  margin-right: -1px;
}
</style>
