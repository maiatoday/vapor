import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.singleWindowApplication
import kotlinx.coroutines.delay
import theme.VaporTheme
import theme.PaletteDisplay


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

    VaporTheme {
        Box(modifier = Modifier.fillMaxSize()) {
            Column {
                Row {
                    Text(
                        text = text + if (showCursor) "_" else "",
                        modifier = Modifier.padding(16.dp)
                    )
                }

                // Display the color palette below Hello World
                PaletteDisplay()
            }

            Text(
                text = "@maiatoday",
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
