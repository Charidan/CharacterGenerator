package charactergenerator;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;

public class SelectionPanel extends JPanel
{
    private static final long serialVersionUID = 1L;

    private JSplitPane split = new JSplitPane();
    private JScrollPane scrollTable = new JScrollPane();
    private JScrollPane scrollTxtPane = new JScrollPane();
    private JTable table = new JTable();
    private JPanel buttonPanel = new JPanel();
    private JButton backButton = new JButton();
    private JButton cancelButton = new JButton();
    private JButton nextButton = new JButton();
    
    public SelectionPanel()
    {
        super();
        setLayout(new GridBagLayout());
        
        GridBagConstraints gbc = new GridBagConstraints();
        
    }

}
