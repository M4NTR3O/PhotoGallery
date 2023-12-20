package database

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.bignerdranch.android.photogallery.GalleryItem
import java.util.UUID

interface PhotoDao {
    @Query("SELECT * FROM galleryitem")
    fun getCrimes(): LiveData<List<GalleryItem>>

    @Query("SELECT * FROM galleryitem WHERE id=(:id)")
    fun getCrime(id: UUID): LiveData<GalleryItem?>
    @Update
    fun updateCrime(galleryItem: GalleryItem)
    @Insert
    fun addCrime(galleryItem: GalleryItem)
}