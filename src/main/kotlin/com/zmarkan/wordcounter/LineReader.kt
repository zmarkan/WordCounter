package com.zmarkan.wordcounter

class LineReader {
    fun readLine(s: String): List<com.zmarkan.wordcounter.Word> {
        if (s.length <= 0)
            return emptyList()
        else {
            val regex = Regex("\\w+'?\\w*")
            return regex.findAll(s).map { com.zmarkan.wordcounter.Word(it.value) }.toList()
        }
    }
}