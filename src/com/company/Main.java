package com.company;

public class Main {

    public static void main(String[] args) {
	    /*
	        In Java, it's possible to inherit attributes and methods from one
	        class to another.

	        Mammals
	            - Females produce milk
	            - Warm blooded
	            - Live birth

	            Humans
	                - Walk upright

	            Gorillas
	                - Walk on 4 legs

	                Silverback Gorilla
	                    -
	        Classes that use inheritance are grouped into 2 categories:

	        1. subclass (child) - the class that inherits
	        2. superclass (parent) - the parent class being inherited from
	    */
        String[] classroom = {"classroom 1", "classroom 2", "classroom 3"};

        User studentBob = new User("Bob", "Smith", 2, "S");
        Student studentBobbi = new Student("Bobbi","Smith",33,"S",321,4.0);

        Teacher teacherObiwan = new Teacher("Obi-Wan", "Kenobi",
                345, "Theoretical Physics", classroom);
// removed two things from main Teacher because we deleted them in the class Teachers....

//        teacherObiwan.absent(3);
//        studentBob.absent(8);

        studentBobbi.absent(1);
    }
}
