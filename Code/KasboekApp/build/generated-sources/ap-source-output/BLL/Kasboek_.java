package BLL;

import BLL.Kas;
import BLL.Rol;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-01-25T23:01:20")
@StaticMetamodel(Kasboek.class)
public class Kasboek_ { 

    public static volatile SingularAttribute<Kasboek, Date> datum;
    public static volatile SingularAttribute<Kasboek, Rol> rolletjes;
    public static volatile SingularAttribute<Kasboek, Kas> beginKas;
    public static volatile SingularAttribute<Kasboek, String> av;
    public static volatile SingularAttribute<Kasboek, Kas> uitKas;
    public static volatile SingularAttribute<Kasboek, String> Commentaar;
    public static volatile SingularAttribute<Kasboek, Integer> id;
    public static volatile SingularAttribute<Kasboek, Kas> eindKas;

}