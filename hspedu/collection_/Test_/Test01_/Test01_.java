package com.hspedu.collection_.Test_.Test01_;

import java.util.ArrayList;
@SuppressWarnings({"all"})
public class Test01_ {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new News("新型コロナウイルスの感染者数は既に1000万を超え、数百万のヒンドゥー" +
                "教信者が恒河に巡礼に訪れていることが公衆の懸念を引き起こしています"));
        arrayList.add(new News("男性が突然、2か月前に釣った魚がまだ網の中にあることに気づき、すぐにそれを引き上げて放してやった"));
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            //System.out.println(arrayList.get(i));
            News news = (News)arrayList.get(i);
            System.out.println(processTitle(news.getTitle()));
        }
    }
    public static String processTitle(String title) {
        if(title == null) {
            return "";
        }

        if(title.length() > 15) {
            return title.substring(0, 15) + "...";
        } else {
            return title;
        }
    }
}

class  News {
    private String title;
    private String content;

    public News(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                '}';
    }
}
