package entity.part;

@FunctionalInterface
public interface Hand {
    void catchSomething();

    default void init(){
        System.out.println("init " + this.getClass().getSimpleName());
    }

}
