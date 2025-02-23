//this porgram simulates a dice game
//import the random data
import java.util.Random;

public class H7{
   
    public static void main(String args[])
    {
    
    //declare random class
   Random ran = new Random();
   
//declare variables
int num1 = ran.nextInt(1,7);;
int num2 = ran.nextInt(1,7);;
boolean reroll = false;
int total = num1 + num2; 
int total2 = 0;

//ifs to decide if you win or lose first time
if ((total == 7)||(total==11)&&(!reroll)){
   System.out.println("Your total is: " +total);
   System.out.println("Congratualtions, you win");
}
else if ((total ==2)||(total ==3)||(total==12)&&(!reroll)){
 System.out.println("Your total is: " +total);
   System.out.println("You lost");
   
}
//if you roll something else, this loop rerolls the dice until you either roll the same or a 7
else{
   System.out.println("Your total is: "+total);
   reroll = true;
   
   while (reroll){
   num1 = ran.nextInt(1,7);
   num2 = ran.nextInt(1,7);
   total2 = num1 + num2;
   System.out.println("Your new total is: "+total2);
   
   if (total2 == 7){
   System.out.println("You lose");
   reroll = false;
}
else if (total == total2){
   System.out.println("You win");
   reroll = false;
}
   }
  
}
    }//main   
}//class