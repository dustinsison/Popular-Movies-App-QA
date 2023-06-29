package com.android.popularmoviesapp.tests

import android.support.test.espresso.Espresso.pressBack
import com.android.popularmoviesapp.robots.HomePageRobot
import com.android.popularmoviesapp.robots.MovieDetailsRobot
import com.android.popularmoviesapp.robots.SettingsRobot
import org.junit.Test

class MovieDetailsPageTests : BaseTest() {
    private val movieDetailsRobot = MovieDetailsRobot()
    private val homePageRobot = HomePageRobot()
    private val settingsRobot = SettingsRobot()
    @Test
    // Checks movie detail page elements
    fun checkMovieDetailsPage() {
        homePageRobot.selectMovie(0)
        movieDetailsRobot.checkDetailsPageText()
        movieDetailsRobot.checkDetailsPageImages()
        movieDetailsRobot.checkTrailers()
        movieDetailsRobot.checkReviews()
    }
    @Test
    // Checks that a movie can be marked as a favorite, and can be sorted as a favorite
    fun checkFavoriteMovie() {
        homePageRobot.selectMovie(0)
        movieDetailsRobot.favoriteMovie()
        pressBack()
        homePageRobot.selectSettings()
        settingsRobot.changeSortByFavorites()
        pressBack()
        homePageRobot.checkMoviePosters()
    }
}