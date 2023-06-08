public class mainTest {
    public static void main(String[] args) {
        codeBlock block = new codeBlock();
    }
}

class codeBlock extends AA {
    public codeBlock() {
//        super();  不写也可以，默认调用父类的无参构造器
//        {}; 不写也可以，默认调用普通代码块
        System.out.println("子类构造器。。。");
    }

    public int name = num();

    static {
        System.out.println("子类静态代码块。。。");
    }

    {
        System.out.println("子类普通代码块。。。");
    }

    public int num() {
        System.out.println("子类普通属性。。。。");
        return 100;
    }
}


class AA {
    public AA() {
        System.out.println("父类的构造器。。。");
    }

    {
        System.out.println("父类的普通代码块。。。");
    }
    static {
        System.out.println("父类的静态代码块。。。");
    }
}
