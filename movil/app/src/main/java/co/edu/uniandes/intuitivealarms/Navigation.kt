package co.edu.uniandes.intuitivealarms

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import co.edu.uniandes.intuitivealarms.screens.CrearAlarma2Screen
import co.edu.uniandes.intuitivealarms.screens.CreateAlarmScreen
import co.edu.uniandes.intuitivealarms.screens.LoginScreen
import co.edu.uniandes.intuitivealarms.screens.MainSelectionScreen
import co.edu.uniandes.intuitivealarms.screens.RecordAudioScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = "welcome") {
        composable("welcome") {
            MainSelectionScreen(
                onInicioClicked = { navController.navigate("login") }
            )
        }
        composable("login") {
            LoginScreen {
                navController.navigate("crearAlarma")
            }
        }
        composable("crearAlarma") {
            CreateAlarmScreen(
                onAddAlarmClicked = {
                    navController.navigate("crearAlarma2")
                }
            )
        }

        composable("crearAlarma2") {
            CrearAlarma2Screen(
                onMicClicked = {
                    navController.navigate("recordAudio")
                },
                onBackClicked = { navController.popBackStack() }
            )
        }

        composable("recordAudio") {
            RecordAudioScreen {
                navController.popBackStack()
            }
        }
    }
}
