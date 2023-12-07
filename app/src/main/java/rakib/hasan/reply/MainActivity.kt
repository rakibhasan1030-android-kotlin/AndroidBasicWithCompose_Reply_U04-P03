package rakib.hasan.reply

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import rakib.hasan.reply.ui.ReplyApp
import rakib.hasan.reply.ui.theme.ReplyTheme

class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ReplyTheme {
                Surface {
                    val windowSize = calculateWindowSizeClass(this)
                    ReplyApp(
                        windowSize = windowSize.widthSizeClass
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ReplyAppPreview() {
    ReplyTheme {
        Surface {
            ReplyApp(
                windowSize = WindowWidthSizeClass.Compact,
            )
        }
    }
}