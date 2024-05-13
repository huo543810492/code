package Theory.InnerClass;

public class Inner {
    public void MethodInner(){
         int j = 9;
        class Innerin{
            int i = 10;
            public  void MethodB() {
                System.out.println(j);
                System.out.println(i);
            }

        }
    }
}
