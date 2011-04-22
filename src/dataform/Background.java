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
public abstract class Background
{
    private String name;
    private String description;
    private ArrayList<Faction> factions;

    public String getName() { return name; }
    public String getDescription() { return description; }
    public ArrayList<Faction> getFactions() { return factions; }
}
