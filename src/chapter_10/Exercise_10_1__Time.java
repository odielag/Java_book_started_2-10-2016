package chapter_10;

import java.util.Calendar;

public class Exercise_10_1__Time
{
	public static void main(String[] args)
	{
		Exercise_10_1__Time testTime = new Exercise_10_1__Time(555550000);
		testTime.displayTime();
	}

	int hour, minute, second;

	Exercise_10_1__Time()
		{
			this.hour = Calendar.HOUR;
			this.minute = Calendar.MINUTE;
			this.second = Calendar.SECOND;
		}

	Exercise_10_1__Time(long elapsedTimeInMS)
		{
			final long MILLS_IN_A_DAY = 1000L * 60 * 60 * 24;
			final long MILLS_IN_A_HOUR = 1000L * 60 * 60;
			final long MILLS_IN_A_MIN = 1000L * 60;
			final long MILLS_IN_A_SEC = 1000L;
			this.hour = (int)((elapsedTimeInMS % MILLS_IN_A_DAY) / MILLS_IN_A_HOUR);
			this.minute = (int)((elapsedTimeInMS % MILLS_IN_A_HOUR) / MILLS_IN_A_MIN);
			this.second = (int)((elapsedTimeInMS % MILLS_IN_A_MIN) / MILLS_IN_A_SEC);
		}

	Exercise_10_1__Time(int hour, int minute, int second)
		{
			this.hour = hour;
			this.minute = minute;
			this.second = second;
		}

	public void setTime(long elapseTime)
	{
		final long MILLS_IN_A_DAY = 1000L * 60 * 60 * 24;
		final long MILLS_IN_A_HOUR = 1000L * 60 * 60;
		final long MILLS_IN_A_MIN = 1000L * 60;
		final long MILLS_IN_A_SEC = 1000L;
		this.hour = (int) ((elapseTime % MILLS_IN_A_DAY) / MILLS_IN_A_HOUR);
		this.minute = (int) ((elapseTime % MILLS_IN_A_HOUR) / MILLS_IN_A_MIN);
		this.second = (int) ((elapseTime % MILLS_IN_A_MIN) / MILLS_IN_A_SEC);

	}
	
	public void displayTime()
	{
		System.out.printf("%d:%d:%d", this.hour, this.minute, this.second);
	}
}
