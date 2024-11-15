plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.freshly"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.freshly"
        minSdk = 26
        //noinspection OldTargetApi
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    // Room Dependencies
    implementation(libs.room.runtime)
    annotationProcessor(libs.room.compiler)

    // TabLayout Dependencies
    implementation(libs.material.v180)
    implementation(libs.viewpager2)

    // JSON Dependencies
    implementation(libs.gson)
}