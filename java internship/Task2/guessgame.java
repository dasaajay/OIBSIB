import java.util.Random;
import java.util.Scanner;
class guessgame
{
public static void main(String ar[])
{
Random R = new Random();
int r_num = R.nextInt(10);
int t=0;
System.out.println("You have only 5 chances to guess the number");
System.out.println("Enter the number between 1-10");
Scanner sc = new Scanner(System.in);
while(t<5)
{
int guess = sc.nextInt();
t++;
if(guess==r_num)
System.out.println("*****Congratulations you won,Its a correct guess******** in " +t+ "th turn");
else if(guess>r_num)
System.out.println("Sorry, Try to give smaller number....Try Again");
else
System.out.println("Oh no, The number is just bigger than your input....Try Again");
}
if(t==5)
{
System.out.println("Sorry to say... You have lost this game");
System.out.println("TRY AGAIN LATER...");
}
}
}