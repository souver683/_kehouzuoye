package come.tatic_01;

public class static_01 {
    static{
        System.out.println("加载类时，static以及加载了，比main方法还早。");

    }

    public static void main(String[] args) {
        System.out.println("main方法执行了");
    }
}
