package entity.robot;


import entity.part.Hand;
import entity.part.Head;
import entity.part.Leg;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class T1000RobotImpl implements Robot, InitializingBean, DisposableBean{

    private Hand hand;
    private Leg leg;
    private Head head;

    private String color;
    private int year;
    private boolean soundEnabled;

    public T1000RobotImpl() {
    }

    public T1000RobotImpl(Hand hand, Leg leg, Head head) {
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }

    public T1000RobotImpl(String color, int year, boolean soundEnabled) {
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    public T1000RobotImpl(Hand hand, Leg leg, Head head, String color, int year, boolean soundEnabled) {
        this.hand = hand;
        this.leg = leg;
        this.head = head;
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSoundEnabled() {
        return soundEnabled;
    }

    public void setSoundEnabled(boolean soundEnabled) {
        this.soundEnabled = soundEnabled;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    @Override
    public void action() {
        head.calc();
        hand.catchSomething();
        leg.go();
        System.out.println("color: " + color);
        System.out.println("year: " + year);
        System.out.println("can play sound: " + soundEnabled);
    }

    @Override
    public void dance() {
        System.out.println("T1000 is dancing!");
    }

    public void init(){
        System.out.println("init " + this.getClass().getSimpleName());
    }

    public void destroy(){
        System.out.println("destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this + " method afterPropertiesSet()");
    }
}
