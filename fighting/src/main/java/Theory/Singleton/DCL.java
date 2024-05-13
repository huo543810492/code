package Theory.Singleton;


 public class DCL {
     private static volatile DCL INSTANCE;
     private DCL(){}

     public static DCL getINSTANCE() {
         if(INSTANCE == null)
         {
             synchronized (DCL.class)
             {
                 if(INSTANCE == null)
                     INSTANCE = new DCL();
             }
         }
         return INSTANCE;
     }

     public static void main(String[] args) {
         DCL.getINSTANCE();
     }
 }
