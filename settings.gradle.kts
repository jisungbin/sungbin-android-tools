/*
 * Developed by Ji Sungbin 2023.
 *
 * Licensed under the MIT.
 * Please see full license: https://github.com/jisungbin/sungbin-android-tools/blob/main/LICENSE
 */

@file:Suppress("UnstableApiUsage")

rootProject.name = "sungbin-android-tools"

enableFeaturePreview("STABLE_CONFIGURATION_CACHE")
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

dependencyResolutionManagement {
  pluginManagement {
    repositories {
      mavenLocal()
      google()
      mavenCentral()
      gradlePluginPortal()
    }
  }
}

buildCache {
  local {
    removeUnusedEntriesAfterDays = 7
  }
}

include(
  ":sample",
  ":toast",
  ":string",
  ":magic-number",
)
