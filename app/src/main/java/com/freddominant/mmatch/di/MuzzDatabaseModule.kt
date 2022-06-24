package com.freddominant.mmatch.di

import android.content.Context
import androidx.room.Room
import com.freddominant.mmatch.data.room.MuzzDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object MuzzDatabaseModule {
    @Provides
    @Singleton
    fun providesDatabase(@ApplicationContext appContext: Context): MuzzDatabase {
        return Room.databaseBuilder(
            appContext,
            MuzzDatabase::class.java,
            "Muzz.db"
        ).build()
    }

    @Provides
    fun getMessagesDAO(muzzDatabase: MuzzDatabase) = muzzDatabase.messagesDAO()
}
