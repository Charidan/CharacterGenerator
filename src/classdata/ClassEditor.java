package classdata;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import dataform.ClassPower;
import java.io.File;

public class ClassEditor
{
    //public static final String CLASS_FOLDER = "C:/Users/Charidan/Desktop/classdata/"; //richardPC
    public static final String CLASS_FOLDER = "~/Eclipse/classdata/"; //richardlaptop
    
    static
    {
        if(!new File(CLASS_FOLDER.substring(0, CLASS_FOLDER.length())).exists())
        {
            System.out.println("Change classdata folder designation in ClassEditor.");
            System.out.println("Failed folder attempted: "+CLASS_FOLDER);
            System.exit(1);
        }
    }
    
    private static JFrame win = new JFrame("Class Editor");
    private static JPanel panel = new JPanel(new GridBagLayout());
    
    private static JTextField nameBox = new JTextField(20);
    private static JTextField levelCountBox = new JTextField(5);
    private static JComboBox babCombo = new JComboBox(new ProgComboBoxModel(ProgComboBoxModel.FULL_SET));
    private static JComboBox fortCombo = new JComboBox(new ProgComboBoxModel(ProgComboBoxModel.SAVE_SET));
    private static JComboBox refCombo = new JComboBox(new ProgComboBoxModel(ProgComboBoxModel.SAVE_SET));
    private static JComboBox willCombo = new JComboBox(new ProgComboBoxModel(ProgComboBoxModel.SAVE_SET));
    private static JComboBox casterLevelCombo = new JComboBox(new ProgComboBoxModel(ProgComboBoxModel.CL_SET));
    private static JTextField hdBox = new JTextField(5);
    private static JTextField skillpointBox = new JTextField(5);
    private static JTextArea descriptionBox = new JTextArea();
    private static JList powerList = new JList();
    private static JScrollPane powerScroll = new JScrollPane(powerList);
    
    private static JLabel nameLabel = new JLabel("Name:");
    private static JLabel levelCountLabel = new JLabel("Level Count:");
    private static JLabel babLabel = new JLabel("BAB:");
    private static JLabel fortLabel = new JLabel("Fort:");
    private static JLabel refLabel = new JLabel("Ref:");
    private static JLabel willLabel = new JLabel("Will:");
    private static JLabel casterLevelLabel = new JLabel("Caster Level:");
    private static JLabel hdLabel = new JLabel("HD:");
    private static JLabel skillpointLabel = new JLabel("Skill Points:");
    private static JLabel descriptionLabel = new JLabel("Description:");
    private static JLabel powerLabel = new JLabel("Powers:");
    
    private static JPanel buttonPanel = new JPanel(new FlowLayout());
    private static JButton saveButton = new JButton("SAVE");
    private static JButton loadButton = new JButton("LOAD");
    
    /**
     * @param args
     */
    public static void main(String[] args)
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
        panel.add(levelCountLabel, labelgbc);
        panel.add(levelCountBox, endline);
        panel.add(hdLabel, labelgbc);
        panel.add(hdBox, endline);
        
        panel.add(babLabel, labelgbc);
        panel.add(babCombo, endline);
        panel.add(fortLabel, labelgbc);
        panel.add(fortCombo, endline);
        panel.add(refLabel, labelgbc);
        panel.add(refCombo, endline);
        panel.add(willLabel, labelgbc);
        panel.add(willCombo, endline);
        panel.add(casterLevelLabel, labelgbc);
        panel.add(casterLevelCombo, endline);
        panel.add(skillpointLabel, labelgbc);
        panel.add(skillpointBox, endline);
        panel.add(descriptionLabel, labelgbc);
        panel.add(descriptionBox, endline);
        panel.add(powerLabel, labelgbc);
        panel.add(powerScroll, endline);
        
        GridBagConstraints bpc = new GridBagConstraints();
        bpc.anchor = GridBagConstraints.SOUTH;
        bpc.fill = GridBagConstraints.HORIZONTAL;
        bpc.gridwidth = GridBagConstraints.REMAINDER;
        
        buttonPanel.add(loadButton);
        buttonPanel.add(saveButton);
        panel.add(buttonPanel, bpc);
        
        win.add(panel);
        win.pack();
        win.setVisible(true);
    }

    public String getName()
    {
        return nameBox.getText();
    }

    public int getHDSize()
    {
        return new Integer(skillpointBox.getText());
    }

    public int getSkillPoints()
    {
        return new Integer(skillpointBox.getText());
    }

    public int getFort()
    {
        return (Integer) fortCombo.getSelectedItem();
    }

    public int getLevelCount()
    {
        return new Integer(skillpointBox.getText());
    }

    public int getBAB()
    {
        return (Integer) babCombo.getSelectedItem();
    }

    public int getCasterLevel()
    {
        return (Integer) casterLevelCombo.getSelectedItem();
    }

    public int getRef()
    {
        return (Integer) refCombo.getSelectedItem();
    }

    public int getWill()
    {
        return (Integer) willCombo.getSelectedItem();
    }

    public ArrayList<ClassPower> getPowers()
    {
        return null;
    }

    public String getDescription()
    {
        return descriptionBox.getText();
    }

}
