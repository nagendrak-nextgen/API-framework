package CoreJava;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class workingwith_Reflections {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String operation = "div";
        int a = 100;
        int b = 20;

        workingwith_Reflections wwr = new workingwith_Reflections();
        Method m = wwr.getClass().getMethod(operation,int.class,int.class);
        m.invoke(wwr,a,b);

    }

    public void add(int a, int b) {
        System.out.println("addition - " + (a+b));
    }

    public void sub(int a, int b) {
        System.out.println("Substraction - " + (a-b));
    }

    public void mul(int a, int b) {
        System.out.println("Multiplication - " + a*b);
    }

    public void div(int a, int b) {
        System.out.println("Division - " + a/b);
    }
}
