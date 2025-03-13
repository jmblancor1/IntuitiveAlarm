<template>
  <div class="title-11">
    <div class="title-12">{{ title }}</div>
  </div>
</template>

<script>
export default {
  name: "xTitle4",
  props: ["title"],
};
</script>

<style>
.title-11 {
  align-items: flex-start;
  display: flex;
  height: 28px;
  min-width: 281px;
}

.title-12 {
  color: var(--m3black);
  font-family: var(--font-family-archivo);
  font-size: var(--font-size-l);
  font-weight: 400;
  letter-spacing: 0;
  line-height: normal;
  margin-top: -1px;
  min-height: 18px;
  white-space: nowrap;
}
</style>
