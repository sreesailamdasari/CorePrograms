package com.core.threads;

import java.util.Calendar;
import java.util.Date;

public class Task implements Runnable {
	private String name;

	public Task(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	// @Override
	public void run() {
		try {
			Calendar calendar = Calendar.getInstance();
			Date startDate = calendar.getTime();
			System.out.println("starttime :" + startDate);
			System.out.println("Doing a task during : " + name + " - Time - " + new Date());
//			Calendar calendar1 = Calendar.getInstance();
//			Date endDate = calendar1.getTime();
//			System.out.println("end time :" + endDate);
//			System.out.println("time :" + (endDate.getTime() - startDate.getTime()));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
