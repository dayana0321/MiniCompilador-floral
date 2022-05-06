
package com.compiladores.minicompilador.interprete2022;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

	private static final String EXTENSION = "mnc";

	public static void main(String[] args) throws IOException {
		String program = args.length > 1 ? args[1] : "test/test." + EXTENSION;

		System.out.println("Interpreting file " + program);

		minicompiladorLexer lexer = new minicompiladorLexer(new ANTLRFileStream(program));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		minicompiladorParser parser = new minicompiladorParser(tokens);

		minicompiladorParser.ProgramContext tree = parser.program();

		minicompiladorCustomVisitor visitor = new minicompiladorCustomVisitor();
		visitor.visit(tree);

		System.out.println("Interpretation finished");

	}

}
