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
                case 0: return "Good Progression";
                case 1: return "Average Progression";
                case 2: return "Poor Progression";
            }
        }
        if(type == SAVE_SET)
        {
            switch(index)
            {
                case 0: return "Good Progression";
                case 1: return "Poor Progression";
            }
        }
        if(type == CL_SET)
        {
            switch(index)
            {
                case 0: return "Non-Caster";
                case 1: return "CL per Level";
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
            if(anItem.equals("Good Progression")) selected = "Good Progression";
            if(anItem.equals("Average Progression")) selected = "Average Progression";
            if(anItem.equals("Poor Progression")) selected = "Poor Progression";
        }
        if(type == SAVE_SET)
        {
            if(anItem.equals("Good Progression")) selected = "Good Progression";
            if(anItem.equals("Poor Progression")) selected = "Poor Progression";
        }
        if(type == CL_SET)
        {
            if(anItem.equals("Non-Caster")) selected = "Non-Caster";
            if(anItem.equals("CL per Level")) selected = "CL per Level";
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
    
    

}
