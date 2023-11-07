package me.ulrich.koth.data;

import me.ulrich.koth.data.KothEnum.BorderColors;
import me.ulrich.koth.data.KothEnum.EndAction;

public class MaxtimeSettings {
	
	private int size;
	private boolean enabled;
	private EndAction endAction;
	private BorderColors borderColor;

	public MaxtimeSettings(boolean enabled, int size, EndAction endAction, BorderColors borderColor) {
		this.setEnabled(enabled);
		this.setSize(size);
		this.setEndAction(endAction);
		this.setBorderColor(borderColor);
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public EndAction getEndAction() {
		return endAction;
	}

	public void setEndAction(EndAction endAction) {
		this.endAction = endAction;
	}

	public BorderColors getBorderColor() {
		return borderColor;
	}

	public void setBorderColor(BorderColors borderColor) {
		this.borderColor = borderColor;
	}
}
