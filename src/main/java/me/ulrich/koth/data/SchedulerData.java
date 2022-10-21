package me.ulrich.koth.data;

import java.time.DayOfWeek;
import java.util.UUID;

import me.ulrich.koth.data.KothEnum.EventFrequency;

public class SchedulerData {

	private EventFrequency frequency;
	private int month_day;
	private DayOfWeek week_day;
	private int hour;
	private int minute;
	private UUID id;
	private UUID kothId;

	public SchedulerData(UUID kothId, UUID id, EventFrequency frequency, int month_day, DayOfWeek week_day, int hour, int minute) {
		this.setKothId(kothId);
		this.setId(id);
		this.setFrequency(frequency);
		this.setWeek_day(week_day);
		this.setMonth_day(month_day);
		this.setHour(hour);
		this.setMinute(minute);

		
	}

	public EventFrequency getFrequency() {
		return frequency;
	}

	public void setFrequency(EventFrequency frequency) {
		this.frequency = frequency;
	}

	public int getMonth_day() {
		return month_day;
	}

	public void setMonth_day(int month_day) {
		this.month_day = month_day;
	}

	public DayOfWeek getWeek_day() {
		return week_day;
	}

	public void setWeek_day(DayOfWeek week_day) {
		this.week_day = week_day;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public UUID getKothId() {
		return kothId;
	}

	public void setKothId(UUID kothId) {
		this.kothId = kothId;
	}



}

