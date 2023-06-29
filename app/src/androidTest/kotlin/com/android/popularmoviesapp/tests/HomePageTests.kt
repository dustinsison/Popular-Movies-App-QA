package com.android.popularmoviesapp.tests

import com.android.popularmoviesapp.robots.HomePageRobot
import android.support.test.runner.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class HomePageTests : BaseTest() {
    private val homePageRobot = HomePageRobot()
    @Test
    fun checkTitle() {
        homePageRobot.checkPageTitle()
    }
    @Test
    fun checkMoviePosters() {
        homePageRobot.checkMoviePosters()
    }
    @Test
    fun scrollToAndOpenMovieDetails() {
        homePageRobot.selectMovie(8)
    }
    @Test
    fun openSettings() {
        homePageRobot.selectSettings()
        Thread.sleep(10000)
    }
}