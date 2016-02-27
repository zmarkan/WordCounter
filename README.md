WordCounter
===

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



