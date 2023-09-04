package land.sungbin.android.dev.tool

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import land.sungbin.android.dev.tool.magicnumber.Zero
import land.sungbin.android.dev.tool.string.replaceLast
import land.sungbin.android.dev.tool.toast.toast

class SampleActivity : Activity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val helloWorld = "[$Zero] ${"Hello, Hello!".replaceLast("Hello", "World")}"
    setContentView(TextView(this).apply { text = helloWorld })
    toast("Welcome~~")
  }
}
