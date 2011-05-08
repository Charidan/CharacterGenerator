package powerdata;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import classdata.CESaveActionListener;
import dataform.PowerTrait;

public class PowerEditor
{
    public static final String POWER_FOLDER = "C:/Users/Charidan/Desktop/DnDCharGen/powerdata/"; //richardPC
    //public static final String POWER_FOLDER = "~/Eclipse/DnDCharGen/powerdata/"; //richardlaptop
    //TODO: Remember to create powerdata folder on laptop
    
    private static JFrame win = new JFrame("Power Editor");
    private static JPanel panel = new JPanel(new GridBagLayout());
    
    private static JTextField nameBox = new JTextField(20);
    private static JTextField levelReqBox = new JTextField(5);
    private static JTextArea descriptionArea = new JTextArea();
    private static JScrollPane descriptionScroll = new JScrollPane(descriptionArea);
    
    private static JLabel nameLabel = new JLabel("Name:");
    private static JLabel levelReqLabel = new JLabel("Level Required:");
    private static JLabel descriptionLabel = new JLabel("Description:");
    
    private static JPanel buttonPanel = new JPanel(new FlowLayout());
    private static JButton saveButton = new JButton("SAVE");
    private static JButton loadButton = new JButton("LOAD");
    
    public PowerEditor()
    {
        win.setTitle("Class Editor");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        GridBagConstraints endline = new GridBagConstraints();
        endline.gridwidth = GridBagConstraints.REMAINDER;
        endline.anchor = GridBagConstraints.WEST;
        endline.weightx = 1;
        
        GridBagConstraints labelgbc = new GridBagConstraints();
        labelgbc.anchor = GridBagConstraints.EAST;
        
        panel.add(nameLabel, labelgbc);
        panel.add(nameBox, endline);
        panel.add(levelReqLabel, labelgbc);
        panel.add(levelReqBox, endline);
        
        descriptionArea.setColumns(20);
        descriptionArea.setRows(7);
        descriptionArea.setLineWrap(true);
        descriptionArea.setWrapStyleWord(true);
        descriptionScroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        
        panel.add(descriptionLabel, labelgbc);
        panel.add(descriptionScroll, endline);
        
        GridBagConstraints bpc = new GridBagConstraints();
        bpc.anchor = GridBagConstraints.SOUTH;
        bpc.fill = GridBagConstraints.HORIZONTAL;
        bpc.gridwidth = GridBagConstraints.REMAINDER;
        
        saveButton.addActionListener(new PESaveActionListener(this));
        
        buttonPanel.add(loadButton);
        buttonPanel.add(saveButton);
        panel.add(buttonPanel, bpc);
        
        win.add(panel);
        win.pack();
        win.setVisible(true);
    }
    
    public String getName() { return nameBox.getText(); }
    public int getLevelReq() { return new Integer(levelReqBox.getText()); }
    public String getDescription() { return descriptionArea.getText(); }

    public ArrayList<PowerTrait> getTraits()
    {
        return new ArrayList<PowerTrait>();
    }
}
