import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.ParserRuleContext;

class Main {
    public static void main(String[] args) {
		// Java read file stream from example.txt
		try {
			CharStream cs = new ANTLRFileStream("helloworld.txt");
			Team8Lexer lexer = new Team8Lexer(cs);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			Team8Parser parser = new Team8Parser(tokens);
			ParserRuleContext tree = parser.superRoot(); // parse

			ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
			CustomListener extractor = new CustomListener();
			walker.walk(extractor, tree); // initiate walk of tree with listener
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
