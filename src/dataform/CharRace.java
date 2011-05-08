/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dataform;

import java.util.ArrayList;
import java.util.HashMap;
import powerdata.ClassPower;

/**
 *
 * @author Julian
 */
public abstract class CharRace
{
    private String name;
    private ArrayList<ClassPower> powers = new ArrayList<ClassPower>();
    private String description;
    private HashMap<String,Integer> abilityMods = new HashMap<String,Integer>();

    public String getName() { return name; }
    public String getDescription() { return description; }
    public ArrayList<ClassPower> getRacePowers() { return powers; }
    public HashMap<String,Integer> getAbilityMods() { return abilityMods; }
}
