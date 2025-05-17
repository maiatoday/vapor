//package ui
//
//import aesthetic.MarbleStatue
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.*
//import androidx.compose.material.Text
//import androidx.compose.runtime.*
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.ExperimentalComposeUiApi
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.geometry.Offset
//import androidx.compose.ui.input.pointer.PointerEventType
//import androidx.compose.ui.input.pointer.onPointerEvent
//import androidx.compose.ui.layout.onGloballyPositioned
//import androidx.compose.ui.unit.dp
//import theme.VaporColors
//import theme.VaporFonts
//import utils.holoFoil
//
//@OptIn(ExperimentalComposeUiApi::class)
//@Composable
//fun SoloHoloFoil(modifier: Modifier = Modifier) {
//    //region Track mouse position
//    var mousePosition by remember { mutableStateOf(Offset.Zero) }
//    var boxSize by remember { mutableStateOf(Offset.Zero) }
//
//    // Calculate offset based on mouse position relative to the box center
//    val offsetX = if (boxSize.x > 0) {
//        (mousePosition.x / boxSize.x - 0.5f) * 2f
//    } else 0f
//    //endregion
//
//    Box(
//        modifier = modifier
//            .fillMaxSize()
//            .background(VaporColors.RaisinBlack)
//            .onGloballyPositioned { coordinates ->
//                boxSize = Offset(
//                    coordinates.size.width.toFloat(),
//                    coordinates.size.height.toFloat()
//                )
//            }
//            .onPointerEvent(PointerEventType.Move) {
//                mousePosition = it.changes.first().position
//            }
//            // Apply holoFoil modifier to the bounding box
//            .holoFoil(offset = offsetX, intensity = 1f)
//    ) {
//        Column(
//            modifier = Modifier.fillMaxSize(),
//            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.Center
//        ) {
//            Text(
//                text = "HoloFoil Demo",
//                style = VaporFonts.monotonStyle.copy(color = VaporColors.OrchidPink),
//                modifier = Modifier.padding(16.dp)
//            )
//
//            Spacer(modifier = Modifier.height(24.dp))
//
//            Text(
//                text = "Move your mouse to adjust the holographic effect",
//                style = VaporFonts.pressStart2PStyle.copy(color = VaporColors.OrchidPink),
//                modifier = Modifier.padding(16.dp)
//            )
//
//            Spacer(modifier = Modifier.height(24.dp))
//            MarbleStatue()
//        }
//    }
//}
