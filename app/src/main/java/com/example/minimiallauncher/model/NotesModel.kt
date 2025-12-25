package com.example.minimiallauncher.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")
data class NotesModel(
    @PrimaryKey val id: Int = 0, // just one sticky note
    val content: String
)