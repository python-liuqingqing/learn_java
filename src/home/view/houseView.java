package project.home.view;

import project.home.domain.House;
import project.home.service.houseService;
import project.home.utils.Utility;


public class houseView {
    private boolean loop = true;//控制显示菜单
    private char key = ' ';//接收用户选择
    private houseService houseServer = new houseService(10);
    private House[] houseList = houseServer.list();


    public void mainMenu() {
        do {
            System.out.println("==============房屋出租系统菜单==============");
            System.out.println("\t\t\t1 新增房源");
            System.out.println("\t\t\t2 查找房源");
            System.out.println("\t\t\t3 删除房源");
            System.out.println("\t\t\t4 修改房源");
            System.out.println("\t\t\t5 显示房源");
            System.out.println("\t\t\t6 退出系统");
            System.out.println("请输入你的选择（1-6）：");
            key = Utility.readChar();
            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    updateHouse();
                    break;
                case '5':
                    listHouses();
                    break;
                case '6':
                    System.out.println("退出");
                    loop = false;
                    break;
                default:
                    System.out.println("请输入正确的编号！");
            }
        } while (loop); //条件
    }

    public void listHouses() {
        System.out.println("==============房屋列表==============");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态（未出组/已出租）");
        for (House h : houseList) {
            if (h == null) {
                break;
            }
            System.out.println(h);
        }
        System.out.println("==============房屋列表显示完毕==============");
    }

    public void addHouse() {
        System.out.println("姓名：");
        String name = Utility.readString();
        System.out.println("电话：");
        String phone = Utility.readString();
        System.out.println("地址：");
        String address = Utility.readString();
        System.out.println("月租：");
        int rant = Utility.readInt();
        System.out.println("状态：");
        String state = Utility.readString();
        House newHouse = new House(0, name, phone, address, rant, state);
        boolean isAdd = houseServer.add(newHouse);
        if (isAdd == true) {
            System.out.println("==============房屋添加成功==============");
        } else {
            System.out.println("==============房屋添加失败==============");
        }
    }

    public void delHouse() {
        System.out.println("==============删除房屋==============");
        System.out.println("请选择待删除的房屋编号（-1退出）：");
        int bh = Utility.readInt();
        if (bh == -1) {
            System.out.println("==============放弃删除==============");
            return;
        }
        char choice = Utility.readSelectChar();
        if (choice == 'Y') {
            houseServer.del(bh);
        } else {
            System.out.println("==============放弃删除==============");
        }
    }

    public void findHouse() {
        System.out.println("==============查找房屋==============");
        System.out.println("请输入查找的的房屋id：");
        int id = Utility.readInt();
        House house = houseServer.findById(id);
        if (house != null) {
            System.out.println(house);
            System.out.println("==============查找房屋完成==============");
        } else {
            System.out.println("==============没有查到此房屋==============");
        }
    }

    public void updateHouse() {
        System.out.println("==============修改房屋==============");
        System.out.println("请输入修改的的房屋id：");
        int id = Utility.readInt();
        if (id == -1) {
            System.out.println("==============放弃修改房屋==============");
            return;
        }
        House house = houseServer.findById(id);
        if (house == null) {
            System.out.println("==============修改房屋不存在==============");
        } else {
            System.out.println("姓名(" + house.getName() + "):");
            String name = Utility.readString();
            house.setName(name);
            System.out.println("电话(" + house.getPhone() + "):");
            String phone = Utility.readString();
            house.setPhone(phone);
            System.out.println("地址(" + house.getAddress() + "):");
            String add = Utility.readString();
            house.setAddress(add);
            System.out.println("月租(" + house.getRant() + "):");
            int rant = Utility.readInt();
            house.setRant(rant);
            System.out.println("状态(" + house.getState() + "):");
            String stat = Utility.readString();
            house.setState(stat);
            System.out.println("==============修改房屋成功==============");
        }
    }


}
