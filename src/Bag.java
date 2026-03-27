import java.util.HashMap;

public abstract class Bag{
    public int capacity = 0;
    public static int num = 0;
    public int weight = 0;
    public String name = "";
    public String closure_System = "";
    public String material = "";
    public Boolean open;

    final static HashMap<Integer,Tools> toolInventory = new HashMap<>();
    final static HashMap<Integer,Weapons> weaponInventory = new HashMap<>();

    public void addABag(){
        ++num;
        System.out.println("You have added a bag!\n You now have "+ num + " bags!");
    }




    public void addToolBag(int i, Tools tool){
        toolInventory.put(i, tool);
        capacity--;
        System.out.println("You have added an item!");
    }

    public static String getToolMap(){
        return toolInventory.toString();
    }

    public void emptyTools(){
        toolInventory.clear();
        System.out.println("You have emptied the bag!");
    }
    public void addWeaponBag(int i, Weapons weapon){
        weaponInventory.put(i, weapon);
        capacity--;
        System.out.println("You have added an item!");
    }

    public void emptyWeapons(){
        weaponInventory.clear();
        System.out.println("You have emptied the bag!");
    }
    public void openBag(){
        open = true;
    }
    public void closeBag(){
        open = false;
    }
}
class Satchel extends Bag{
    public Satchel(){
        this.capacity = 5;
        this.weight = 0;
        this.closure_System = "zipper";
        this.material = "cotton";
    }

}

class Clutch extends Bag{
    public Clutch(){
        this.capacity = 2;
        this.weight = 0;
        this.closure_System = "snap lock";
        this.material = "leather";
    }


}

class Backpack extends Bag{
    public Backpack(){
        this.capacity = 10;
        this.weight = 0;
        this.closure_System = "zipper";
        this.material = "nylon";
    }
}


