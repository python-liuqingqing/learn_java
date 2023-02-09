package project.home.service;

import project.home.domain.House;

public class houseService {
    private House[] houses;
    private int houseNum = 1;
    private int idInc = 1;

    public houseService(int size) {
        /*
        T[] 数组名 = new T[N];
        T：数组中元素的类型。
        T[]：表示是数组类型，[]也可以放在数组名的后面。这里的[]不能有任何的数组
        N：创建数组要的长度。
        */
        houses = new House[size];
        houses[0] = new House(1, "lqp", "124", "北京", 1000, "出租");
    }

    public House[] list() {
        return houses;
    }

    public boolean add(House house) {
        if (houses.length == houseNum) {
            System.out.println("数组已满，不能添加了！");
            return false;
        }
        houses[houseNum++] = house;
//       自增id, 更新id
        house.setId(++idInc);
        return true;
    }

    public boolean del(int bh) {
        int index = -1; // 删除的下标
        for (int i = 0; i < houseNum; i++) {
            if (bh == houses[i].getId()) {
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("============未发现此房屋=============");
            return false;
        }
        for (int i = index; i < houseNum - 1; i++) {
            houses[i] = houses[i + 1];
        }
        houses[houseNum - 1] = null;
        houseNum--;
        System.out.println("============删除成功=============");
        return true;
    }

    public House findById(int id) {
        for (int i = 0; i < houseNum; i++) {
            if (id == houses[i].getId()) {
                return houses[i];
            }
        }
        return null;
    }


}
