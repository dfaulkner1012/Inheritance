package com.company;

public class User {
    private String firstName;
    private String lastName;
    private int userId;
    private String role;

    public User(String firstName, String lastName, int userId, String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userId = userId;
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void absent(int daysAbsent) {
//        System.out.println(this.firstName + " is absent for " + daysAbsent + " days");
    }
}
