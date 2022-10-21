package me.ulrich.koth.data;

public class ProximitySettings {

	private int size;
	private boolean enabled;

	public ProximitySettings(boolean enabled, int size) {
		this.setEnabled(enabled);
		this.setSize(size);
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
}
