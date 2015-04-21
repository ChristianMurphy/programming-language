import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.ParserRuleContext;

class Main {
    public static void main(String[] args) {
		// Java read file stream from example.txt
		try {
			CharStream cs = new ANTLRFileStream("example.txt");
			Team8Lexer lexer = new Team8Lexer(cs);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			Team8Parser parser = new Team8Parser(tokens);
			ParserRuleContext tree = parser.root(); // parse

			ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
//			declareMain();
//			declareStringType();
			CustomListener extractor = new CustomListener();
			walker.walk(extractor, tree); // initiate walk of tree with listener
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
//
//	public static void declareMain() {
//		System.out.println("define i32 @main() nounwind {\n" +
//			"    %1 = load i32* @variable\n" +
//			"    ret i32 %1\n" +
//			"}");
//	}
//
//	public static void declareStringType() {
//		System.out.println("; The actual type definition for our 'String' type.\n" +
//			"%String = type {\n" +
//			"    i8*,     ; 0: buffer; pointer to the character buffer\n" +
//			"    i32,     ; 1: length; the number of chars in the buffer\n" +
//			"    i32,     ; 2: maxlen; the maximum number of chars in the buffer\n" +
//			"    i32      ; 3: factor; the number of chars to preallocate when growing\n" +
//			"}\n" +
//			"\n" +
//			"define fastcc void @String_Create_Default(%String* %this) nounwind {\n" +
//			"    ; Initialize 'buffer'.\n" +
//			"    %1 = getelementptr %String* %this, i32 0, i32 0\n" +
//			"    store i8* null, i8** %1\n" +
//			"\n" +
//			"    ; Initialize 'length'.\n" +
//			"    %2 = getelementptr %String* %this, i32 0, i32 1\n" +
//			"    store i32 0, i32* %2\n" +
//			"\n" +
//			"    ; Initialize 'maxlen'.\n" +
//			"    %3 = getelementptr %String* %this, i32 0, i32 2\n" +
//			"    store i32 0, i32* %3\n" +
//			"\n" +
//			"    ; Initialize 'factor'.\n" +
//			"    %4 = getelementptr %String* %this, i32 0, i32 3\n" +
//			"    store i32 16, i32* %4\n" +
//			"\n" +
//			"    ret void\n" +
//			"}\n" +
//			"\n" +
//			"declare i8* @malloc(i32)\n" +
//			"declare void @free(i8*)\n" +
//			"declare i8* @memcpy(i8*, i8*, i32)\n" +
//			"\n" +
//			"define fastcc void @String_Delete(%String* %this) nounwind {\n" +
//			"    ; Check if we need to call 'free'.\n" +
//			"    %1 = getelementptr %String* %this, i32 0, i32 0\n" +
//			"    %2 = load i8** %1\n" +
//			"    %3 = icmp ne i8* %2, null\n" +
//			"    br i1 %3, label %free_begin, label %free_close\n" +
//			"\n" +
//			"free_begin:\n" +
//			"    call void @free(i8* %2)\n" +
//			"    br label %free_close\n" +
//			"\n" +
//			"free_close:\n" +
//			"    ret void\n" +
//			"}\n" +
//			"\n" +
//			"define fastcc void @String_Resize(%String* %this, i32 %value) {\n" +
//			"    ; %output = malloc(%value)\n" +
//			"    %output = call i8* @malloc(i32 %value)\n" +
//			"\n" +
//			"    ; todo: check return value\n" +
//			"\n" +
//			"    ; %buffer = this->buffer\n" +
//			"    %1 = getelementptr %String* %this, i32 0, i32 0\n" +
//			"    %buffer = load i8** %1\n" +
//			"\n" +
//			"    ; %length = this->length\n" +
//			"    %2 = getelementptr %String* %this, i32 0, i32 1\n" +
//			"    %length = load i32* %2\n" +
//			"\n" +
//			"    ; memcpy(%output, %buffer, %length)\n" +
//			"    %3 = call i8* @memcpy(i8* %output, i8* %buffer, i32 %length)\n" +
//			"\n" +
//			"    ; free(%buffer)\n" +
//			"    call void @free(i8* %buffer)\n" +
//			"\n" +
//			"    ; this->buffer = %output\n" +
//			"    store i8* %output, i8** %1\n" +
//			"\n" +
//			"    ret void\n" +
//			"}\n" +
//			"\n" +
//			"define fastcc void @String_Add_Char(%String* %this, i8 %value) {\n" +
//			"    ; Check if we need to grow the string.\n" +
//			"    %1 = getelementptr %String* %this, i32 0, i32 1\n" +
//			"    %length = load i32* %1\n" +
//			"    %2 = getelementptr %String* %this, i32 0, i32 2\n" +
//			"    %maxlen = load i32* %2\n" +
//			"    ; if length == maxlen:\n" +
//			"    %3 = icmp eq i32 %length, %maxlen\n" +
//			"    br i1 %3, label %grow_begin, label %grow_close\n" +
//			"\n" +
//			"grow_begin:\n" +
//			"    %4 = getelementptr %String* %this, i32 0, i32 3\n" +
//			"    %factor = load i32* %4\n" +
//			"    %5 = add i32 %maxlen, %factor\n" +
//			"    call void @String_Resize(%String* %this, i32 %5)\n" +
//			"    br label %grow_close\n" +
//			"\n" +
//			"grow_close:\n" +
//			"    %6 = getelementptr %String* %this, i32 0, i32 0\n" +
//			"    %buffer = load i8** %6\n" +
//			"    %7 = getelementptr i8* %buffer, i32 %length\n" +
//			"    store i8 %value, i8* %7\n" +
//			"    %8 = add i32 %length, 1\n" +
//			"    store i32 %8, i32* %1\n" +
//			"\n" +
//			"    ret void\n" +
//			"}");
//	}
}
