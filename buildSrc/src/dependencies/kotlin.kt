const val VERSION_KOTLIN = "1.3.72"
const val VERSION_COROUTINES = "1.3.6"
private const val VERSION_DOKKA: String = "0.10.1"

fun Dependencies.kotlinx(module: String, version: String? = null) =
    "org.jetbrains.kotlinx:kotlinx-$module${version?.let { ":$it" } ?: ""}"

fun Dependencies.dokka() = "org.jetbrains.dokka:dokka-gradle-plugin:$VERSION_DOKKA"

val Plugins.dokka get() = id("org.jetbrains.dokka")