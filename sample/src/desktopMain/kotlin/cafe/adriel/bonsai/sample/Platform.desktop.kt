package cafe.adriel.bonsai.sample

import okio.FileSystem
import okio.Path
import okio.Path.Companion.toPath

actual fun getDefaultDataFolderPath(): Path {
    return System.getProperty("user.home")?.toPath() ?: FileSystem.SYSTEM_TEMPORARY_DIRECTORY
}
