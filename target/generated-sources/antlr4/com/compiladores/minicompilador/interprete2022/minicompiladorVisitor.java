// Generated from com/compiladores/minicompilador/interprete2022/minicompilador.g4 by ANTLR 4.5.1
package com.compiladores.minicompilador.interprete2022;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link minicompiladorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface minicompiladorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link minicompiladorParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(minicompiladorParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link minicompiladorParser#if_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_decl(minicompiladorParser.If_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link minicompiladorParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(minicompiladorParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link minicompiladorParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(minicompiladorParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link minicompiladorParser#var_assig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_assig(minicompiladorParser.Var_assigContext ctx);
	/**
	 * Visit a parse tree produced by {@link minicompiladorParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(minicompiladorParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by {@link minicompiladorParser#asig_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsig_op(minicompiladorParser.Asig_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link minicompiladorParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion(minicompiladorParser.OperacionContext ctx);
}