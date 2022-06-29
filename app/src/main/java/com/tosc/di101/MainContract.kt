package com.tosc.di101

interface MainContract {

    interface MainView {
        fun showLoader()
        fun hideLoader()
        fun showSuccess(results: List<String>)
    }

    interface MainPresenter {
        fun myButtonClicked()
    }
}