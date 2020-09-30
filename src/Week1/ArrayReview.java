package Week1;

import java.util.Scanner;
/**
 * This class reviews array practice exercises
 *
 * @author Sandy Chang
 * Course: Syst17796
 * School: Sheridan College
 * Created: 22 Sep 2020 / Updated: 
 */
public class ArrayReview {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        /*
        // Get a word and prints it in reverse order
        System.out.println("Please enter a word:");
        String word = input.nextLine();
        
        System.out.println("Here are your letters in reverse order:");
        for (int i=word.length()-1; i>=0; i--){
            System.out.println(word.charAt(i));
        }
        */
        
        /*
        // Using student object
        System.out.println("Please enter a student name:");
        String name = input.nextLine();
        Student stud1 = new Student(name);
        System.out.println("Student name is " + stud1.getName());
        */
        
        // Creating array of students:
        Student[] studentList = new Student[3];
        
        for(int i = 0; i < studentList.length; i++){
            int j = i+1;
            System.out.println("Please enter a name of your classmate " + j + ": ");
            String name = input.nextLine();
            studentList[i] = new Student(name);
        }
        
        for(Student s: studentList){
            System.out.println(s.getName());
        }
        
        
    }
}
