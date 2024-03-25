package com.hspedu.enum_;

public class EnumDetail {
    public static void main(String[] args) {
        Music.CLASSICMUSIC.playing();
    }
}
interface IPplaying {
    public void  playing();
}

enum Music implements  IPplaying {
    CLASSICMUSIC;
    @Override
    public void playing() {
        System.out.println("音楽を再生しています...");
    }
}