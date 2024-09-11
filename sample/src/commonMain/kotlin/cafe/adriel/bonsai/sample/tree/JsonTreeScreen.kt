package cafe.adriel.bonsai.sample.tree

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import bonsai.sample.generated.resources.Res
import cafe.adriel.bonsai.core.Bonsai
import cafe.adriel.bonsai.core.tree.Tree
import cafe.adriel.bonsai.json.JsonBonsaiStyle
import cafe.adriel.bonsai.json.JsonTree
import kotlinx.serialization.json.JsonElement
import org.jetbrains.compose.resources.ExperimentalResourceApi

object JsonTreeScreen : TreeScreen<JsonElement> {

    override val title = "JSON Tree"
    @OptIn(ExperimentalResourceApi::class)
    @Composable
    override fun composeTree(): Tree<JsonElement> {
        var json by remember {
            mutableStateOf("{}")
        }
        LaunchedEffect(Unit) {
            json = Res.readBytes("files/response.json").decodeToString()
        }
        return JsonTree(json)
    }

    @Composable
    override fun BonsaiContent(
        tree: Tree<JsonElement>,
        modifier: Modifier
    ) {
        Bonsai(
            tree = tree,
            style = JsonBonsaiStyle(),
            modifier = modifier
        )
    }
}
