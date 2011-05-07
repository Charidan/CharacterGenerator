package classdata;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.File;
import javax.swing.JOptionPane;

public class CESaveActionListener implements ActionListener
{
    ClassEditor win;
    
    public CESaveActionListener(ClassEditor parent)
    {
        win = parent;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        CharClass c = new CharClass(win.getName(), win.getLevelCount(), win.getBAB(), win.getFort(),
                win.getRef(), win.getWill(), win.getHDSize(), win.getSkillPoints(), win.getCasterLevel(),
                win.getPowers(), win.getDescription());
        File f = new File(ClassEditor.CLASS_FOLDER+c.getFileName());
        if(!f.exists())
        {
            try
            {
                f.createNewFile();
                
            } catch(IOException ex)
            {
                JOptionPane.showMessageDialog(null, "ERROR: Could not create file: "+f.getPath(), "ERROR: Could not create file", JOptionPane.ERROR_MESSAGE, null);
            }
        }
        try
        {
            c.print(new PrintStream(f));
        } catch(FileNotFoundException ex)
        {
            System.out.println("Impossible FileNotFound in CESaveActionListener.");
            System.out.println("Failed folder attempted: "+f.getAbsolutePath());
        }
    }
    
}
