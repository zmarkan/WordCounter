package com.zmarkan.wordcounter

class LineReader {
    fun readLine(s: String): List<Word> {
        if (s.length <= 0)
            return emptyList()
        else {
            val regex = Regex("\\w+'?\\w*")
            return regex.findAll(s).map { Word(it.value) }.toList()
        }
    }
}