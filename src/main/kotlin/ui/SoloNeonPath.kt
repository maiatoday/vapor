package ui

import aesthetic.NeonPath
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
fun SoloNeonPath() {
    Box(modifier = Modifier.fillMaxSize().background(VaporColors.RaisinBlack)) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Neon Path Demo",
                style = VaporFonts.monotonStyle.copy(color = VaporColors.OrchidPink),
                modifier = Modifier.padding(16.dp)
            )
            Spacer(modifier = Modifier.height(24.dp))
            
            // Display the neon path
            NeonPath(
                width = 500.dp,
                height = 500.dp,
                strokeWidth = 8f
            )
            
            Spacer(modifier = Modifier.height(24.dp))
            
            // Display a thicker neon path
            Text(
                text = "Thicker Neon Path",
                style = VaporFonts.monotonStyle.copy(color = VaporColors.OrchidPink),
                modifier = Modifier.padding(8.dp)
            )
            NeonPath(
                width = 300.dp,
                height = 300.dp,
                strokeWidth = 15f
            )
        }
    }
}