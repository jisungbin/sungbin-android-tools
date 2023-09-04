/*
 * Developed by Ji Sungbin 2023.
 *
 * Licensed under the MIT.
 * Please see full license: https://github.com/jisungbin/sungbin-android-tools/blob/main/LICENSE
 */

plugins {
  `java-platform`
}

dependencies {
  constraints {
    api(buildArtifactId(tag = "magicnumber", version = "0.1.0"))
    api(buildArtifactId(tag = "toast", version = "0.1.0"))
    api(buildArtifactId(tag = "string", version = "0.1.0"))
  }
}

fun buildArtifactId(tag: String, version: String) =
  "land.sungbin.sat:sat-$tag:$version"
