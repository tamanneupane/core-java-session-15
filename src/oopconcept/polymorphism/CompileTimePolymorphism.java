package oopconcept.polymorphism;

public class CompileTimePolymorphism {

    public static void main(String[] args) {

        CompileTimePolymorphism compileTimePolymorphism = new CompileTimePolymorphism();
        compileTimePolymorphism.add(2,3);

        compileTimePolymorphism.add(5,10);

        compileTimePolymorphism.add(5.2f,10.2f);

    }

    // function overloading
    public  void add(int a, int b){
        int result = a + b;
        System.out.println(result);
    }

    public  void add(float a, float b){
        float result = a + b;
        System.out.println(result);
    }


}
