package com.digitalhouse.testunit

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
@LargeTest
class MainTest {

    private lateinit var stringToBetyped: String

    @get:Rule
    val rule = ActivityTestRule(MainActivity::class.java)

    @Before
    fun initValidString(){
        stringToBetyped = "Espresso"
    }

    @Test
    fun changeText_sameActivity(){
        onView(withId(R.id.edit_text)).perform(typeText(stringToBetyped), closeSoftKeyboard())
        onView(withId(R.id.btn)).perform(click())


        onView(withId(R.id.textView)).check(matches(withText(stringToBetyped)))
        }
}