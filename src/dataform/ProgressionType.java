/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataform;

/**
 *
 * @author Julian
 */
public abstract class ProgressionType
{
    public static final int UNIQUE_PROG = 0;
    public static final int UNIQUE_DIE_PROG = 1;
    public static final int CONSTANT_PROG = 2;
    public static final int CONSTANT_DIE_PROG = 3;
    public static final int HALF_PROG = 4;
    public static final int HALF_DIE_PROG = 5;
    public static final int HALF_ROUNDUP_PROG = 6;
    public static final int THIRD_PROG = 7;
    public static final int THIRD_DIE_PROG = 8;
    public static final int THIRD_ROUNDUP_PROG = 9;
    
    protected int type;
    protected String formula;
    
    public ProgressionType(int type)
    {
        this.type = type;
    }
    
    public ProgressionType(String formula)
    {
        type = UNIQUE_PROG;
        this.formula= formula;
    }
    
    protected String getValue(int scalar, int offset)
    {
        switch(type)
        {
            case UNIQUE_PROG: return getUniqueValue();
            case CONSTANT_PROG: return constantProgValue(scalar, offset);
            case HALF_PROG: return halfProgValue(scalar, offset);
            case HALF_ROUNDUP_PROG: return halfProgRoundUpValue(scalar, offset);
            case THIRD_PROG: return thirdProgValue(scalar, offset);
            case THIRD_ROUNDUP_PROG: return thirdProgRoundUpValue(scalar, offset);
            default: return "";
        }
    }
    
    protected String getDieValue(int scalar, int offset, int dieSize)
    {
        switch(type)
        {
            case UNIQUE_DIE_PROG: return getUniqueDieValue();
            case CONSTANT_DIE_PROG: return constantDieProgValue(scalar, offset, dieSize);
            case HALF_DIE_PROG: return halfDieProgValue(scalar, offset, dieSize);
            case THIRD_DIE_PROG: return thirdDieProgValue(scalar, offset, dieSize);
            default: return "";
        }
    }
    
    protected String getUniqueValue()
    {
        // TODO read a formula to get a value
        return null;
    }
    
    protected String getUniqueDieValue()
    {
        // TODO read a formula to get a value
        return null;
    }

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
