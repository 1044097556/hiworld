package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.TestDIService;

public class TestDI {
    public static void main(String [] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestDIService ts = (TestDIService) applicationContext.getBean("testDIservice");
        ts.sayhello();
    }
}
