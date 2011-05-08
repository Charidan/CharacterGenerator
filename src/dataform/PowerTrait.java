/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dataform;

import java.io.PrintStream;

/**
 *
 * @author Julian
 */
public class PowerTrait
{
    ProgressionType progType;
    private String description;
    private String base;
    private String effected;

    public PowerTrait(String baseStat, String effectedStat, ProgressionType progType, String description)
    {
        base = baseStat;
        effected = effectedStat;
        this.progType = progType;
        this.description = description;
    }
    
    public String getDescription() { return description; }
    public String getBaseStat() { return base; }
    public String getEffectedStat() { return effected; }
    public ProgressionType getProgType() { return progType; }
    
    public String getValue()
    {
        return null;
    }

    public void print(PrintStream p)
    {
        // TODO Find save format for PowerTrait
        
    }
    
}
