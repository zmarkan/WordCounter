package com.zmarkan.wordcounter

import org.junit.Assert
import org.junit.Test

class LineReaderTest {

    val lineReader = LineReader()

    @Test fun readingEmptyLineReturnsNoWords() {
        Assert.assertTrue(lineReader.readLine("").isEmpty())
    }

    @Test fun readingSingleWordInLine(){
        Assert.assertEquals(1, lineReader.readLine("Hello").size)
    }

    @Test fun readingWordsSeparatedBySpaces(){
        val inputString = "Foo bar baz"
        Assert.assertEquals(3, lineReader.readLine(inputString).size)
    }

    @Test fun readingWordsSeparatedByAnyPunctuation(){
        val inputString = "Foo, bar! Baz; Foo? bar: \"baz\"--something else."
        Assert.assertEquals(8, lineReader.readLine(inputString).size)
    }
}

