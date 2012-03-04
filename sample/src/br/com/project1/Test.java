package br.com.project1;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

public class Test {

	/**
	 * @param args
	 * @throws RecognitionException 
	 */
	public static void main(String[] args) throws RecognitionException {
		CharStream charStream = new ANTLRStringStream(" teste dois tres");
		// TODO Auto-generated method stub
		test1Lexer lexer = new test1Lexer(charStream );
		TokenStream tokenStrem = new CommonTokenStream(lexer);
		test1Parser parser = new test1Parser(tokenStrem );
		parser.rule();
		System.out.println("DONE!");
	}

}
