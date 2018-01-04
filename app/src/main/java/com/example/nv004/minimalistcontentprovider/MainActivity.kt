package com.example.nv004.minimalistcontentprovider

import android.nfc.Tag
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    val TAG = MainActivity::class.java.simpleName
    var mTextView: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mTextView = findViewById(R.id.textview)
    }

    fun onClickDisplayEntries(view: View) {

        Log.d(TAG, "Yay, I was clicked!")
        when (view.id) {
            R.id.button_display_all -> Log.d(TAG, "Yay, " + R.id.button_display_all + " was clicked!")
            R.id.button_display_first -> Log.d(TAG, "Yay, " + R.id.button_display_first + " was clicked!")
            else -> Log.d(TAG, "Error. This should never happen.")
        }
        mTextView?.append("Thus we go! \n")
    }

}
