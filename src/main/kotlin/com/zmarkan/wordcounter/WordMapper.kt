package com.zmarkan.wordcounter

import java.util.*

class WordMapper {
    val wordMap: MutableMap<Word, Int> = mutableMapOf()

    fun addList(words: List<Word>) {
        words.forEach { wordMap.put(it, wordMap.getOrPut(it, {0}) + 1)}
    }

    fun getWordsByOccurence(): List<Pair<Word, Int>> {
        return wordMap
                .toList()
                .sortedWith(Comparator { firstPair, secondPair -> secondPair.compareTo(firstPair)})
    }
}