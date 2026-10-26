package kr.ac.android.tagmanager.data.local

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface StyleDao {
    @Insert
    suspend fun insertStyle(style: StyleEntity): Long

    @Insert
    suspend fun insertImages(images: List<StyleImageEntity>)
}