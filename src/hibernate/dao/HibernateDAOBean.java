package hibernate.dao;

import controller.HibernateUtil;
import domain.PostInfo;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class HibernateDAOBean implements HibernateDAO {

    public void addPostInfo(PostInfo postInfo){

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx =  session.beginTransaction();

        try{
            session.persist(postInfo);
            tx.commit();
        }catch(Exception e){
            if(session!=null)tx.rollback();{
                e.printStackTrace();
            }
        }
    }

    @Override
    public List<PostInfo> findAllPostInfo(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx =  session.beginTransaction();

        Query query = session.createQuery("from PostInfo ");
        List<PostInfo> postInfoList = query.list(); // get all postInfo data and save to list
        tx.commit();

        return postInfoList;
    }
}
