package controller;

import com.opensymphony.xwork2.ActionSupport;
import domain.PostInfo;
import hibernate.dao.HibernateDAO;
import hibernate.dao.HibernateDAOBean;
import org.hibernate.Session;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class PostAction extends ActionSupport{

    private String title;
    private String user;
    private String message;
    private Date deadline;
    private PostInfo postInfo;
    private String releasedate;
    private HibernateDAO dao; // initiating HibernateDAO interface
    private List<PostInfo> postInfoList; //

    public String getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(String releasedate) {
        this.releasedate = releasedate;
    }

    public PostAction(){
        dao = new HibernateDAOBean(); // build HibernateDAOBean Object
        postInfo = new PostInfo(title, user, message, deadline);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = null;
            try {
                date = sdf.parse(deadline);
            }catch(ParseException e){
                e.printStackTrace();
            }
            this.deadline = date;
    }

    public List<PostInfo> getPostInfoList() {
        return postInfoList;
    }

    public void setPostInfoList(List<PostInfo> postInfoList) {
        this.postInfoList = postInfoList;
    }

    public String insertPostInfo() throws  Exception{

//        PostInfo pf = new PostInfo(title, user, message, deadline);
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        org.hibernate.Transaction tx =  session.beginTransaction();
//        session.save(pf);
//        tx.commit();
//        session.close();
//        HibernateUtil.shutdown();
        dao.addPostInfo(postInfo);
        postInfoList = dao.findAllPostInfo();
        return "insert";
    }

    public String listPostInfo() throws Exception{
        postInfoList = dao.findAllPostInfo();
        return "query";
    }





}
