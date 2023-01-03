import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        //Original List
        String naughtyNiceList[][] = {
            {"LoGaN", "may", "Naughty",	"7730 Whitemarsh Court", "deOdeRant"},
            {"Cecilia",	"bOYer", "Nice", "8686 Elm St.", "PUddle"},
            {"lorElAi",	"moRsE", "Naughty",	"8529 Birchpond St.", "TOMAto"},
            {"rory", "black", "Naughty", "39 Fairfield Ave.", "lamp ShaDe"},
            {"Denzel", "SancHez", "961 Hanover Ave.", "shOEs"},
            {"maNUEL",	"Lambert", "Nice", "698 Arrowhead Rd.", "chArgEr"},
            {"Trinity",	"FISHER", "Nice", "49 Arlington Avenue", "winDow"},
            {"maTthiAs", "hayEs", "Nice", "23 Woodside Ave.", "LOTION"},
            {"Sophia",	"SToUT", "Naughty",	"7640 Andover Dr.",	"teddY beAr"},
            {"keNNedy",	"Dunlap", "", "63 Cypress Rd.", "pAnts"},
            {"", "", "", "", ""},
            {"", "", "", "", ""},
            {"", "", "", "", ""},
            {"", "", "", "", ""},
            {"", "", "", "", ""},
            {"", "", "", "", ""},
            {"", "", "", "", ""},
            {"", "", "", "", ""},
            {"", "", "", "", ""},
            {"", "", "", "", ""},
        };
        String yesno;

        //Accept new comma-delimited entries
        Scanner in = new Scanner(System.in);
        boolean enter = true;
        String[] newEntry;

        //Print Old List
        System.out.print("\nOld List:");
        printArray(naughtyNiceList);
        Thread.sleep(1000); 

        //Change Presents to Coal
        for (int i = 0; i < naughtyNiceList.length; i++){
            for (int j = 0; j < naughtyNiceList[i].length; j++){
                naughtyNiceList[i][j] = naughtyNiceList[i][j].toUpperCase();
            }
            if (naughtyNiceList[i][2].equals ("NAUGHTY")){
                naughtyNiceList[i][4] = "COAL";
            }
        }

        //Print New List
        System.out.println("\nThe Computer Gangster Elves are fixing your terrible list, please hold."); 
        Thread.sleep(2000);
        System.out.println("Meanwhile, please enjoy some reindeer jazz music.");
        Thread.sleep(2000);
        System.out.println("** jazzy music in background **");
        Thread.sleep(2000);
        System.out.print("\nNew List:");
        Thread.sleep(1000);
        printArray(naughtyNiceList);
        Thread.sleep(1000); 

        //Add Children?
        do{
            System.out.println("\nWould you like to add new children? If yes, type yes. If not, type no.");
            yesno = in.nextLine().toUpperCase();

            //No
            if(yesno.equals("NO")) {
                System.out.println("Good procrastinating, see you later!");
                Thread.sleep(1000);
                break;
            }

            //Yes
            else if(yesno.equals("YES")) {
                Thread.sleep(1000);
                System.out.println("Please enter a new child. Use the format 'First Name,Last Name,Naughty or Nice,Address,Present'." + Colors.Red + " DO NOT USE SPACES!" + Colors.Reset);
                newEntry = in.nextLine().toUpperCase().split(",");
                if(newEntry.length == 5) {

                    for(int i = 0; i < naughtyNiceList.length; i++) {
                        if (naughtyNiceList[i][0].equals("")
                        && naughtyNiceList[i][1].equals("")
                        && naughtyNiceList[i][2].equals("")
                        && naughtyNiceList[i][3].equals("")
                        && naughtyNiceList[i][4].equals("")){
                            
                            //Change presents to Coal
                            naughtyNiceList[i] = newEntry;
                            if (naughtyNiceList[i][2].equals ("NAUGHTY")){
                                naughtyNiceList[i][4] = "COAL";
                            }
                            break;
                        }
                    }
                    //New list
                    Thread.sleep(1000);
                    System.out.println();
                    printArray(naughtyNiceList);
                }

                //Not correct amount of columns
                else {
                    Thread.sleep(1000);
                    System.out.print(Colors.Red + "That's not the correct amount of information!! Use the correct format!!" + Colors.Reset);
                    Thread.sleep(1000);
                }
            }
            
            // Not YES or NO
            else {
                Thread.sleep(1000);
                System.out.print(Colors.Red + "Yes or no only!!" + Colors.Reset);
                Thread.sleep(1000);
            }

        } while(true);
    }

    //Naughty or Nice Colors
    public static void printArray(String[][] naughtyNiceList) {
        for (int i = 0; i < naughtyNiceList.length; i++){
            if (naughtyNiceList[i][2].toUpperCase().equals("NAUGHTY")){
                System.out.println(Colors.Red);
            }
            else if (naughtyNiceList[i][2].toUpperCase().equals("NICE")){
                System.out.println(Colors.Green);
            }
            else {
                System.out.println(Colors.Yellow);
            }
            for (int j = 0; j < naughtyNiceList[i].length; j++){
                System.out.print(naughtyNiceList[i][j] + " ");
            }
            System.out.print(Colors.Reset);
        }

    }
}