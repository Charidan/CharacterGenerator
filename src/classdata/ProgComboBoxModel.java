package classdata;

import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;

public class ProgComboBoxModel implements ComboBoxModel
{
    public static final int FULL_SET = 0;
    public static final int SAVE_SET = 1;
    public static final int CL_SET = 2;
    
    public static final String GOOD_PROGRESSION = "Good Progression";
    public static final String AVERAGE_PROGRESSION = "Average Progression";
    public static final String POOR_PROGRESSION = "Poor Progression";
    public static final String CL_NONCASTER = "Non-Caster";
    public static final String CL_PER_LEVEL = "CL per Level";
    
    private int type;
    
    private ArrayList<ListDataListener> listeners = new ArrayList<ListDataListener>();
    private String selected;
    
    public ProgComboBoxModel(int type)
    {
        this.type = type;
    }

    @Override
    public void addListDataListener(ListDataListener listener)
    {
        listeners.add(listener);
    }

    @Override
    public Object getElementAt(int index)
    {
        if(type == FULL_SET)
        {
            switch(index)
            {
                case 0: return GOOD_PROGRESSION;
                case 1: return AVERAGE_PROGRESSION;
                case 2: return POOR_PROGRESSION;
            }
        }
        if(type == SAVE_SET)
        {
            switch(index)
            {
                case 0: return GOOD_PROGRESSION;
                case 1: return POOR_PROGRESSION;
            }
        }
        if(type == CL_SET)
        {
            switch(index)
            {
                case 0: return CL_NONCASTER;
                case 1: return CL_PER_LEVEL;
            }
        }
        return null;
    }

    @Override
    public int getSize()
    {
        if(type == FULL_SET) return 3;
        if(type == SAVE_SET) return 2;
        if(type == CL_SET) return 2;
        return 0;
    }

    @Override
    public void removeListDataListener(ListDataListener listener)
    {
        listeners.remove(listener);
    }

    @Override
    public Object getSelectedItem()
    {
        return selected;
    }

    @Override
    public void setSelectedItem(Object anItem)
    {
        if(type == FULL_SET)
        {
            if(anItem.equals(GOOD_PROGRESSION)) selected = GOOD_PROGRESSION;
            if(anItem.equals(AVERAGE_PROGRESSION)) selected = AVERAGE_PROGRESSION;
            if(anItem.equals(POOR_PROGRESSION)) selected = POOR_PROGRESSION;
        }
        if(type == SAVE_SET)
        {
            if(anItem.equals(GOOD_PROGRESSION)) selected = GOOD_PROGRESSION;
            if(anItem.equals(POOR_PROGRESSION)) selected = POOR_PROGRESSION;
        }
        if(type == CL_SET)
        {
            if(anItem.equals(CL_NONCASTER)) selected = CL_NONCASTER;
            if(anItem.equals(CL_PER_LEVEL)) selected = CL_PER_LEVEL;
        }
        notifyListeners();
    }

    private void notifyListeners()
    {
        for(ListDataListener ldl : listeners)
        {
            ldl.contentsChanged(new ListDataEvent(this, ListDataEvent.CONTENTS_CHANGED, 0, getSize()));
        }
    }
    
    public static int prog2int(String progressionType)
    {
        if(progressionType.equals(GOOD_PROGRESSION)) return CharClass.GOOD_PROGRESSION;
        if(progressionType.equals(AVERAGE_PROGRESSION)) return CharClass.AVERAGE_PROGRESSION;
        if(progressionType.equals(POOR_PROGRESSION)) return CharClass.POOR_PROGRESSION;
        if(progressionType.equals(CL_NONCASTER)) return CharClass.CL_NONCASTER;
        if(progressionType.equals(CL_PER_LEVEL)) return CharClass.CL_PER_LEVEL;
        return CharClass.NULL_PROGRESSION;
    }

}
