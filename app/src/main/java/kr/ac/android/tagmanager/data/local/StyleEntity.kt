package kr.ac.android.tagmanager.data.local
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Style")
data class StyleEntity (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "style_id")
    val id: Int,

    @ColumnInfo(name = "style_name")
    val name: String,

    @ColumnInfo(name = "style_prompt")
    val prompt: String
)