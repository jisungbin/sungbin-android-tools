package land.sungbin.android.dev.tool

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class SampleActivity : Activity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    @Suppress("SetTextI18n")
    setContentView(TextView(this).apply { text = "Hello, World!" })
  }
}