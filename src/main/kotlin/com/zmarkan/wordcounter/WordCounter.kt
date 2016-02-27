package com.zmarkan.wordcounter

import java.io.File
import java.util.*

//
fun main(args: Array<String>){
    //read file to lines - here
    //split lines to words - lineReader
    //map words that occur
    //TODO: sort and output by occurence
    //TODO: Reduce
    //TODO: bask in glory

    //Reading files
    //Assume words are not split between the lines so we can just read lines
    //TODO: have some easily configurable repository of files etc
    val file = File("assets/Railway-Children-by-E-Nesbit.txt")

    println(file.absolutePath)


    //now we have a bunch of strings
    for (line in file.readLines()){
        println(line)
    }

}