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

        //Accept new comma-delimited entries
        Scanner in = new Scanner(System.in);
        boolean enter = true;
        String[] newEntry;

        System.out.print("\nOld List:");
        printArray(naughtyNiceList);
        Thread.sleep(2000); 

        for (int i = 0; i < naughtyNiceList.length; i++){
            for (int j = 0; j < naughtyNiceList[i].length; j++){
                naughtyNiceList[i][j] = naughtyNiceList[i][j].toUpperCase();
            }
            if (naughtyNiceList[i][2].equals ("NAUGHTY")){
                naughtyNiceList[i][4] = "COAL";
            }
        }

        System.out.print("\nNew List:");
        printArray(naughtyNiceList);
        Thread.sleep(2000); 

        System.out.println("\nPlease enter information for a new child.");
        newEntry = in.nextLine().toUpperCase().split(",");
        for(int i = 0; i < naughtyNiceList.length; i++) {
            if (naughtyNiceList[i][0].equals(" ")
            && naughtyNiceList[i][0].equals(" ")){
                naughtyNiceList[i] = newEntry;
            }
        }
        Scanner sc= new Scanner(System.in);  
        String childOne= sc.nextLine();
        in.reset();
        System.out.println();
        printArray(naughtyNiceList);
    }
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