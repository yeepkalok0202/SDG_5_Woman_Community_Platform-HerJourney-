plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.wia2007mad"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.wia2007mad"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
        multiDexEnabled = true

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
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
// dependency for slider view
    implementation ("com.github.smarteist:autoimageslider:1.4.0")
    implementation ("com.github.bumptech.glide:glide:4.11.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.navigation:navigation-fragment:2.7.6")
    implementation("androidx.navigation:navigation-ui:2.7.6")
    implementation("androidx.recyclerview:recyclerview:1.3.2")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation ("com.github.bumptech.glide:glide:4.11.0")
    annotationProcessor ("com.github.bumptech.glide:compiler:4.11.0")
    implementation ("com.squareup.picasso:picasso:2.71828")
    implementation ("com.github.hakobast:dropdown-textview:0.3.1")
    implementation ("de.hdodenhof:circleimageview:3.1.0")
    implementation ("com.makeramen:roundedimageview:2.3.0")
    implementation ("androidx.lifecycle:lifecycle-viewmodel:2.6.2")
    //firebase stuff
    implementation(platform("com.google.firebase:firebase-bom:32.7.0"))
    implementation("com.google.firebase:firebase-analytics")
    implementation("com.google.firebase:firebase-messaging:23.4.0")
    implementation ("com.google.firebase:firebase-core:21.1.1")
    // Add the dependencies for any other desired Firebase products
    // https://firebase.google.com/docs/android/setup#available-libraries
    implementation("com.google.firebase:firebase-auth")
    implementation ("com.google.firebase:firebase-firestore")
    implementation("com.google.firebase:firebase-database:20.3.0")
    // Firebase Storage
    implementation ("com.google.firebase:firebase-storage:20.3.0") // Check for the latest version

    // Make sure you also have Firebase Core
    implementation ("com.google.firebase:firebase-core:21.1.1")
    implementation("com.google.firebase:firebase-appcheck")
//For emergency locator
    implementation("com.karumi:dexter:6.2.2")
    implementation("com.google.android.gms:play-services-maps:18.2.0")
    implementation("com.google.android.gms:play-services-location:21.0.1")
    implementation("com.google.android.libraries.places:places:3.3.0")
    implementation("com.firebaseui:firebase-ui-firestore:8.0.2")
    implementation ("androidx.multidex:multidex:2.0.1")

    implementation("com.intuit.sdp:sdp-android:1.0.6")
    implementation("com.intuit.ssp:ssp-android:1.0.6")
    //above is sdp ssp for scale independent resolutions

    //for slide task
    implementation ("it.xabaras.android:recyclerview-swipedecorator:1.4")


}
