/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package charactergenerator;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Julian/Charidan
 */
public class Main
{
    static JFrame win = new JFrame("Character Generator");
    static JPanel panel = new SelectionPanel();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        win.setSize(800,600);
        win.add(panel);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setVisible(true);
    }
}
