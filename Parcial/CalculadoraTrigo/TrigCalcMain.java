import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.IOException;

public class TrigCalcMain {
    public static void main(String[] args) throws IOException {
        // Leer el archivo de entrada
        CharStream input = CharStreams.fromStream(new FileInputStream("expr.in"));

        // Crear el lexer y el parser
        TrigCalcLexer lexer = new TrigCalcLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TrigCalcParser parser = new TrigCalcParser(tokens);

        // Parsear el archivo
        ParseTree tree = parser.prog();

        // Crear un Listener
        ParseTreeWalker walker = new ParseTreeWalker();
        TrigCalcListenerImpl listener = new TrigCalcListenerImpl();

        // Iniciar el recorrido del árbol de análisis con el Listener
        walker.walk(listener, tree);
    }
}
