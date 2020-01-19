package com.example.insta;

import java.util.ArrayList;

public class data {
    public static ArrayList<information> getData() {

        ArrayList<information> data=new ArrayList<>();

    int images[] = {R.drawable.u6, R.drawable.u4, R.drawable.u5, R.drawable.u7};
    String names[] = {"Lee Min Ho", "Facts_club", "Draw_Globe", "World_tour"};
    int post[] = {R.drawable.p6, R.drawable.pp4, R.drawable.pp5, R.drawable.pp3};
    String likes[]={"100,000 likes","1,234 likes","500 likes","90,000 likes"};
    String tag[]={"#design shoots","#riddle of the day","pizza anyone?","jumping into 2020"};
    String time[]={"2 minutes ago","10 hours ago","19 hours ago","1 day ago"};
    for (int i=0;i<images.length;i++)
    {
        information current=new information() ;
        current.imageid=images[i];
        current.title=names[i];
        current.postpic=post[i];
        current.liking=likes[i];
        current.title1=names[i]+" ";
        current.tagg=tag[i];
        current.tym=time[i];

        data.add(current);
    }

return data;
}

}
