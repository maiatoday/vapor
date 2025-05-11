package ui

import aesthetic.MarbleStatue
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import theme.VaporColors
import theme.VaporFonts
import utils.glitch

@Composable
fun SoloGlitch(modifier: Modifier = Modifier) {
    var intensity by remember { mutableStateOf(0.3f) }
    
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(VaporColors.RaisinBlack)
            // Apply glitch modifier to the bounding box
            .glitch(intensity = intensity)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Glitch Demo",
                style = VaporFonts.monotonStyle.copy(color = VaporColors.OrchidPink),
                modifier = Modifier.padding(16.dp)
            )

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "Digital distortion effect",
                style = VaporFonts.pressStart2PStyle.copy(color = VaporColors.OrchidPink),
                modifier = Modifier.padding(16.dp)
            )

            Spacer(modifier = Modifier.height(24.dp))
            
            // Add MarbleStatue as required in the issue description
            MarbleStatue()
        }
    }
}