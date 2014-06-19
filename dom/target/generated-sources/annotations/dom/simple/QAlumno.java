package dom.simple;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QAlumno extends org.datanucleus.api.jdo.query.PersistableExpressionImpl<Alumno> implements PersistableExpression<Alumno>
{
    public static final QAlumno jdoCandidate = candidate("this");

    public static QAlumno candidate(String name)
    {
        return new QAlumno(null, name, 5);
    }

    public static QAlumno candidate()
    {
        return jdoCandidate;
    }

    public static QAlumno parameter(String name)
    {
        return new QAlumno(Alumno.class, name, ExpressionType.PARAMETER);
    }

    public static QAlumno variable(String name)
    {
        return new QAlumno(Alumno.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression name;
    public final StringExpression apellido;
    public final NumericExpression<Integer> dni;
    public final ObjectExpression<org.apache.isis.applib.DomainObjectContainer> container;

    public QAlumno(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.name = new StringExpressionImpl(this, "name");
        this.apellido = new StringExpressionImpl(this, "apellido");
        this.dni = new NumericExpressionImpl<Integer>(this, "dni");
        this.container = new ObjectExpressionImpl<org.apache.isis.applib.DomainObjectContainer>(this, "container");
    }

    public QAlumno(Class type, String name, org.datanucleus.api.jdo.query.ExpressionType exprType)
    {
        super(type, name, exprType);
        this.name = new StringExpressionImpl(this, "name");
        this.apellido = new StringExpressionImpl(this, "apellido");
        this.dni = new NumericExpressionImpl<Integer>(this, "dni");
        this.container = new ObjectExpressionImpl<org.apache.isis.applib.DomainObjectContainer>(this, "container");
    }
}
