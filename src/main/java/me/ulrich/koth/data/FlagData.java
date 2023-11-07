package me.ulrich.koth.data;

import me.ulrich.koth.data.KothEnum.SchedulerFlag;

public class FlagData {

	private SchedulerFlag flag_key;
	private Class<?> flag_type;
	private Object flag_value;

	public FlagData(SchedulerFlag flag_key, Class<?> flag_type, Object flag_value) {
		this.setFlag_key(flag_key);
		this.setFlag_type(flag_type);
		this.setFlag_value(flag_value);
	}

	public SchedulerFlag getFlag_key() {
		return flag_key;
	}

	public void setFlag_key(SchedulerFlag flag_key) {
		this.flag_key = flag_key;
	}

	public Class<?> getFlag_type() {
		return flag_type;
	}

	public void setFlag_type(Class<?> flag_type) {
		this.flag_type = flag_type;
	}

	public Object getFlag_value() {
		return flag_value;
	}

	public void setFlag_value(Object flag_value) {
		this.flag_value = flag_value;
	}
}
