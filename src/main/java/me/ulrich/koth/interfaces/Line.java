package me.ulrich.koth.interfaces;

/**
 * The line interface used to return lines, and which has a method to update the {@link Hologram}
 */
public interface Line {

    /**
     * Update a hologram line
     *
     * @param hologram The parent hologram
     */
    default void updateHologram(final Hologram hologram) {
        hologram.updateLine(hologram.getLineIndex(this), this);
    }

}
