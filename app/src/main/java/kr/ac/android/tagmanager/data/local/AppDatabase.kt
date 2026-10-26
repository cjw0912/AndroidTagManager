package kr.ac.android.tagmanager.data.local

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = { StyleEntity::class }, version = 1)
abstract class AppDatabase : RoomDatabase() {

}