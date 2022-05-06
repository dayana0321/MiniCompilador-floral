// Generated from com/compiladores/minicompilador/interprete2022/minicompilador.g4 by ANTLR 4.5.1
package com.compiladores.minicompilador.interprete2022;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link minicompiladorParser}.
 */
public interface minicompiladorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link minicompiladorParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(minicompiladorParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link minicompiladorParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(minicompiladorParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link minicompiladorParser#if_decl}.
	 * @param ctx the parse tree
	 */
	void enterIf_decl(minicompiladorParser.If_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link minicompiladorParser#if_decl}.
	 * @param ctx the parse tree
	 */
	void exitIf_decl(minicompiladorParser.If_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link minicompiladorParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(minicompiladorParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link minicompiladorParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(minicompiladorParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link minicompiladorParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(minicompiladorParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link minicompiladorParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(minicompiladorParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link minicompiladorParser#var_assig}.
	 * @param ctx the parse tree
	 */
	void enterVar_assig(minicompiladorParser.Var_assigContext ctx);
	/**
	 * Exit a parse tree produced by {@link minicompiladorParser#var_assig}.
	 * @param ctx the parse tree
	 */
	void exitVar_assig(minicompiladorParser.Var_assigContext ctx);
	/**
	 * Enter a parse tree produced by {@link minicompiladorParser#println}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(minicompiladorParser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link minicompiladorParser#println}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(minicompiladorParser.PrintlnContext ctx);
	/**
	 * Enter a parse tree produced by {@link minicompiladorParser#asig_op}.
	 * @param ctx the parse tree
	 */
	void enterAsig_op(minicompiladorParser.Asig_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link minicompiladorParser#asig_op}.
	 * @param ctx the parse tree
	 */
	void exitAsig_op(minicompiladorParser.Asig_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link minicompiladorParser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterOperacion(minicompiladorParser.OperacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link minicompiladorParser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitOperacion(minicompiladorParser.OperacionContext ctx);
}