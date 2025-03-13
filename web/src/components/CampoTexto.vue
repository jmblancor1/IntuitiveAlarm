<template>
  <div :class="['text-field-5', className || '']">
    <div class="text-field-2">
      <div class="state-layer-9">
        <div class="content-5">
          <input
              class="styled-input"
              type="text"
              :placeholder="labelText"
              :value="value"
              @input="$emit('input', $event.target.value)"
          />
          <div class="label-text-container-1" v-if="labelText">
            <div class="label-text-9 m3bodysmall">{{ labelText }}</div>
          </div>
        </div>
      </div>
    </div>
    <supporting-text />
  </div>
</template>

<script>
import SupportingText from "./SupportingText";

export default {
  name: "TextField2",
  components: {
    SupportingText,
  },
  props: {
    labelText: String,
    className: String,
    value: String,
  },
};
</script>

<style scoped>

.text-field-5 {
  align-items: flex-start;
  border-radius: 4px 4px 0px 0px;
  display: flex;
  flex-direction: column;
  height: 56px;
  margin-left: 2px;
  margin-top: 61px;
  position: relative;
  width: 330px;
}

.text-field-2 {
  align-items: flex-start;
  align-self: stretch;
  background-color: var(--white);
  border: 2px solid var(--on-surface-var-nv-80);
  border-radius: 4px;
  display: flex;
  flex: 0 0 auto;
  flex-direction: column;
  gap: 10px;
  margin-bottom: -2px;
  margin-left: -2px;
  margin-right: -2px;
  margin-top: -2px;
  position: relative;
  width: 100%;
}

.state-layer-9 {
  align-items: flex-start;
  align-self: stretch;
  border-radius: 4px 4px 0px 0px;
  display: flex;
  flex: 0 0 auto;
  gap: 4px;
  padding: 4px 0px 4px 16px;
  position: relative;
  width: 100%;
}

.content-5 {
  align-items: flex-start;
  display: flex;
  flex: 1;
  flex-direction: column;
  flex-grow: 1;
  height: 48px;
  justify-content: center;
  padding: 4px 0px;
  position: relative;
}

.label-text-container-1 {
  align-items: center;
  background-color: var(--white-pointer);
  display: inline-flex;
  left: -4px;
  padding: 0px 4px;
  position: absolute;
  top: -12px;
}

.label-text-9 {
  color: var(--on-surface-var-nv-80);
  font-weight: 400;
  line-height: 16px;
  margin-top: -1px;
  position: relative;
  white-space: nowrap;
  width: fit-content;
}

.text-field-5.text-field-3 {
  margin-top: 60px;
}
.text-field-5.text-field-6 {
  margin-left: unset;
  margin-top: 60px;
}
.text-field-5.text-field-7 {
  margin-left: 1px;
}
.text-field-5.text-field-9 {
  left: 452px;
  margin-left: unset;
  margin-top: unset;
  position: absolute;
  top: 262px;
}
.text-field-5.text-field-10 {
  left: 452px;
  margin-left: unset;
  margin-top: unset;
  position: absolute;
  top: 354px;
}
.text-field-5.text-field-11 {
  left: 452px;
  margin-left: unset;
  margin-top: unset;
  position: absolute;
  top: 452px;
}

.styled-input {
  background: transparent;
  border: none;
  outline: none;
  width: 100%;
  font-size: 14px;
}
</style>
