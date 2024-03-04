import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); //initialize scanner
        String rpsChoiceA = ""; //initialize input variables
        String rpsChoiceB = "";
        String rpsMenuA = "Play RPS!\nR- Rock\tP- Paper\tS- Scissors\nPlayer A choose one: "; //initialize option menus
        String rpsMenuB = "Play RPS!\nR- Rock\tP- Paper\tS- Scissors\nPlayer B choose one: ";
        String donePlaying = ""; // initialize finished variable
        final String rockPaper = "Paper covers Rock."; // initialize outcome variables
        final String paperScissors = "Scissors cuts Paper.";
        final String scissorsRock = "Rock breaks Scissors.";
        final String aWins = " Player A wins!";
        final String bWins = " Player B wins!";
        boolean done = false; // will loop until done equals true
        boolean done2 = false; // to make sure ending is a valid input
        do { // do while loop runs app until user is done
            do { //do while loop runs until user has input a correct value
                System.out.println(rpsMenuA);
                if (in.hasNextLine())
                {
                    rpsChoiceA = in.nextLine(); // sets input value equal to input from scanner
                    if (rpsChoiceA.equalsIgnoreCase("R"))
                    {
                        done = true;// valid value ends loop
                    }
                    else if (rpsChoiceA.equalsIgnoreCase("P"))
                    {
                        done = true;
                    }
                    else if (rpsChoiceA.equalsIgnoreCase("S"))
                    {
                        done = true;
                    }
                    else
                    {
                        System.out.println(rpsChoiceA + " is not a valid choice.\nPlease enter a valid choice."); //invalid value prompts user again
                    }
                }
            } while (!done);

            done = false;
            do
            {
                System.out.println(rpsMenuB);
                if (in.hasNextLine())
                {
                    rpsChoiceB = in.nextLine();
                    if (rpsChoiceB.equalsIgnoreCase("R"))
                    {
                        done = true;
                        if (rpsChoiceA.equalsIgnoreCase("P")) //compares player a to player b
                        {
                            System.out.println(rockPaper + aWins); //correct outcome of the inputs
                        }
                        if (rpsChoiceA.equalsIgnoreCase("S"))
                        {
                            System.out.println(scissorsRock + bWins);
                        }
                    }
                    else if (rpsChoiceB.equalsIgnoreCase("P"))
                    {
                        done = true;
                        if (rpsChoiceA.equalsIgnoreCase("R"))
                        {
                            System.out.println(rockPaper + bWins);
                        }
                        if (rpsChoiceA.equalsIgnoreCase("S"))
                        {
                            System.out.println(paperScissors + aWins);
                        }
                    }
                    else if (rpsChoiceB.equalsIgnoreCase("S"))
                    {
                        done = true;
                        if (rpsChoiceA.equalsIgnoreCase("P"))
                        {
                            System.out.println(paperScissors + bWins);
                        }
                        if (rpsChoiceA.equalsIgnoreCase("R"))
                        {
                            System.out.println(scissorsRock + aWins);
                        }
                    }
                    else
                    {
                        System.out.println(rpsChoiceB + " is not a valid choice.\nPlease enter a valid choice.");
                    }
                }
            } while (!done);
            if(rpsChoiceA.equalsIgnoreCase(rpsChoiceB))
            {
                System.out.println("It is a tie."); // if player a and player b have the same input, they tie
            }


            done = false;
            System.out.print("Are you done playing? Y/N:"); // asks if the user is done playing
            do
            {
                if (in.hasNextLine())
                {
                    donePlaying = in.nextLine();
                    if (donePlaying.equalsIgnoreCase("Y"))
                    {
                        done = true; //if they are the program ends
                        done2 = true; //valid input
                    } else if (donePlaying.equalsIgnoreCase("N"))
                    {
                        System.out.println("Lets continue."); // if not it continues
                        done2 = true;
                    } else
                    {
                        System.out.println(donePlaying + " is not a valid choice.\nPlease enter a valid choice."); //if invalid response, it asks again
                    }
                }
            }while(!done2);
        }while(!done);

    }
}