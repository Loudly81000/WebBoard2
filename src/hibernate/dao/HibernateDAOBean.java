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
            //session.persist(postInfo);
            session.save(postInfo);
            tx.commit();
        }catch(Exception e){
            if(session!=null)tx.rollback();{
                e.printStackTrace();
            }
        }finally{
            session.close();
        }
    }

    @Override
    public List<PostInfo> findAllPostInfo(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx =  session.beginTransaction();
        List<PostInfo> postInfoList=null;

        try {
            Query query = session.createQuery("from PostInfo ");
            postInfoList = query.list(); // get all postInfo data and save to list
            tx.commit();
        }catch(Exception e) {
            if (session != null) tx.rollback();{
            e.printStackTrace();
            }
        } finally{
            session.close();
        }
        return postInfoList;
    }

}
