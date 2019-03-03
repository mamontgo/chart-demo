package com.scribsee.chat;

import java.util.*;

/**
 * Created by mamon_000 on 3/2/2019.
 */
public class DatePointBuilder {

    public static List<DataPoint> build(int items) {
        Calendar ago = Calendar.getInstance();
        ago.add(Calendar.DATE, items);
        Date current = ago.getTime();
        List<DataPoint> points = new ArrayList<DataPoint>();
        for(int i = 0;i<=items;i++){
            DataPoint point = new DataPoint();
            point.setScore(new Random().nextInt(100));
            point.setDate(current);
            points.add(point);
            ago.setTime(current);
            ago.add(Calendar.DATE, 1);
            current = ago.getTime();
        }
        return points;
    }

}
