package com.example.naver.broadcastbestpractice;

import android.app.Activity;

import java.util.List;

/**
 * Created by naver on 7/10/2017.
 */

public class ActivityCollector {

    public static List<Activity> activityList;

    public static void addActivity(Activity activity){
        activityList.add(activity);
    }

    public static void removeActivity(Activity activity){
        activityList.remove(activity);
    }

    public static void finishAll(){
        for (Activity activity:activityList) {
            if(!activity.isFinishing()){
                activity.finish();
            }
        }
    }

}
