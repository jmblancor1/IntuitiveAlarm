<template>
  <div :class="[`modal-confirmacion`, className || ``]"><list-dialog :className="listDialogProps.className" /></div>
</template>

<script>
import ListDialog from "./ListDialog";
export default {
  name: "ModalConfirmacion",
  components: {
    ListDialog,
  },
  props: ["className", "listDialogProps"],
};
</script>

<style>
.modal-confirmacion {
  align-items: flex-start;
  display: flex;
  flex-direction: column;
  height: 56px;
  left: 0;
  position: absolute;
  top: 0;
  width: 345px;
}

.modal-confirmacion.modal-confirmacion-2 {
  display: inline-flex;
  left: 405px;
  top: 189px;
  width: unset;
}
</style>
