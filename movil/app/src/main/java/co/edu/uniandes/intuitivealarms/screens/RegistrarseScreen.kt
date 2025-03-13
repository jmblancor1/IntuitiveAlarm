package co.edu.uniandes.intuitivealarms.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import co.edu.uniandes.intuitivealarms.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegistrarseScreen(
    onCloseClicked: () -> Unit = {}
) {
    val backgroundBrush = Brush.verticalGradient(
        colors = listOf(
            Color(0xFF00B7C0),
            Color.White
        )
    )
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Scaffold(
        containerColor = Color.Transparent,
        topBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                contentAlignment = Alignment.TopEnd
            ) {
                IconButton(
                    onClick = { onCloseClicked() },
                    modifier = Modifier.padding(8.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Close,
                        contentDescription = "Cerrar",
                        tint = Color.Black
                    )
                }
            }
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(brush = backgroundBrush)
                .padding(innerPadding)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp, vertical = 24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(8.dp))

                Icon(
                    painter = painterResource(id = R.drawable.reloj),
                    contentDescription = null,
                    tint = Color.Unspecified,
                    modifier = Modifier
                        .size(80.dp)
                        .clip(CircleShape)
                        .background(Color(0xFFF5F5F5))
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "Hola, Regístrate!!",
                    style = MaterialTheme.typography.headlineMedium.copy(
                        fontWeight = FontWeight.Bold
                    ),
                    color = Color.Black
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "Bienvenido a Intuitive Alarm.\nRegístrate y prepárate para despertar.",
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.Black,
                    fontSize = 15.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(horizontal = 16.dp)
                )

                Spacer(modifier = Modifier.height(24.dp))

                RoundedWhiteTextField(
                    value = email,
                    onValueChange = { email = it },
                    placeholderText = "Ingresa tu email"
                )

                Spacer(modifier = Modifier.height(16.dp))

                RoundedWhiteTextField(
                    value = password,
                    onValueChange = { password = it },
                    placeholderText = "Ingresa tu clave",
                    isPassword = true
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "Al registrarte aceptas los términos y condiciones de Intuitive Alarm",
                    color = Color.Black,
                    fontSize = 14.sp,
                    modifier = Modifier.padding(horizontal = 16.dp),
                    textAlign = TextAlign.Center
                )

                Spacer(modifier = Modifier.height(24.dp))

                Button(
                    onClick = {
                        onCloseClicked()
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .clip(RoundedCornerShape(24.dp)),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF00B7C0),
                        contentColor = Color.White
                    )
                ) {
                    Text(text = "Registrarse", fontSize = 18.sp)
                }
            }
        }
    }
}

