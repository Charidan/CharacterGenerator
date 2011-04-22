/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classdata;

/**
 *
 * @author Charidan
 */
public class StormLord extends CharClass
{

    public StormLord()
    {
        name = "Storm Lord";
        levelCount = 20;
        bab = CharClass.AVERAGE_PROGRESSION;
        fort = CharClass.GOOD_PROGRESSION;
        ref = CharClass.GOOD_PROGRESSION;
        will = CharClass.POOR_PROGRESSION;
        hdSize = 8;
        skillPoints = 4;
        casterLevel = CharClass.CL_PER_LEVEL;
        description = "A Storm Lord is really in touch with the primal power "+
                "of a big ass storm. He can channel it into baddassery. Storm "+
                "Lords are more prevalent in races that deal with storms. "+
                "Storms take many forms, and Storm Lords can be in touch with "+
                "some or all of them, and may prefer one type to another.";
    }
}
