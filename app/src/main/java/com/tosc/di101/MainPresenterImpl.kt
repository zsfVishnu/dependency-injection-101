package com.tosc.di101

import android.os.Looper

class MainPresenterImpl(private val view : MainContract.MainView) : MainContract.MainPresenter {

    private val myInteractor: SampleInteractor = MySampleInteractor(Looper.getMainLooper())

    override fun myButtonClicked() {
        view.showLoader()

        myInteractor.fetchDataAndNotify {
            view.hideLoader()
            view.showSuccess(it)
        }
    }
}