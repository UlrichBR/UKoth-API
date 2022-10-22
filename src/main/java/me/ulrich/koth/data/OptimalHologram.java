package me.ulrich.koth.data;


import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;

import me.ulrich.koth.interfaces.Hologram;
import me.ulrich.koth.interfaces.HologramAPI;
import me.ulrich.koth.interfaces.ItemLine;
import me.ulrich.koth.interfaces.Line;
import me.ulrich.koth.interfaces.TextLine;
import me.ulrich.koth.interfaces.VisibilityManager;

import java.util.ArrayList;
import java.util.List;

/**
 * The default implementation of the {@link Hologram}
 */
public final class OptimalHologram implements Hologram {

    private final HologramAPI connector;
    private final Object hologramObject;
    private Location location;
    private String id;
    private Object extra;

    private final VisibilityManager visibilityManager = new OptimalVisibilityManager(this);
    private final List<Line> lines = new ArrayList<>();

    /**
     * Create a new hologram
     *
     * @param connector      The connector to use
     * @param hologramObject The hologram object for the connector
     * @param location       The starting location
     */
    public OptimalHologram(final HologramAPI connector,
                           final Object hologramObject,
                           final Location location,
                           final String id, final Object extra) {
        this.connector = connector;
        this.hologramObject = hologramObject;
        this.location = location;
        this.id = id;
        this.extra = extra;
    }

    @Override
    public List<Line> getLines() {
        return this.lines;
    }

    @Override
    public Line getLineAt(final int index) {
        return this.lines.get(index);
    }

    @Override
    public int getLineIndex(final Line line) {
        return this.lines.indexOf(line);
    }

    @Override
    public void setLineAt(final int index, final Line line) {
        this.lines.set(index, line);
        this.connector.setLine(this, index, line);
    }

    @Override
    public void updateLine(final int index, final Line line) {
        this.connector.updateLine(this, index, line);
    }

    @Override
    public void appendLine(final Line line) {
        this.lines.add(line);
        this.connector.appendLine(this, line);
    }

    @Override
    public ItemLine appendItemLine(final ItemStack itemStack) {
        final ItemLine itemLine = new OptimalItemLine(this, itemStack);
        this.appendLine(itemLine);

        return itemLine;
    }

    @Override
    public TextLine appendTextLine(final String text) {
        final TextLine textLine = new OptimalTextLine(this, text);
        this.appendLine(textLine);

        return textLine;
    }

    @Override
    public VisibilityManager getVisibilityManager() {
        return this.visibilityManager;
    }

    @Override
    public Location getLocation() {
        return this.location;
    }

    @Override
    public void teleport(final Location location) {
        this.location = location;
        this.connector.teleport(this, location);
    }

    @Override
    public void delete() {
        this.connector.delete(this);
    }

    @Override
    public int size() {
        return this.lines.size();
    }

    @Override
    public Object getHologramAsObject() {
        return this.hologramObject;
    }
    
    @Override
	public String getId() {
		return id;
	}
    
	@Override
	public Object getExtra() {
		return extra;
	}

}
