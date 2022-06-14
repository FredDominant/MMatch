package com.freddominant.mmatch.data.room

import androidx.room.Dao
import androidx.room.Query
import com.freddominant.mmatch.data.room.entities.TextMessage
import kotlinx.coroutines.flow.Flow

@Dao
interface MessagesDAO {

    @Query("SELECT * FROM textmessage")
    fun getConversationHistory(): Flow<List<TextMessage>>
}