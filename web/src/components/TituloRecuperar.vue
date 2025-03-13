<template>
  <div class="title-7">
    <h1 class="title-8 button---semibold-24">{{ title }}</h1>
  </div>
</template>

<script>
export default {
  name: "xTitle2",
  props: ["title"],
};
</script>

<style>
.title-7 {
  align-items: flex-start;
  align-self: flex-end;
  display: flex;
  height: 24px;
  min-width: 273px;
}

.title-8 {
  color: var(--eerie-black-2);
  font-weight: 600;
  line-height: 20px;
  margin-top: -1px;
  min-height: 15px;
  white-space: nowrap;
}
</style>
