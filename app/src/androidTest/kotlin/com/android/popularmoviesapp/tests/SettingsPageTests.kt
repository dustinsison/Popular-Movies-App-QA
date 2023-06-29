package com.android.popularmoviesapp.tests

import android.support.test.runner.AndroidJUnit4
import com.android.popularmoviesapp.robots.HomePageRobot
import com.android.popularmoviesapp.robots.SettingsRobot
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class SettingsPageTests : BaseTest() {
    private val homePageRobot = HomePageRobot()
    private val settingsRobot = SettingsRobot()
    @Test
    // Checks the default settings
    fun verifySettingsPage() {
        homePageRobot.selectSettings()
        settingsRobot.checkDefaultSettings()
    }
    @Test
    // Changes the sort by settings
    fun changeSortSettings() {
        homePageRobot.selectSettings()
        settingsRobot.changeSortByRated()
    }
}