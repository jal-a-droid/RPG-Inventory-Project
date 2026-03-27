public class Weapons {
    protected String name = "No Name";
    protected int health = 100;
    protected String type = "tool";
    protected String damage = "no effect";

    public Weapons(String name, String type, String damage){
        this.name = name;
        this.type = type;
        this.damage = damage;
    }

    public Weapons(String name, int health, String type, String damage){
        this.name = name;
        this.health = health;
        this.type = type;
        this.damage = damage;
    }

    public String getName(){
        return this.name;
    }
    public int getHealth(){
        return this.health;
    }
    public String getType(){
        return this.type;
    }
    public String getDamage(){
        return this.damage;
    }
    public void dropWeapon(){

    }
}

class projectile extends Weapons{
    static int quantity = 3;
    public projectile(String name, String type, String damage) {
        super(name, type, damage);
    }
    public void shoot(){
        System.out.println("You have shot your projectile. You have delt " + damage + " damage!");
        quantity--;
    }

}