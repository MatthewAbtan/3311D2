import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.function.Consumer;

public class UserBookingsView extends JPanel {

    private DefaultListModel<String> bookingListModel;
    private JList<String> bookingList;

    public UserBookingsView(Consumer<String> switchTo) {
        // panel layout
        setLayout(new BorderLayout());

        // title
        JLabel titleLabel = new JLabel("My Bookings", JLabel.CENTER);
        titleLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
        add(titleLabel, BorderLayout.NORTH);

        // a list to hold user bookings
        bookingListModel = new DefaultListModel<>();
        bookingList = new JList<>(bookingListModel);
        bookingList.setFont(new Font("SansSerif", Font.PLAIN, 16));

        //scroll panel for displaying the bookings
        JScrollPane scrollPane = new JScrollPane(bookingList);
        scrollPane.setPreferredSize(new Dimension(300, 200));
        add(scrollPane, BorderLayout.CENTER);

        populateUserBookings(); //temp method to test out code

        // bottom panel with action buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
        buttonPanel.setAlignmentX(JPanel.CENTER_ALIGNMENT);
        //cancel button action
        addButton(buttonPanel, "Cancel Booking", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onCancelBooking();
            }
        });

        buttonPanel.add(Box.createVerticalStrut(10)); // spacing

        //extend button action
        addButton(buttonPanel, "Extend Booking Time", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onExtendBooking();
            }
        });

        buttonPanel.add(Box.createVerticalStrut(10)); // spacing

        //switch back to dash button
        addButton(buttonPanel, "Back to Dashboard", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchTo.accept("UserDashboard");
            }
        });

        buttonPanel.add(Box.createVerticalStrut(10)); // spacing

        add(buttonPanel, BorderLayout.SOUTH);
    }

    //helper method for making the buttons
    private void addButton(JPanel panel, String text, AbstractAction action) {
        JButton button = new JButton(text);
        button.setFont(new Font("SansSerif", Font.PLAIN, 18));
        button.setMaximumSize(new Dimension(250, 50));
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.addActionListener(action);
        panel.add(button);
    }

    //this method will work based on parking space data, for now I just wrote some example code
    private void onCancelBooking() {
        if (bookingList.getSelectedValue() != null) {
            bookingListModel.removeElement(bookingList.getSelectedValue());
            JOptionPane.showMessageDialog(this, "Booking canceled successfully.");
        } else {
            JOptionPane.showMessageDialog(this, "Please select a booking to cancel.");
        }
    }

    //this method will work based on parking space data, for now I just wrote some example code
    private void onExtendBooking() {
        if (bookingList.getSelectedValue() != null) {
            JOptionPane.showMessageDialog(this, "Booking time extended for: " + bookingList.getSelectedValue());
        } else {
            JOptionPane.showMessageDialog(this, "Please select a booking to extend.");
        }
    }

    //temp method for filling the view without actual data
    private void populateUserBookings() {
        bookingListModel.addElement("Booking 1 - Lot A, Space 42, Time: 10:00 AM - 12:00 PM");
        bookingListModel.addElement("Booking 2 - Lot B, Space 15, Time: 2:00 PM - 4:00 PM");
        bookingListModel.addElement("Booking 3 - Lot A, Space 88, Time: 6:00 PM - 8:00 PM");
        bookingListModel.addElement("Booking 4 - Lot C, Space 7, Time: 9:00 AM - 11:00 AM");
    }
}