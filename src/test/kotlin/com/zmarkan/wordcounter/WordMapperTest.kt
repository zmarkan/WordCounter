package com.zmarkan.wordcounter

import org.junit.Assert
import org.junit.Test

class WordMapperTest {

    var wordMapper = WordMapper()


    @Test fun emptyWordMapperHasEmptySetAndEmptyMap(){
        val wordMapper = WordMapper()

        Assert.assertTrue(wordMapper.wordMap.isEmpty())
    }

    @Test fun addingListWithSingleItem(){
        val listOfSingleWord = listOf<Word>(Word("Hello"))
        wordMapper.addList(listOfSingleWord)

        Assert.assertEquals(1, wordMapper.wordMap.size)
        Assert.assertEquals(1, wordMapper.wordMap[Word("Hello")])
    }

    @Test fun addingListWithMultipleUniqueItems(){
        val listOfWords = listOf<Word>(Word("Hello"), Word("World"), Word("Meerkat"))

        wordMapper = WordMapper()
        wordMapper.addList(listOfWords)
        Assert.assertEquals(3, wordMapper.wordMap.size)
        Assert.assertEquals(1, wordMapper.wordMap[Word("Hello")])
        Assert.assertEquals(1, wordMapper.wordMap[Word("World")])
        Assert.assertEquals(1, wordMapper.wordMap[Word("Meerkat")])
    }
}

class WordMapper {
    val wordMap: MutableMap<Word, Int> = mutableMapOf()

    fun addList(words: List<Word>) {
        wordMap.putAll(words.map { Pair( it, 1) })
    }
}
