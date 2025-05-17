package ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import theme.VaporColors
import theme.VaporFonts

@Composable
fun SoloVanishingFloor() {
    // State for the vanishing point position
    val vanishingPointPosition = remember { mutableStateOf(0.5f) }
    // State for the tile toggle
    val useTiles = remember { mutableStateOf(false) }

    Box(modifier = Modifier.Companion.fillMaxSize().background(VaporColors.RaisinBlack)) {
        Column(
            modifier = Modifier.Companion.fillMaxSize(),
            horizontalAlignment = Alignment.Companion.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Receding Floor Perspective Grid",
                style = VaporFonts.monotonStyle.copy(color = VaporColors.OrchidPink),
                modifier = Modifier.padding(16.dp)
            )

            // Display and control for vanishing point position
            Text(
                text = "Vanishing Point Position: ${vanishingPointPosition.value}",
                style = MaterialTheme.typography.body2.copy(color = VaporColors.OrchidPink),
                modifier = Modifier.padding(top = 8.dp, bottom = 4.dp)
            )

            Slider(
                value = vanishingPointPosition.value,
                onValueChange = { vanishingPointPosition.value = it },
                valueRange = 0f..1f,
                modifier = Modifier.fillMaxWidth(0.8f).padding(horizontal = 16.dp)
            )

            // Toggle switch for tiles mode
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(8.dp)
            ) {
                Text(
                    text = "Tile",
                    style = MaterialTheme.typography.body2.copy(color = VaporColors.OrchidPink),
                    modifier = Modifier.padding(end = 8.dp)
                )
                Switch(
                    checked = useTiles.value,
                    onCheckedChange = { useTiles.value = it },
                    colors = SwitchDefaults.colors(
                        checkedThumbColor = VaporColors.Mulberry,
                        checkedTrackColor = VaporColors.OrchidPink,
                        uncheckedThumbColor = Color.White,
                        uncheckedTrackColor = Color.Gray
                    )
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            //👀
//            VanishingFloor(
//                size = 400.dp,
//                rows = 28,
//                columns = 32,
//                position = vanishingPointPosition.value,
//                useTiles = useTiles.value
//            )
        }
    }
}
