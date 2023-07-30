plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {
    namespace = "uz.feature.movie.ui"
    compileSdk = 33

    defaultConfig {
        minSdk = 24
        targetSdk = 33

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(project(":core:feature_api"))
    implementation(project(":core:common"))


    implementation(Deps.core)
    implementation(Deps.appcompat)
    implementation(Deps.material)
    testImplementation(Test.jUnit)
    androidTestImplementation(Test.testJunit)
    androidTestImplementation(Test.expresso)

    implementation(DaggerHilt.dagger)
    implementation(DaggerHilt.dagger_capt)
    implementation(DaggerHilt.dagger_compiler)

    implementation(JetpackCompose.jetpackNavigation)

}