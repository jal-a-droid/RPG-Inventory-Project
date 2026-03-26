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
