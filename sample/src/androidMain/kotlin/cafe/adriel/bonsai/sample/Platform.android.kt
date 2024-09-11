package cafe.adriel.bonsai.sample

import android.os.Build
import androidx.annotation.RequiresApi
import okio.FileSystem
import okio.Path
import okio.Path.Companion.toOkioPath

@RequiresApi(Build.VERSION_CODES.N)
actual fun getDefaultDataFolderPath(): Path {
    return SampleApplication.getContext().dataDir?.toOkioPath() ?: FileSystem.SYSTEM_TEMPORARY_DIRECTORY
}
