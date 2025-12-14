package com.example.minimiallauncher.model

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface NotesDao {
    @Query("SELECT * FROM notes WHERE id = 0")
    suspend fun getNote(): Notes?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: Notes)
}
