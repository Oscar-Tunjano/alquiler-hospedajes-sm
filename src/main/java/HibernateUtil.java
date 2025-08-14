
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    static {
        try {
            // Lee hibernate.cfg.xml y crea el SessionFactory
            sessionFactory = new Configuration().configure().buildSessionFactory();
            System.out.println("✅ Hibernate configurado correctamente.");
        } catch (Throwable ex) {
            System.err.println("❌ Error al inicializar Hibernate: " + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        getSessionFactory().close();
    }
}

