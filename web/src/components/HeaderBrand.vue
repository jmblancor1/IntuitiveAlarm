<template>
  <div :class="[`frame-30068`, className || ``]">
    <div class="intuitive-alarms archivo-semi-bold-white-20px">Intuitive Alarms</div>
  </div>
</template>

<script>
export default {
  name: "Frame30068",
  props: ["className"],
};
</script>

<style>
.frame-30068 {
  align-items: center;
  border-radius: 8px;
  display: flex;
  height: 40px;
  margin-right: -22px;
  margin-top: 15px;
  overflow: hidden;
  padding: 0 31px;
  width: 247px;
}

.intuitive-alarms {
  letter-spacing: 0;
  line-height: normal;
  min-height: 22px;
  position: relative;
  white-space: nowrap;
  width: 149px;
}

.frame-30068.frame-30068-1,
.frame-30068.frame-30068-2,
.frame-30068.frame-30068-3,
.frame-30068.frame-30068-4,
.frame-30068.frame-30068-5,
.frame-30068.frame-30068-6,
.frame-30068.frame-30068-7 {
  align-self: flex-end;
}
</style>
