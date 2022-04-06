package cafe.adriel.bonsai.filesystem

import androidx.compose.runtime.Composable
import cafe.adriel.bonsai.core.Node
import okio.FileSystem
import okio.Path
import okio.Path.Companion.toOkioPath
import java.io.File
import java.nio.file.Path as NioPath

@Composable
public fun fileSystemNodes(
    rootDirectory: File,
    selfInclude: Boolean = false,
    style: FileSystemNodeStyle = FileSystemNodeStyle.DefaultStyle
): List<Node<Path>> =
    fileSystemNodes(
        rootDirectory = rootDirectory.toOkioPath(),
        fileSystem = FileSystem.SYSTEM,
        selfInclude = selfInclude,
        style = style
    )

@Composable
public fun fileSystemNodes(
    rootDirectory: NioPath,
    selfInclude: Boolean = false,
    style: FileSystemNodeStyle = FileSystemNodeStyle.DefaultStyle
): List<Node<Path>> =
    fileSystemNodes(
        rootDirectory = rootDirectory.toOkioPath(),
        fileSystem = FileSystem.SYSTEM,
        selfInclude = selfInclude,
        style = style
    )