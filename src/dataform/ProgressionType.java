/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataform;

/**
 *
 * @author Julian
 */
public class ProgressionType
{
    public String constantProgValue(int scalar, int offset)
    {
        return "" + (scalar + offset);
    }

    public String constantDieProgValue(int scalar, int offset, int dieSize)
    {
        return "" + (scalar + offset) + "d" + dieSize;
    }

    public String halfProgValue(int scalar, int offset)
    {
        return "" + (scalar / 2 + offset);
    }

    public String halfProgRoundUpValue(int scalar, int offset)
    {
        return "" + ((scalar + 1)/ 2 + offset);
    }

    public String halfDieProgValue(int scalar, int offset, int dieSize)
    {
        return "" + ((scalar + 1) / 2 + offset) + "d" + dieSize;
    }

    public String thirdProgValue(int scalar, int offset)
    {
        return "" + (scalar / 3 + offset);
    }

    public String thirdProgRoundUpValue(int scalar, int offset)
    {
        return "" + ((scalar + 1)/ 3 + offset);
    }

    public String thirdDieProgValue(int scalar, int offset, int dieSize)
    {
        return "" + ((scalar + 1) / 3 + offset) + "d" + dieSize;
    }


}
