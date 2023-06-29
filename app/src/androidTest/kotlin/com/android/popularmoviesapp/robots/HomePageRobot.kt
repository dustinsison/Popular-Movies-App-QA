package com.android.popularmoviesapp.robots

import android.content.Context
import android.support.test.InstrumentationRegistry.getInstrumentation
import android.support.test.espresso.Espresso
import android.support.test.espresso.Espresso.onIdle
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu
import android.support.test.espresso.UiController
import android.support.test.espresso.ViewAction
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition
import android.support.test.espresso.contrib.RecyclerViewActions.scrollToPosition
import android.support.test.espresso.matcher.ViewMatchers.hasMinimumChildCount
import android.support.test.espresso.matcher.ViewMatchers.isAssignableFrom
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.v7.widget.RecyclerView
import android.view.View
import com.android.popularmoviesapp.R
import org.hamcrest.CoreMatchers.anyOf

class HomePageRobot {
    private val context: Context = getInstrumentation().targetContext
    private val pageTitle: String = context.getString(R.string.app_name)
    private val settings: String = context.getString(R.string.action_settings)
    // Checks home page title
    fun checkPageTitle() {
        onView(withText(pageTitle))
            .check(matches(isDisplayed()))
    }
    // Checks that at least two movies are displayed
    fun checkMoviePosters() {
        onIdle()
        onView(anyOf(withId(R.id.movies_rv)))
            .check(matches(hasMinimumChildCount(0)))
    }
    // Selects movie at given index
    fun selectMovie(index: Int) {
        onView(withId(R.id.movies_rv))
            .perform(actionOnItemAtPosition<RecyclerView.ViewHolder>(index, clickChildViewWithId(R.id.movies_iv)))
            .perform(click())
        onIdle()
    }
    private fun clickChildViewWithId(viewId: Int): ViewAction {
        return object : ViewAction {
            override fun getConstraints() = isAssignableFrom(RecyclerView::class.java)
            override fun getDescription() = "Click on a child view with specified ID."
            override fun perform(uiController: UiController, view: View) {
                val childView = view.findViewById<View>(viewId)
                childView.performClick()
            }
        }
    }
    // Opens the settings menu
    fun selectSettings() {
        openActionBarOverflowOrOptionsMenu(getInstrumentation().targetContext)
        onView(withText(settings)).perform(click())
        onIdle()
    }
}