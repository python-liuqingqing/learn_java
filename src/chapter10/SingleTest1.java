public class SingleTest1 {
    public static void main(String[] args) {
//        new FistFriend1("dd");
//        System.out.println(FistFriend1.num);
//       单例模式 饿汉式 创建实例就会创建出来
        FistFriend1 instance = FistFriend1.getInstance();
        System.out.println(instance);
        System.out.println(instance.hashCode());
//
        FistFriend1 instance1 = FistFriend1.getInstance();
        System.out.println(instance1);
        System.out.println(instance1.hashCode());
    }
}

class FistFriend1 {
    public static int num =1;
    private String name;
    private static FistFriend1 f;

    //    1 私有化 2 提供一个公共static方法 返回内部实例
    FistFriend1(String name) {
        System.out.println("构造器");
        this.name = name;
    }
    public static FistFriend1 getInstance() {
        if (f == null){
            f = new FistFriend1("hh");
        }
        return f;
    }

    @Override
    public String toString() {
        return "FistFriend{" + "name='" + name + '\'' + '}';
    }
}