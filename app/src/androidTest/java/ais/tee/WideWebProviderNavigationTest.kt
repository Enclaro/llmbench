package ais.tee

import androidx.compose.ui.test.assertDoesNotExist
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class WideWebProviderNavigationTest {
    @get:Rule
    val composeRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun providerNavigationStaysVisibleWithoutDrawerButton() {
        composeRule.onNodeWithTag("tab_web_service_claude").assertIsDisplayed()
        composeRule.onNodeWithTag("btn_web_provider_drawer").assertDoesNotExist()
    }
}
