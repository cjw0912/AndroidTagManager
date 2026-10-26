package kr.ac.android.tagmanager.data.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey


@Entity(
    tableName = "style_image",
    foreignKeys = [
        ForeignKey(
            entity = StyleEntity::class,
            parentColumns = ["style_id"],
            childColumns = ["style_id"]
        )
    ]
)
data class StyleImageEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "image_id")
    val id: Int = 0,

    @ColumnInfo(name = "style_id")
    val styleId: Int,

    @ColumnInfo(name = "img_url")
    val url: String,

    @ColumnInfo(name = "image_prompt")
    val prompt: String
)