package ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import theme.VaporColors
import theme.VaporFonts

/**
 * All the things - the final composition
 */
@Composable
fun AllTheThings() {
    Box(modifier = Modifier.Companion.fillMaxSize().background(VaporColors.RaisinBlack)) {
        Column(
            modifier = Modifier.Companion.fillMaxSize(),
            horizontalAlignment = Alignment.Companion.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Things Screen",
                style = VaporFonts.rubikGlitchStyle.copy(color = VaporColors.OrchidPink),
                modifier = Modifier.Companion.padding(16.dp)
            )
        }
    }
}
