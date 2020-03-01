package com.company;

public class Teacher extends User{

    private String subject;
    private String[] classrooms;
    private int ptoDays = 10;

    public Teacher(String firstName, String lastName, int userId,
                   String subject, String[] classrooms) { // deleted int ptoDays & String role
        super(firstName, lastName, userId, "T"); // We changed role to "T"
        this.subject = subject;
        this.classrooms = classrooms;
//        this.ptoDays = ptoDays; // commented this out because we don't need it - it's up top in private = 10.
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String[] getClassrooms() {
        return classrooms;
    }

    public void setClassrooms(String[] classrooms) {
        this.classrooms = classrooms;
    }

    public int getPtoDays() {
        return ptoDays;
    }

    public void setPtoDays(int ptoDays) {
        this.ptoDays = ptoDays;
    }

    @Override
    public void absent(int daysAbsent) {
        this.ptoDays -= daysAbsent; // ptoDays = ptoDays - daysAbsent
//        System.out.println(this.getFirstName() + " has " + this.ptoDays + " pto days left.");
        super.absent(daysAbsent);
    }
}
