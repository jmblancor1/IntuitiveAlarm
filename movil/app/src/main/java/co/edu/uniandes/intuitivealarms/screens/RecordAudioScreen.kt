package co.edu.uniandes.intuitivealarms.screens

import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material.icons.filled.Save
import androidx.compose.material.icons.filled.Stop
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay

@Composable
fun RecordAudioScreen(
    onBackClicked: () -> Unit = {},
    onStopClicked: () -> Unit = {},
    onRecordClicked: () -> Unit = {},
    onPauseClicked: () -> Unit = {},
    onSaveClicked: () -> Unit = {}
) {
    var recordingTime by remember { mutableStateOf(0) }
    val infiniteTransition = rememberInfiniteTransition()
    val amplitude by infiniteTransition.animateFloat(
        initialValue = 10f,
        targetValue = 40f,
        animationSpec = infiniteRepeatable(
            animation = tween(800),
            repeatMode = RepeatMode.Reverse
        )
    )
    LaunchedEffect(Unit) {
        while (true) {
            delay(1000)
            recordingTime++
        }
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    listOf(Color(0xFF00B7C0), Color.White)
                )
            )
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp, vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .clickable { onBackClicked() },
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = null,
                        tint = Color.Black
                    )
                }
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Grabación",
                    fontSize = 20.sp,
                    color = Color.Black
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                contentAlignment = Alignment.Center
            ) {
                Box(
                    modifier = Modifier
                        .size(300.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(Color(0xFF1B1B1B)),
                    contentAlignment = Alignment.Center
                ) {
                    Canvas(modifier = Modifier.fillMaxSize()) {
                        for (i in 1..5) {
                            drawCircle(
                                color = Color(0xFF3F51B5),
                                radius = amplitude + i * 20,
                                style = Stroke(width = 2f)
                            )
                        }
                    }
                    Text(
                        text = formatSeconds(recordingTime),
                        color = Color.White,
                        fontSize = 16.sp
                    )
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Icon(
                    imageVector = Icons.Filled.Stop,
                    contentDescription = null,
                    tint = Color(0xFF00B7C0),
                    modifier = Modifier
                        .size(40.dp)
                        .clickable { onStopClicked() }
                )
                Spacer(modifier = Modifier.width(32.dp))
                Icon(
                    imageVector = Icons.Filled.Mic,
                    contentDescription = null,
                    tint = Color(0xFF00B7C0),
                    modifier = Modifier
                        .size(40.dp)
                        .clickable { onRecordClicked() }
                )
                Spacer(modifier = Modifier.width(32.dp))
                Icon(
                    imageVector = Icons.Filled.Pause,
                    contentDescription = null,
                    tint = Color(0xFF00B7C0),
                    modifier = Modifier
                        .size(40.dp)
                        .clickable { onPauseClicked() }
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Grabar Audio",
                    color = Color.Black,
                    fontSize = 16.sp
                )
                Spacer(modifier = Modifier.weight(1f))
                Icon(
                    imageVector = Icons.Filled.Save,
                    contentDescription = null,
                    tint = Color(0xFF00B7C0),
                    modifier = Modifier
                        .size(40.dp)
                        .clickable { onSaveClicked() }
                )
            }
        }
    }
}

private fun formatSeconds(seconds: Int): String {
    val h = seconds / 3600
    val m = (seconds % 3600) / 60
    val s = seconds % 60
    return String.format("%02d:%02d:%02d", h, m, s)
}
