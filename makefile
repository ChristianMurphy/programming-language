grammar: clean
	java -jar /usr/local/lib/antlr-4.5-complete.jar Team8.g4
	javac Team8*.java

test: grammar
	java org.antlr.v4.runtime.misc.TestRig Team8 primary -gui example.txt

clean:
	rm -f *.java *.class *.tokens
