package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.Consumer;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class UserBookLot extends JPanel {
    private Consumer<String> switchTo;
    private JList<String> lotList; // list of parking lots
    private JPanel spacePanel;
    private JLabel titleLabel;
    private DefaultListModel<String> lotListModel;
    private final Color GREEN = new Color(127, 255, 212);
    private final Color RED = new Color(255, 127, 127);

    public UserBookLot(Consumer<String> switchTo) {
        this.switchTo = switchTo;
        // panel layout
        setLayout(new BorderLayout());

        // back button
        JButton backButton = new JButton("Back to Dashboard");
        backButton.setFont(new Font("SansSerif", Font.PLAIN, 18));
        add(backButton, BorderLayout.NORTH);
        backButton.addActionListener(e -> switchTo.accept("GUI.UserDashboard"));


        // creating a split pane to hold parts of this view
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        splitPane.setDividerLocation(300);

        // list that will hold the list of lots
        lotListModel = new DefaultListModel<>();
        lotList = new JList<>(lotListModel);
        lotList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lotList.setFont(new Font("SansSerif", Font.PLAIN, 16));
        lotList.setFixedCellHeight(40);

        // example lots; will change after database integration
        lotListModel.addElement("Lot 1 - 20/50 Spaces Available");
        lotListModel.addElement("Lot 2 - 10/25 Spaces Available");
        lotListModel.addElement("Lot 3 - 5/18 Spaces Available");

        // listener for the list of lots
        lotList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    // Load spaces for the selected lot
                    String selectedLot = lotList.getSelectedValue();
                    loadSpacesForLot(selectedLot);
                }
            }
        });

        //this is the actual panel that holds the list of lots
        JScrollPane lotScrollPane = new JScrollPane(lotList);
        splitPane.setLeftComponent(lotScrollPane);

        // this panel will display the parking spaces
        spacePanel = new JPanel();
        spacePanel.setLayout(new GridLayout(10, 10, 5, 5)); // 5 rows x 10 spaces (example)

        // placeholder initial spaces
        loadSpacesForLot(null);
        splitPane.setRightComponent(spacePanel);

        // Add the split pane to the panel
        add(splitPane, BorderLayout.CENTER);
    }

    // method to load parking spaces
    private void loadSpacesForLot(String lot) {
        spacePanel.removeAll(); // clear previous spaces

        if (lot == null) { //null case is for the intial view
            JLabel emptyLabel = new JLabel("Select a lot to view spaces", JLabel.CENTER);
            emptyLabel.setFont(new Font("SansSerif", Font.ITALIC, 18));
            spacePanel.add(emptyLabel);
        } else { //this case if for when a lot is selected
            // this is a temporary way to add example spaces, will update later
            for (int i = 1; i <= 100; i++) {
                JButton spaceButton = new JButton("S" + i);
                spaceButton.setBackground(i % 2 == 0 ? GREEN : RED);
                spaceButton.setOpaque(true);
                spaceButton.setBorderPainted(false);

                // add listeners to each space to allow user to interact with each space
                spaceButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "Space Selected: " + ((JButton) e.getSource()).getText());
                    }
                });

                spacePanel.add(spaceButton);
            }
        }

        // refresh the space panel
        spacePanel.revalidate();
        spacePanel.repaint();
    }
}