package com.android.popularmoviesapp.tests

import com.android.popularmoviesapp.robots.HomePageRobot
import android.support.test.runner.AndroidJUnit4
import android.support.test.rule.ActivityTestRule
import com.android.popularmoviesapp.MainActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class HomePageTests {

    private val homePageRobot = HomePageRobot()

    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun checkTitle() {
        homePageRobot.checkPageTitle()
    }

    @Test
    fun checkMoviePosters() {
        homePageRobot.checkMoviePosters()
    }
}
