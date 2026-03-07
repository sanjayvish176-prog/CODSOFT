import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        int total =0;

        for (int i =1;i<=n;i++){
            System.out.print("enter marks for subject " + i+"(out of 100; ");
            int marks  = sc.nextInt();
            total+=marks;
        }
        double average = (double) total /n;
        char grade;
        if(average >=90){
            grade = 'A';

        } else if (average>=80){
            grade ='B';
        }
        else if (average>=70){
            grade ='C';
        }
        else if (average>=60){
            grade ='D';
        }
        else {
            grade ='E';
        }
        
        System.out.println("\nTotal Marks: " +total);
        System.out.println("Average Percentage: "+average);
        System.out.println("Grade: " );
                System.out.println("Grade: " );

        sc.close();
    }

    
}
