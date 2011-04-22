/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package charactergenerator;

import java.util.Iterator;
import java.util.TreeSet;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Charidan
 */
public class ClassTableModel extends AbstractTableModel
{
    private static final long serialVersionUID = 1L;
    private TreeSet<classdata.CharClass> list = new TreeSet<classdata.CharClass>(new ClassComparator());

    //TODO remove test code constructor
    public ClassTableModel()
    {
        list.add(classdata.CharClass.STORM_LORD);
    }

    public int getRowCount()
    {
        return list.size();
    }

    public int getColumnCount()
    {
        return 1;
    }

    public Object getValueAt(int rowIndex, int columnIndex)
    {
        Iterator<classdata.CharClass> i = list.iterator();
        for(int j = 0; j < rowIndex; j++) i.next();
        classdata.CharClass s = i.next();
        System.out.println(s.getName());
        return s.getName();
    }

    @Override
    public String getColumnName(int col)
    {
        if(col == 0) return "Class";
        else return "Error - Column should not exist.";
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Override
    public Class getColumnClass(int c)
    {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int row, int col)
    {
        return false;
    }
}
