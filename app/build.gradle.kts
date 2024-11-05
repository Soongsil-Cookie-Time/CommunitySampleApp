plugins {
    alias(libs.plugins.android.application)
    id("com.google.gms.google-services")
}

android {
    namespace = "com.ssuclass.communitysampleapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.ssuclass.communitysampleapp"
        minSdk = 24
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildFeatures {
        viewBinding = true
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

    // Firebase BoM (Bill of Materials)으로 모든 Firebase 라이브러리 버전 관리
    implementation(platform("com.google.firebase:firebase-bom:32.1.1"))

    // Firestore 라이브러리
    implementation("com.google.firebase:firebase-firestore-ktx")

    // Firebase Core (기본 Firebase 기능 사용 시 추가 가능)
    implementation("com.google.firebase:firebase-analytics-ktx")
}