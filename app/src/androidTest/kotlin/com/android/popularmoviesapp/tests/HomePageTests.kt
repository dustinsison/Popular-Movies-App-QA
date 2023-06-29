package com.android.popularmoviesapp.tests

import com.android.popularmoviesapp.robots.HomePageRobot
import android.support.test.runner.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class HomePageTests : BaseTest() {
    private val homePageRobot = HomePageRobot()
    @Test
    // Checks app title
    fun checkTitle() {
        homePageRobot.checkPageTitle()
    }
    @Test
    // Checks app is displaying movies
    fun checkMoviePosters() {
        homePageRobot.checkMoviePosters()
    }
    @Test
    // Checks that the user can scroll down the list of movies and select one
    fun scrollToAndOpenMovieDetails() {
        homePageRobot.selectMovie(8)
    }
    @Test
    // Opens the settings page
    fun openSettings() {
        homePageRobot.selectSettings()
    }
}