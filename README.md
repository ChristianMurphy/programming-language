# SER 502
## Project 2 - Deepa, Vishal and Christian

### Installation instructions
1. Install [Java JDK 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
2. Install [ANTLR4](http://www.antlr.org/)
3. Install [iojs](https://iojs.org/en/index.html)


### Build Instructions
1. build the grammar file `antlr4 yoyohead.g4`
2. compile the grammar `javac *.java`

### View the Abstract Syntax Tree
1. run it `grun yoyohead root -gui example.yoyo`

### Compile a YoYo File to YO
1. `java Main example.yoyo > example.yo`

### Execute a Yo File
1. `node VM.js example.yo [program variables]`
