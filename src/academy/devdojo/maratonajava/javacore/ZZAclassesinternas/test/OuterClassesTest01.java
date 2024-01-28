package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class InnerClassesTest01 {
    private String name = "Monkey D. Luffy";

    class Inner {
        public void printOuterClassAttribute() {
            System.out.println(name);
            System.out.println(this);
            System.out.println(InnerClassesTest01.this);
        }
    }

    public static void main(String[] args) {
        InnerClassesTest01 outerClass = new InnerClassesTest01();
        Inner inner = outerClass.new Inner();
        Inner inner2 = new InnerClassesTest01().new Inner();
        inner.printOuterClassAttribute();
        inner2.printOuterClassAttribute();
    }
}
