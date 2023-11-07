package me.ulrich.koth.data;

import java.util.UUID;

import me.ulrich.koth.data.KothEnum.CmdType;

public class CmdData {


	private CmdType type;
	private String cmd;
	private UUID kothUUID;
	private UUID id;

	public CmdData(UUID id, UUID kothUUID, String cmd, CmdType type) {
		this.setId(id);
		this.setCmd(cmd);
		this.setType(type);
		this.setKothUUID(kothUUID);
	}

	public CmdType getType() {
		return type;
	}

	public void setType(CmdType type) {
		this.type = type;
	}

	public UUID getKothUUID() {
		return kothUUID;
	}

	public void setKothUUID(UUID kothUUID) {
		this.kothUUID = kothUUID;
	}

	public String getCmd() {
		return cmd;
	}

	public void setCmd(String cmd) {
		this.cmd = cmd;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}
}
