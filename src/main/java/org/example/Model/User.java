package org.example.Model;

import java.util.Date;

public class User {
    private String name;
    private int userID;
    private Date birthday;

    public User(String name, int userID, Date birthday) {
        this.name = name;
        this.userID = userID;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
