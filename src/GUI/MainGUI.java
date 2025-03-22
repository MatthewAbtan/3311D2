package GUI;

import javax.swing.*;
import java.awt.*;
import System.MainSystem;

public class MainGUI extends JFrame{
    private static MainGUI instance;
    CardLayout cardLayout;
    JPanel mainPanel;
    MainSystem mainSystem;

    //singleton
    public static MainGUI getInstance(){
        if(instance == null){
            instance = new MainGUI();
        }
        return instance;
    }
    private MainGUI(){
        super("ParkingSoftware"); //window title
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        this.mainSystem = MainSystem.getInstance();

        //adding all the panels for different parts of the GUI
        mainPanel.add(new LoginPanel(this::switchTo),"Login");
        mainPanel.add(new UserDashboard(this::switchTo),"GUI.UserDashboard");
        mainPanel.add(new UserBookLot(this::switchTo),"GUI.UserBookLot");
        mainPanel.add(new UserBookingsView(this::switchTo),"UserBookings");
        mainPanel.add(new ManagementDashboard(this::switchTo),"GUI.ManagementDashboard");
        mainPanel.add(new ManagementAccountsView(this::switchTo), "AccountsView");
        mainPanel.add(new ManagementLotsView(this::switchTo), "LotsView");
        cardLayout.show(mainPanel,"Login");
        this.add(mainPanel);



    }

//we pass this method to each panel, allows us to change panels
public void switchTo(String panel){
        cardLayout.show(mainPanel,panel);
}

public static void main(String[] args) {
    System.out.println("Hello, World!");

    JFrame frame = MainGUI.getInstance();                   //GUI.MainGUI is implemented as a singleton
    frame.setSize(1280,720);
    frame.setResizable(false);                              //makes it so that the window can not be resized, I did this to make it have a consistent look
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);

    frame.setVisible(true);
    }

}