package service;

import dao.TestDIDao;

public class TestDIServiceimpl implements TestDIService {
    private TestDIDao testDIDao;

    public TestDIServiceimpl(TestDIDao testDIDao) {
        this.testDIDao = testDIDao;
    }

    @Override
    public void sayhello() {
        testDIDao.sayHello();
        System.out.println("TestDIservice构造方法注入say:hello!");
    }
}
