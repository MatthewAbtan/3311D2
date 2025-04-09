import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        UserBookingsView.populateUserBookings();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ParkingSpace parkingSpace4 = new ParkingSpace((int) (byte) 10, "data/managerData.csv", "", "ToolTipText");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace4.empty();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        ParkingSpace parkingSpace4 = new ParkingSpace((int) (byte) 10, "data/managerData.csv", "", "ToolTipText");
        String str5 = parkingSpace4.getCurrentUser();
        int int6 = parkingSpace4.getIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace4.empty();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        ManagementAccountsView.populatePendingAccounts();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        ParkingSpace parkingSpace4 = new ParkingSpace((int) (byte) 10, "data/managerData.csv", "", "ToolTipText");
        String str5 = parkingSpace4.getCurrentUser();
        int int6 = parkingSpace4.getIndex();
        String str7 = parkingSpace4.getCurrentUser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace4.book("PanelUI");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        ParkingSpace parkingSpace4 = new ParkingSpace((int) (byte) 10, "data/managerData.csv", "", "ToolTipText");
        String str5 = parkingSpace4.getCurrentUser();
        int int6 = parkingSpace4.getIndex();
        String str7 = parkingSpace4.getCurrentUser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace4.setMaintenance();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        ParkingSpace parkingSpace4 = new ParkingSpace((int) (byte) 10, "data/managerData.csv", "", "ToolTipText");
        String str5 = parkingSpace4.getCurrentUser();
        int int6 = parkingSpace4.getIndex();
        int int7 = parkingSpace4.getIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace4.empty();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        ParkingSpace parkingSpace4 = new ParkingSpace((int) (byte) 10, "data/managerData.csv", "", "ToolTipText");
        String str5 = parkingSpace4.getCurrentUser();
        int int6 = parkingSpace4.getIndex();
        int int7 = parkingSpace4.getIndex();
        String str8 = parkingSpace4.getCurrentCar();
        String str9 = parkingSpace4.getCurrentCar();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace4.book("data/parkingSpaceData.csv");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        ParkingSpace parkingSpace4 = new ParkingSpace((int) (byte) 10, "data/managerData.csv", "", "ToolTipText");
        String str5 = parkingSpace4.getCurrentUser();
        int int6 = parkingSpace4.getIndex();
        String str7 = parkingSpace4.getCurrentCar();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace4.book("ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=4194313,maximumSize=,minimumSize=,preferredSize=]");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        ParkingSpace parkingSpace4 = new ParkingSpace((int) (byte) 10, "data/managerData.csv", "", "ToolTipText");
        String str5 = parkingSpace4.getCurrentUser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace4.empty();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        ParkingSpace parkingSpace4 = new ParkingSpace(16, "", "data/lotData.csv", "data/managerData.csv");
        String str5 = parkingSpace4.getCurrentCar();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace4.book("hi!");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        ParkingSpace parkingSpace4 = new ParkingSpace((int) (byte) 10, "data/managerData.csv", "", "ToolTipText");
        String str5 = parkingSpace4.getCurrentCar();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace4.setMaintenance();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        ParkingSpace parkingSpace4 = new ParkingSpace((int) (byte) 10, "data/managerData.csv", "", "ToolTipText");
        String str5 = parkingSpace4.getCurrentUser();
        int int6 = parkingSpace4.getIndex();
        int int7 = parkingSpace4.getIndex();
        String str8 = parkingSpace4.getCurrentCar();
        String str9 = parkingSpace4.getCurrentCar();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace4.book("PanelUI");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        ParkingSpace parkingSpace4 = new ParkingSpace((int) (byte) 10, "data/managerData.csv", "", "ToolTipText");
        String str5 = parkingSpace4.getCurrentUser();
        int int6 = parkingSpace4.getIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace4.book("ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=37748745,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=2147483647,height=2147483647]]");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        ParkingSpace parkingSpace4 = new ParkingSpace((int) (byte) 10, "data/managerData.csv", "", "ToolTipText");
        String str5 = parkingSpace4.getCurrentCar();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace4.empty();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        ParkingSpace parkingSpace4 = new ParkingSpace((int) (byte) 10, "data/managerData.csv", "", "ToolTipText");
        String str5 = parkingSpace4.getCurrentUser();
        int int6 = parkingSpace4.getIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        parkingSpace4.book("ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=8388617,maximumSize=,minimumSize=,preferredSize=]");
    }
}

