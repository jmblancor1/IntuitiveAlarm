<template>
  <div class="panel-10">
    <div class="frame-30203-2">
      <frame30197 :alarmas="frame30197Props.alarmas" :className="frame30197Props.className" />
      <div class="frame-3019-2">
        <router-link to="/panel-usuarios">
          <div class="usuarios-2 kumbhsans-normal-white-14px">{{ usuarios }}</div>
        </router-link>
      </div>
      <div class="frame-3019-2">
        <div class="alarmas-2 kumbhsans-normal-white-14px">{{ alarmas }}</div>
      </div>
    </div>
  </div>
</template>

<script>
import Frame30072 from "./EmptyFrame.vue";
import Frame30197 from "./SidebarAlarmLink.vue";
export default {
  name: "Panel4",
  components: {
    Frame30072,
    Frame30197,
  },
  props: ["usuarios", "alarmas", "frame30197Props"],
};
</script>

<style>
.panel-10 {
  align-items: flex-start;
  background-color: var(--white);
  display: inline-flex;
  flex-direction: column;
  margin-left: 1px;
  margin-top: 14px;
  position: relative;
}

.frame-30210-2 {
  background-color: var(--color-panel-izq);
  height: 40px;
  position: relative;
  width: 192px;
}

.vector-8 {
  height: 6px;
  left: 172px;
  position: absolute;
  top: 19px;
  width: 10px;
}

.frame-30203-2 {
  align-items: flex-start;
  background-color: var(--licorice);
  display: inline-flex;
  flex: 0 0 auto;
  flex-direction: column;
  position: relative;
}

.frame-3019-2 {
  align-items: center;
  background-color: var(--color-panel-izq);
  display: flex;
  flex: 0 0 auto;
  gap: 15px;
  padding: 11px 15px;
  position: relative;
  width: 192px;
}

.usuarios-2 {
  cursor: pointer;
  letter-spacing: 0;
  line-height: normal;
  margin-top: -1px;
  position: relative;
  width: fit-content;
}

.alarmas-2 {
  letter-spacing: 0;
  line-height: normal;
  margin-top: -1px;
  position: relative;
  width: fit-content;
}
</style>
