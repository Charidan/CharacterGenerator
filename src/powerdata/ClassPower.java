/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package powerdata;

import java.io.PrintStream;
import java.util.ArrayList;
import dataform.PowerTrait;

/**
 *
 * @author Julian
 */
public class ClassPower
{
    private String name;
    private String fileName;
    private int levelReq;
    private ArrayList<PowerTrait> traits = new ArrayList<PowerTrait>();
    private String description;
    
    public ClassPower(String name, int reqLevel, ArrayList<PowerTrait> traits, String description)
    {
        this.name = name;
        fileName = name.replaceAll(" ", "");
        this.levelReq = reqLevel;
        this.traits = traits;
        this.description = description;
    }
    
    public String getName() { return name; }
    public String getFileName() { return fileName; }
    void addTrait(PowerTrait trait) { traits.add(trait); }
    public int getLevelReq() { return levelReq; }
    public String getDescription(){ return description; }

    public void print(PrintStream p)
    {
        p.println(name);
        p.println(levelReq);
        for(PowerTrait t: traits)
        {
            t.print(p);
        }
        p.println(description);
        p.flush();
        p.close();
    }
}
