package pets.dogs;

public class Yorkie {
    public static final String type = "Yorkshire Terrier";
    public int weight;

    public static void speak(){
        System.out.println("bark bark!");
    }

    public void setWeight(int weight){
        this.weight = weight;
    }
}
