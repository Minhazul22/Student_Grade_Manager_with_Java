import java.util.Arrays;
import java.util.Scanner; //scanner class import

public class GradeCalculator { //main class


    /// ////Calculate Avg method.
    public static double calculateAverage ( int[] grades){
        float avg;
        int sum = 0;
        for (int i = 0; i < grades.length; i ++){
            sum = sum + grades[i];
        }

        return (double) sum / grades.length;

    }

    // "Find the highest" method.

    public static int findHighest(int[] grades){
        int max = grades[0];

        for (int i = 0; i < grades.length; i++){
            if (grades[i] > max){
                max = grades[i];
            }

        }
        return max;
    }

    // "Find the highest" method.

    public static int findLowest(int[] grades){
        int min = grades[0];

        for (int i = 0; i < grades.length; i++){
            if (grades[i] < min){
                min = grades[i];
            }

        }
        return min;
    }

    //countPassing

 public static int countPassing(int[] grades){
     int count = 0;
        for (int i = 0; i < grades.length; i++){

            if (grades[i] >= 60){
                count++;
            }
        }
        return count;
 }

 public static int[] deduplicatedGrades(int[] grades){
        Arrays.sort(grades);
        int uniqueCount = 1;

     for (int i = 1; i < grades.length; i++) {
         if (grades[i] != grades[i-1]) {
             uniqueCount++;
         }
     }

     int [] deduplicated = new int[uniqueCount];
     deduplicated[0] = grades[0];
     int index = 1;

     for (int i = 1; i < grades.length; i++){
         if (grades[i] != grades[i-1]){
             deduplicated[index++] = grades[i];
         }
     }
     return deduplicated;
 }

    // Method to display all results
    public static void displayResults(int[] grades) {
        System.out.println("\n=== Grade Analysis Results ===");
        System.out.println("All Grades: " + Arrays.toString(grades));
        System.out.println("Average Grade: " + String.format("%.2f", calculateAverage(grades)));
        System.out.println("Highest Grade: " + findHighest(grades));
        System.out.println("Lowest Grade: " + findLowest(grades));
        System.out.println("Passing Grades (>= 60): " + countPassing(grades));
        System.out.println("Unique Grades: " + Arrays.toString(deduplicatedGrades(grades)));
        // Additional statistics
        int failing = grades.length - countPassing(grades);
        System.out.println("Failing Grades (< 60): " + failing);
        System.out.println("Total Students: " + grades.length);
    }


//Main Method
    public static void main(String[] args) {
        int[] grades = new int[5];

        System.out.println("Enter 5 student’s grades (0-100): ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < grades.length; i++) {
            int grade;
            while (true) { // repeat until valid input
                System.out.print("Enter grade for student " + (i + 1) + ": ");
                grade = scanner.nextInt();

                if (grade >= 0 && grade <= 100) {
                    break; // exit inner loop if valid
                } else {
                    System.out.println("Invalid input! Please enter a grade between 0 and 100.");
                }
            }
            grades[i] = grade; // store valid grade in array
        }


  //Display result
        displayResults(grades);
        scanner.close();


    }




}

