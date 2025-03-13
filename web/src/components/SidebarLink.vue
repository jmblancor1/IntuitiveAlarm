<template>
  <div :class="['frame-3019-1', className || '']">
    <router-link
        to="/panel-principal"
        class="panel-1 archivo-normal-white-14px"
        style="cursor: pointer; text-decoration: none;"
    >
      {{ panel }}
    </router-link>
  </div>
</template>


<script>
export default {
  name: "Frame30195",
  props: ["panel", "className"],
};
</script>

<style>
.frame-3019-1 {
  align-items: center;
  display: flex;
  flex: 0 0 auto;
  gap: 15px;
  padding: 11px 15px;
  position: relative;
  width: 192px;
}

.panel-1 {
  letter-spacing: 0;
  line-height: normal;
  margin-top: -1px;
  position: relative;
  white-space: nowrap;
  width: fit-content;
}

.frame-3019-1.frame-30195 {
  align-items: center;
  background-color: var(--color-panel-izq);
  box-shadow: 0px 4px 4px #00000040;
  display: flex;
  flex: 0 0 auto;
  gap: 15px;
  padding: 11px 15px;
  position: relative;
  width: 192px;
}

.frame-3019-1.frame-30197 {
  align-items: center;
  background-color: var(--color-panel-izq);
  display: flex;
  flex: 0 0 auto;
  gap: 15px;
  padding: 11px 15px;
  position: relative;
  width: 192px;
}
</style>
