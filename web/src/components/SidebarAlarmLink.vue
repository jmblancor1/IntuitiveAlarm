<template>
  <div :class="[`frame-30197-1`, className || ``]">
    <div class="alarmas-1 archivo-bold-white-14px">{{ alarmas }}</div>
  </div>
</template>

<script>
export default {
  name: "Frame30197",
  props: ["alarmas", "className"],
};
</script>

<style>
.frame-30197-1 {
  align-items: center;
  display: flex;
  flex: 0 0 auto;
  gap: 15px;
  padding: 11px 15px;
  position: relative;
  width: 192px;
}

.alarmas-1 {
  letter-spacing: 0;
  line-height: normal;
  margin-top: -1px;
  position: relative;
  white-space: nowrap;
  width: fit-content;
}

.frame-30197-1.frame-30196,
.frame-30197-1.frame-30195-1 {
  background-color: var(--color-panel-izq);
}
</style>
