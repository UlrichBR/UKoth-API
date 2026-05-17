package me.ulrich.koth.interfaces;


import org.bukkit.inventory.ItemStack;

/**
 * A class which handles {@link ItemStack} displays on any {@link Hologram}
 */
public interface ItemLine extends Line {

    /**
     * Get the {@link ItemStack} that the {@link ItemLine} currently represents
     * @return The current displayed {@link ItemStack}
     */
    ItemStack getItemStack();

    /**
     * Set the {@link ItemStack} the {@link ItemLine} displays
     * @param itemStack The {@link ItemStack} to display
     */
    void setItemStack(final ItemStack itemStack);

}
