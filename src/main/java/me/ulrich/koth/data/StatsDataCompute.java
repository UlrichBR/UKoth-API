package me.ulrich.koth.data;

public class StatsDataCompute {

	private String data;
	private int amount;

	public StatsDataCompute(String data, int amount) {
		this.setData(data);
		this.setAmount(amount);
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
}
