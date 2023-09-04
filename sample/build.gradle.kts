/*
 * Developed by Ji Sungbin 2023.
 *
 * Licensed under the MIT.
 * Please see full license: https://github.com/jisungbin/sungbin-android-tools/blob/main/LICENSE
 */

import org.jetbrains.kotlin.gradle.dsl.KotlinProjectExtension

plugins {
  kotlin("android")
  android("application")
}

android {
  namespace = "land.sungbin.android.dev.tool"

  compileSdk = 34

  defaultConfig {
    minSdk = 21
    targetSdk = 34
    versionCode = 1
    versionName = "0.1.0"
  }

  sourceSets {
    getByName("main").java.srcDir("src/main/kotlin")
  }

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
  }

  extensions.configure<KotlinProjectExtension> {
    jvmToolchain(17)
  }
}