import org.antlr.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.ParserRuleContext;

class Main {
    public static void main(String[] args) {
		// Java read file stream from example.txt
		try {
			CharStream cs = (CharStream) new ANTLRFileStream("example.txt");
			Team8Lexer lexer = new Team8Lexer(cs);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			Team8Parser parser = new Team8Parser(tokens);
			ParserRuleContext tree = parser.root(); // parse

			ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
			Team8BaseListener extractor = new Team8BaseListener(parser);
			walker.walk(extractor, tree); // initiate walk of tree with listener
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}