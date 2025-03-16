import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.singleWindowApplication
import kotlinx.coroutines.delay

@Composable
@Preview
fun App() {
    val text = "Hello, World!"
    var showCursor by remember { mutableStateOf(true) }

    // Blinking cursor effect
    LaunchedEffect(Unit) {
        while (true) {
            delay(500) // 500ms blink rate
            showCursor = !showCursor
        }
    }

    MaterialTheme {
        Box(modifier = Modifier.fillMaxSize()) {
            Row {
                Text(
                    text = text + if (showCursor) "_" else "",
                    color = Color.Black,
                    modifier = Modifier.padding(16.dp)
                )
            }

            Text(
                text = "@maiatoday",
                color = Color.Black,
                modifier = Modifier.align(Alignment.BottomEnd).padding(16.dp)
            )
        }
    }
}

fun main() {
    singleWindowApplication(
        title = "Vapor",
        state = WindowState(width = 800.dp, height = 800.dp),
    ) {
        App()
    }
}
