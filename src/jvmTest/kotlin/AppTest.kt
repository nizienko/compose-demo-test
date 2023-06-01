import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import org.junit.Rule
import org.junit.Test

class AppTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun testButtonClick() {
        composeTestRule.setContent {
            App()
        }

        composeTestRule.onNodeWithText("Hello, World!").performClick()
        composeTestRule.waitForIdle()
        composeTestRule.onNodeWithText("Hello, Desktop!").assertIsDisplayed()
    }
}
