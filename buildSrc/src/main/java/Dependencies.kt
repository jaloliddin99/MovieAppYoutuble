object Version {
    const val core = "1.7.0"
    const val appcompat = "1.6.1"
    const val material = "1.9.0"


    const val retrofit = "2.9.0"
    const val okHttp = "5.0.0-alpha.2"

    const val dagger_version = "2.44"
    const val hilt_compiler = "1.0.0"

    const val jUnit = "4.13.2"
    const val testJUnit = "1.1.5"
    const val expresso = "3.5.1"
    const val jetpackNavigation = "2.6.0"
}

object Deps {
    const val core = "androidx.core:core-ktx:${Version.core}"
    const val appcompat = "androidx.appcompat:appcompat:${Version.appcompat}"
    const val material = "com.google.android.material:material:${Version.material}"
}

object DaggerHilt {

    const val dagger = "com.google.dagger:hilt-android:${Version.dagger_version}"
    const val dagger_android_compiler = "com.google.dagger:hilt-android-compiler:${Version.dagger_version}"
    const val dagger_compiler = "androidx.hilt:hilt-compiler:${Version.hilt_compiler}"

}

object Retrofit {
    const val retrofit = "com.squareup.retrofit2:retrofit:${Version.retrofit}"
    const val retrofit_gson = "com.squareup.retrofit2:converter-gson:${Version.retrofit}"
    const val okHttp = "com.squareup.okhttp3:logging-interceptor:${Version.okHttp}"

}

object Test {
    const val jUnit = "junit:junit:${Version.jUnit}"
    const val testJunit = "androidx.test.ext:junit:${Version.testJUnit}"
    const val expresso = "androidx.test.espresso:espresso-core:${Version.expresso}"
}

object JetpackCompose{

    const val jetpackNavigation = "androidx.navigation:navigation-compose:${Version.jetpackNavigation}"

}


