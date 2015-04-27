import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.ParserRuleContext;

class Main {
    public static void main(String[] args) {
		// Java read file stream from example.txt
		try {
			CharStream cs = new ANTLRFileStream(args[0]);
			yoyoheadLexer lexer = new yoyoheadLexer(cs);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			yoyoheadParser parser = new yoyoheadParser(tokens);
			ParserRuleContext tree = parser.root(); // parse

			ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
			CustomListener extractor = new CustomListener();
			walker.walk(extractor, tree); // initiate walk of tree with listener
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
