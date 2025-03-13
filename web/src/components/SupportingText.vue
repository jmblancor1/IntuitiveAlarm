<template>
  <div class="supporting-text-2 hidden"><p class="supporting-text-3 m3bodysmall">El dato ingresado es inválido</p></div>
</template>

<script>
export default {
  name: "SupportingText",
};
</script>

<style>
.supporting-text-2,
.supporting-text-6,
.supporting-text-4 {
  align-items: flex-start;
  display: flex;
  gap: 10px;
  height: 20px;
  left: 0;
  opacity: 0;
  padding: 4px 16px 0px;
  position: absolute;
  top: 56px;
  width: 330px;
}

.supporting-text-3,
.supporting-text-7,
.supporting-text-5 {
  color: var(--on-surface-var-nv-80);
  flex: 1;
  font-weight: 400;
  line-height: 16px;
  margin-top: -1px;
  position: relative;
}
</style>
