public class PrimitiveDataTypes {
    public static int staticVar; // doesn't have to be initialized
    public int instanceVar; // doesn't have to be initialized
    public static int setLocalVar(){
        int localVar; // must be initialized
        localVar = 0;
        return localVar;
    }
    public static void main(String[] args){
        PrimitiveDataTypes test = new PrimitiveDataTypes();
        System.out.println(test.setLocalVar());
        System.out.println(test.staticVar);
        System.out.println(test.instanceVar);
    }
}
