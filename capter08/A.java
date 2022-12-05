package capter08;

//访问修饰符
//1、公开 public           同类 同包 子类 不同包
//2、受保护 protected      同类 同包 子类
//3、默认，没有修饰符        同类 同包
//4、私有  private         同类
public class A {
    public int a = 100;     // 公开
    protected int b = 3;    // 受保护
    int c = 2;              //默认
    private int d = 1;      // 私有

}
