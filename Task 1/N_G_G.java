import java.util.*;
public class N_G_G {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int finals=0;
        boolean playAgain=true;
        boolean guess=false;
        System.out.println("Welcome to the Number Guessing Game");
        int randomnumber= (int)(Math.random()*100)+1;
        for(int i = 8;i>0;i--){
            System.out.println("You have "+i+" attempt left");
            int user= sc.nextInt();
            if(user==randomnumber){
                guess=true;
                finals=finals+1;
                System.out.println("You did it");
                break;
            }
            else if(user>randomnumber){
                System.out.println("Too High");
            }
            else{
                System.out.println("Too Low");
            }
        }
        if(guess==false){
            System.out.println("You Lost");
            }
        }
    }
