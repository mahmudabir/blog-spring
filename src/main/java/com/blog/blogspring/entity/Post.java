package com.blog.blogspring.entity;

import javafx.geometry.Pos;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Post {

    @Id
    @GeneratedValue(
            strategy= GenerationType.IDENTITY,
            generator="native"
    )
    @GenericGenerator(
            name = "native",
            strategy = "native"
    )
    private int id;
    private String title;
    private String content;

    @ManyToOne
    private User user;

   public Post(){

    }

   public Post(int id, String title, String content, int userId){
        this.id = id;
        this.title = title;
        this.content = content;
        this.user = new User(userId, "", "","","","",2);
    }

    public int getId() {
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
