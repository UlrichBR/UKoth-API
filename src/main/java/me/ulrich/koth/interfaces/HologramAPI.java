package me.ulrich.koth.interfaces;


import org.bukkit.Location;
import org.bukkit.entity.Player;

import me.ulrich.koth.Koth;

/**
 * The {@link HologramAPI} which handles connections between multiple {@link Hologram} sources
 */
public interface HologramAPI {

    /**
     * Create a {@link Hologram}
     *
     * @param location The starting {@link Location}
     * @param extra 
     * @param id 
     * @return The created {@link Hologram}
     */
    Hologram createHologram(final Koth plugin, final Location location, String id, Object extra);

    /**
     * Set a holograms line at an index
     *
     * @param hologram  The parent {@link Hologram}
     * @param lineIndex The {@link Line} index
     * @param line      The {@link Line}
     */
    void setLine(final Hologram hologram, final int lineIndex, final Line line);

    /**
     * Update a {@link Hologram}s line
     *
     * @param hologram  The parent {@link Hologram}
     * @param lineIndex The {@link Line} index
     * @param line      The {@link Line}
     */
    void updateLine(final Hologram hologram, final int lineIndex, final Line line);

    /**
     * Append a {@link Line} to a {@link Hologram}
     *
     * @param hologram The parent {@link Hologram}
     * @param line     The {@link Line}
     */
    void appendLine(final Hologram hologram, final Line line);

    /**
     * Teleport a hologram
     *
     * @param hologram The {@link Hologram} to teleport
     * @param location The {@link Location} to teleport it to
     */
    void teleport(final Hologram hologram, final Location location);

    /**
     * Delete a hologram
     */
    void delete(final Hologram hologram);

    /**
     * Show a hologram to a player
     *
     * @param visibilityManager The {@link VisibilityManager} to use
     * @param player            The player
     */
    void showTo(final VisibilityManager visibilityManager, final Player player);

    /**
     * Hide a hologram from a player
     *
     * @param visibilityManager The {@link VisibilityManager} to use
     * @param player            The player
     */
    void hideTo(final VisibilityManager visibilityManager, final Player player);

}
