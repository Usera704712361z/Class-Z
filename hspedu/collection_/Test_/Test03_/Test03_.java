package com.hspedu.collection_.Test_.Test03_;

import java.util.*;

public class Test03_ {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put("jack", 650);
        m.put("tom", 1200);
        m.put("smith", 2900);
        System.out.println(m);

        m.put("jack",2600);
        System.out.println(m);

        Set keySet = m.keySet();
        for (Object key :keySet) {
            m.put(key, (Integer)m.get(key) + 100);
        }
        System.out.println(m);

        Set entrySet = m.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry =  (Map.Entry)iterator.next();
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        Collection values = m.values();
        for (Object value :values) {
            System.out.println((value));
        }

    }
}
