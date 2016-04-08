package com.antonioleiva.bandhookkotlin.ui.screens.tabs

import android.support.v4.app.Fragment
import com.antonioleiva.bandhookkotlin.BuildConfig
import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.whenever
import org.junit.Assert.*
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner
import org.robolectric.annotation.Config


//@RunWith(RobolectricGradleTestRunner::class)
//@Config(constants = BuildConfig::class)
class TabFragment2Test {

    

    // we can test java/kotlin level activity with these tests
    @Test
    fun testSillyFun() {
        var subject = TabFragment2()
        var result : String = subject.sillyFun()
        assert(result.equals("Hello Silly"))
    }

    // we can mock too:
    @Test
    fun testMoreSilly() {
        val mockTab2 : TabFragment2 = mock()
        whenever(mockTab2.sillyFun()).thenReturn("Mock me stupid")

        var subject = InnerClass(mockTab2)
        var result : String = subject.moreSilly()
        assert(result.equals("Mock me stupid"))



    }
}