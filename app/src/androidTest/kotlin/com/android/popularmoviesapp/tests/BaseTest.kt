package com.android.popularmoviesapp.tests

import android.support.test.espresso.Espresso.onIdle
import android.support.test.rule.ActivityTestRule
import com.android.popularmoviesapp.MainActivity
import org.junit.Before
import org.junit.Rule

open class BaseTest {
    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)
    @Before
    fun onStart() {
        onIdle()
    }
}