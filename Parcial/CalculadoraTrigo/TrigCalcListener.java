// Generated from TrigCalc.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TrigCalcParser}.
 */
public interface TrigCalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TrigCalcParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(TrigCalcParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrigCalcParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(TrigCalcParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrigCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(TrigCalcParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrigCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(TrigCalcParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrigCalcParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(TrigCalcParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrigCalcParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(TrigCalcParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TrigCalcParser#angle}.
	 * @param ctx the parse tree
	 */
	void enterAngle(TrigCalcParser.AngleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TrigCalcParser#angle}.
	 * @param ctx the parse tree
	 */
	void exitAngle(TrigCalcParser.AngleContext ctx);
}