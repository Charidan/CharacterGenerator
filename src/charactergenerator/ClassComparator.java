/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package charactergenerator;

import java.util.Comparator;

/**
 *
 * @author Charidan
 */
public class ClassComparator implements Comparator<classdata.CharClass>
{

    public int compare(classdata.CharClass c1, classdata.CharClass c2)
    {
        return c1.getName().compareToIgnoreCase(c2.getName());
    }

}
