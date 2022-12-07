import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

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
        
        naughtyNiceList = formatList(naughtyNiceList);
        printList(naughtyNiceList, "ALL");

        //Accept new comma-delimited entries
        Scanner in = new Scanner(System.in);
        boolean enter = true;
        String[] newEntry;

        // while (enter) {

        //     System.out.println("\nEnter data for a new child separated by commas. (Type \"STOP\" to exit)");

        //     //Prompt user for new input, store into a String array to be evaluated
        //     newEntry = updateList(in.nextLine().split(","), naughtyNiceList[0].length);

        //     //Incorrect length entry
        //     if (newEntry[0].equals("INVALID")) {
        //         System.out.println(Colors.Yellow + "Please enter a list of " + naughtyNiceList[0].length + " items." + Colors.Reset);
        //     }

        //     //Enter data
        //     else if (newEntry.length == naughtyNiceList[0].length) {

        //     }
        // }
    }
    public static void printList() {

    }
}
