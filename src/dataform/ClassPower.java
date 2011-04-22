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
public abstract class ClassPower
{
    private String name;
    private int reqLevel;
    private ProgressionType progType;
    private ArrayList<PowerTrait> traits = new ArrayList<PowerTrait>();
    
    public String getName() { return name; }
    public ProgressionType getProgType() { return progType; }
    void addTrait(PowerTrait trait) { traits.add(trait); }
    public int getReqLevel() { return reqLevel; }
}
