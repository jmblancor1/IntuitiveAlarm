<template>
  <div class="panel-9">
    <div class="frame-30210-1">
      <div class="flex-row-7">

        <div class="modulos-7 archivo-semi-bold-white-14px">{{ modulos }}</div>

      </div>
    </div>
    <div class="frame-30203-1">
      <frame30195 :panel="frame301951Props.panel" :className="frame301951Props.className" />
      <frame30197 :alarmas="frame30197Props.alarmas" :className="frame30197Props.className" />
      <frame30195 :panel="frame301952Props.panel" :className="frame301952Props.className" />
    </div>
  </div>
</template>

<script>
import Frame30195 from "./SidebarLink.vue";
import Frame30197 from "./SidebarAlarmLink.vue";
export default {
  name: "Panel3",
  components: {
    Frame30195,
    Frame30197,
  },
  props: ["modulos", "frame301951Props", "frame30197Props", "frame301952Props"],
};
</script>

<style>
.panel-9 {
  align-items: flex-start;
  background-color: var(--white);
  display: inline-flex;
  flex-direction: column;
  margin-left: 1px;
  margin-top: 14px;
  position: relative;
}

.frame-30210-1 {
  display: none;
}

.frame-30210-1 {
  background-color: var(--color-panel-izq);
  height: 40px;
  position: relative;
  width: 192px;
}

.flex-row-7 {
  align-items: flex-start;
  display: flex;
  left: 12px;
  min-width: 170px;
  position: relative;
  top: 10px;
}

.icon-9 {
  height: 20px;
  width: 14px;
}

.modulos-7 {
  letter-spacing: 0;
  line-height: normal;
  margin-left: 19px;
  min-height: 15px;
  min-width: 71px;
  position: relative;
  white-space: nowrap;
}

.vector-7 {
  align-self: center;
  height: 6px;
  margin-left: 56px;
  margin-top: 4px;
  width: 10px;
}

.frame-30203-1 {
  align-items: flex-start;
  background-color: var(--licorice);
  display: inline-flex;
  flex: 0 0 auto;
  flex-direction: column;
  position: relative;
}
</style>
