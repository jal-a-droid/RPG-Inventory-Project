public class Weapons {
    protected String name = "No Name";
    protected int health = 100;
    protected String type = "tool";
    protected String damage = "no effect";

    public Weapons(String name, String type, String effect){
        this.name = name;
        this.type = type;
        this.damage = effect;
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
