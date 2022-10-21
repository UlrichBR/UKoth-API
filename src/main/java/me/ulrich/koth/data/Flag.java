package me.ulrich.koth.data;

public enum Flag {
    NAME("%name"),
    TAG("%tag"),
    PLAYER("%player"),
    EXTRA("%extra"),
    AMOUNT("%amount");

    private String flag;

    private Flag(String flag) {
        this.flag = flag;
    }

    public String getFlag() {
        return flag;
    }
}
