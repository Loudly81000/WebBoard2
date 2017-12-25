package hibernate.dao;


import domain.PostInfo;

import java.util.List;

public interface HibernateDAO {
    public void addPostInfo(PostInfo postInfo); // inserting post to database
    public List<PostInfo> findAllPostInfo(); // method for finding all post
}
