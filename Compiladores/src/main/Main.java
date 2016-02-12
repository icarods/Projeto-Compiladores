package main;

import simpleAdder.lexer.Lexer;
import simpleAdder.lexer.LexerException;
import simpleAdder.node.*;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

public class Main {

public static void main(String[] args) {
	if (args.length > 0) {
		try {
			MeuLexico lexer = new MeuLexico(new PushbackReader(new FileReader(args[0]), 1024));
			analisadorLexico(args[0], lexer);
		} catch (Exception  e) {
			System.out.println(e);
		}
	} else {
		System.exit(1);
	}
}


public static void analisadorLexico(String arquivo, Lexer lexo)
	throws LexerException, IOException {
		Token t = null;
		int linha = 0;
		while (!((t = lexo.next()) instanceof EOF)) {
				if (!(t instanceof TBranco)) {
					if (linha == 0) {
						linha = t.getLine();
						System.out.print("linha " + linha + ": ");
					}
					if (linha != t.getLine()) {
						linha = t.getLine();
						System.out.print("\nlinha " + linha + ": ");
					}
				System.out.print(t.getClass().getSimpleName() + "[\'" + t.getText() + "\'] ");
			}
		}
	}
}

