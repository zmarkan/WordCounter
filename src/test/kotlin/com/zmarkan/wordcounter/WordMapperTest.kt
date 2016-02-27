package com.zmarkan.wordcounter

import org.junit.Assert
import org.junit.Test

class WordMapperTest {

    @Test fun emptyWordMapperHasEmptySetAndEmptyMap(){
        val wordMapper = WordMapper()

        Assert.assertTrue(wordMapper.wordMap.isEmpty())
    }

    @Test fun addingListWithSingleItem(){
        val listOfSingleWord = listOf(Word("Hello"))
        val wordMapper = WordMapper()
        wordMapper.addList(listOfSingleWord)

        Assert.assertEquals(1, wordMapper.wordMap.size)
        Assert.assertEquals(1, wordMapper.wordMap[Word("Hello")])
    }

    @Test fun addingListWithMultipleUniqueItems(){
        val listOfWords = listOf(Word("Hello"), Word("World"), Word("Meerkat"))
        val wordMapper = WordMapper()
        wordMapper.addList(listOfWords)

        Assert.assertEquals(3, wordMapper.wordMap.size)
        Assert.assertEquals(1, wordMapper.wordMap[Word("Hello")])
        Assert.assertEquals(1, wordMapper.wordMap[Word("World")])
        Assert.assertEquals(1, wordMapper.wordMap[Word("Meerkat")])
    }

    @Test fun addingListWithNonUniqueItems(){
        val listOfWords = listOf("Hello".toWord(), "hello".toWord(), "Hello".toWord(), "meerkat".toWord(), "meerkat".toWord());
        val wordMapper = WordMapper()
        wordMapper.addList(listOfWords)

        Assert.assertEquals(2, wordMapper.wordMap.size)
        Assert.assertEquals(3, wordMapper.wordMap["hello".toWord()])
        Assert.assertEquals(2, wordMapper.wordMap["meerkat".toWord()])
    }

    @Test fun addingSeveralLists(){
        val listOfWords = listOf("Hello".toWord(), "hello".toWord(), "Hello".toWord(), "meerkat".toWord(), "meerkat".toWord());
        val listOfMoreMeerkats = listOf("meerkat".toWord(), "meerkat".toWord(), "notMeerkat".toWord())
        val wordMapper = WordMapper()
        wordMapper.addList(listOfWords)
        wordMapper.addList(listOfMoreMeerkats)

        Assert.assertEquals(3, wordMapper.wordMap.size)
        Assert.assertEquals(3, wordMapper.wordMap["hello".toWord()])
        Assert.assertEquals(4, wordMapper.wordMap["meerkat".toWord()])
    }

    @Test fun sortWordsByOccurence(){
        val listOfWords = listOf("Hello".toWord(), "hello".toWord(), "Hello".toWord(), "meerkat".toWord(), "meerkat".toWord());
        val listOfMoreMeerkats = listOf("meerkat".toWord(), "meerkat".toWord(), "notMeerkat".toWord())
        val biggestListEver = listOf("item".toWord(), "item".toWord(), "item".toWord(), "item".toWord(), "item".toWord(), "item".toWord(), "item".toWord())

        val wordMapper = WordMapper()
        wordMapper.addList(listOfWords)
        wordMapper.addList(listOfMoreMeerkats)
        wordMapper.addList(biggestListEver)

        val mostCommon = wordMapper.getWordsByOccurence().first()
        val leastCommon = wordMapper.getWordsByOccurence().last()

        Assert.assertEquals(7, mostCommon.second)
        Assert.assertEquals("item".toWord(), mostCommon.first)
        Assert.assertEquals(1, leastCommon.second)
        Assert.assertEquals("notmeerkat".toWord(), leastCommon.first)
    }
}
