package com.shark.mymvvm

import android.util.Log
import com.shark.math.MathUtils

object MvvmTest {

    fun testLog() {
        val add = MathUtils.add(2, 3)
        Log.i("SharkChilli", "testLog: $add")
    }
}