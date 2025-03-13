package co.edu.uniandes.intuitivealarms

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import co.edu.uniandes.intuitivealarms.screens.AlarmData
import co.edu.uniandes.intuitivealarms.screens.CrearAlarma2Screen
import co.edu.uniandes.intuitivealarms.screens.CreateAlarmScreen
import co.edu.uniandes.intuitivealarms.screens.LoginScreen
import co.edu.uniandes.intuitivealarms.screens.MainSelectionScreen
import co.edu.uniandes.intuitivealarms.screens.RecordAudioScreen
import co.edu.uniandes.intuitivealarms.screens.RegistrarseScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    val alarms = remember { mutableStateListOf<AlarmData>() }
    NavHost(navController, startDestination = "welcome") {
        composable("welcome") {
            MainSelectionScreen(
                onInicioClicked = { navController.navigate("login") },
                onRegistrarseClicked = { navController.navigate("registrarse") }
            )
        }
        composable("login") {
            LoginScreen(
                onCloseClicked = { navController.navigate("crearAlarma") },
                onRegistrarseClicked = { navController.navigate("registrarse") }
            )
        }
        composable("crearAlarma") {
            CreateAlarmScreen(
                alarms = alarms,
                onAddAlarmClicked = { navController.navigate("crearAlarma2") },
                onCloseClicked = { navController.navigate("login") }
            )
        }
        composable("crearAlarma2") {
            CrearAlarma2Screen(
                onMicClicked = {
                    navController.navigate("recordAudio")
                },
                onGuardarClicked = { h, m, am, title ->
                    alarms.add(AlarmData(hour = h, minute = m, isAm = am, title = title))
                    navController.popBackStack()
                },
                onBackClicked = { navController.popBackStack() }
            )
        }
        composable("recordAudio") {
            RecordAudioScreen {
                navController.popBackStack()
            }
        }
        composable("registrarse") {
            RegistrarseScreen(
                onCloseClicked = { navController.popBackStack() }
            )
        }
    }
}
