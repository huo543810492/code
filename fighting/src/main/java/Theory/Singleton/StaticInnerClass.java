package Theory.Singleton;

public class StaticInnerClass {
    private static class SingletonHolder{
        private static StaticInnerClass INSTANCE = new StaticInnerClass();
    }
    private StaticInnerClass(){}
    public static StaticInnerClass  getInstance()
    {
        return SingletonHolder.INSTANCE;
    }
}
