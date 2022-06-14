package com.freddominant.mmatch.data.room.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class TextMessage(
    @PrimaryKey
    val id: Int,
    val text: String,
    val isFromMessage: Boolean,
    override val date: Long
): Message {
    override fun relativeDate(): Calendar {
        return Calendar.getInstance(Locale.getDefault()).apply {
            timeInMillis = date
        }
    }
}