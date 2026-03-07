import java.util.Random;
import java.util.Scanner;

 public class number{
    public number(){

    }
     
    public static void main(String[] args){
        Scanner var1 = new Scanner(System.in);
        Random var2 = new Random();
        int var3 = 0;
        byte var4 = 7;
        int var5=1;

        char var6;
        do{
            int var7 = var2.nextInt(100)+1;
            int var9 =0;
            boolean var10= false;
            System.out.println("\nRound"+var5);
            System.out.println("Guess a number between 1 and 100");
            System.out.println("You have "+var4+"attempts.");

            for(;var9 < var4; System.out.println("Attempt left: "+(var4-var9))){
                System.out.print("Enter your guess: ");
                int var8 = var1.nextInt();
                ++var9;
                if(var8==var7){
                    System.out.println("Correct! You guessed the number.");
                    var10 = true;
                    var3 +=(var4-var9+1)*10;
                    break;

                }
                if(var8 >var7){
                    System.out.println("Too high!");

                } else{
                    System.out.println("Too low!");
                }
            }
            if(!var10){
                System.out.println("You ran out of attempt! The number was: +var7");
            }
            System.out.println("Current Score:" +var3);
            System.out.print("Do you want to play another round ? (y/n):");
            var6 = var1.next().charAt(0);
            ++var5;


        }while(var6=='y' || var6 == 'y');
        System.out.println("|nGame Over!");
        System.out.println("Final Score: "+var3);
        var1.close();
    }
 }