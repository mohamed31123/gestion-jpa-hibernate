package ma.gestion;

import ma.gestion.util.HibernateUtil;
import org.h2.engine.Session;
import org.hibernate.SessionFactory;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        HibernateUtil.getSessionFactory().openSession();
    }
}
