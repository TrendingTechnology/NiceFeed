package com.joshuacerdenia.android.nicefeed.data.model

// Light version of Feed – no website and description

data class FeedLight(
    val url: String,
    var title: String,
    val imageUrl: String?,
    var category: String,
    var unreadCount: Int
)