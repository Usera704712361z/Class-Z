package com.hspedu.houserent.view;

import com.hspedu.houserent.domain.House;
import com.hspedu.houserent.service.HouseService;
import com.hspedu.houserent.utils.Utility;

/**
 * 1.显示界面
 * 2.接收用户的输入
 * 3.调用HouseService完成对房屋信息的各种操作
 */
public class HouseView {
    private boolean loop = true;//控制显示菜单
    private char key = ' ';//接收用户选择
    private HouseService houseService = new HouseService(2);

    //根据id修改房屋信息
    public void update() {
        System.out.println("==========修改房屋信息==========");
        System.out.println("请选择待修改房屋编号（-1退出）");
        int updateId = Utility.readInt();
        if(updateId == -1) {
            System.out.println("==========放弃修改房屋信息==========");
            return;
        }

        //根据输入得到updateId，查找对象
        House house = houseService.findById(updateId);
        if(house == null) {
            System.out.println("==========修改房屋信息不存在..==========");
            return;
        }

        System.out.println("姓名(" + house.getName() + ")：");
        //这里如果用户直接回车表示不修改该信息，默认""
        String name = Utility.readString(10,"");
        if(!"".equals(name)) {
            house.setName(name);
        }

        System.out.println("电话(" + house.getPhone() + ")：");
        String phone = Utility.readString(15, "");
        if(!"".equals(phone)) {
            house.setPhone(phone);
        }

        System.out.println("地址(" + house.getAddress() + ")：");
        String address = Utility.readString(18, "");
        if(!"".equals(address)) {
            house.setAddress(address);
        }

        System.out.println("租金(" + house.getRent() + ")：");
        int rent = Utility.readInt(-1);
        if (rent != -1) {
            house.setRent(rent);
        }

        System.out.println("状态(" + house.getState() + ")：");
        String state = Utility.readString(5,"");
        if(!"".equals(state)) {
            house.setState(state);
        }
        System.out.println("==========修改房屋信息成功..==========");
    }

    //根据id查找房屋信息
    public void findHouse() {
        System.out.println("==========查找房屋信息==========");
        System.out.println("请输入你要查找的id：");
        int findId = Utility.readInt();
        //调用方法
        House house = houseService.findById(findId);
        if(house != null) {
            System.out.println(house);
        } else {
            System.out.println("==========查找房屋信息的id不存在==========");
        }
    }

    //完成退出确认
    public void exit() {
        //使用Utility提供的方法完成确认
        char c = Utility.readConfirmSelection();
        if(c == 'Y') {
            loop = false;
        }
    }

    //编写delHouse（）接收输入的id，调用Service的del方法
    public void delHouse() {
        System.out.println("==========删除房屋信息==========");
        System.out.println("请输入待删除房屋的编号（-1退出）");
        int delId = Utility.readInt();
        if(delId == -1) {
            System.out.println("==========放弃删除房屋信息==========");
            return;
        }
        //注意：该方法本身就有循环判断的逻辑，必须输出Y/N
        char choice = Utility.readConfirmSelection();
        if(choice == 'Y') {
            if(houseService.del(delId)) {
                System.out.println("==========删除房屋信息成功==========");
            } else {
                System.out.println("==========房屋编号不存在，删除失败==========");
            }
        } else {
            System.out.println("==========放弃删除房屋信息==========");
        }
    }

    //编写addHouse（）接收输入，创建House对象，调用add方法
    public void addHouse() {
        System.out.println("==========添加房屋==========");
        System.out.print("姓名：");
        String name = Utility.readString(8);
        System.out.print("电话：");
        String phone = Utility.readString(13);
        System.out.print("住址：");
        String address = Utility.readString(20);
        System.out.print("月租：");
        int rent = Utility.readInt();
        System.out.print("状态：");
        String state = Utility.readString(5);
        //创建一个新的House对象
        House newHouse = new House(0, name, phone, address, rent, state);
        if(houseService.add(newHouse)){
            System.out.println("==========添加房屋成功==========");
        } else {
            System.out.println("==========添加房屋失败==========");
        }
    }

    //编写listHouse()显示房屋列表
    public void listHouse() {
        System.out.println("==========房屋列表==========");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        House[] houses = houseService.list();
        for (int i = 0; i < houses.length; i++) {
            if(houses[i] == null) {
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("==========房屋列表显示完毕==========");
    }
    public void mainMenu() {
        do {
            System.out.println("\n==========房屋出租系统==========");
            System.out.println("\t\t1 新 增 房 源");
            System.out.println("\t\t2 查 找 房 源");
            System.out.println("\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t4 查 找 房 屋 信 息");
            System.out.println("\t\t5 房 屋 列 表");
            System.out.println("\t\t6 退      出");
            System.out.println("请输入你的选择(1-6): ");
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
                    update();
                    break;
                case '5':
                    listHouse();
                    break;
                case '6':
                    exit();
                    break;
            }
        } while(loop);
    }
}
