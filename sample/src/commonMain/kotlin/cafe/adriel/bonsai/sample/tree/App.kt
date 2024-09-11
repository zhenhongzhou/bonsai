package cafe.adriel.bonsai.sample.tree

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import cafe.adriel.bonsai.sample.HomeScreen
import cafe.adriel.voyager.navigator.Navigator

@Composable
fun App() {
    MaterialTheme {
        Navigator(HomeScreen)
    }
}
