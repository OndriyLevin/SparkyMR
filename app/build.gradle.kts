plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.sparkymr"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.sparkymr"
        minSdk = 29
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")

    // Meta Spatial SDK
    implementation("com.meta.spatial:meta-spatial-sdk:0.9.2")
    implementation("com.meta.spatial:meta-spatial-sdk-toolkit:0.9.2")
    implementation("com.meta.spatial:meta-spatial-sdk-vr:0.9.2")
}
