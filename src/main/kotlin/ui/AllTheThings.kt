package ui

import aesthetic.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.PointerEventType
import androidx.compose.ui.input.pointer.onPointerEvent
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import theme.VaporColors
import theme.VaporFonts
import utils.glitch
import utils.holoFoil

/** All the things - the final composition */
@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun AllTheThings() {
    // Track mouse position
    var mousePosition by remember { mutableStateOf(Offset.Zero) }
    var boxSize by remember { mutableStateOf(Offset.Zero) }

    // Calculate offset based on mouse position relative to the box center
    val offsetX = if (boxSize.x > 0) {
        (mousePosition.x / boxSize.x - 0.5f) * 2f
    } else 0f

    Box(modifier = Modifier.Companion.fillMaxSize()
        .meshGradient(colorPoints)
        .onGloballyPositioned { coordinates ->
            boxSize = Offset(
                coordinates.size.width.toFloat(),
                coordinates.size.height.toFloat()
            )
        }
        .onPointerEvent(PointerEventType.Move) {
            mousePosition = it.changes.first().position
        }
        // Apply holoFoil modifier to the bounding box
        .holoFoil(offset = offsetX, intensity = 0.4f)
        .glitch(intensity = 0.05f)
    ) {

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
                useTiles = false
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
                .align(Alignment.BottomStart)
                .padding(top = 60.dp)
                .offset(x=180.dp)
        )

        Cassette(
            option = 6,
            modifier = Modifier.size(160.dp)
                .align(Alignment.BottomCenter)
                .padding(bottom = 60.dp)
        )
        // Add title at the top center
        TitleText(
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(top = 48.dp, end = 64.dp)
        )

        // Add "なに!?" text at the bottom start, rotated 45 degrees
        Text(
            text = "なに!?",
            style = VaporFonts.pressStart2PStyle.copy(
                color = Color.White,
                fontSize = 36.sp,
                shadow = Shadow(
                    color = VaporColors.RobinEggBlue,
                    offset = Offset(2f, 2f),
                    blurRadius = 2f)
            ),
            modifier = Modifier
                .align(Alignment.BottomStart)
                .offset(x = 0.dp, y = (-200).dp)
                .graphicsLayer(rotationZ = -90f)

        )
    }
}
