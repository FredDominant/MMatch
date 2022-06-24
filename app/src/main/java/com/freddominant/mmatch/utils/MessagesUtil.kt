package com.freddominant.mmatch.utils

import com.freddominant.mmatch.data.room.entities.TextMessage
import java.util.*

object MessagesUtil {
    fun getPrePopulatedMessages() : List<TextMessage>? {
        val calendar = Calendar.getInstance()
        val date = Date()
        calendar.firstDayOfWeek
//        calendar.set(year = 2020, month = Calendar.OCTOBER, date = )
        return null
    }
}