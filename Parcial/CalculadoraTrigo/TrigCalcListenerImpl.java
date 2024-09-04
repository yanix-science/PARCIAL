import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class TrigCalcListenerImpl extends TrigCalcBaseListener {

    @Override
    public void enterExpr(TrigCalcParser.ExprContext ctx) {
        String function = ctx.function().getText();
        double angle = Double.parseDouble(ctx.angle().getText());

        // Convertir grados a radianes
        double radians = Math.toRadians(angle);

        // Calcular el valor trigonométrico
        double result = 0;
        switch (function) {
            case "Sin":
                result = Math.sin(radians);
                break;
            case "Cos":
                result = Math.cos(radians);
                break;
            case "Tan":
                result = Math.tan(radians);
                break;
        }

        // Imprimir el resultado
        System.out.println(String.format("%.1f", result));
    }
}
