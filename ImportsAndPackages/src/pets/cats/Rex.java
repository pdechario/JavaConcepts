package pets.cats;

public class Rex {
    public static final String type = "Devon Rex";
    public int weight;

    public static void speak(){
        System.out.println("mew!");
    }

    public void setWeight(int weight){
        this.weight = weight;
    }
}