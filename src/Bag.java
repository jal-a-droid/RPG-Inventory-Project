public abstract class Bag{
    public static int capacity = 0;
    public static int num = 0;
    public static int weight = 0;

    public int numOfBags(){
        System.out.println("You have added a bag!");
        return 8;
    }

    public static void addToBag(){
        System.out.println("You have added an item!");
    }

    public static void empty(){
        System.out.println("You have emptied the bag!");
    }
}
class Satchel extends Bag{


}

