package com.freddominant.mmatch.di

import com.freddominant.mmatch.data.room.repository.MessagesRepository
import com.freddominant.mmatch.data.room.repository.MessagesRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
abstract class MuzzModule {
    @Binds
    @ViewModelScoped
    abstract fun bindMessageRepository(
        messagesRepository: MessagesRepositoryImpl
    ): MessagesRepository
}