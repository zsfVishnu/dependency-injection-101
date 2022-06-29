package com.tosc.di101

interface SampleInteractor {
    fun fetchDataAndNotify(success : (List<String>) -> Unit)
}