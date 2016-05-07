WordCounter
===

Given a book in a text file (http://www.loyalbooks.com/download/text/Railway-Children-by-E-Nesbit.txt for example)

1. Write an application that outputs the individual words that appear in the book, and how many times that word appears in the text file.
2. The second part is to also output whether the number of times each word appears is a prime number.

The following assumptions can be made:

- Ignore punctuation and capitalisation
- The code should compile and run on a machine with VS/Xamarin and NUnit

It would be beneficial to:

- come up with more than one solution and be able to talk about the pro’s and con’s to each
- ensure the application scales and performs optimally
- Use TDD in the approach to writing the application

# A simple word counting application written in Kotlin

I chose Kotlin because it's a modern, functional programming language that is 100% interoperable with Java.
Also, the word counting problem is essentially a map reduce job and can benefit a lot from a functional approach.

# Building and running

Gradle build system should do its magic and do everything.

Mac/linux:
./gradlew clean test --info

Windows: (should work but I haven't tried')
gradlew clean test --info

If you run it without the --info flag it suppresses the printouts so I recommend running with it.
Tests reports should be generated in build/reports/index.html



