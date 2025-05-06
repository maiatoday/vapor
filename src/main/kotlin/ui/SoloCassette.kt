package ui

import aesthetic.Cassette
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
fun SoloCassette() {
    Box(modifier = Modifier.fillMaxSize().background(VaporColors.RaisinBlack)) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Cassette Demo",
                style = VaporFonts.monotonStyle.copy(color = VaporColors.OrchidPink),
                modifier = Modifier.padding(16.dp)
            )
            Spacer(modifier = Modifier.height(24.dp))

            // First row of cassettes (1-3)
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.padding(16.dp)
            ) {
                Cassette(option = 1, modifier = Modifier.size(150.dp))
                Spacer(modifier = Modifier.width(16.dp))
                Cassette(option = 2, modifier = Modifier.size(150.dp))
                Spacer(modifier = Modifier.width(16.dp))
                Cassette(option = 3, modifier = Modifier.size(150.dp))
            }

            Spacer(modifier = Modifier.height(24.dp))

            // Second row of cassettes (4-6)
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.padding(16.dp)
            ) {
                Cassette(option = 4, modifier = Modifier.size(150.dp))
                Spacer(modifier = Modifier.width(16.dp))
                Cassette(option = 5, modifier = Modifier.size(150.dp))
                Spacer(modifier = Modifier.width(16.dp))
                Cassette(option = 6, modifier = Modifier.size(150.dp))
            }

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "Cassette Variants",
                style = VaporFonts.monotonStyle.copy(color = VaporColors.OrchidPink),
                modifier = Modifier.padding(16.dp)
            )

            // Row of cassette variants (v01-v04) using options 7-10
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.padding(16.dp)
            ) {
                Cassette(option = 7, modifier = Modifier.size(150.dp))
                Spacer(modifier = Modifier.width(16.dp))
                Cassette(option = 8, modifier = Modifier.size(150.dp))
                Spacer(modifier = Modifier.width(16.dp))
                Cassette(option = 9, modifier = Modifier.size(150.dp))
                Spacer(modifier = Modifier.width(16.dp))
                Cassette(option = 10, modifier = Modifier.size(150.dp))
            }
        }
    }
}
