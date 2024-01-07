package com.hspedu.houserent.service;

import com.hspedu.houserent.domain.House;

/**
 * 1.响应HouseView的调用
 * 2.完成对房屋信息的各种操作(c[creat]r[read]u[update]d[delete])
 */
public class HouseService {
    private House[] houses;//保存House对象
    private int houseNums = 1;//记录当前有多少个房屋信息
    private int idCounter = 1;
    public HouseService(int size) {
        houses = new House[size];//当创建HouseService对象时，指定数组大小
        //为了配合测试列表信息，初始化一个House对象
        houses[0] = new House(1,"jack","112",
                "軽井沢",40000,"未出租");
    }

    //find方法，返回House对象或者null
    public House findById(int findId) {
        for(int i = 0; i < houseNums; i++) {
            if(findId == houses[i].getId()) {
                return houses[i];
            }
        }
        return null;
    }

    public boolean del(int delId) {
        //应先找到要删除的房屋信息对应的下标
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if(delId == houses[i].getId()) {//要删除的房屋（id），是数组下标为i的元素
                index = i;//使用index记录i
            }
        }
        if(index == -1) {//未找到房屋信息
            return false;
        }
        for(int i = index; i < houseNums -1; i++) {
            houses[i] = houses[i + 1];
        }
        //把当前存在的房屋信息的最后一个设置为null
        houses[--houseNums] = null;
        return true;
    }

    //add方法，添加新对象，返回boolean
    public boolean add(House newHouse) {
        //判断是否还可以继续添加
        if(houseNums == houses.length) {
            System.out.println("数组已满不能再添加...");
            return false;
        }
        houses[houseNums++] = newHouse;
        //设计一个id自增长的机制，然后更新newHouse的id
        newHouse.setId(++idCounter);
        return true;
    }

    public House[] list(){
        return houses;
    }
}
