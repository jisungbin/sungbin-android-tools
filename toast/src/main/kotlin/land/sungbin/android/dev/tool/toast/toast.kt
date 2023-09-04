/*
 * Developed by Ji Sungbin 2023.
 *
 * Licensed under the MIT.
 * Please see full license: https://github.com/jisungbin/sungbin-android-tools/blob/main/LICENSE
 */

@file:Suppress("unused")

package land.sungbin.android.dev.tool.toast

import android.app.Activity
import android.widget.Toast

/**
 * 토스트 메시지를 표시합니다.
 *
 * @param message 출력할 메시지
 * @param length 토스트 길이. 기본값은 [Toast.LENGTH_SHORT] 입니다.
 *
 * @return 표시되는 토스트 인스턴스
 */
public fun Activity.toast(message: String, length: Int = Toast.LENGTH_SHORT): Toast =
  Toast.makeText(applicationContext, message, length)!!.also(Toast::show)
