grammar: clean
	java -jar /usr/local/lib/antlr-4.5-complete.jar yoyohead.g4
	javac *.java

test: grammar
	java org.antlr.v4.runtime.misc.TestRig yoyohead root -gui example.yoyo

clean:
	rm -f *.class *.tokens
