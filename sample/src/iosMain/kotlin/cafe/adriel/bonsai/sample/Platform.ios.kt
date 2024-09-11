package cafe.adriel.bonsai.sample

import okio.Path
import okio.Path.Companion.toPath
import platform.Foundation.NSSearchPathForDirectoriesInDomains
import platform.Foundation.NSDocumentDirectory
import platform.Foundation.NSUserDomainMask

actual fun getDefaultDataFolderPath(): Path {
    val paths = NSSearchPathForDirectoriesInDomains(NSDocumentDirectory, NSUserDomainMask, true)
    return (paths.first() as String).toPath()
}
