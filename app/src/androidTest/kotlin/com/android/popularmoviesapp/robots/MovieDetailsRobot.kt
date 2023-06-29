package com.android.popularmoviesapp.robots

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withId
import com.android.popularmoviesapp.R

class MovieDetailsRobot {
    fun checkDetailsPageImages() {
        onView(withId(R.id.movie_detail_backdrop_iv))
            .check(matches(isDisplayed()))
        onView(withId(R.id.movie_detail_iv))
            .check(matches(isDisplayed()))
    }
    fun checkDetailsPageText() {
        onView(withId(R.id.md_original_title))
            .check(matches(isDisplayed()))
        onView(withId(R.id.md_release_date))
            .check(matches(isDisplayed()))
        onView(withId(R.id.md_vote_avg))
            .check(matches(isDisplayed()))
        onView(withId(R.id.md_plot_synopsis))
            .check(matches(isDisplayed()))
    }
    fun checkTrailers() {
        onView(withId(R.id.md_trailers_rv))
            .perform(ViewActions.scrollTo())
            .check(matches(isDisplayed()))
    }
    fun checkReviews() {
        onView(withId(R.id.md_reviews_rv))
            .perform(ViewActions.scrollTo())
            .check(matches(isDisplayed()))
    }
    fun favoriteMovie() {
        onView(withId(R.id.favoriteFloatingActionButton))
            .check(matches(isDisplayed()))
            .perform(click())
    }
}