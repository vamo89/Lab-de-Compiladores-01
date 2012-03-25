package compiladores.lab01.parserLatexToHtml;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.BufferedTokenStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenSource;
import org.antlr.runtime.TokenStream;

public class LatexToHtml {
	
	public static void main(String[] args) throws RecognitionException {
		LatexToHtmlParser latexToHtmlParser;		
		
		String str, inputString = "";
        try {
            BufferedReader in = new BufferedReader(new FileReader("D:\\Meus documentos\\Área de Trabalho\\completo.tex"));
            while ((str = in.readLine()) != null) {
            	inputString += str;
            	inputString += "\n";
            }
            in.close();
        } catch (IOException e){}

		CharStream input = new ANTLRStringStream(inputString);
		
		TokenSource tokenSource = new LatexToHtmlLexer(input);
		
		TokenStream tokenInput = new BufferedTokenStream(tokenSource);
		
		latexToHtmlParser = new LatexToHtmlParser(tokenInput);
		
		try{
            // Create file 
            FileWriter fstream = new FileWriter("D:\\Meus documentos\\Área de Trabalho\\output.html");
            BufferedWriter out = new BufferedWriter(fstream);
            out.write(latexToHtmlParser.run());

            out.flush();
            //Close the output stream
            out.close();
            System.out.println("DONE!");
        }catch (Exception e){//Catch exception if any
        	System.err.println("Error: " + e.getMessage());
        }
	}

}
