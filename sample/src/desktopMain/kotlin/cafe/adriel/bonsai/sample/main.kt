package cafe.adriel.bonsai.sample

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import cafe.adriel.bonsai.sample.tree.App

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Sample",
    ) {
        App()
    }
}
