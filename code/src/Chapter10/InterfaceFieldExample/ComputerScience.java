package Chapter10.InterfaceFieldExample;

import Chapter10.Exericise3.Demo;

public class ComputerScience implements DemoInterface{
    public ComputerScience()
    {
        System.out.println(DemoInterface.A);
        System.out.println(DemoInterface.NAME);
        System.out.println(DemoInterface.COURSE_NAME);
    }

}
