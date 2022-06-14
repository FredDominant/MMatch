package com.freddominant.mmatch.data.room.entities

import java.util.*

interface Message {
    val date: Long
    fun relativeDate (): Calendar
}