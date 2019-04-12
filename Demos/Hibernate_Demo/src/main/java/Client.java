import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {
    static SessionFactory sf = null;

    static {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate-cfg.xml");
        sf = cfg.buildSessionFactory();

        // Hibernate creates the schema, should be one session factory per dbSessionFactory sf = cfg.buildSessionFactory();

    }
    public static void main(String[] args) {

        Session s = sf.openSession();
        Transaction t = s.beginTransaction();

        Person p = new Person(1,"tester", "10B", "something@gmail.com", 2348943);

        // Hibernate will automatically create and fire a queries, you dont need to worry about column name and table
        // name
        s.save(p);
        t.commit();
        s.close();
    }
}