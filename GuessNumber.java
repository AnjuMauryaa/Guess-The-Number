import java.util.Scanner;
import java.util.Random;

class Game{
   Random random = new Random();
    
   private int computerInput;
   private int myNumber;
   private int counter = 1;

    public Game(){
    computerInput = random.nextInt(100);
    System.out.println("conputer number is:" +computerInput);
    }


    public int isCorrect()
    {
      if(myNumber == computerInput)
      return 0;
      else if(myNumber>computerInput)
      return 1;
      else  
      return 2;
    }

    public void setNumber(int n){
        myNumber = n;
    }

   public void setCounter(){
    counter++;
   }

   public void getCounter()
   {
    System.out.println("NUmber of guesses are:" + counter);
   }

}

public class GuessNumber {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Game gm = new Game();
        System.out.println("Enter a number between 1 to 100:");
        while(true){
        int  userInput = sc.nextInt();
        gm.setNumber(userInput);

        if(gm.isCorrect() == 0){
        System.out.println("Congrats your guess is right");
        break;
        }
        else if(gm.isCorrect() == 1){
            gm.setCounter();
        System.out.println("Enter smaller Number:");
        }
        else{
            gm.setCounter();
        System.out.println("Enter larger number:");
        }
         }
         gm.getCounter();
    }
}
