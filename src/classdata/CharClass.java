/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package classdata;

/**
 *
 * @author Julian
 */
public abstract class CharClass
{
    public static final int GOOD_PROGRESSION = 0;
    public static final int AVERAGE_PROGRESSION = 1;
    public static final int POOR_PROGRESSION = 2;
    
    public static final int CL_NONCASTER = 0;
    public static final int CL_PER_LEVEL = 1;

    String name;
    int levelCount;
    int bab;
    int fort;
    int ref;
    int will;
    int hdSize;
    int skillPoints;
    int casterLevel;
    String description;

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
}
