package com.github.arisaksen.noteapp.util

import androidx.room.TypeConverter
import java.util.Date

class DateConverter {

    @TypeConverter
    fun timeStampFromDate(date: Date): Long =
        date.time

    @TypeConverter
    fun dateFromTimestamp(timestamp: Long): Date? =
        Date(timestamp)

}