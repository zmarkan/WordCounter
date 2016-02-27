package com.zmarkan.wordcounter

import org.junit.Assert
import org.junit.Test

class WordTest {

    @Test fun wordsAreEqual(){
        Assert.assertEquals(Word("Hello"), Word("Hello"))
        Assert.assertNotEquals(Word("Hello"), Word("World"))
    }

    @Test fun wordsAreCaseInsensitive(){
        Assert.assertEquals(Word("Hello"), Word("HELLO"))
        Assert.assertEquals(Word("meerkat"), Word("MeerkAt"))
    }
}