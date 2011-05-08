package classdata;

import java.util.Comparator;
import powerdata.ClassPower;

public class ClassPowerComparator implements Comparator<powerdata.ClassPower>
{

    @Override
    public int compare(ClassPower o1, ClassPower o2)
    {
        return o1.getName().compareToIgnoreCase(o2.getName());
    }

}
