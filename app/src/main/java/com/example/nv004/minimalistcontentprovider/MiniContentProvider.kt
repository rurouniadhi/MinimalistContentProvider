package com.example.nv004.minimalistcontentprovider

import android.content.ContentProvider
import android.content.ContentValues
import android.content.ContentValues.TAG
import android.content.Context
import android.content.UriMatcher
import android.database.Cursor
import android.net.Uri
import android.util.Log
/**
 * Created by NV004 on 1/4/2018.
 */
class MiniContentProvider : ContentProvider() {
    private var sUriMatcher = UriMatcher(UriMatcher.NO_MATCH)
    var mData: Array<String>? = null


    override fun onCreate(): Boolean {
        initializeUriMatching()
        val context = context
        mData = context.resources.getStringArray(R.array.words)
        return true
    }
    private fun initializeUriMatching() {
        sUriMatcher.addURI(Contract.AUTHORITY, Contract.CONTENT_PATH + "/#", 1);
        sUriMatcher.addURI(Contract.AUTHORITY, Contract.CONTENT_PATH, 0);
    }
    override fun getType(uri: Uri): String? {
        when(sUriMatcher.match(uri)){
            0 -> return Contract.MULTIPLE_RECORD_MIME_TYPE
            1 -> return Contract.SINGLE_RECORD_MIME_TYPE
            else ->
                    return null
        }
    }

    override fun delete(p0: Uri?, p1: String?, p2: Array<out String>?): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun update(p0: Uri?, p1: ContentValues?, p2: String?, p3: Array<out String>?): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun query(uri: Uri, projection: Array<String>?, selection: String?, selectionArgs: Array<String>?, sortOrder: String): Cursor {

    }

    override fun insert(p0: Uri?, p1: ContentValues?): Uri {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        Log.e(TAG, "Not implemented: update uri: " )
    }



}