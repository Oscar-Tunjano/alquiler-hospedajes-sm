
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class TestHibernate {

    public static void main(String[] args) {
        // Obtener SessionFactory
        SessionFactory factory = HibernateUtil.getSessionFactory();
        
        // Abrir sesión
        Session session = factory.openSession();
        
        System.out.println("✅ Conexión a la base de datos establecida con éxito usando Hibernate.");
        
        // Cerrar sesión y factory
        session.close();
        factory.close();
    }
}
