import Vue from "vue";
import Router from "vue-router";
import IngresarUsuario from "./components/IngresarUsuario";
import CrearCuenta from "./components/CrearCuenta";
import RecuperarClave from "./components/RecuperarClave";
import PanelUsuarios from "./components/PanelUsuarios";
import PanelPrincipal from "./components/PanelPrincipal";

import {
  crearCuentaData,
  recuperarClaveData,
  panelUsuariosData,
  panelPrincipalData,
} from "./data";

Vue.use(Router);

export default new Router({
  mode: "history",
  routes: [
    {
      path: "/",
      component: IngresarUsuario,
    },
    {
      path: "/ingresar-usuario",
      component: IngresarUsuario,
    },
    {
      path: "/crear-cuenta",
      component: CrearCuenta,
      props: {
        title: "Crear una cuenta de usuario",
        textField21Props: crearCuentaData.textField21Props,
        textField22Props: crearCuentaData.textField22Props,
        textField23Props: crearCuentaData.textField23Props,
        textField24Props: crearCuentaData.textField24Props,
        xButtonProps: crearCuentaData.xButtonProps,
        buttonFilled12Props: crearCuentaData.buttonFilled12Props,
      },
    },
    {
      path: "/recuperar-clave",
      component: RecuperarClave,
      props: {
        xTitle2Props: recuperarClaveData.xTitle2Props,
        textField2Props: recuperarClaveData.textField2Props,
        buttonFilled1Props: recuperarClaveData.buttonFilled1Props,
        buttonFilled12Props: recuperarClaveData.buttonFilled12Props,
      },
    },
    {
      path: "/panel-usuarios",
      component: PanelUsuarios,
      props: { ...panelUsuariosData },
    },
    {
      path: "/panel-principal",
      component: PanelPrincipal,
      props: { ...panelPrincipalData },
    },
  ],
});
