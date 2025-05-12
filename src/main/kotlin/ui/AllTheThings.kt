package ui

import aesthetic.*
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import theme.VaporColors

/** All the things - the final composition */
@Composable
fun AllTheThings() {
    Box(modifier = Modifier.Companion.fillMaxSize().meshGradient(colorPoints)) {

        Column(
            modifier = Modifier.fillMaxSize(),
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

        Sunset(
            modifier = Modifier.size(500.dp)
                .align(Alignment.TopEnd)
                .padding(top = 40.dp, end = 40.dp)
        )

        Palm(
            modifier = Modifier.size(600.dp)
                .offset((-180).dp, (-100).dp)
                .align(Alignment.BottomStart)
        )
        DolphinSchool(
            modifier = Modifier.padding(vertical = 16.dp)
                .align(Alignment.Center).offset((-120).dp, 20.dp)

        )
        MarbleStatue(
            modifier = Modifier.Companion.size(450.dp).align(Alignment.BottomEnd)

        )

        // Smaller LayeredMarbleStatue with horizontal flip
        LayeredMarbleStatue(
            modifier = Modifier.size(200.dp).align(Alignment.BottomStart).offset((200).dp, (-150).dp),
            flipHorizontally = true
        )

        Cassette(
            option = 10,
            modifier = Modifier.size(200.dp)
                .align(Alignment.BottomEnd)
                .padding(top = 40.dp, start = 40.dp)
        )
        Cassette(
            option = 3,
            modifier = Modifier.size(200.dp)
                .align(Alignment.BottomEnd)
                .padding(top = 40.dp, start = 40.dp)
                .offset(20.dp, 10.dp)
        )

        Cassette(
            option = 1,
            modifier = Modifier.size(180.dp)
                .align(Alignment.BottomStart)
                .padding(bottom = 40.dp, start = 40.dp)
        )

        Cassette(
            option = 5,
            modifier = Modifier.size(120.dp)
                .align(Alignment.CenterEnd)
                .padding(20.dp)
                .offset((-10).dp, 120.dp)
        )

        Cassette(
            option = 7,
            modifier = Modifier.size(150.dp)
                .align(Alignment.CenterStart)
                .padding(start = 60.dp, top = 100.dp)
        )

        Cassette(
            option = 4,
            modifier = Modifier.size(140.dp)
                .align(Alignment.BottomCenter)
                .padding(top = 60.dp)
        )

        Cassette(
            option = 6,
            modifier = Modifier.size(160.dp)
                .align(Alignment.BottomCenter)
                .padding(bottom = 60.dp)
        )

    }
}
