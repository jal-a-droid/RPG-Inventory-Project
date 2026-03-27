import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Would you like to acquire a bag?");
        //Scanner scan = new Scanner(System.in);
        //String question = scan.nextLine().toLowerCase();
        Satchel Jalen = new Satchel();
        Tools pencil = new Tools("urmom", "tool", "write");
        Jalen.addToolBag(1, pencil);
        //System.out.println(Jalen.toolInventory.values());
        printTool(Jalen);
    }

    static void printTool(Bag bagName) {
        for (Tools t : bagName.toolInventory.values()) {
            System.out.println(t.name);
        }
    }

}