/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package classdata;

import java.io.PrintStream;

/**
 *
 * @author Julian
 */
public class CharClass
{
    public static final int GOOD_PROGRESSION = 0;
    public static final int AVERAGE_PROGRESSION = 1;
    public static final int POOR_PROGRESSION = 2;
    
    public static final int CL_NONCASTER = 0;
    public static final int CL_PER_LEVEL = 1;

    private String name;
    private int levelCount;
    private int bab;
    private int fort;
    private int ref;
    private int will;
    private int hdSize;
    private int skillPoints;
    private int casterLevel;
    private String description;
    
    public static final CharClass STORM_LORD = new CharClass("Storm Lord", 20, AVERAGE_PROGRESSION,
            GOOD_PROGRESSION, GOOD_PROGRESSION, POOR_PROGRESSION, 8, 4, CL_PER_LEVEL,
            "A Storm Lord is really in touch with the primal power "+
            "of a big ass storm. He can channel it into baddassery. Storm "+
            "Lords are more prevalent in races that deal with storms. "+
            "Storms take many forms, and Storm Lords can be in touch with "+
            "some or all of them, and may prefer one type to another.");

    public CharClass(String name, int levelCount, int bab, int fort, int ref, int will,
            int hdSize, int skillPoints, int casterLevel, String description)
    {
        this.name = name;
        this.levelCount = levelCount;
        this.bab = bab;
        this.fort = fort;
        this.ref = ref;
        this.will = will;
        this.hdSize = hdSize;
        this.skillPoints = skillPoints;
        this.casterLevel = casterLevel;
        this.description = description;
    }
    
    public String getName() { return name; }
    public int getBAB() { return bab; }
    public int getLevelCount() { return levelCount; }
    public int getFort() { return fort; }
    public int getRef() { return ref; }
    public int getWill() { return will; }
    public int getHDSize() { return hdSize; }
    public int getSkillPoints() { return skillPoints; }
    public int getCasterLevel() { return casterLevel; }
    public String getDescription() { return description; }
    
    public void print(PrintStream p)
    {
        p.println(name);
        p.println(levelCount);
        p.println(bab);
        p.println(fort);
        p.println(ref);
        p.println(will);
        p.println(hdSize);
        p.println(skillPoints);
        p.println(casterLevel);
        p.println(description);
    }
}
