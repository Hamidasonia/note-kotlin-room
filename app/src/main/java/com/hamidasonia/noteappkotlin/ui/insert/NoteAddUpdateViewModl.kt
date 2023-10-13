package com.hamidasonia.noteappkotlin.ui.insert

import android.app.Application
import androidx.lifecycle.ViewModel
import com.hamidasonia.noteappkotlin.database.Note
import com.hamidasonia.noteappkotlin.repository.NoteRepository

class NoteAddUpdateViewModl(application: Application): ViewModel() {
    private val mNoteRepository: NoteRepository = NoteRepository(application)

    fun insert(note: Note){
        mNoteRepository.insert(note)
    }

    fun delete(note: Note){
        mNoteRepository.delete(note)
    }

    fun update(note: Note) {
        mNoteRepository.update(note)
    }
}