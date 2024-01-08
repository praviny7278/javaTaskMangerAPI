package com.user.userTask.model;

import jakarta.persistence.*;

@Entity
public class User {

    public User() {
        super();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // or GenerationType.AUTO
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    private String userName;
    private String userEmail;
    private String userTask;
    private Boolean userTaskStatus;

    public User(Long id, String userName, String userEmail, String userTask, Boolean userTaskStatus) {
        super();
        this.id = id;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userTask = userTask;
        this.userTaskStatus = userTaskStatus;
    }

    public Long getUserID() {
        return id;
    }
    public void setUserID(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserTask() {
        return userTask;
    }
    public void setUserTask(String userTask) {
        this.userTask = userTask;
    }

    public Boolean getUserTaskStatus() {
        return userTaskStatus;
    }
    public void setUserTaskStatus(Boolean userTaskStatus) {
        this.userTaskStatus = userTaskStatus;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", UserTask='" + userTask + '\'' +
                ", UserTaskStatus=" + userTaskStatus +
                '}';
    }
}
