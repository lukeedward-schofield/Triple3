package triple3

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = AppInfo.NAME
    ) {
        MaterialTheme {
            Text(AppInfo.greeting())
        }
    }
}