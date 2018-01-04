package com.example.nv004.minimalistcontentprovider

import android.net.Uri

/**
 * Created by NV004 on 1/3/2018.
 */
object Contract{
    val AUTHORITY = "com.example.nv004.minimalistcontentprovider.provider"
    val CONTENT_PATH = "words"
    val CONTENT_URI = Uri.parse("content://$AUTHORITY/$CONTENT_PATH")
    val ALL_ITEMS = -2
    val WORD_ID = "id"
    val SINGLE_RECORD_MIME_TYPE = "vnd.android.cursor.item/vnd.com.example.nv004.provider.words"
    val MULTIPLE_RECORD_MIME_TYPE = "vnd.android.cursor.dir/vnd.com.example.nv004.provider.words"

}