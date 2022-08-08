package Builder;

public interface vehicle {
    default void print(){
        System.out.println("Im a Builder.vehicle");
    }

    static void blowHorn(){
        System.out.println("toot toot");
    }
}
