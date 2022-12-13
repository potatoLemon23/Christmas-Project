import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int playerOneChoice = 0;
        int playerTwoChoice = 0;
        float userIn;

        //Player name
        System.out.println(Colors.Cyan + "\nPlayer one, what is your name?" + Colors.Reset);
        Thread.sleep(1000); 
        Scanner sc= new Scanner(System.in);  
        String userOneName= sc.nextLine();   
        in.reset();
        System.out.println();

        Thread.sleep(1000); 
        System.out.println(Colors.Purple + "\nPlayer Two, what is your name?" + Colors.Reset);
        Thread.sleep(1000);     
        String userTwoName= sc.nextLine();   
        in.reset();
        System.out.println();

        // Player One Choose rock paper or scissors
        System.out.println("\n" + Colors.Cyan + userOneName + Colors.Reset + ", Rock, Paper, Scissors, or Bomb Cyclone?");
        Thread.sleep(1000); 
        System.out.println("\n1. Rock");
        Thread.sleep(500); 
        System.out.println("2. Paper");
        Thread.sleep(500); 
        System.out.println("3. Scissors");
        Thread.sleep(500); 
        System.out.println(Colors.Red + "4. Bomb Cyclone" + Colors.Reset);

        // Store the Choices
        playerOneChoice = in.nextInt();
        in.reset();

        if (playerOneChoice == 1 || playerOneChoice == 2 || playerOneChoice == 3 || playerOneChoice == 4) {
            System.out.println(Colors.Green + "\nExcellent choice " + Colors.Cyan + userOneName + Colors.Reset);
            Thread.sleep(1000);
        }

        else {
            System.out.println(Colors.Red + "\nThat's not a choice you idiot! Try again!" + Colors.Reset);
            Thread.sleep(1000); 
        }

        //Player Two Choose
        System.out.println("\n" + Colors.Purple + userTwoName + Colors.Reset + ", Rock, Paper, Scissors, or Bomb Cyclone?");
        Thread.sleep(1000); 
        System.out.println("\n1. Rock");
        Thread.sleep(500); 
        System.out.println("2. Paper");
        Thread.sleep(500); 
        System.out.println("3. Scissors");
        Thread.sleep(500); 
        System.out.println(Colors.Red + "4. Bomb Cyclone" + Colors.Reset);

        // Store the Choices
        playerTwoChoice = in.nextInt();
        in.reset();

        if (playerOneChoice == 1 || playerOneChoice == 2 || playerOneChoice == 3 || playerOneChoice == 4) {
            System.out.println(Colors.Green + "\nExcellent choice " + Colors.Purple + userTwoName + Colors.Reset);
        }

        else {
            System.out.println(Colors.Red + "\nThat's not a choice you idiot! Try again!" + Colors.Reset);
            Thread.sleep(1000); 
        }

        // Count Down, reveal choices
        Thread.sleep(2000); 
        System.out.println("\n3...");
        Thread.sleep(1000); 
        System.out.println("2...");
        Thread.sleep(1000); 
        System.out.println("1...");
        Thread.sleep(1000);

        if (playerOneChoice == 1) {
         Thread.sleep(1000);
         System.out.println("\n" + Colors.Cyan + userOneName + Colors.Reset + " Chose Rock.");  
        }

        else if (playerOneChoice == 2) {
         Thread.sleep(1000);
         System.out.println("\n" + Colors.Cyan + userOneName + Colors.Reset + " Chose Paper.");  
        }
        
        else if (playerOneChoice == 3) {
         Thread.sleep(1000);
         System.out.println("\n" + Colors.Cyan + userOneName + Colors.Reset + " Chose Scissors.");  
        }

        else if (playerOneChoice == 4) {
            Thread.sleep(1000);
            System.out.println("\n" + Colors.Cyan + userOneName + Colors.Reset + " Chose Bomb Cyclone.");
        }

        if (playerTwoChoice == 1) {
         Thread.sleep(1000);
         System.out.println("\n" + Colors.Purple + userTwoName + Colors.Reset + " Chose Rock.");  
        }
   
        else if (playerTwoChoice == 2) {
         Thread.sleep(1000);
         System.out.println("\n" + Colors.Purple + userTwoName + Colors.Reset + " Chose Paper.");  
        }
           
        else if (playerTwoChoice == 3) {
         Thread.sleep(1000);
         System.out.println("\n" + Colors.Purple + userTwoName + Colors.Reset + " Chose Scissors.");  
        }

        else if (playerTwoChoice == 4) {
            Thread.sleep(1000);
            System.out.println("\n" + Colors.Purple + userTwoName + Colors.Reset + " Chose Bomb Cyclone.");
        }

        // Identify the winner!
        if (playerOneChoice == 1 && playerTwoChoice == 1) {
            Thread.sleep(2000);
            System.out.println(Colors.Red + "\nYou tied! No one wins hahaha!" + Colors.Reset);
        }

        if (playerOneChoice == 2 && playerTwoChoice == 2) {
            Thread.sleep(2000);
            System.out.println(Colors.Red + "\nYou tied! No one wins hahaha!" + Colors.Reset);
        }

        if (playerOneChoice == 3 && playerTwoChoice == 3) {
            Thread.sleep(2000);
            System.out.println(Colors.Red + "\nYou tied! No one wins hahaha!" + Colors.Reset);
        }

        if (playerOneChoice == 4 && playerTwoChoice == 4) {
            Thread.sleep(2000);
            System.out.println(Colors.Red + "\nRED ALERT!");
            Thread.sleep(1000);
            System.out.println("RED ALERT!"); 
            Thread.sleep(1000);
            System.out.println("OVERPOWER OF SYSTEM, EXPLOSION IMPENDING.");
            Thread.sleep(1000);
            System.out.println("TAKE COVER IMMEDIA...");
            Thread.sleep(500);
            System.out.println(" {***" + Colors.Reset + Colors.Yellow + "**" + Colors.Reset + Colors.White + "*" + Colors.Reset + Colors.Yellow + "**" + Colors.Reset + Colors.Red + "***}" + Colors.Reset);
        }
        
        if (playerOneChoice == 1 && playerTwoChoice == 2) {
            Thread.sleep(2000);
            System.out.println(Colors.Green + "\n" + Colors.Purple + userTwoName + Colors.Reset + " wins! Hate to be you " + Colors.Cyan + userOneName + Colors.Reset + "!" + Colors.Reset);
        }
        
        if (playerOneChoice == 1 && playerTwoChoice == 3) {
            Thread.sleep(2000);
            System.out.println(Colors.Green + "\n" + Colors.Cyan + userOneName + Colors.Reset + " wins! Hate to be you " + Colors.Purple + userTwoName + Colors.Reset + "!" + Colors.Reset);
        }

        if (playerOneChoice == 2 && playerTwoChoice == 1) {
            Thread.sleep(2000);
            System.out.println(Colors.Green + "\n" + Colors.Cyan + userOneName + Colors.Reset + " wins! Hate to be you " + Colors.Purple + userTwoName + Colors.Reset + "!" + Colors.Reset);
        }

        if (playerOneChoice == 2 && playerTwoChoice == 3) {
            Thread.sleep(2000);
            System.out.println(Colors.Green + "\n" + Colors.Purple + userTwoName + Colors.Reset + " wins! Hate to be you " + Colors.Cyan + userOneName + Colors.Reset + "!" + Colors.Reset);
        }

        if (playerOneChoice == 3 && playerTwoChoice == 1) {
            Thread.sleep(2000);
            System.out.println(Colors.Green + "\n" + Colors.Purple + userTwoName + Colors.Reset + " wins! Hate to be you " + Colors.Cyan + userOneName + Colors.Reset + "!" + Colors.Reset);
        }

        if (playerOneChoice == 3 && playerTwoChoice == 2) {
            Thread.sleep(2000);
            System.out.println(Colors.Green + "\n" + Colors.Cyan + userOneName + Colors.Reset + " wins! Hate to be you " + Colors.Purple + userTwoName + Colors.Reset + "!" + Colors.Reset);
        }

        if (playerOneChoice == 4 && playerTwoChoice == 1) {
            Thread.sleep(2000);
            System.out.println(Colors.Red + "\n" + Colors.Cyan + userOneName + Colors.Reset + " decimates " + Colors.Purple + userTwoName + Colors.Reset + ". Really, how did you think you would get away without a bomb cyclone " + Colors.Purple + userTwoName + Colors.Reset + "??" + Colors.Reset);
        }

        if (playerOneChoice == 4 && playerTwoChoice == 2) {
            Thread.sleep(2000);
            System.out.println(Colors.Red + "\n" + Colors.Cyan + userOneName + Colors.Reset + " decimates " + Colors.Purple + userTwoName + Colors.Reset + ". Really, how did you think you would get away without a bomb cyclone " + Colors.Purple + userTwoName + Colors.Reset + "??" + Colors.Reset);
        }

        if (playerOneChoice == 4 && playerTwoChoice == 3) {
            Thread.sleep(2000);
            System.out.println(Colors.Red + "\n" + Colors.Cyan + userOneName + Colors.Reset + " decimates " + Colors.Purple + userTwoName + Colors.Reset + ". Really, how did you think you would get away without a bomb cyclone " + Colors.Purple + userTwoName + Colors.Reset + "??" + Colors.Reset);
        }

        if (playerOneChoice == 1 && playerTwoChoice == 4) {
            Thread.sleep(2000);
            System.out.println(Colors.Red + "\n" + Colors.Purple + userTwoName + Colors.Reset + " decimates " + Colors.Cyan + userOneName + Colors.Reset + ". Really, how did you think you would get away without a bomb cyclone " + Colors.Cyan + userOneName + Colors.Reset + "??" + Colors.Reset);
        }

        if (playerOneChoice == 2 && playerTwoChoice == 4) {
            Thread.sleep(2000);
            System.out.println(Colors.Red + "\n" + Colors.Purple + userTwoName + Colors.Reset + " decimates " + Colors.Cyan + userOneName + Colors.Reset + ". Really, how did you think you would get away without a bomb cyclone " + Colors.Cyan + userOneName + Colors.Reset + "??" + Colors.Reset);
        }

        if (playerOneChoice == 3 && playerTwoChoice == 4) {
            Thread.sleep(2000);
            System.out.println(Colors.Red + "\n" + Colors.Purple + userTwoName + Colors.Reset + " decimates " + Colors.Cyan + userOneName + Colors.Reset + ". Really, how did you think you would get away without a bomb cyclone " + Colors.Cyan + userOneName + Colors.Reset + "??" + Colors.Reset);
        }
    }
}
