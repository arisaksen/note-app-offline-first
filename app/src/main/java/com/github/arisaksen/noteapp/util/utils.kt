package com.github.arisaksen.noteapp.util

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale


fun Date.formatDateForNote(noteDateFormat: String): String =
    SimpleDateFormat(noteDateFormat, Locale.getDefault()).format(this.time)