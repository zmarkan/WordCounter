package com.zmarkan.wordcounter

fun String.toWord(): Word{
    return Word(this)
}

fun Pair<Word, Int>.compareTo(other: Pair<Word, Int>): Int {
    return this.second.compareTo(other.second)
}
