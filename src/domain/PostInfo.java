package domain;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PostInfo implements Serializable{

    private int id;
    private String title;
    private String user;
    private String message;
    private String releasedate;
    private String deadline;

    //constructor for building Constructor.newInstance() by Hibernate
    public PostInfo(){
    }

    public PostInfo(String title, String user, String message, String deadline){
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

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(String releasedate) {
        this.releasedate = releasedate;
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
