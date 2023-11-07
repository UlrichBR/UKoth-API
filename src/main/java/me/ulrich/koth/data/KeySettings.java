package me.ulrich.koth.data;

public class KeySettings {

	private boolean enabled;
	private int amount;

	public KeySettings(boolean enabled, int amount) {
		this.setEnabled(enabled);
		this.setAmount(amount);
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
}
