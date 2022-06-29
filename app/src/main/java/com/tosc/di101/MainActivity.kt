package com.tosc.di101

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.Toast

class MainActivity : AppCompatActivity(), MainContract.MainView {


    private val  presenter : MainContract.MainPresenter = MainPresenterImpl(this)

    private lateinit var myLoader: ProgressBar

    private var isFetchingData = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myLoader = findViewById(R.id.progressbar)

        findViewById<Button>(R.id.button).setOnClickListener {
            if (!isFetchingData) {
                isFetchingData = true
                presenter.myButtonClicked()
            }
        }

    }

    override fun showLoader() {
        myLoader.visibility = View.VISIBLE
    }

    override fun hideLoader() {
        myLoader.visibility = View.GONE
    }

    override fun showSuccess(results: List<String>) {
        isFetchingData = false
        Toast.makeText(this,results.toString(), Toast.LENGTH_LONG ).show()
    }
}