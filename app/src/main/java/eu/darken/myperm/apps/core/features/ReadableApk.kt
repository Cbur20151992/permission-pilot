package eu.darken.myperm.apps.core.features

import android.content.pm.ApplicationInfo
import android.content.pm.PackageInfo
import android.os.Build
import androidx.core.content.pm.PackageInfoCompat
import eu.darken.myperm.apps.core.Pkg
import eu.darken.myperm.common.hasApiLevel

// A Pkg where we have access to an APK
interface ReadableApk : Pkg {

    val packageInfo: PackageInfo

    val applicationInfo: ApplicationInfo?
        get() = packageInfo.applicationInfo

    val versionName: String?
        get() = packageInfo.versionName

    val versionCode: Long
        get() = PackageInfoCompat.getLongVersionCode(packageInfo)

    val sharedUserId: String?
        get() = packageInfo.sharedUserId

    val apiTargetLevel: Int?
        get() = applicationInfo?.targetSdkVersion

    val apiCompileLevel: Int?
        get() = if (hasApiLevel(Build.VERSION_CODES.S)) applicationInfo?.compileSdkVersion else null

    val apiMinimumLevel: Int?
        get() = applicationInfo?.minSdkVersion

}
