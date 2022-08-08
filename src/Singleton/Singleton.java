package Singleton;

public class Singleton {
    //Bill Pugh Method
    String name;

    private Singleton(){}

    private static class InstanceHolder{
        private static final Singleton instance = new Singleton();
    }

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }

    public static Singleton getInstance(){
        Singleton instance = InstanceHolder.instance;
        instance.name = "Khaled";
        return instance;
    }
}
