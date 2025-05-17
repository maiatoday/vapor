package ui

//⚡️👀
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.Shadow
//import androidx.compose.material.Text

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import theme.VaporColors

/**
 * Title composable with "Compose draw speedrun" text in OrchidPink using
 * RubikGlitch font and subtitle with "Reloaded" text in white using
 * Neonderthaw font
 */
@Composable
fun TitleText(modifier: Modifier = Modifier) {
    //⚡️ title
}

/** Solo version of RubikGlitchTitle for individual display */
@Composable
fun SoloRubikGlitchTitle() {
    Box(modifier = Modifier.fillMaxSize().background(VaporColors.RaisinBlack)) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            TitleText()
        }

        // Add "なに!?" text at the bottom start, rotated 45 degrees
        //⚡️ nani

    }
}
