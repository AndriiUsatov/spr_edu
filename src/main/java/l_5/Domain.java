package l_5;

import entity.robot.Robot;
import entity.robot.T1000RobotImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Domain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        Robot t1000 = (T1000RobotImpl) context.getBean("t1000v_3");
        t1000.dance();
        t1000.action();

        //First comment

        //Third comment




        //More comments
        //Second comment
        //Fourth comment
        //Fifth comment
        System.out.println("AHAHAHAAA");
        System.out.println("Hello World!");
    }
}
