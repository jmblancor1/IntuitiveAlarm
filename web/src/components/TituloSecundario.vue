<template>
  <div class="title-9">
    <h1 class="title-10 label--title---semibold-24">{{ title }}</h1>
  </div>
</template>

<script>
export default {
  name: "xTitle3",
  props: ["title"],
};
</script>

<style>
.title-9 {
  align-items: flex-start;
  display: flex;
  height: 28px;
  min-width: 281px;
}

.title-10 {
  color: var(--eerie-black-2);
  font-weight: 600;
  line-height: normal;
  margin-top: -1px;
  min-height: 18px;
  white-space: nowrap;
}
</style>
