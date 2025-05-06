package ui

import aesthetic.Sunset
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
fun SoloSunset() {
    Box(
        modifier = Modifier.fillMaxSize().background(VaporColors.RaisinBlack),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier.Companion.fillMaxSize(),
            horizontalAlignment = Alignment.Companion.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Sunset Demo",
                style = VaporFonts.monotonStyle.copy(color = VaporColors.OrchidPink),
                modifier = Modifier.Companion.padding(16.dp)
            )
            Spacer(modifier = Modifier.height(24.dp))
            Sunset(size = 300.dp, retro = false)
            Sunset(size = 300.dp, retro = true)
        }
    }
}
