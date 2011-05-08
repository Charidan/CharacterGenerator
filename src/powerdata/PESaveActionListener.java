package powerdata;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import javax.swing.JOptionPane;

public class PESaveActionListener implements ActionListener
{
    PowerEditor editor;
    
    public PESaveActionListener(PowerEditor parent)
    {
        editor = parent;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        ClassPower power = new ClassPower(editor.getName(), editor.getLevelReq(), editor.getTraits(), editor.getDescription());
        File f = new File(PowerEditor.POWER_FOLDER+power.getFileName()+".classpower");
        if(!f.exists())
        {
            try
            {
                f.createNewFile();
                
            } catch(IOException ex)
            {
                JOptionPane.showMessageDialog(null, "ERROR: Could not create file: "+f.getPath(),
                        "ERROR: Could not create file", JOptionPane.ERROR_MESSAGE, null);
            }
        }
        try
        {
            power.print(new PrintStream(f));
        } catch(FileNotFoundException ex)
        {
            System.out.println("Impossible FileNotFound in CESaveActionListener.");
            System.out.println("Failed folder attempted: "+f.getAbsolutePath());
        }
    }

}
