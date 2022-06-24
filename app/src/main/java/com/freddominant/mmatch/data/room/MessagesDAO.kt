package com.freddominant.mmatch.data.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.freddominant.mmatch.data.room.entities.TextMessage
import kotlinx.coroutines.flow.Flow

@Dao
interface MessagesDAO {

    @Query("SELECT * FROM textmessage")
    fun getConversationHistory(): Flow<List<TextMessage>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun saveMessage(message: TextMessage)
}