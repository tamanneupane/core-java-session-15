package contitionalstatement;

public class BlockScope {

    int a = 5;
    String global = "Global Variable";
    public static void main(String[] args) {
        BlockScope bs = new BlockScope();
        bs.function();

        System.gc();
        // GC runs here

        bs.function1();

        int i = 5;
        {
            int j = 10;
            System.out.println(i);
        }
        //System.out.println(j); // cannot access
        System.out.println(i);
    }

    public void function(){
        String local = "Local Variable";
        System.out.println(global);
    }

    public void function1(){
        String local = "Local Variable";
        System.out.println(global);
    }
}
