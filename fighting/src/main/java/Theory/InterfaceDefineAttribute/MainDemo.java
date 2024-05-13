package Theory.InterfaceDefineAttribute;

public class MainDemo {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("大白");
        SkillImpl skillImpl = new SkillImpl();
        Skill skill2 = new Skill(){
            @Override
            public void use() {
                System.out.println("用匿名内部类实现，" +
                        "并biu biu biu");
            }
        };
//        hero.setSkill(skill2);
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("用匿名内部类和匿名对象实现，并biu biu biu");
            }
        });
        hero.attack();

    }

}
