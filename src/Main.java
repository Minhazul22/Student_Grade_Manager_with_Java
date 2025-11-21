import java.util.Scanner; //scanner class import

public class Main { //main class
    public void main(String[] args){
    int numberOfStudents = 0, student_roll, passed = 0,failed = 0;
    float sum = 0, max= -99999, min = 99999; //took a very small and,
                                            // a very large number to compare max and min grade
    float[] grades;

Scanner input = new Scanner(System.in); //create a scanner obj
        //asking for user input
        System.out.println("How many students you want to enter grades for: ");
        numberOfStudents = input.nextInt();
         grades = new float[numberOfStudents];

        System.out.println("Enter each student’s grade (0-100): ");




        for ( int i = 0; i < grades.length; i++) {
            grades[i] = input.nextFloat(); //taking user input using a for loop

        }

        //Printing grades report using a for loop
        // and also a method 'Letter_grade()'to get the grades
        System.out.println("=== Grade Report === ");
           for (int i = 0; i < grades.length; i++){
            student_roll = i + 1;
            System.out.println("Student " + student_roll + ":  " + grades[i] + "  " + Letter_grade(grades[i]) );

           }



       //printing the stats, used a for loop and
        // if else statements to find max min and
        // number of passed and failed students

        System.out.println("=== Statistics === ");

        for (int i = 0; i < grades.length; i++ ) {
            sum = sum + grades[i];

        if (max < grades[i]){ //comparing the array elements
            max = grades[i]; //setting new max
        }

        if (min>grades[i]) { //same for finding the min
            min = grades[i]; // a large number is compared with the array elements
        }

        if (grades[i] >= 60){
            passed ++; //counter
        }else {
            failed++; //counter
        }



}       //printing the stats
        System.out.println("Avg grade: " + sum / grades.length);
        System.out.println("Highest Grade:"+ max);
        System.out.println("Lowest Grade: " + min);
        System.out.println("Students Passed: " + passed);
        System.out.println("Students failed: " + failed);




    }



//the method for finding the Letter grades// used if else to return the string
    String Letter_grade (float grade) {
    if (grade >= 90 && grade <= 100) {
        return "(A)";
    } else if (grade >= 80 && grade <= 89) {
        return "(B)";
    }
    if (grade >= 70 && grade <= 79) {
        return "(C)";
    } else if (grade >= 60 && grade <= 69) {
        return "(D)";
    } else if (grade >= 0 && grade <= 59) {
        return "(F)";
    } else {
        return "Invalid input";
    }

}

}

////////////////