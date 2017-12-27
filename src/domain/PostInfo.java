package domain;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table( name = "post_list")
public class PostInfo implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;

    @Column(name="title")
    private String title;

    @Column(name="user")
    private String user;

    @Column(name = "message")
    private String message;

    @Column(name = "releasedate")
    private String releasedate;

    @Type( type = "date")
    @Column(name = "deadline")
    private Date deadline;

    //constructor for building Constructor.newInstance() by Hibernate
    public PostInfo(){
    }

    public PostInfo(String title, String user, String message, Date deadline){
        this.title = title;
        this.user = user;
        this.message = message;
        this.deadline = deadline;
        generateReleaseDateStr();
    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void genDeadline(String deadline){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse(deadline);
        }catch(ParseException e){
            e.printStackTrace();
        }
        this.deadline = date;
    }


    public String getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(String releasedate) {
        this.releasedate = getNowLocalDateTime();
    }

    //getLocalDateTime methodi: time to String
    public String getNowLocalDateTime (){
        Date dt = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = sdf.format(dt);
        return currentTime;
    }

    public void generateReleaseDateStr() {
        this.releasedate = getNowLocalDateTime();
    }














}
