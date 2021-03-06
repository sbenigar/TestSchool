package dom.simple;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QLegajo extends org.datanucleus.api.jdo.query.PersistableExpressionImpl<Legajo> implements PersistableExpression<Legajo>
{
    public static final QLegajo jdoCandidate = candidate("this");

    public static QLegajo candidate(String name)
    {
        return new QLegajo(null, name, 5);
    }

    public static QLegajo candidate()
    {
        return jdoCandidate;
    }

    public static QLegajo parameter(String name)
    {
        return new QLegajo(Legajo.class, name, ExpressionType.PARAMETER);
    }

    public static QLegajo variable(String name)
    {
        return new QLegajo(Legajo.class, name, ExpressionType.VARIABLE);
    }

    public final dom.simple.QTarjeta tarjeta;

    public QLegajo(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        if (depth > 0)
        {
            this.tarjeta = new dom.simple.QTarjeta(this, "tarjeta", depth-1);
        }
        else
        {
            this.tarjeta = null;
        }
    }

    public QLegajo(Class type, String name, org.datanucleus.api.jdo.query.ExpressionType exprType)
    {
        super(type, name, exprType);
        this.tarjeta = new dom.simple.QTarjeta(this, "tarjeta", 5);
    }
}
