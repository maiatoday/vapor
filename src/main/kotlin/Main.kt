import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.singleWindowApplication
import theme.VaporTheme
import ui.AllTheThings
import ui.Solo
import ui.TheLook

enum class UiState {
    Look,
    Solo,
    AllTheThings
}
@Composable
@Preview
fun App() {
    var uiState by remember { mutableStateOf(UiState.Solo) }

    VaporTheme {
        Box(modifier = Modifier.fillMaxSize()) {
            // Display content based on the current UI state
            when (uiState) {
                UiState.Look -> TheLook()
                UiState.Solo -> Solo()
                UiState.AllTheThings -> AllTheThings()
            }

            // Button to toggle between Look and Solo states
            Button(
                onClick = {
                    // Toggle between Look and Solo states only
                    uiState = when (uiState) {
                        UiState.Look -> UiState.Solo
                        UiState.Solo -> UiState.Look
                        UiState.AllTheThings -> UiState.Look
                    }
                },
                modifier = Modifier.align(Alignment.TopEnd).padding(16.dp)
            ) {
                Icon(Icons.Filled.Settings, contentDescription = "Settings")
            }

            // Button to switch to AllTheThings state
            Button(
                onClick = {
                    uiState = UiState.AllTheThings
                },
                modifier = Modifier.align(Alignment.BottomEnd).padding(16.dp)
            ) {
                Text(
                    text = "@maiatoday"
                )
            }
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
