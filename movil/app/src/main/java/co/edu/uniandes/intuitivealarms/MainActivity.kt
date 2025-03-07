package co.edu.uniandes.intuitivealarms

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import co.edu.uniandes.intuitivealarms.ui.theme.IntuitiveAlarmsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IntuitiveAlarmsTheme {
                AppNavigation()
            }
        }
    }
}
