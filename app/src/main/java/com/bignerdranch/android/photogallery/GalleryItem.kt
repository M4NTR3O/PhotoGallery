package com.bignerdranch.android.photogallery

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import java.util.UUID

@Entity
data class GalleryItem(
    var title: String = "",
    @PrimaryKey var id: UUID = UUID.randomUUID(),
    @SerializedName("url_s") var url: String = ""
)
