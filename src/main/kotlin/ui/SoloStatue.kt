package ui

import aesthetic.LayeredMarbleStatue
import aesthetic.MarbleStatue
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import theme.VaporColors
import theme.VaporFonts
import utils.myBlur
import utils.weirdColorFilter

@Composable
fun SoloStatue(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize().background(VaporColors.RaisinBlack)) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Marble Statue Demo",
                style = VaporFonts.monotonStyle.copy(color = VaporColors.OrchidPink),
                modifier = Modifier.padding(16.dp)
            )
            Spacer(modifier = Modifier.height(24.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                // Default MarbleStatue
                MarbleStatue(modifier = Modifier.size(200.dp))

                // MarbleStatue with weird color filter
                MarbleStatue(
                    modifier = Modifier.size(200.dp),
                    colorFilter = weirdColorFilter
                )

                // MarbleStatue with blur modifier
                MarbleStatue(
                    modifier = Modifier.size(200.dp)
                        .myBlur()
                )

                // LayeredMarbleStatue with horizontal flip
                LayeredMarbleStatue(
                    modifier = Modifier.size(200.dp),
                    flipHorizontally = true
                )
            }
        }
    }
}
