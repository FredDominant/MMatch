package com.freddominant.mmatch.data.room.repository

import com.freddominant.mmatch.data.room.entities.TextMessage
import kotlinx.coroutines.flow.Flow

interface MessagesRepository {
    suspend fun getConversations(): Flow<List<TextMessage>>

    suspend fun saveMessage(message: TextMessage)
}