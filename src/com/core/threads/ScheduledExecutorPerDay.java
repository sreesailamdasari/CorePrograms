/**
 * 
 */
package com.core.threads;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author sreesdas
 *
 */
public class ScheduledExecutorPerDay implements Runnable {

	public static void main(String[] args) {
		// https://stackoverflow.com/questions/20387881/how-to-run-certain-task-every-day-at-a-particular-time-using-scheduledexecutorse
		LocalDateTime localNow = LocalDateTime.now();
		// Malesiya time zone
		// ZoneId malesiyaZone = ZoneId.of("Asia/Kuala_Lumpur");
		// India time zone
		ZoneId indiaZone = ZoneId.of("Asia/Kolkata");

		ZonedDateTime zonedNow = ZonedDateTime.of(localNow, indiaZone);
		ZonedDateTime zonedNext;
		// Here you need to set the time when it has to start - suppose if you want run
		// the scheduler midnight 1.30 am you need to mention time as - 13-30-0
		zonedNext = zonedNow.withHour(16).withMinute(45).withSecond(0);
		if (zonedNow.compareTo(zonedNext) > 0)
			zonedNext = zonedNext.plusDays(1);

		Duration duration = Duration.between(zonedNow, zonedNext);
		long initalDelay = duration.getSeconds();
		ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
		scheduler.scheduleAtFixedRate(new ScheduledExecutorPerDay(), initalDelay, 24 * 60 * 60, TimeUnit.SECONDS);

	}

	@Override
	public void run() {
		// Write your code here

	}

}
