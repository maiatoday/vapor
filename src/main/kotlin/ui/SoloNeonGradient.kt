package ui

import aesthetic.NeonGradient
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import theme.VaporColors
import theme.VaporFonts

@Composable
fun SoloNeonGradient() {
    Box(modifier = Modifier.fillMaxSize().background(VaporColors.RaisinBlack)) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Linear Gradient Demo",
                style = VaporFonts.monotonStyle.copy(color = VaporColors.OrchidPink),
                modifier = Modifier.padding(16.dp)
            )
            Spacer(modifier = Modifier.height(24.dp))
            
            // Horizontal gradient
            Text(
                text = "Horizontal Gradient",
                style = VaporFonts.monotonStyle.copy(color = VaporColors.OrchidPink),
                modifier = Modifier.padding(8.dp)
            )
            NeonGradient(
                width = 400.dp,
                height = 100.dp,
                horizontal = true
            )
            
            Spacer(modifier = Modifier.height(32.dp))
            
            // Vertical gradient
            Text(
                text = "Vertical Gradient",
                style = VaporFonts.monotonStyle.copy(color = VaporColors.OrchidPink),
                modifier = Modifier.padding(8.dp)
            )
            NeonGradient(
                width = 100.dp,
                height = 300.dp,
                horizontal = false
            )
        }
    }
}