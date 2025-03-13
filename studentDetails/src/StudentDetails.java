
import java.util.Scanner;


public class StudentDetails {

    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        char initial;
        System.out.print("Enter initial:");
        initial = scn.nextLine().charAt(0);
        
        String surname;
        System.out.print("Enter surname:");
        surname = scn.nextLine();
        
        int studNum;
        System.out.print("Enter student number:");
        studNum = scn.nextInt();
        
        System.out.println("Student Details:");
        System.out.println("Student name: " + initial + "." + surname);
        System.out.println("Student details: " + studNum);
    }
    
}
