import java.lang.reflect.Array;
import java.util.*;

public class Test {
    static List<String> lists = new ArrayList<>();

    public static void main(String[] args) {
        //lambdaTest();
        //setTest();
        //fx("hello world!");
        //fx(100);

      Demo demo=  new Demo<String>();
      demo.fx("abc");
    }


    static void setTest() {
        Set sets = new HashSet<String>();
        sets.add("Are");
        sets.add("you");
        sets.add("ok");
        sets.add("?");

        sets.forEach((str) -> System.out.println(str));
    }


    static void lambdaTest() {
        String[] strings = {"i", "am", "a", "coder", "hello", "world", "are", "you", "ok", "?"};

        lists = Arrays.asList(strings);

        lists.forEach((string) -> System.out.println(string));
        new Thread((() -> System.out.println("run...."))).start();
    }

    static <T> void fx(T t) {
        System.out.println(t.getClass());
    }

   static class Demo<T>{
         void fx(T t) {
            System.out.println(t.getClass());
        }
    }
}
