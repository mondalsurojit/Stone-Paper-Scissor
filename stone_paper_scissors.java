import java.util.Scanner;
import java.util.Random;
public class stone_paper_scissors{
public static int cs=0;
public static int us=0;

public static int outcome(){
    Random rd=new Random();
    int result=1+rd.nextInt(3);
    return(result); 
}

public static void compare(int in){
int call=outcome();
System.out.println(call);
if(in>3 || in<1){
    System.out.println("Invalid Input");
}
else if(call==in){
    System.out.println("No Point");
}
else if((call==1 && in==3) || (call==2 && in==1) || (call==3 && in==2)){
    cs++;
    System.out.println("Point Goes To The Computer");
}
else{
    us++;
    System.out.println("Point Goes To The User");
}
}

public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.print("This Is A Virtual Simulation Of Stone Paper Scissor Game. ");
    System.out.println("Here You Will Be Playing With The Computer.");
    System.out.println("The Side Who Scores 3 Points First Will Be declared The Winner.");
    int i=1;
    while(cs<3 && us<3){//Confusion: Still now did't understand why I am not using logical OR
    System.out.println("");
    System.out.println("Round:"+i+" Enter your Choice");
    System.out.println("Press 1: For Stone\nPress 2: For Paper\nPress 3: For Scissor");
    int input=sc.nextInt();
    compare(input);
    i++;
    }
    if(cs>us){
            System.out.println("Computer wins!");
        }
        else{
            System.out.println("User wins!");
        }
}
}
