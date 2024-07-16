package com.hspedu_15.generic_.GenericTestWokr_;

import org.junit.jupiter.api.Test;

import java.util.List;

public class GenericTestWork_ {
    public static void main(String[] args) {

    }

    @Test
    public void testList() {
        DAO<User> dao = new DAO<>();
        dao.save("001", new User(1, 10, "jack"));
        dao.save("002", new User(2, 18, "king"));
        dao.save("003", new User(3, 38, "smith"));

        List<User> list = dao.list();
        System.out.println("list =" + list);

        dao.update("003", new User(3, 58, "milan"));
        dao.delete("001");
        System.out.println("====修改后====");
        list = dao.list();
        System.out.println("list" +list);

        System.out.println("id = 003" + dao.get("003"));
    }
}
