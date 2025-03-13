package co.edu.uniandes.intuitivealarms.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Folder
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.PlayCircleFilled
import androidx.compose.material.icons.filled.Vibration
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class AlarmData(
    val hour: Int,
    val minute: Int,
    val isAm: Boolean,
    val title: String
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreateAlarmScreen(
    alarms: SnapshotStateList<AlarmData>,
    onAddAlarmClicked: () -> Unit = {},
    onCloseClicked: () -> Unit = {}
) {
    val gradient = Brush.verticalGradient(listOf(Color(0xFF00B7C0), Color.White))
    Scaffold(
        topBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(Color(0xFF00B7C0)),
                contentAlignment = Alignment.TopEnd
            ) {
                IconButton(onClick = { onCloseClicked() }) {
                    Icon(Icons.Default.Close, contentDescription = null, tint = Color.Black)
                }
            }
        },
        floatingActionButtonPosition = FabPosition.Center,
        containerColor = Color.Transparent,
        floatingActionButton = {
            FloatingActionButton(
                onClick = { onAddAlarmClicked() },
                shape = CircleShape,
                containerColor = Color(0xFF00B7C0)
            ) {
                Text("+", color = Color.White, fontSize = 24.sp)
            }
        }
    ) { padding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(gradient)
                .padding(padding)
        ) {
            Column(Modifier.fillMaxSize().padding(16.dp)) {
                Text(
                    text = "Tus Alarmas",
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(Modifier.height(16.dp))
                alarms.forEach {
                    AlarmCard(it)
                    Spacer(Modifier.height(16.dp))
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AlarmCard(alarm: AlarmData) {
    var isExpanded by remember { mutableStateOf(false) }
    var alarmEnabled by remember { mutableStateOf(true) }
    val dayLabels = listOf("L", "M", "X", "J", "V", "S", "D")
    val dayStates = remember { mutableStateListOf(false, false, false, false, false, false, false) }
    val suffix = if (alarm.isAm) "AM" else "PM"
    val hourText = if (alarm.hour == 0) 12 else alarm.hour
    val displayColor = if (alarmEnabled) Color(0xFFE0F7FA) else Color(0xFFDADADA)
    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = displayColor),
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(Modifier.padding(16.dp)) {
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                Column {
                    Row {
                        IconButton(onClick = {}) {
                            Icon(Icons.Default.Folder, contentDescription = null, tint = Color.Gray)
                        }
                        Text(
                            text = if (alarm.title.isBlank()) "Adicionar Título" else alarm.title,
                            color = Color.Gray,
                            fontSize = 14.sp,
                            modifier = Modifier.align(Alignment.CenterVertically)
                        )
                    }
                    Text(
                        text = "%02d:%02d %s".format(hourText, alarm.minute, suffix),
                        fontWeight = FontWeight.Bold,
                        fontSize = 32.sp,
                        color = Color(0xFF424242)
                    )
                    Text("Diariamente", fontSize = 14.sp, color = Color.Gray)
                }
                Column(horizontalAlignment = Alignment.End) {
                    IconButton(onClick = { isExpanded = !isExpanded }) {
                        Icon(
                            imageVector = if (isExpanded) Icons.Filled.KeyboardArrowUp else Icons.Filled.KeyboardArrowDown,
                            contentDescription = null
                        )
                    }
                    Switch(
                        checked = alarmEnabled,
                        onCheckedChange = { alarmEnabled = it },
                        modifier = Modifier.scale(0.9f, 0.8f),
                        colors = SwitchDefaults.colors(
                            checkedTrackColor = Color.White,
                            uncheckedTrackColor = Color.White,
                            checkedThumbColor = Color(0xFF00B7C0),
                            uncheckedThumbColor = Color.LightGray
                        )
                    )
                }
            }
            if (isExpanded) {
                Spacer(Modifier.height(8.dp))
                Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                    dayLabels.forEachIndexed { i, d ->
                        if (i > 0) Spacer(Modifier.width(8.dp))
                        FilterChip(
                            selected = dayStates[i],
                            onClick = { dayStates[i] = !dayStates[i] },
                            shape = CircleShape,
                            colors = FilterChipDefaults.filterChipColors(
                                containerColor = Color(0xFF00B7C0),
                                labelColor = Color.White,
                                selectedContainerColor = Color(0xFFE0F7FA),
                                selectedLabelColor = Color(0xFF00B7C0)
                            ),
                            modifier = Modifier.size(36.dp),
                            label = {
                                Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                                    Text(d)
                                }
                            }
                        )
                    }
                }
                Spacer(Modifier.height(16.dp))
                Column {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(Icons.Filled.PlayCircleFilled, contentDescription = null, tint = Color.Gray)
                        Spacer(Modifier.width(4.dp))
                        Text("Sonido")
                        Spacer(Modifier.width(8.dp))
                        Text("Audio1", fontWeight = FontWeight.Medium)
                    }
                    Spacer(Modifier.height(8.dp))
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(Icons.Filled.Vibration, contentDescription = null, tint = Color.Gray)
                        Spacer(Modifier.width(4.dp))
                        Text("Vibración")
                        Spacer(Modifier.width(4.dp))
                        RadioButton(selected = false, onClick = {})
                    }
                    Spacer(Modifier.height(8.dp))
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(Icons.Filled.Delete, contentDescription = null, tint = Color.Gray)
                        Spacer(Modifier.width(4.dp))
                        Text("Eliminar")
                    }
                }
            }
        }
    }
}