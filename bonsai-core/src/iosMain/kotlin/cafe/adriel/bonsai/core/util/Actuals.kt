package cafe.adriel.bonsai.core.util

import platform.Foundation.NSUUID.Companion.UUID

internal actual val randomUUID: String
    get() = UUID().UUIDString
