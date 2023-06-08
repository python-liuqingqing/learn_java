public class SingleTest {
    public static void main(String[] args) {
//       单例模式 饿汉式 创建实例就会创建出来
        new FistFriend("33");
//        FistFriend instance = FistFriend.getInstance();
//        System.out.println(instance);
//        System.out.println(instance.hashCode());
//
//        FistFriend instance1 = FistFriend.getInstance();
//        System.out.println(instance1);
//        System.out.println(instance1.hashCode());
    }
}

class FistFriend {
    private String name;

    public static int num =1;

    //   创建一个内部实例，并设置为静态属性方便下面调用（静态方法只能调用静态属性）静态方法类加载时执行，只执行一次。
    private static FistFriend gf = new FistFriend("xh");

    //    1 私有化 2 提供一个公共static方法 返回内部实例
    FistFriend(String name) {
        System.out.println("构造器");
        this.name = name;
    }
    public static FistFriend getInstance() {
        return gf;
    }

    @Override
    public String toString() {
        return "FistFriend{" + "name='" + name + '\'' + '}';
    }
}