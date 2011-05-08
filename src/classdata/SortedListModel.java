package classdata;

import java.util.Comparator;
import javax.swing.DefaultListModel;

public class SortedListModel extends DefaultListModel
{
    private static final long serialVersionUID = 1L;
    private Comparator c;
    
    public SortedListModel(Comparator c)
    {
        this.c = c;
    }
    
    @Override
    public void addElement(Object element)
    {
       for(int i = 0; i < size(); i++)
       {
           if(c.compare(get(i), element) > 0) super.add(i, element);
       }
    }
    
    @Override
    public void add(int index, Object element)
    {
        addElement(element);
    }
    
    @Override
    public void insertElementAt(Object element, int index)
    {
        addElement(element);
    }
    
    @Override
    public Object set(int index, Object element)
    {
        Object out = get(index);
        remove(index);
        addElement(element);
        return out;
    }
    
    @Override
    public void setElementAt(Object element, int index)
    {
        remove(index);
        addElement(element);
    }
}
