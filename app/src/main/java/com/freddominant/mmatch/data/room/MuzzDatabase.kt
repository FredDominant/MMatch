package com.freddominant.mmatch.data.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.freddominant.mmatch.data.room.entities.TextMessage

@Database(entities = [TextMessage::class], version = 1, exportSchema = false)
abstract class MuzzDatabase: RoomDatabase() {
    abstract fun messagesDAO(): MessagesDAO
}