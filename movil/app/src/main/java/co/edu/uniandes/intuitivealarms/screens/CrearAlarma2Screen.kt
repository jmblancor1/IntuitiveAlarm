package co.edu.uniandes.intuitivealarms.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CrearAlarma2Screen(
    onMicClicked: () -> Unit = {},
    onDeleteRecording: () -> Unit = {},
    onBackClicked: () -> Unit = {},
    onGuardarClicked: (Int, Int, Boolean, String) -> Unit = { _, _, _, _ -> }
) {
    var hourValue by remember { mutableStateOf("07") }
    var minuteValue by remember { mutableStateOf("00") }
    var isAmSelected by remember { mutableStateOf(true) }
    var titleValue by remember { mutableStateOf("") }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Brush.verticalGradient(listOf(Color(0xFF00B7C0), Color.White)))
    ) {
        Column(Modifier.fillMaxSize()) {
            Box(Modifier.fillMaxWidth().height(56.dp)) {
                Row(
                    Modifier
                        .fillMaxSize()
                        .padding(horizontal = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(Modifier.size(40.dp).clickable { onBackClicked() })
                    Spacer(Modifier.width(8.dp))
                    Text("Crea tu Alarma", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                }
            }
            Column(
                Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(20.dp))
                        .background(Color(0xFFE0F7FA))
                        .padding(16.dp)
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text("Seleccionar Hora", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                        Spacer(Modifier.height(4.dp))
                        Text("Seleccione los minutos primero.", fontSize = 14.sp, color = Color.Gray)
                        Spacer(Modifier.height(16.dp))
                        Row(
                            Modifier
                                .padding(horizontal = 16.dp, vertical = 8.dp)
                                .height(IntrinsicSize.Min),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                CustomTextField(hourValue) { hourValue = it }
                                Text(":", fontSize = 30.sp, modifier = Modifier.padding(horizontal = 8.dp))
                                CustomTextField(minuteValue) { minuteValue = it }
                            }
                            Spacer(Modifier.width(24.dp))
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                CheckButton("AM", isAmSelected) { if (it) isAmSelected = true }
                                CheckButton("PM", !isAmSelected) { if (it) isAmSelected = false }
                            }
                        }
                    }
                }
                Spacer(Modifier.height(24.dp))
                Text("Agregar Título (Opcional)", fontWeight = FontWeight.Bold, fontSize = 16.sp)
                Spacer(Modifier.height(8.dp))
                Box(
                    Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(8.dp))
                        .background(Color.White)
                        .border(1.dp, Color.Gray, RoundedCornerShape(8.dp))
                        .padding(horizontal = 8.dp, vertical = 4.dp)
                ) {
                    BasicTextField(
                        value = titleValue,
                        onValueChange = { titleValue = it },
                        textStyle = TextStyle.Default.copy(fontSize = 16.sp),
                        singleLine = true,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
                Spacer(Modifier.height(16.dp))
                Text("Graba tu mensaje Motivacional (Opcional)", fontWeight = FontWeight.Bold, fontSize = 16.sp)
                Spacer(Modifier.height(16.dp))
                Box(Modifier.fillMaxWidth().clip(RoundedCornerShape(16.dp)).padding(16.dp)) {
                    Column(Modifier.fillMaxWidth(), verticalArrangement = Arrangement.spacedBy(12.dp)) {
                        Row(
                            Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Start
                        ) {
                            Text("Pincha aquí y graba tu Mensaje", fontSize = 15.sp)
                            Spacer(Modifier.width(8.dp))
                            Box(Modifier.size(24.dp).clickable { onMicClicked() }, contentAlignment = Alignment.Center) {
                                Icon(Icons.Filled.Mic, contentDescription = null, tint = Color(0xFF00B7C0))
                            }
                        }
                        Row(
                            Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Start
                        ) {
                            Text("Audio 1", fontSize = 16.sp, color = Color.Black)
                            Spacer(Modifier.width(8.dp))
                            Box(Modifier.size(24.dp).clickable { onDeleteRecording() }, contentAlignment = Alignment.Center) {
                                Icon(Icons.Filled.Delete, contentDescription = null, tint = Color.Black)
                            }
                        }
                    }
                }
                Spacer(Modifier.height(32.dp))
                Box(
                    Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(Color(0xFF00B7C0))
                        .clickable {
                            val h = hourValue.toIntOrNull() ?: 7
                            val m = minuteValue.toIntOrNull() ?: 0
                            onGuardarClicked(h, m, isAmSelected, titleValue)
                        },
                    contentAlignment = Alignment.Center
                ) {
                    Text("Guardar Alarma", fontSize = 18.sp, color = Color.White)
                }
            }
        }
    }
}

@Composable
fun CustomTextField(value: String, onChange: (String) -> Unit) {
    Box(
        Modifier
            .width(80.dp)
            .height(45.dp)
            .background(Color.White, RoundedCornerShape(4.dp))
            .border(1.dp, Color.Gray, RoundedCornerShape(4.dp))
            .padding(4.dp)
    ) {
        BasicTextField(
            value = value,
            onValueChange = {
                if (it.length <= 2 && it.all { c -> c.isDigit() }) onChange(it)
            },
            textStyle = TextStyle.Default.copy(fontSize = 25.sp),
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier.fillMaxWidth().padding(4.dp)
        )
    }
}

@Composable
fun CheckButton(text: String, isChecked: Boolean, onChecked: (Boolean) -> Unit) {
    val bg = if (isChecked) Color(0xFFB2EBF2) else Color.White
    val bd = if (isChecked) Color(0xFF00ACC1) else Color.Gray
    Box(
        Modifier
            .clip(RoundedCornerShape(6.dp))
            .border(1.dp, bd, RoundedCornerShape(6.dp))
            .background(bg)
            .clickable { onChecked(true) }
            .padding(horizontal = 16.dp, vertical = 4.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(text, color = Color.Black, fontSize = 14.sp)
    }
}
