/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dataform;

import java.util.ArrayList;

/**
 *
 * @author Julian
 */
public abstract class Region
{
    private String name;
    private String description;
    private ArrayList<Background> bgs = new ArrayList<Background>();
    private ArrayList<Faction> factions = new ArrayList<Faction>();

    public String getName() { return name; }
    public String getDescription() { return description; }
    public ArrayList<Background> getBackgrounds() { return bgs; }
    public ArrayList<Faction> getFactions() { return factions; }
}
