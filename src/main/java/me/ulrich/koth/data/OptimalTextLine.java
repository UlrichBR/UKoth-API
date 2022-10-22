package me.ulrich.koth.data;


import org.bukkit.ChatColor;

import me.ulrich.koth.interfaces.TextLine;


public final class OptimalTextLine implements TextLine {

    private final OptimalHologram hologram;

    private String text;

    /**
     * Create a new Item Line
     *
     * @param hologram The parent {@link OptimalHologram}
     * @param text     The default {@link String} text
     */
    public OptimalTextLine(OptimalHologram hologram, String text) {
        this.hologram = hologram;
        this.text = ChatColor.translateAlternateColorCodes('&', text);
    }

    public String getText() {
        return this.text;
    }

    @Override
    public void setText(String text) {
        this.text = ChatColor.translateAlternateColorCodes('&', text);
        this.updateHologram(hologram);
    }

}
