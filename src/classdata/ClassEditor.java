package classdata;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ClassEditor extends JPanel
{
    private static final long serialVersionUID = 1L;

    private JTextField nameBox = new JTextField(20);
    private JTextField levelCountBox = new JTextField(20);
    private JComboBox babCombo = new JComboBox();
    private JComboBox fortCombo = new JComboBox();
    private JComboBox refCombo = new JComboBox();
    private JComboBox willCombo = new JComboBox();
    private JComboBox casterLevelCombo = new JComboBox();
    private JTextField hdBox = new JTextField(20);
    private JTextField skillpointBox = new JTextField(20);
    private JTextField powerBox = new JTextField(20);
    
    private JLabel nameLabel = new JLabel();
    private JLabel levelCountLabel = new JLabel();
    private JLabel babLabel = new JLabel();
    private JLabel fortLabel = new JLabel();
    private JLabel refLabel = new JLabel();
    private JLabel willLabel = new JLabel();
    private JLabel casterLevelLabel = new JLabel();
    private JLabel hdLabel = new JLabel();
    private JLabel skillpointLabel = new JLabel();
    private JLabel powerLabel = new JLabel();
    
    public ClassEditor()
    {
        super();
        setLayout(new GridBagLayout());
        
        GridBagConstraints endline = new GridBagConstraints();
        endline.gridwidth = GridBagConstraints.REMAINDER;
        endline.anchor = GridBagConstraints.WEST;
        endline.weightx = 1;
        
    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO make a GUI for ClassEditor
        
    }

}
