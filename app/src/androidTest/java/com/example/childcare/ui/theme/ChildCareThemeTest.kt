package com.example.childcare.ui.theme

import androidx.compose.material3.Text
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ChildCareThemeTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun childCareTheme_rendersContentCorrectly() {
        composeTestRule.setContent {
            ChildCareTheme {
                Text(text = "Theme Test Content")
            }
        }

        composeTestRule.onNodeWithText("Theme Test Content").assertIsDisplayed()
    }
}
