import domain.PostInfo;
import org.hibernate.Session;

import javax.transaction.Transaction;

public class HibernateTest {

    public static void main(String [] args){

        String title = "123";
        String user = "123";
        String message = "123";
        String deadline = "1111-12-11";

        PostInfo pf = new PostInfo(title, user, message, deadline);

        Session session = HibernateUtil.getSessionFactory().openSession();

        org.hibernate.Transaction tx =  session.beginTransaction();

        session.save(pf);

        tx.commit();

        session.close();

        HibernateUtil.shutdown();

        //test sucessfully
    }


}
