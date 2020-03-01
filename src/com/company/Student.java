package com.company;
    /*
        In Wednesday's class we created a Teacher class that inherits from a User class. Add to this code.

Create a Student class that inherits from the User class. Create additional fields for the student.
One of the fields should represent gpa.

Override the absent() method that exists in the User class. For every day absent, decrease the gpa by 0.01 points.

Invoke this in main. Submitted code must be in a GitHub repo.
    */
public class Student extends User{
    private int studentID;
    private double gpa = 4.0;

    public Student(String firstName, String lastName, int userId, String role, int studentID, double gpa) {
        super(firstName, lastName, userId, role);
        this.studentID = studentID;
//        this.gpa = gpa;
    }

        public int getStudentID() {
            return studentID;
        }

        public void setStudentID(int studentID) {
            this.studentID = studentID;
        }

        public double getGpa() {
            return gpa;
        }

        public void setGpa(double gpa) {
            this.gpa = gpa;
        }

        @Override
        public void absent(int daysAbsent) {
            this.gpa -= daysAbsent * 0.01;
            System.out.println(this.getFirstName() + " has a " + this.gpa + " gpa.");
            super.absent(daysAbsent);
        }
    }
