package com.tosc.di101

import android.os.Handler
import android.os.Looper

class MySampleInteractor(private val looper: Looper) : SampleInteractor {

    private val results = listOf("hello", "world", "dependency inejection")
    override fun fetchDataAndNotify(success : (List<String>) -> Unit) {

        Handler(looper).postDelayed({
            success.invoke(results)
        }, 2000)
    }
}