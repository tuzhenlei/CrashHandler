package com.tuzhenlei.crashhandler;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

import java.util.LinkedList;
import java.util.List;

/**
 * author：tuzhenlei
 * time  ：2017/2/20 17:49
 */

public class MyActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {

	private static List<Activity> activities = new LinkedList<>();
	public static int sAnimationId = 0;

	@Override
	public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
		addActivity(activity);
	}

	@Override
	public void onActivityStarted(Activity activity) {

	}

	@Override
	public void onActivityResumed(Activity activity) {

	}

	@Override
	public void onActivityPaused(Activity activity) {

	}

	@Override
	public void onActivityStopped(Activity activity) {

	}

	@Override
	public void onActivitySaveInstanceState(Activity activity, Bundle outState) {

	}

	@Override
	public void onActivityDestroyed(Activity activity) {
		removeActivity(activity);
	}

	/**
	 * 添加Activity
	 */
	public static void addActivity(Activity activity) {
		if (activities == null) {
			activities = new LinkedList<>();
		}

		if (!activities.contains(activity)) {
			activities.add(activity);//把当前Activity添加到集合中
		}
	}

	/**
	 * 移除Activity
	 */
	public static void removeActivity(Activity activity) {
		if (activities.contains(activity)) {
			activities.remove(activity);
		}

		if (activities.size() == 0) {
			activities = null;
		}
	}


	/**
	 * 销毁所有activity
	 */
	public static void removeAllActivities() {
		for (Activity activity : activities) {
			if (null != activity) {
				activity.finish();
				activity.overridePendingTransition(0, sAnimationId);
			}
		}
	}
}
