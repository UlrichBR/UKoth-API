package me.ulrich.koth.data;

public class CommandData_sound {

	private String on_help;
	private String on_success;
	private String on_error;
	
	public CommandData_sound(String on_help, String on_success, String on_error) {
		this.setOn_help(on_help);
		this.setOn_success(on_success);
		this.setOn_error(on_error);
	}

	public String getOn_help() {
		return on_help;
	}

	public void setOn_help(String on_help) {
		this.on_help = on_help;
	}

	public String getOn_success() {
		return on_success;
	}

	public void setOn_success(String on_success) {
		this.on_success = on_success;
	}

	public String getOn_error() {
		return on_error;
	}

	public void setOn_error(String on_error) {
		this.on_error = on_error;
	}
	
}
