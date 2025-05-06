package ui

import aesthetic.DolphinSchool
import aesthetic.MarbleStatue
import aesthetic.Triangle
import aesthetic.VanishingFloor
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import theme.VaporColors

/** All the things - the final composition */
@Composable
fun AllTheThings() {
    Box(modifier = Modifier.Companion.fillMaxSize().background(VaporColors.RaisinBlack)) {

        Column(
            modifier = Modifier.Companion.fillMaxSize(),
            horizontalAlignment = Alignment.Companion.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Triangle(
                size = 400.dp,
                color1 = VaporColors.Mulberry,
                color2 = VaporColors.RobinEggBlue,
                color3 = VaporColors.Glaucous
            )

            VanishingFloor(
                size = 400.dp,
                rows = 28,
                columns = 32,
                position = 0.67f,
                useTiles = true
            )
        }

        DolphinSchool(
            modifier = Modifier.padding(vertical = 16.dp)
                .align(Alignment.Center).offset((-120).dp, 20.dp)

        )
        MarbleStatue(
            modifier = Modifier.Companion.size(450.dp).align(Alignment.BottomEnd)

        )

    }
}
