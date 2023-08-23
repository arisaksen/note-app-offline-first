package com.github.arisaksen.noteapp.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.github.arisaksen.noteapp.model.Note
import com.github.arisaksen.noteapp.util.DateConverter
import com.github.arisaksen.noteapp.util.UUIDConverter

@Database(entities = [Note::class], version = 1, exportSchema = false)
@TypeConverters(DateConverter::class, UUIDConverter::class)
abstract class NoteDatabase : RoomDatabase() {
   abstract fun noteDao(): NoteDatabaseDao
}