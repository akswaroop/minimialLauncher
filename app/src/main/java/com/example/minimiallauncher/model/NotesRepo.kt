package com.example.minimiallauncher.model

import kotlinx.coroutines.flow.Flow

class NotepadRepository(private val dao: NotesDao) {
    suspend fun getNote() = dao.getNote()
    suspend fun saveNote(content: String) {
        dao.insertNote(Notes(id = 0, content = content))
    }
}
