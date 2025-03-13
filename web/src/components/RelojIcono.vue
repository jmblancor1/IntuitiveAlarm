<template>
  <div :class="[`reloj-5`, className || ``]" :style="{ 'background-image': 'url(' + src + ')' }"></div>
</template>

<script>
export default {
  name: "Reloj1",
  props: ["src", "className"],
};
</script>

<style>
.reloj-5 {
  align-self: center;
  background-position: 50% 50%;
  background-size: cover;
  height: 67px;
  margin-top: 792px;
  width: 67px;
}

.reloj-5.reloj-5-1,
.reloj-5.reloj-5-2,
.reloj-5.reloj-5-3,
.reloj-5.reloj-5-4,
.reloj-5.reloj-5-5,
.reloj-5.reloj-5-6,
.reloj-5.reloj-5-7 {
  align-self: unset;
  margin-top: unset;
}
</style>
