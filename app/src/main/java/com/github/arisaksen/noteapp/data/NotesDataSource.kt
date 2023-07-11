package com.github.arisaksen.noteapp.data

import com.github.arisaksen.noteapp.model.Note

class NotesDataSource {
    fun loadNotes(): List<Note> = listOf(
        Note(title = "A good day", description = "We went on vecation by the lake"),
        Note(title = "Android compose", description = "Work on compose"),
        Note(title = "Keep at it..", description = "Continue the course"),
        Note(title = "A good day", description = "day 1"),
        Note(title = "A good day", description = "day 2"),
        Note(title = "A good day", description = "day 3"),
        Note(title = "A good day", description = "day 4"),
        Note(title = "A good day", description = "day 5"),
        Note(title = "A bad day", description = "day 6"),
        Note(title = "A good day", description = "day 7"),
        Note(title = "A good day", description = "day 8")
    )

    companion object {
        fun loadNotes(): List<Note> = listOf(
            Note(title = "A good day", description = "We went on vecation by the lake"),
            Note(title = "Android compose", description = "Work on compose"),
            Note(title = "Keep at it..", description = "Continue the course"),
            Note(title = "A good day", description = "day 1"),
            Note(title = "A good day", description = "day 2"),
            Note(title = "A good day", description = "day 3"),
            Note(title = "A good day", description = "day 4"),
            Note(title = "A good day", description = "day 5"),
            Note(title = "A bad day", description = "day 6"),
            Note(title = "A good day", description = "day 7"),
            Note(title = "A good day", description = "day 8")
        )
    }
}