package com.android.popularmoviesapp.robots

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.hasMinimumChildCount
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import com.android.popularmoviesapp.R
import org.hamcrest.CoreMatchers.anyOf

class HomePageRobot {
    // Verifies home page title
    fun checkPageTitle() {
        onView(withText("Popular Movies"))
            .check(matches(isDisplayed()))
    }
    // Verifies that at least two movies are displayed
    fun checkMoviePosters() {
        onView(anyOf(withId(R.id.movies_rv)))
            .check(matches(hasMinimumChildCount(2)))
    }
}