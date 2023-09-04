/*
 * Developed by Ji Sungbin 2023.
 *
 * Licensed under the MIT.
 * Please see full license: https://github.com/jisungbin/sungbin-android-tools/blob/main/LICENSE
 */

@file:Suppress("unused")

package land.sungbin.android.dev.tool.string

/**
 * 주어진 문자열에서 마지막 단어를 특정 단어로 교체합니다.
 *
 * @param target 교체할 대상
 * @param replacement 교체할 단어
 *
 * @return 주어진 단어로 교체된 문자열
 */
public fun String.replaceLast(target: String, replacement: String): String {
  val pos = lastIndexOf(target)
  return if (pos > -1) {
    (substring(0, pos) + replacement + substring(pos + replacement.length))
  } else {
    this
  }
}
