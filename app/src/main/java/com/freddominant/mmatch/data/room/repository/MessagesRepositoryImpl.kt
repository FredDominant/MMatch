package com.freddominant.mmatch.data.room.repository

import com.freddominant.mmatch.data.room.MessagesDAO
import com.freddominant.mmatch.data.room.entities.TextMessage
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class MessagesRepositoryImpl @Inject constructor(
    private val messagesDAO: MessagesDAO
) : MessagesRepository {

    override suspend fun getConversations(): Flow<List<TextMessage>> {
        return messagesDAO.getConversationHistory()
    }

    override suspend fun saveMessage(message: TextMessage) {
        messagesDAO.saveMessage(message)
    }
}