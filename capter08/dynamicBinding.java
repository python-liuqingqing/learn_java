package capter08;

public class dynamicBinding {
    public static void main(String[] args) {
        AA aa = new BB();
        System.out.println(aa.sum());
    }
}

class AA {
    int i = 10;

    public int sum() {
        return get() + 10;  // 30 此时get 会调子类的get,也会使用子类的 i属性。
    }

    public int sum1() {
        return i + 10;
    }

    public int get() {
        return i;
    }
}

class BB extends AA {
    int i = 20;

//    public int sum() {
//        return get() + 10;
//    }

    public int sum1() {
        return i + 10;
    }

    public int get() {
        return i;
    }


}