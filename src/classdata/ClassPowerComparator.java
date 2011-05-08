package classdata;

import java.util.Comparator;
import dataform.ClassPower;

public class ClassPowerComparator implements Comparator<dataform.ClassPower>
{

    @Override
    public int compare(ClassPower o1, ClassPower o2)
    {
        return o1.getName().compareToIgnoreCase(o2.getName());
    }

}
