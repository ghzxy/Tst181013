import java.util.ArrayList;
import java.util.List;

public class Test {
   static Tst t;
   static List<Tst> list=new ArrayList<Tst>();
    public static void main(String[] args) {


        t= new Tst();
        t.a=0;
       list.add(t);
        System.out.println("----"+list.get(0).a);
        t.a=1;
        //TEST   FFF

        t=null;
        System.out.println("----"+list.get(0).a);
    }

   static class  Tst{
        int a;
    }
}
