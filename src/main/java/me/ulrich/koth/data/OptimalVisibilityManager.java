package me.ulrich.koth.data;


import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import me.ulrich.koth.interfaces.Hologram;
import me.ulrich.koth.interfaces.VisibilityManager;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * The default {@link VisibilityManager} implementation
 */
public class OptimalVisibilityManager implements VisibilityManager {

    private final List<UUID> viewers = new ArrayList<>();

    private final Hologram hologram;
    private boolean visibleByDefault;

    /**
     * Construct the default {@link VisibilityManager} for a {@link Hologram}
     * @param hologram The {@link Hologram} parent
     */
    public OptimalVisibilityManager(final Hologram hologram) {
        this.hologram = hologram;
        this.visibleByDefault = true;
    }

    @Override
    public Hologram getHologram() {
        return this.hologram;
    }

    @Override
    public boolean isVisibleByDefault() {
        return this.visibleByDefault;
    }

    @Override
    public void setVisibleByDefault(final boolean visibleByDefault) {
        this.visibleByDefault = visibleByDefault;
    }

    @Override
    public void showTo(final Player player) {
        this.viewers.add(player.getUniqueId());
    }

    @Override
    public void hideTo(final Player player) {
        this.viewers.remove(player.getUniqueId());
    }

    @Override
    public boolean isVisibleTo(final Player player) {
        return this.viewers.contains(player.getUniqueId());
    }

    @Override
    public void resetVisibility(final Player player) {
        if (this.visibleByDefault) {
            this.viewers.add(player.getUniqueId());
            return;
        }

        this.viewers.remove(player.getUniqueId());
    }

    @Override
    public void resetVisibilityAll() {
        Bukkit.getOnlinePlayers().forEach(this::resetVisibility);
    }

}
