package com.zmarkan.wordcounter

import java.io.File

fun main(args: Array<String>){

    val lineReader = LineReader()
    val wordMapper = WordMapper()
    val erathostenes = Erathostenes(SIEVE_SIZE)

    val file = File(SHERLOCK)
    file.readLines().forEach { wordMapper.addList(lineReader.readLine(it)) }

    println("Word by occurence:")
    wordMapper.getWordsByOccurence().forEach {
        println(String.format(
                "Word: %s Occurrences: %d isPrimeNumber: %b",
                it.first,
                it.second,
                it.second.isPrime(erathostenes.sieve)));
    }

    //TODO: optimisation idea #1: skip calculation when items have the same number of occurrences
    //TODO: optimisation idea #2: split the map and run on different machines in parallel. Merge results in the end
}