package com.zmarkan.wordcounter

import java.util.*

class WordMapper {
    val wordMap: MutableMap<Word, Int> = mutableMapOf()

    fun addList(words: List<Word>) {

        //TODO: find a more functional way of doing this adding

        //TODO: maybe use getOrPut
        words.forEach {
            val currentNumberOfOccurences = wordMap[it]
            if(currentNumberOfOccurences != null){
                wordMap[it] = currentNumberOfOccurences + 1
            }
            else{
                wordMap.put(it, 1)
            }

        }
    }

    fun getWordsByOccurence(): List<Pair<Word, Int>> {
        return wordMap
                .toList()
                .sortedWith(Comparator { firstPair, secondPair -> secondPair.compareTo(firstPair)})
    }
}