public class Tools {
    protected String name = "No Name";
    protected int health = 100;
    protected String type = "tool";
    protected String effect = "no effect";

    public Tools(String name, String type, String effect){
        this.name = name;
        this.type = type;
        this.effect = effect;
    }

    public Tools(String name, int health, String type, String effect){
        this.name = name;
        this.health = health;
        this.type = type;
        this.effect = effect;
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
    public String getEffect(){
        return this.effect;
    }
    public void dropTool(){

    }
    public void write(){
        System.out.println("You have written!");
    }
}

class healConsumable extends Tools{
    static int quantity = 1;
    static Boolean contHeal = false;
    public healConsumable(String name, String type, String effect) {
        super(name, type, effect);
    }

    public void consume(){
        System.out.println("You have consumed the healing fruit. You are now continuously healing!");
        contHeal = true;
    }
}

class questKey extends Tools{
    static int quantity = 1;
    public questKey(String name, String type, String effect) {
        super(name, type, effect);
    }

    public void useKey(){
        System.out.println("You have used the Quest Key to open the Quest Chest!");
        quantity--;
    }
}