package Theory.testNewObjectInLoop;

public class Student {
    private String namd;
    private int age;
   private  static String room;




    public String getNamd() {
        return namd;
    }

    public void setNamd(String namd) {
        this.namd = namd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getRoom() {
        return room;
    }

    public static void setRoom(String room) {
        Student.room = room;
    }

    public Student(String namd, int age) {
        this.namd = namd;
        this.age = age;
    }
    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "namd='" + namd + '\'' +
                ", age=" + age +
                '}';
    }
}
