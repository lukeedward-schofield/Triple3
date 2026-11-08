package triple3

import kotlin.test.Test
import kotlin.test.assertTrue

class AppInfoTest {
    @Test
    fun greetingMentionsAppName() {
        assertTrue(AppInfo.greeting().contains(AppInfo.NAME))
    }
}