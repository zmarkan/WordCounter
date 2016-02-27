import java.io.File
import java.util.*

//
fun main(args: Array<String>){
    //TODO: read file
    //TODO: Map
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