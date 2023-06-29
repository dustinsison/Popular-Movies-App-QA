package com.android.popularmoviesapp.tests

import android.content.Context
import android.content.pm.PackageManager
import android.support.test.InstrumentationRegistry
import android.support.test.espresso.Espresso.onIdle
import android.support.test.rule.ActivityTestRule
import com.android.popularmoviesapp.MainActivity
import org.junit.After
import org.junit.Before
import org.junit.Rule
import java.io.File

open class BaseTest {
    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)
    @Before
    fun onStart() {
        val context = InstrumentationRegistry.getInstrumentation().targetContext
        clearAppData(context)
        onIdle()
    }
    // Function to clear app data programmatically
    private fun clearAppData(context: Context) {
        try {
            val packageName = context.packageName
            val packageManager: PackageManager = context.packageManager
            packageManager.getPackageInfo(packageName, PackageManager.GET_META_DATA)?.let {
                val appData = File(it.applicationInfo.dataDir)
                appData.listFiles()?.forEach { file ->
                    file.deleteRecursively()
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
    @After
    fun onEnd() {
        val context = InstrumentationRegistry.getInstrumentation().targetContext
        clearAppData(context)
    }
}