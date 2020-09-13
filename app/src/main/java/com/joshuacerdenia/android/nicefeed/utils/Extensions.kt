package com.joshuacerdenia.android.nicefeed.utils

import android.util.TypedValue
import android.view.View
import com.joshuacerdenia.android.nicefeed.data.model.EntryLight
import com.joshuacerdenia.android.nicefeed.data.model.FeedLight
import com.joshuacerdenia.android.nicefeed.data.model.FeedMinimal

fun List<FeedMinimal>.sortedByTitle() = this.sortedBy { it.title }

fun List<FeedMinimal>.sortedByCategory() = this.sortedBy { it.category }

@JvmName("sortedByTitleFeedLight")
fun List<FeedLight>.sortedByTitle() = this.sortedBy { it.title }

fun List<FeedLight>.sortedByUnreadCount() = this.sortedByDescending { it.unreadCount }

fun List<EntryLight>.sortedByDatePublished() = this.sortedByDescending { it.date }

fun List<EntryLight>.sortedUnreadOnTop() = this.sortedByDatePublished().sortedBy { it.isRead }

fun String.pathified() = this.substringAfter(
    "www.",
    this.substringAfter("://")
).removeSuffix("/")

fun String.simplified() = this.substringBefore("?").pathified()

fun String.shortened() = this.pathified().substringBefore("/").substringBefore("?")

fun View.addRipple() = with(TypedValue()) {
    context.theme.resolveAttribute(android.R.attr.selectableItemBackground, this, true)
    setBackgroundResource(resourceId)
}