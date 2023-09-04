/*
 * Developed by Ji Sungbin 2023.
 *
 * Licensed under the MIT.
 * Please see full license: https://github.com/jisungbin/sungbin-android-tools/blob/main/LICENSE
 */

import org.jetbrains.kotlin.gradle.dsl.KotlinProjectExtension

plugins {
  kotlin("android")
  android("library")
}

android {
  namespace = "land.sungbin.android.dev.tool.toast"

  compileSdk = 34

  defaultConfig {
    minSdk = 21
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

kotlin {
  explicitApi()
}
