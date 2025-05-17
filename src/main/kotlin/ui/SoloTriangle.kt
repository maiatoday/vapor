package ui

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
fun SoloTriangle() {
    Box(modifier = Modifier.Companion.fillMaxSize().background(VaporColors.RaisinBlack)) {
        Column(
            modifier = Modifier.Companion.fillMaxSize(),
            horizontalAlignment = Alignment.Companion.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Triangle Demo",
                style = VaporFonts.monotonStyle.copy(color = VaporColors.OrchidPink),
                modifier = Modifier.Companion.padding(16.dp)
            )
            Spacer(modifier = Modifier.height(24.dp))
            //👀
//            Triangle(
//                size = 200.dp,
//                color1 = VaporColors.Mulberry,
//                color2 = VaporColors.RobinEggBlue,
//                color3 = VaporColors.Glaucous
//            )
        }
    }
}
