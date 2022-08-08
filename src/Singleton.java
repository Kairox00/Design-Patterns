public class Singleton {
    //Bill Pugh Method

    private Singleton(){}

    private static class InstanceHolder{
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance(){
        return InstanceHolder.instance;
    }
}
