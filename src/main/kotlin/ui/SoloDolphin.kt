package ui

import aesthetic.Dolphin
import aesthetic.Dolphin2
import aesthetic.PinkDolphin
import aesthetic.PinkDolphin2
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
fun SoloDolphin() {
    Box(modifier = Modifier.fillMaxSize().background(VaporColors.RaisinBlack)) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Dolphin Demo",
                style = VaporFonts.monotonStyle.copy(color = VaporColors.OrchidPink),
                modifier = Modifier.padding(16.dp)
            )
            Spacer(modifier = Modifier.height(24.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.padding(16.dp)
            ) {
                PinkDolphin(modifier = Modifier.size(150.dp))
                Spacer(modifier = Modifier.width(16.dp))
                PinkDolphin2(modifier = Modifier.size(150.dp))
            }
            Spacer(modifier = Modifier.height(24.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.padding(16.dp)
            ) {
                Dolphin(modifier = Modifier.size(100.dp))
                Spacer(modifier = Modifier.width(16.dp))
                Dolphin2(modifier = Modifier.size(100.dp))
            }
        }
    }
}
