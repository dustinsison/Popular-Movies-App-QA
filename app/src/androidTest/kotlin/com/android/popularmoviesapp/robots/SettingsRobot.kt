package com.android.popularmoviesapp.robots

import android.content.Context
import android.support.test.InstrumentationRegistry
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withText
import com.android.popularmoviesapp.R

class SettingsRobot {
    private val context: Context = InstrumentationRegistry.getInstrumentation().targetContext
    private val sortBy: String = context.getString(R.string.sort_list_pref_label)
    private val sortByPopular: String = context.getString(R.string.sort_most_popular_label)
    private val sortByRated: String = context.getString(R.string.sort_highest_rated_label)
    private val sortByFavorites: String = context.getString(R.string.sort_favorite_movie_label)
    fun checkDefaultSettings() {
        onView(withText(sortBy)).check(matches(isDisplayed()))
        onView(withText(sortByPopular)).check(matches(isDisplayed()))
    }
    fun changeSortByRated() {
        onView(withText(sortBy)).perform(click())
        onView(withText(sortByRated)).perform(click())
        onView(withText(sortByRated)).check(matches(isDisplayed()))
    }
    fun changeSortByFavorites() {
        onView(withText(sortBy)).perform(click())
        onView(withText(sortByFavorites)).perform(click())
        onView(withText(sortByFavorites)).check(matches(isDisplayed()))
    }
}