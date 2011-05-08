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
    ClassEditor editor;
    
    public CESaveActionListener(ClassEditor parent)
    {
        editor = parent;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        CharClass c = new CharClass(editor.getName(), editor.getLevelCount(), editor.getBAB(), editor.getFort(),
                editor.getRef(), editor.getWill(), editor.getHDSize(), editor.getSkillPoints(), editor.getCasterLevel(),
                editor.getPowers(), editor.getDescription());
        File f = new File(ClassEditor.CLASS_FOLDER+c.getFileName()+".charclass");
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
            c.print(new PrintStream(f));
        } catch(FileNotFoundException ex)
        {
            System.out.println("Impossible FileNotFound in CESaveActionListener.");
            System.out.println("Failed folder attempted: "+f.getAbsolutePath());
        }
    }
    
}
