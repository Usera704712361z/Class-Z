package com.hspedu_23.Work_01;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Work_01 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Class<PrivateTest> privateTestClass = PrivateTest.class;
        PrivateTest privateTestObj = privateTestClass.newInstance();
        Field name = privateTestClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(privateTestObj, "marry");
        Method getName = privateTestClass.getMethod("getName");
        Object invoke = getName.invoke(privateTestObj);
        System.out.println("name属性的值 = " + invoke);
    }
}

class PrivateTest {
    private String name = "helloKitty";
    public  String getName() {
        return name;
    }

}
