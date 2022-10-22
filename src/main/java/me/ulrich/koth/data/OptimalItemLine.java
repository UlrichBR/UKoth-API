package me.ulrich.koth.data;


import org.bukkit.inventory.ItemStack;

import me.ulrich.koth.interfaces.ItemLine;

public final class OptimalItemLine implements ItemLine {

    private final OptimalHologram hologram;

    private ItemStack itemStack;

    /**
     * Create a new Item Line
     *
     * @param hologram  The parent {@link OptimalHologram}
     * @param itemStack The default {@link ItemStack}
     */
    public OptimalItemLine(final OptimalHologram hologram,
                           final ItemStack itemStack) {
        this.hologram = hologram;
        this.itemStack = itemStack;
    }

    @Override
    public ItemStack getItemStack() {
        return this.itemStack;
    }

    @Override
    public void setItemStack(final ItemStack itemStack) {
        this.itemStack = itemStack;
        this.updateHologram(hologram);
    }

}
