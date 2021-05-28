package ws.model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-05-17T11:30:39")
@StaticMetamodel(TbEmployee.class)
public class TbEmployee_ { 

    public static volatile SingularAttribute<TbEmployee, String> password;
    public static volatile SingularAttribute<TbEmployee, String> phone;
    public static volatile SingularAttribute<TbEmployee, String> employeecode;
    public static volatile SingularAttribute<TbEmployee, BigDecimal> salary;
    public static volatile SingularAttribute<TbEmployee, String> employeename;

}