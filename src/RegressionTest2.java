import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        managementDashboard1.list();
        javax.swing.plaf.PanelUI panelUI8 = managementDashboard1.getUI();
        java.awt.image.ColorModel colorModel9 = managementDashboard1.getColorModel();
        java.awt.Point point10 = managementDashboard1.location();
        java.awt.event.KeyListener keyListener11 = null;
        managementDashboard1.addKeyListener(keyListener11);
        java.awt.Color color13 = managementDashboard1.getForeground();
        managementDashboard1.removeAll();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(panelUI8);
        org.junit.Assert.assertNotNull(colorModel9);
        org.junit.Assert.assertNotNull(point10);
        org.junit.Assert.assertNotNull(color13);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        ParkingLot parkingLot1 = new ParkingLot("data/userData.csv");
        ParkingSpace[] parkingSpaceArray2 = parkingLot1.getSpaces();
        parkingLot1.setEnabled(true);
        ParkingSpace parkingSpace6 = parkingLot1.getSpace((int) '#');
        parkingLot1.setEnabled(true);
        org.junit.Assert.assertNotNull(parkingSpaceArray2);
        org.junit.Assert.assertNotNull(parkingSpace6);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        PaymentStrategy paymentStrategy0 = null;
        PaymentProcessor paymentProcessor1 = new PaymentProcessor(paymentStrategy0);
        CreditCardPayment creditCardPayment2 = new CreditCardPayment();
        paymentProcessor1.setPaymentStrategy((PaymentStrategy) creditCardPayment2);
        PaymentStrategy paymentStrategy4 = null;
        PaymentProcessor paymentProcessor5 = new PaymentProcessor(paymentStrategy4);
        CreditCardPayment creditCardPayment6 = new CreditCardPayment();
        paymentProcessor5.setPaymentStrategy((PaymentStrategy) creditCardPayment6);
        paymentProcessor1.setPaymentStrategy((PaymentStrategy) creditCardPayment6);
        PaymentStrategy paymentStrategy9 = null;
        PaymentProcessor paymentProcessor10 = new PaymentProcessor(paymentStrategy9);
        CreditCardPayment creditCardPayment11 = new CreditCardPayment();
        paymentProcessor10.setPaymentStrategy((PaymentStrategy) creditCardPayment11);
        PaymentStrategy paymentStrategy13 = null;
        PaymentProcessor paymentProcessor14 = new PaymentProcessor(paymentStrategy13);
        CreditCardPayment creditCardPayment15 = new CreditCardPayment();
        paymentProcessor14.setPaymentStrategy((PaymentStrategy) creditCardPayment15);
        paymentProcessor10.setPaymentStrategy((PaymentStrategy) creditCardPayment15);
        paymentProcessor1.setPaymentStrategy((PaymentStrategy) creditCardPayment15);
        PaymentStrategy paymentStrategy19 = null;
        PaymentProcessor paymentProcessor20 = new PaymentProcessor(paymentStrategy19);
        CreditCardPayment creditCardPayment21 = new CreditCardPayment();
        paymentProcessor20.setPaymentStrategy((PaymentStrategy) creditCardPayment21);
        paymentProcessor1.setPaymentStrategy((PaymentStrategy) creditCardPayment21);
        creditCardPayment21.pay((double) 2);
        PaymentProcessor paymentProcessor26 = new PaymentProcessor((PaymentStrategy) creditCardPayment21);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        javax.swing.KeyStroke keyStroke7 = null;
        java.awt.event.ActionListener actionListener8 = managementDashboard1.getActionForKeyStroke(keyStroke7);
        javax.swing.JToolTip jToolTip9 = managementDashboard1.createToolTip();
        java.awt.Event event10 = null;
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        ManagementDashboard managementDashboard12 = new ManagementDashboard(strConsumer11);
        managementDashboard12.setInheritsPopupMenu(true);
        boolean boolean15 = managementDashboard12.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget16 = null;
        managementDashboard12.setDropTarget(dropTarget16);
        java.awt.Dimension dimension18 = null;
        managementDashboard12.setPreferredSize(dimension18);
        javax.swing.event.AncestorListener ancestorListener20 = null;
        managementDashboard12.removeAncestorListener(ancestorListener20);
        java.awt.Dimension dimension22 = managementDashboard12.getPreferredSize();
        java.awt.Dimension dimension23 = managementDashboard12.getPreferredSize();
        managementDashboard12.setDebugGraphicsOptions(10);
        boolean boolean26 = jToolTip9.lostFocus(event10, (java.lang.Object) managementDashboard12);
        boolean boolean27 = managementDashboard12.isOpaque();
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        managementDashboard12.addPropertyChangeListener("ToolTipText", propertyChangeListener29);
        java.awt.Component[] componentArray31 = managementDashboard12.getComponents();
        java.awt.Font font32 = null;
        managementDashboard12.setFont(font32);
        java.util.function.Consumer<java.lang.String> strConsumer34 = null;
        ManagementDashboard managementDashboard35 = new ManagementDashboard(strConsumer34);
        boolean boolean36 = managementDashboard35.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests37 = managementDashboard35.getInputMethodRequests();
        java.awt.Container container38 = managementDashboard35.getTopLevelAncestor();
        java.awt.Color color39 = null;
        managementDashboard35.setForeground(color39);
        javax.swing.KeyStroke keyStroke41 = null;
        java.awt.event.ActionListener actionListener42 = managementDashboard35.getActionForKeyStroke(keyStroke41);
        javax.swing.JToolTip jToolTip43 = managementDashboard35.createToolTip();
        java.util.function.Consumer<java.lang.String> strConsumer44 = null;
        ManagementDashboard managementDashboard45 = new ManagementDashboard(strConsumer44);
        boolean boolean46 = managementDashboard45.isCursorSet();
        java.awt.Event event47 = null;
        boolean boolean49 = managementDashboard45.lostFocus(event47, (java.lang.Object) "");
        java.util.function.Consumer<java.lang.String> strConsumer50 = null;
        ManagementDashboard managementDashboard51 = new ManagementDashboard(strConsumer50);
        managementDashboard51.setRequestFocusEnabled(false);
        java.awt.Event event54 = null;
        boolean boolean56 = managementDashboard51.keyUp(event54, (int) (short) 1);
        managementDashboard51.setAutoscrolls(true);
        java.awt.event.HierarchyListener[] hierarchyListenerArray59 = managementDashboard51.getHierarchyListeners();
        jToolTip43.add((java.awt.Component) managementDashboard45, (java.lang.Object) hierarchyListenerArray59);
        managementDashboard12.remove((java.awt.Component) managementDashboard45);
        boolean boolean62 = managementDashboard12.isValid();
        managementDashboard12.setToolTipText("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(actionListener8);
        org.junit.Assert.assertNotNull(jToolTip9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dimension22);
        org.junit.Assert.assertNotNull(dimension23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(componentArray31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(inputMethodRequests37);
        org.junit.Assert.assertNull(container38);
        org.junit.Assert.assertNull(actionListener42);
        org.junit.Assert.assertNotNull(jToolTip43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(hierarchyListenerArray59);
        org.junit.Assert.assertArrayEquals(hierarchyListenerArray59, new java.awt.event.HierarchyListener[] {});
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        PaymentStrategy paymentStrategy0 = null;
        PaymentProcessor paymentProcessor1 = new PaymentProcessor(paymentStrategy0);
        CreditCardPayment creditCardPayment2 = new CreditCardPayment();
        paymentProcessor1.setPaymentStrategy((PaymentStrategy) creditCardPayment2);
        PaymentStrategy paymentStrategy4 = null;
        PaymentProcessor paymentProcessor5 = new PaymentProcessor(paymentStrategy4);
        CreditCardPayment creditCardPayment6 = new CreditCardPayment();
        paymentProcessor5.setPaymentStrategy((PaymentStrategy) creditCardPayment6);
        paymentProcessor1.setPaymentStrategy((PaymentStrategy) creditCardPayment6);
        creditCardPayment6.pay((double) 1L);
        creditCardPayment6.pay((double) (short) 10);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.event.ContainerListener containerListener5 = null;
        managementDashboard1.removeContainerListener(containerListener5);
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = managementDashboard1.getFocusTraversalPolicy();
        managementDashboard1.layout();
        java.util.function.Consumer<java.lang.String> strConsumer9 = null;
        ManagementDashboard managementDashboard10 = new ManagementDashboard(strConsumer9);
        boolean boolean11 = managementDashboard10.isCursorSet();
        java.awt.Event event12 = null;
        boolean boolean14 = managementDashboard10.lostFocus(event12, (java.lang.Object) "");
        managementDashboard10.setAutoscrolls(false);
        java.awt.Graphics graphics17 = null;
        managementDashboard10.update(graphics17);
        managementDashboard10.setFocusCycleRoot(false);
        java.awt.Graphics graphics21 = null;
        managementDashboard10.paintAll(graphics21);
        java.util.function.Consumer<java.lang.String> strConsumer23 = null;
        ManagementDashboard managementDashboard24 = new ManagementDashboard(strConsumer23);
        managementDashboard24.setRequestFocusEnabled(false);
        java.awt.Event event27 = null;
        boolean boolean29 = managementDashboard24.keyUp(event27, (int) (short) 1);
        managementDashboard24.setAutoscrolls(true);
        int int32 = managementDashboard24.getDebugGraphicsOptions();
        boolean boolean33 = managementDashboard24.isMaximumSizeSet();
        managementDashboard24.nextFocus();
        java.util.function.Consumer<java.lang.String> strConsumer35 = null;
        ManagementDashboard managementDashboard36 = new ManagementDashboard(strConsumer35);
        managementDashboard36.setRequestFocusEnabled(false);
        managementDashboard36.enable();
        java.util.function.Consumer<java.lang.String> strConsumer40 = null;
        ManagementDashboard managementDashboard41 = new ManagementDashboard(strConsumer40);
        managementDashboard41.setInheritsPopupMenu(true);
        boolean boolean44 = managementDashboard41.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget45 = null;
        managementDashboard41.setDropTarget(dropTarget45);
        boolean boolean47 = managementDashboard41.getAutoscrolls();
        java.util.function.Consumer<java.lang.String> strConsumer48 = null;
        ManagementDashboard managementDashboard49 = new ManagementDashboard(strConsumer48);
        managementDashboard49.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy52 = null;
        managementDashboard49.setFocusTraversalPolicy(focusTraversalPolicy52);
        java.lang.Object obj54 = managementDashboard41.getClientProperty((java.lang.Object) managementDashboard49);
        java.awt.LayoutManager layoutManager55 = managementDashboard49.getLayout();
        managementDashboard49.setAlignmentX((float) 0);
        managementDashboard24.putClientProperty((java.lang.Object) managementDashboard36, (java.lang.Object) 0);
        java.awt.event.FocusListener[] focusListenerArray59 = managementDashboard24.getFocusListeners();
        java.awt.ComponentOrientation componentOrientation60 = managementDashboard24.getComponentOrientation();
        managementDashboard10.applyComponentOrientation(componentOrientation60);
        managementDashboard1.setComponentOrientation(componentOrientation60);
        boolean boolean63 = managementDashboard1.isValid();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(focusTraversalPolicy7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(layoutManager55);
        org.junit.Assert.assertNotNull(focusListenerArray59);
        org.junit.Assert.assertArrayEquals(focusListenerArray59, new java.awt.event.FocusListener[] {});
        org.junit.Assert.assertNotNull(componentOrientation60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        managementDashboard1.move((int) (byte) 1, (int) '#');
        managementDashboard1.layout();
        managementDashboard1.setEnabled(false);
        int int10 = managementDashboard1.getY();
        java.awt.Component component13 = managementDashboard1.locate((-1), (int) '#');
        managementDashboard1.setAlignmentY((float) 100L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNull(component13);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.event.ContainerListener containerListener5 = null;
        managementDashboard1.removeContainerListener(containerListener5);
        javax.swing.JPopupMenu jPopupMenu7 = null;
        managementDashboard1.setComponentPopupMenu(jPopupMenu7);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener9 = null;
        managementDashboard1.addHierarchyBoundsListener(hierarchyBoundsListener9);
        java.awt.Cursor cursor11 = managementDashboard1.getCursor();
        java.util.function.Consumer<java.lang.String> strConsumer12 = null;
        ManagementDashboard managementDashboard13 = new ManagementDashboard(strConsumer12);
        boolean boolean14 = managementDashboard13.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests15 = managementDashboard13.getInputMethodRequests();
        java.util.function.Consumer<java.lang.String> strConsumer16 = null;
        ManagementDashboard managementDashboard17 = new ManagementDashboard(strConsumer16);
        managementDashboard17.setInheritsPopupMenu(true);
        boolean boolean20 = managementDashboard17.isValidateRoot();
        int int21 = managementDashboard13.getComponentZOrder((java.awt.Component) managementDashboard17);
        java.awt.Dimension dimension22 = managementDashboard13.size();
        managementDashboard1.setMinimumSize(dimension22);
        java.awt.Graphics graphics24 = null;
        managementDashboard1.update(graphics24);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNotNull(cursor11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(inputMethodRequests15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(dimension22);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.event.ContainerListener containerListener5 = null;
        managementDashboard1.removeContainerListener(containerListener5);
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = managementDashboard1.getFocusTraversalPolicy();
        java.awt.ImageCapabilities imageCapabilities10 = null;
        java.awt.image.VolatileImage volatileImage11 = managementDashboard1.createVolatileImage((int) (short) 1, 32, imageCapabilities10);
        managementDashboard1.grabFocus();
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        boolean boolean15 = managementDashboard14.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests16 = managementDashboard14.getInputMethodRequests();
        java.awt.Container container17 = managementDashboard14.getTopLevelAncestor();
        java.awt.Color color18 = null;
        managementDashboard14.setForeground(color18);
        managementDashboard14.repaint(10, 100, 0, (int) (short) 1);
        boolean boolean25 = managementDashboard14.requestFocusInWindow();
        java.util.function.Consumer<java.lang.String> strConsumer26 = null;
        ManagementDashboard managementDashboard27 = new ManagementDashboard(strConsumer26);
        managementDashboard27.setRequestFocusEnabled(false);
        java.awt.Event event30 = null;
        boolean boolean32 = managementDashboard27.keyUp(event30, (int) (short) 1);
        managementDashboard27.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        managementDashboard27.removePropertyChangeListener("", propertyChangeListener36);
        managementDashboard27.doLayout();
        javax.swing.JPopupMenu jPopupMenu39 = managementDashboard27.getComponentPopupMenu();
        java.awt.Component component41 = managementDashboard14.add((java.awt.Component) managementDashboard27, 1);
        java.util.function.Consumer<java.lang.String> strConsumer42 = null;
        ManagementDashboard managementDashboard43 = new ManagementDashboard(strConsumer42);
        managementDashboard43.setRequestFocusEnabled(false);
        java.awt.Event event46 = null;
        boolean boolean48 = managementDashboard43.keyUp(event46, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener49 = null;
        managementDashboard43.addInputMethodListener(inputMethodListener49);
        java.awt.Dimension dimension51 = managementDashboard43.getMaximumSize();
        managementDashboard27.setPreferredSize(dimension51);
        managementDashboard27.show(false);
        int int57 = managementDashboard27.getBaseline((int) (byte) 10, (int) 'a');
        boolean boolean58 = managementDashboard27.isRequestFocusEnabled();
        java.awt.Component component59 = managementDashboard1.add((java.awt.Component) managementDashboard27);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(focusTraversalPolicy7);
        org.junit.Assert.assertNull(volatileImage11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputMethodRequests16);
        org.junit.Assert.assertNull(container17);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(jPopupMenu39);
        org.junit.Assert.assertNotNull(component41);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(dimension51);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(component59);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener7 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener7);
        java.awt.Dimension dimension9 = managementDashboard1.getMaximumSize();
        java.awt.event.MouseEvent mouseEvent10 = null;
        java.awt.Point point11 = managementDashboard1.getToolTipLocation(mouseEvent10);
        java.util.function.Consumer<java.lang.String> strConsumer12 = null;
        ManagementDashboard managementDashboard13 = new ManagementDashboard(strConsumer12);
        boolean boolean14 = managementDashboard13.isCursorSet();
        java.awt.Event event15 = null;
        boolean boolean17 = managementDashboard13.lostFocus(event15, (java.lang.Object) "");
        managementDashboard13.setAutoscrolls(false);
        java.awt.Graphics graphics20 = null;
        managementDashboard13.update(graphics20);
        managementDashboard13.setFocusCycleRoot(false);
        managementDashboard13.repaint((long) (byte) 0);
        managementDashboard13.setVisible(false);
        java.lang.Object obj28 = managementDashboard1.getClientProperty((java.lang.Object) false);
        boolean boolean29 = managementDashboard1.isPaintingTile();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dimension9);
        org.junit.Assert.assertNull(point11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        java.awt.event.HierarchyListener hierarchyListener7 = null;
        managementDashboard1.addHierarchyListener(hierarchyListener7);
        java.awt.Cursor cursor9 = null;
        managementDashboard1.setCursor(cursor9);
        java.awt.Point point12 = managementDashboard1.getMousePosition(false);
        javax.swing.border.Border border13 = managementDashboard1.getBorder();
        boolean boolean14 = managementDashboard1.isPaintingForPrint();
        java.awt.Event event15 = null;
        boolean boolean18 = managementDashboard1.mouseUp(event15, 1, 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(point12);
        org.junit.Assert.assertNull(border13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.event.ComponentListener componentListener4 = null;
        managementDashboard1.removeComponentListener(componentListener4);
        javax.swing.InputMap inputMap6 = managementDashboard1.getInputMap();
        java.awt.image.VolatileImage volatileImage9 = managementDashboard1.createVolatileImage(8, (int) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        managementDashboard1.addPropertyChangeListener("ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=37748745,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=2147483647,height=2147483647]]", propertyChangeListener11);
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        boolean boolean15 = managementDashboard14.isCursorSet();
        java.awt.Event event16 = null;
        boolean boolean18 = managementDashboard14.lostFocus(event16, (java.lang.Object) "");
        managementDashboard14.setAutoscrolls(false);
        java.awt.Graphics graphics21 = null;
        managementDashboard14.update(graphics21);
        java.awt.Dimension dimension23 = managementDashboard14.getPreferredSize();
        java.awt.Rectangle rectangle24 = managementDashboard14.getVisibleRect();
        managementDashboard1.scrollRectToVisible(rectangle24);
        java.util.function.Consumer<java.lang.String> strConsumer26 = null;
        ManagementDashboard managementDashboard27 = new ManagementDashboard(strConsumer26);
        managementDashboard27.setRequestFocusEnabled(false);
        java.awt.Event event30 = null;
        boolean boolean32 = managementDashboard27.keyUp(event30, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener33 = null;
        managementDashboard27.addInputMethodListener(inputMethodListener33);
        java.awt.Dimension dimension35 = managementDashboard27.getMaximumSize();
        java.awt.event.MouseEvent mouseEvent36 = null;
        java.awt.Point point37 = managementDashboard27.getToolTipLocation(mouseEvent36);
        java.util.function.Consumer<java.lang.String> strConsumer38 = null;
        ManagementDashboard managementDashboard39 = new ManagementDashboard(strConsumer38);
        managementDashboard39.setInheritsPopupMenu(true);
        boolean boolean42 = managementDashboard39.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget43 = null;
        managementDashboard39.setDropTarget(dropTarget43);
        managementDashboard39.setFocusable(false);
        java.util.function.Consumer<java.lang.String> strConsumer47 = null;
        ManagementDashboard managementDashboard48 = new ManagementDashboard(strConsumer47);
        boolean boolean49 = managementDashboard48.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests50 = managementDashboard48.getInputMethodRequests();
        managementDashboard48.move((int) (byte) 1, (int) '#');
        boolean boolean54 = managementDashboard48.isFocusTraversable();
        java.util.function.Consumer<java.lang.String> strConsumer55 = null;
        ManagementDashboard managementDashboard56 = new ManagementDashboard(strConsumer55);
        managementDashboard56.setRequestFocusEnabled(false);
        managementDashboard56.enable();
        managementDashboard56.list();
        java.awt.Point point61 = managementDashboard56.location();
        boolean boolean62 = managementDashboard48.contains(point61);
        boolean boolean63 = managementDashboard39.contains(point61);
        java.awt.Component component65 = managementDashboard27.add((java.awt.Component) managementDashboard39, (int) (short) 0);
        managementDashboard39.firePropertyChange("data/parkingSpaceData.csv", (float) 35, (float) (short) 1);
        managementDashboard1.setComponentZOrder((java.awt.Component) managementDashboard39, 0);
        org.junit.Assert.assertNotNull(inputMap6);
        org.junit.Assert.assertNull(volatileImage9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dimension23);
        org.junit.Assert.assertNotNull(rectangle24);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dimension35);
        org.junit.Assert.assertNull(point37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(inputMethodRequests50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(point61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(component65);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        managementDashboard1.move((int) (byte) 1, (int) '#');
        managementDashboard1.layout();
        java.awt.Point point8 = managementDashboard1.getLocation();
        java.awt.event.FocusListener focusListener9 = null;
        managementDashboard1.addFocusListener(focusListener9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNotNull(point8);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        managementDashboard5.setInheritsPopupMenu(true);
        boolean boolean8 = managementDashboard5.isValidateRoot();
        int int9 = managementDashboard1.getComponentZOrder((java.awt.Component) managementDashboard5);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        managementDashboard5.addPropertyChangeListener("hi!", propertyChangeListener11);
        boolean boolean13 = managementDashboard5.isPreferredSizeSet();
        managementDashboard5.setDoubleBuffered(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        javax.swing.KeyStroke keyStroke7 = null;
        java.awt.event.ActionListener actionListener8 = managementDashboard1.getActionForKeyStroke(keyStroke7);
        java.util.function.Consumer<java.lang.String> strConsumer9 = null;
        ManagementDashboard managementDashboard10 = new ManagementDashboard(strConsumer9);
        boolean boolean11 = managementDashboard10.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests12 = managementDashboard10.getInputMethodRequests();
        java.awt.Container container13 = managementDashboard10.getTopLevelAncestor();
        java.awt.event.ContainerListener containerListener14 = null;
        managementDashboard10.removeContainerListener(containerListener14);
        int int16 = managementDashboard1.getComponentZOrder((java.awt.Component) managementDashboard10);
        java.awt.event.KeyListener keyListener17 = null;
        managementDashboard10.removeKeyListener(keyListener17);
        java.lang.String str19 = managementDashboard10.getToolTipText();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(actionListener8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(inputMethodRequests12);
        org.junit.Assert.assertNull(container13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener7 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener7);
        java.awt.Dimension dimension9 = managementDashboard1.getMaximumSize();
        java.awt.event.MouseEvent mouseEvent10 = null;
        java.awt.Point point11 = managementDashboard1.getToolTipLocation(mouseEvent10);
        boolean boolean12 = managementDashboard1.isPaintingForPrint();
        java.awt.Event event13 = null;
        java.util.function.Consumer<java.lang.String> strConsumer14 = null;
        ManagementDashboard managementDashboard15 = new ManagementDashboard(strConsumer14);
        managementDashboard15.setInheritsPopupMenu(true);
        boolean boolean18 = managementDashboard15.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget19 = null;
        managementDashboard15.setDropTarget(dropTarget19);
        boolean boolean21 = managementDashboard15.getAutoscrolls();
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        managementDashboard23.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy26 = null;
        managementDashboard23.setFocusTraversalPolicy(focusTraversalPolicy26);
        java.lang.Object obj28 = managementDashboard15.getClientProperty((java.lang.Object) managementDashboard23);
        java.util.function.Consumer<java.lang.String> strConsumer29 = null;
        ManagementDashboard managementDashboard30 = new ManagementDashboard(strConsumer29);
        managementDashboard30.setRequestFocusEnabled(false);
        java.awt.Event event33 = null;
        boolean boolean35 = managementDashboard30.keyUp(event33, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener36 = null;
        managementDashboard30.addInputMethodListener(inputMethodListener36);
        java.awt.Dimension dimension38 = managementDashboard30.getMaximumSize();
        int int39 = managementDashboard15.getComponentZOrder((java.awt.Component) managementDashboard30);
        java.awt.Component component40 = managementDashboard15.getNextFocusableComponent();
        managementDashboard15.removeNotify();
        boolean boolean42 = managementDashboard1.gotFocus(event13, (java.lang.Object) managementDashboard15);
        java.util.function.Consumer<java.lang.String> strConsumer43 = null;
        ManagementDashboard managementDashboard44 = new ManagementDashboard(strConsumer43);
        managementDashboard44.setRequestFocusEnabled(false);
        java.awt.Event event47 = null;
        boolean boolean49 = managementDashboard44.keyUp(event47, (int) (short) 1);
        boolean boolean50 = managementDashboard44.isCursorSet();
        java.awt.Dimension dimension51 = managementDashboard44.size();
        managementDashboard15.setMaximumSize(dimension51);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dimension9);
        org.junit.Assert.assertNull(point11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dimension38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNull(component40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(dimension51);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        boolean boolean4 = managementDashboard1.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget5 = null;
        managementDashboard1.setDropTarget(dropTarget5);
        java.awt.Dimension dimension7 = null;
        managementDashboard1.setPreferredSize(dimension7);
        java.awt.Event event9 = null;
        boolean boolean12 = managementDashboard1.mouseExit(event9, (int) 'a', (int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        boolean boolean15 = managementDashboard14.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests16 = managementDashboard14.getInputMethodRequests();
        java.awt.Container container17 = managementDashboard14.getTopLevelAncestor();
        java.awt.Color color18 = null;
        managementDashboard14.setForeground(color18);
        javax.swing.KeyStroke keyStroke20 = null;
        java.awt.event.ActionListener actionListener21 = managementDashboard14.getActionForKeyStroke(keyStroke20);
        javax.swing.JToolTip jToolTip22 = managementDashboard14.createToolTip();
        java.awt.Event event23 = null;
        java.util.function.Consumer<java.lang.String> strConsumer24 = null;
        ManagementDashboard managementDashboard25 = new ManagementDashboard(strConsumer24);
        managementDashboard25.setInheritsPopupMenu(true);
        boolean boolean28 = managementDashboard25.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget29 = null;
        managementDashboard25.setDropTarget(dropTarget29);
        java.awt.Dimension dimension31 = null;
        managementDashboard25.setPreferredSize(dimension31);
        javax.swing.event.AncestorListener ancestorListener33 = null;
        managementDashboard25.removeAncestorListener(ancestorListener33);
        java.awt.Dimension dimension35 = managementDashboard25.getPreferredSize();
        java.awt.Dimension dimension36 = managementDashboard25.getPreferredSize();
        managementDashboard25.setDebugGraphicsOptions(10);
        boolean boolean39 = jToolTip22.lostFocus(event23, (java.lang.Object) managementDashboard25);
        java.awt.Rectangle rectangle40 = jToolTip22.bounds();
        managementDashboard1.computeVisibleRect(rectangle40);
        javax.swing.TransferHandler transferHandler42 = managementDashboard1.getTransferHandler();
        java.awt.Event event43 = null;
        boolean boolean46 = managementDashboard1.mouseEnter(event43, (int) (short) 0, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputMethodRequests16);
        org.junit.Assert.assertNull(container17);
        org.junit.Assert.assertNull(actionListener21);
        org.junit.Assert.assertNotNull(jToolTip22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dimension35);
        org.junit.Assert.assertNotNull(dimension36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(rectangle40);
        org.junit.Assert.assertNull(transferHandler42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        managementDashboard5.setInheritsPopupMenu(true);
        boolean boolean8 = managementDashboard5.isValidateRoot();
        int int9 = managementDashboard1.getComponentZOrder((java.awt.Component) managementDashboard5);
        java.awt.event.ContainerListener containerListener10 = null;
        managementDashboard5.addContainerListener(containerListener10);
        managementDashboard5.transferFocusBackward();
        java.awt.image.VolatileImage volatileImage15 = managementDashboard5.createVolatileImage((int) (short) 0, 1);
        java.awt.image.VolatileImage volatileImage18 = managementDashboard5.createVolatileImage(0, 10);
        javax.swing.JPopupMenu jPopupMenu19 = null;
        managementDashboard5.setComponentPopupMenu(jPopupMenu19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(volatileImage15);
        org.junit.Assert.assertNull(volatileImage18);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        ParkingSpace parkingSpace4 = new ParkingSpace((int) (byte) 10, "data/managerData.csv", "", "ToolTipText");
        int int5 = parkingSpace4.getIndex();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        javax.swing.KeyStroke keyStroke7 = null;
        java.awt.event.ActionListener actionListener8 = managementDashboard1.getActionForKeyStroke(keyStroke7);
        javax.swing.JToolTip jToolTip9 = managementDashboard1.createToolTip();
        java.awt.Event event10 = null;
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        ManagementDashboard managementDashboard12 = new ManagementDashboard(strConsumer11);
        managementDashboard12.setInheritsPopupMenu(true);
        boolean boolean15 = managementDashboard12.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget16 = null;
        managementDashboard12.setDropTarget(dropTarget16);
        java.awt.Dimension dimension18 = null;
        managementDashboard12.setPreferredSize(dimension18);
        javax.swing.event.AncestorListener ancestorListener20 = null;
        managementDashboard12.removeAncestorListener(ancestorListener20);
        java.awt.Dimension dimension22 = managementDashboard12.getPreferredSize();
        java.awt.Dimension dimension23 = managementDashboard12.getPreferredSize();
        managementDashboard12.setDebugGraphicsOptions(10);
        boolean boolean26 = jToolTip9.lostFocus(event10, (java.lang.Object) managementDashboard12);
        boolean boolean27 = managementDashboard12.isOpaque();
        java.awt.event.KeyListener keyListener28 = null;
        managementDashboard12.removeKeyListener(keyListener28);
        java.util.function.Consumer<java.lang.String> strConsumer30 = null;
        ManagementDashboard managementDashboard31 = new ManagementDashboard(strConsumer30);
        managementDashboard31.setInheritsPopupMenu(true);
        boolean boolean34 = managementDashboard31.isValidateRoot();
        java.awt.LayoutManager layoutManager35 = null;
        managementDashboard31.setLayout(layoutManager35);
        boolean boolean37 = managementDashboard31.getFocusTraversalKeysEnabled();
        managementDashboard31.removeNotify();
        java.awt.Rectangle rectangle39 = managementDashboard31.getVisibleRect();
        managementDashboard12.computeVisibleRect(rectangle39);
        java.awt.Graphics graphics41 = null;
        managementDashboard12.update(graphics41);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(actionListener8);
        org.junit.Assert.assertNotNull(jToolTip9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dimension22);
        org.junit.Assert.assertNotNull(dimension23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(rectangle39);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        SuperManager superManager0 = new SuperManager();
        MainSystem.currentManager = superManager0;
        java.lang.String str2 = superManager0.getUsername();
        java.lang.String str3 = superManager0.getPassword();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SUPERMAN" + "'", str2, "SUPERMAN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "123456789" + "'", str3, "123456789");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        javax.swing.KeyStroke keyStroke7 = null;
        java.awt.event.ActionListener actionListener8 = managementDashboard1.getActionForKeyStroke(keyStroke7);
        javax.swing.JToolTip jToolTip9 = managementDashboard1.createToolTip();
        java.util.function.Consumer<java.lang.String> strConsumer10 = null;
        ManagementDashboard managementDashboard11 = new ManagementDashboard(strConsumer10);
        managementDashboard11.setRequestFocusEnabled(false);
        java.awt.Event event14 = null;
        boolean boolean16 = managementDashboard11.keyUp(event14, (int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer17 = null;
        ManagementDashboard managementDashboard18 = new ManagementDashboard(strConsumer17);
        managementDashboard18.setRequestFocusEnabled(false);
        java.awt.Event event21 = null;
        boolean boolean23 = managementDashboard18.keyUp(event21, (int) (short) 1);
        managementDashboard18.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        managementDashboard18.removePropertyChangeListener("", propertyChangeListener27);
        java.awt.Dimension dimension29 = managementDashboard18.getPreferredSize();
        managementDashboard11.setSize(dimension29);
        managementDashboard1.setMinimumSize(dimension29);
        java.awt.Dimension dimension32 = managementDashboard1.minimumSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(actionListener8);
        org.junit.Assert.assertNotNull(jToolTip9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dimension29);
        org.junit.Assert.assertNotNull(dimension32);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.event.ComponentListener componentListener4 = null;
        managementDashboard1.removeComponentListener(componentListener4);
        javax.swing.InputMap inputMap6 = managementDashboard1.getInputMap();
        java.awt.image.VolatileImage volatileImage9 = managementDashboard1.createVolatileImage(8, (int) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        managementDashboard1.addPropertyChangeListener("ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=37748745,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=2147483647,height=2147483647]]", propertyChangeListener11);
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        boolean boolean15 = managementDashboard14.isCursorSet();
        java.awt.Event event16 = null;
        boolean boolean18 = managementDashboard14.lostFocus(event16, (java.lang.Object) "");
        managementDashboard14.setAutoscrolls(false);
        java.awt.Graphics graphics21 = null;
        managementDashboard14.update(graphics21);
        java.awt.Dimension dimension23 = managementDashboard14.getPreferredSize();
        java.awt.Rectangle rectangle24 = managementDashboard14.getVisibleRect();
        managementDashboard1.scrollRectToVisible(rectangle24);
        boolean boolean26 = managementDashboard1.isValid();
        org.junit.Assert.assertNotNull(inputMap6);
        org.junit.Assert.assertNull(volatileImage9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dimension23);
        org.junit.Assert.assertNotNull(rectangle24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        boolean boolean4 = managementDashboard1.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget5 = null;
        managementDashboard1.setDropTarget(dropTarget5);
        boolean boolean7 = managementDashboard1.getAutoscrolls();
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        managementDashboard9.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        managementDashboard9.setFocusTraversalPolicy(focusTraversalPolicy12);
        java.lang.Object obj14 = managementDashboard1.getClientProperty((java.lang.Object) managementDashboard9);
        java.util.function.Consumer<java.lang.String> strConsumer15 = null;
        ManagementDashboard managementDashboard16 = new ManagementDashboard(strConsumer15);
        managementDashboard16.setRequestFocusEnabled(false);
        java.awt.Event event19 = null;
        boolean boolean21 = managementDashboard16.keyUp(event19, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener22 = null;
        managementDashboard16.addInputMethodListener(inputMethodListener22);
        java.awt.Dimension dimension24 = managementDashboard16.getMaximumSize();
        int int25 = managementDashboard1.getComponentZOrder((java.awt.Component) managementDashboard16);
        managementDashboard1.transferFocusBackward();
        java.awt.dnd.DropTarget dropTarget27 = null;
        managementDashboard1.setDropTarget(dropTarget27);
        managementDashboard1.reshape((int) (byte) -1, (int) (short) 0, (int) (short) 1, (int) (byte) 1);
        managementDashboard1.revalidate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = managementDashboard1.areFocusTraversalKeysSet((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dimension24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        boolean boolean4 = managementDashboard1.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget5 = null;
        managementDashboard1.setDropTarget(dropTarget5);
        boolean boolean7 = managementDashboard1.getAutoscrolls();
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        boolean boolean10 = managementDashboard9.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests11 = managementDashboard9.getInputMethodRequests();
        java.util.function.Consumer<java.lang.String> strConsumer12 = null;
        ManagementDashboard managementDashboard13 = new ManagementDashboard(strConsumer12);
        managementDashboard13.setInheritsPopupMenu(true);
        boolean boolean16 = managementDashboard13.isValidateRoot();
        int int17 = managementDashboard9.getComponentZOrder((java.awt.Component) managementDashboard13);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        managementDashboard13.addPropertyChangeListener("hi!", propertyChangeListener19);
        boolean boolean21 = managementDashboard13.isManagingFocus();
        int int22 = managementDashboard1.getComponentZOrder((java.awt.Component) managementDashboard13);
        boolean boolean23 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) managementDashboard1);
        managementDashboard1.setOpaque(false);
        javax.swing.TransferHandler transferHandler26 = null;
        managementDashboard1.setTransferHandler(transferHandler26);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(inputMethodRequests11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        managementDashboard1.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard1.removePropertyChangeListener("", propertyChangeListener10);
        managementDashboard1.doLayout();
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        managementDashboard14.setInheritsPopupMenu(true);
        boolean boolean17 = managementDashboard14.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget18 = null;
        managementDashboard14.setDropTarget(dropTarget18);
        java.awt.Dimension dimension20 = null;
        managementDashboard14.setPreferredSize(dimension20);
        java.awt.Event event22 = null;
        boolean boolean25 = managementDashboard14.mouseExit(event22, (int) 'a', (int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer26 = null;
        ManagementDashboard managementDashboard27 = new ManagementDashboard(strConsumer26);
        boolean boolean28 = managementDashboard27.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests29 = managementDashboard27.getInputMethodRequests();
        java.awt.Container container30 = managementDashboard27.getTopLevelAncestor();
        java.awt.Color color31 = null;
        managementDashboard27.setForeground(color31);
        javax.swing.KeyStroke keyStroke33 = null;
        java.awt.event.ActionListener actionListener34 = managementDashboard27.getActionForKeyStroke(keyStroke33);
        javax.swing.JToolTip jToolTip35 = managementDashboard27.createToolTip();
        java.awt.Event event36 = null;
        java.util.function.Consumer<java.lang.String> strConsumer37 = null;
        ManagementDashboard managementDashboard38 = new ManagementDashboard(strConsumer37);
        managementDashboard38.setInheritsPopupMenu(true);
        boolean boolean41 = managementDashboard38.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget42 = null;
        managementDashboard38.setDropTarget(dropTarget42);
        java.awt.Dimension dimension44 = null;
        managementDashboard38.setPreferredSize(dimension44);
        javax.swing.event.AncestorListener ancestorListener46 = null;
        managementDashboard38.removeAncestorListener(ancestorListener46);
        java.awt.Dimension dimension48 = managementDashboard38.getPreferredSize();
        java.awt.Dimension dimension49 = managementDashboard38.getPreferredSize();
        managementDashboard38.setDebugGraphicsOptions(10);
        boolean boolean52 = jToolTip35.lostFocus(event36, (java.lang.Object) managementDashboard38);
        java.awt.Rectangle rectangle53 = jToolTip35.bounds();
        managementDashboard14.computeVisibleRect(rectangle53);
        managementDashboard1.setMixingCutoutShape((java.awt.Shape) rectangle53);
        java.awt.Color color56 = managementDashboard1.getBackground();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean58 = managementDashboard1.areFocusTraversalKeysSet(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(inputMethodRequests29);
        org.junit.Assert.assertNull(container30);
        org.junit.Assert.assertNull(actionListener34);
        org.junit.Assert.assertNotNull(jToolTip35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(dimension48);
        org.junit.Assert.assertNotNull(dimension49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(rectangle53);
        org.junit.Assert.assertNotNull(color56);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        managementDashboard1.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard1.removePropertyChangeListener("", propertyChangeListener10);
        managementDashboard1.doLayout();
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        managementDashboard14.setInheritsPopupMenu(true);
        boolean boolean17 = managementDashboard14.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget18 = null;
        managementDashboard14.setDropTarget(dropTarget18);
        java.awt.Dimension dimension20 = null;
        managementDashboard14.setPreferredSize(dimension20);
        java.awt.Event event22 = null;
        boolean boolean25 = managementDashboard14.mouseExit(event22, (int) 'a', (int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer26 = null;
        ManagementDashboard managementDashboard27 = new ManagementDashboard(strConsumer26);
        boolean boolean28 = managementDashboard27.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests29 = managementDashboard27.getInputMethodRequests();
        java.awt.Container container30 = managementDashboard27.getTopLevelAncestor();
        java.awt.Color color31 = null;
        managementDashboard27.setForeground(color31);
        javax.swing.KeyStroke keyStroke33 = null;
        java.awt.event.ActionListener actionListener34 = managementDashboard27.getActionForKeyStroke(keyStroke33);
        javax.swing.JToolTip jToolTip35 = managementDashboard27.createToolTip();
        java.awt.Event event36 = null;
        java.util.function.Consumer<java.lang.String> strConsumer37 = null;
        ManagementDashboard managementDashboard38 = new ManagementDashboard(strConsumer37);
        managementDashboard38.setInheritsPopupMenu(true);
        boolean boolean41 = managementDashboard38.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget42 = null;
        managementDashboard38.setDropTarget(dropTarget42);
        java.awt.Dimension dimension44 = null;
        managementDashboard38.setPreferredSize(dimension44);
        javax.swing.event.AncestorListener ancestorListener46 = null;
        managementDashboard38.removeAncestorListener(ancestorListener46);
        java.awt.Dimension dimension48 = managementDashboard38.getPreferredSize();
        java.awt.Dimension dimension49 = managementDashboard38.getPreferredSize();
        managementDashboard38.setDebugGraphicsOptions(10);
        boolean boolean52 = jToolTip35.lostFocus(event36, (java.lang.Object) managementDashboard38);
        java.awt.Rectangle rectangle53 = jToolTip35.bounds();
        managementDashboard14.computeVisibleRect(rectangle53);
        managementDashboard1.setMixingCutoutShape((java.awt.Shape) rectangle53);
        java.awt.Color color56 = managementDashboard1.getBackground();
        boolean boolean57 = managementDashboard1.isRequestFocusEnabled();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(inputMethodRequests29);
        org.junit.Assert.assertNull(container30);
        org.junit.Assert.assertNull(actionListener34);
        org.junit.Assert.assertNotNull(jToolTip35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(dimension48);
        org.junit.Assert.assertNotNull(dimension49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(rectangle53);
        org.junit.Assert.assertNotNull(color56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        boolean boolean4 = managementDashboard1.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget5 = null;
        managementDashboard1.setDropTarget(dropTarget5);
        boolean boolean7 = managementDashboard1.getAutoscrolls();
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        managementDashboard9.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        managementDashboard9.setFocusTraversalPolicy(focusTraversalPolicy12);
        java.lang.Object obj14 = managementDashboard1.getClientProperty((java.lang.Object) managementDashboard9);
        java.util.function.Consumer<java.lang.String> strConsumer15 = null;
        ManagementDashboard managementDashboard16 = new ManagementDashboard(strConsumer15);
        managementDashboard16.setRequestFocusEnabled(false);
        java.awt.Event event19 = null;
        boolean boolean21 = managementDashboard16.keyUp(event19, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener22 = null;
        managementDashboard16.addInputMethodListener(inputMethodListener22);
        java.awt.Dimension dimension24 = managementDashboard16.getMaximumSize();
        int int25 = managementDashboard1.getComponentZOrder((java.awt.Component) managementDashboard16);
        managementDashboard1.transferFocusBackward();
        java.awt.dnd.DropTarget dropTarget27 = null;
        managementDashboard1.setDropTarget(dropTarget27);
        managementDashboard1.setAutoscrolls(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dimension24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        javax.swing.KeyStroke keyStroke7 = null;
        java.awt.event.ActionListener actionListener8 = managementDashboard1.getActionForKeyStroke(keyStroke7);
        javax.swing.JToolTip jToolTip9 = managementDashboard1.createToolTip();
        java.awt.Event event10 = null;
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        ManagementDashboard managementDashboard12 = new ManagementDashboard(strConsumer11);
        managementDashboard12.setInheritsPopupMenu(true);
        boolean boolean15 = managementDashboard12.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget16 = null;
        managementDashboard12.setDropTarget(dropTarget16);
        java.awt.Dimension dimension18 = null;
        managementDashboard12.setPreferredSize(dimension18);
        javax.swing.event.AncestorListener ancestorListener20 = null;
        managementDashboard12.removeAncestorListener(ancestorListener20);
        java.awt.Dimension dimension22 = managementDashboard12.getPreferredSize();
        java.awt.Dimension dimension23 = managementDashboard12.getPreferredSize();
        managementDashboard12.setDebugGraphicsOptions(10);
        boolean boolean26 = jToolTip9.lostFocus(event10, (java.lang.Object) managementDashboard12);
        boolean boolean27 = managementDashboard12.isOpaque();
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        managementDashboard12.addPropertyChangeListener("ToolTipText", propertyChangeListener29);
        java.awt.Component[] componentArray31 = managementDashboard12.getComponents();
        java.awt.Font font32 = null;
        managementDashboard12.setFont(font32);
        java.util.function.Consumer<java.lang.String> strConsumer34 = null;
        ManagementDashboard managementDashboard35 = new ManagementDashboard(strConsumer34);
        boolean boolean36 = managementDashboard35.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests37 = managementDashboard35.getInputMethodRequests();
        java.awt.Container container38 = managementDashboard35.getTopLevelAncestor();
        java.awt.Color color39 = null;
        managementDashboard35.setForeground(color39);
        javax.swing.KeyStroke keyStroke41 = null;
        java.awt.event.ActionListener actionListener42 = managementDashboard35.getActionForKeyStroke(keyStroke41);
        javax.swing.JToolTip jToolTip43 = managementDashboard35.createToolTip();
        java.util.function.Consumer<java.lang.String> strConsumer44 = null;
        ManagementDashboard managementDashboard45 = new ManagementDashboard(strConsumer44);
        boolean boolean46 = managementDashboard45.isCursorSet();
        java.awt.Event event47 = null;
        boolean boolean49 = managementDashboard45.lostFocus(event47, (java.lang.Object) "");
        java.util.function.Consumer<java.lang.String> strConsumer50 = null;
        ManagementDashboard managementDashboard51 = new ManagementDashboard(strConsumer50);
        managementDashboard51.setRequestFocusEnabled(false);
        java.awt.Event event54 = null;
        boolean boolean56 = managementDashboard51.keyUp(event54, (int) (short) 1);
        managementDashboard51.setAutoscrolls(true);
        java.awt.event.HierarchyListener[] hierarchyListenerArray59 = managementDashboard51.getHierarchyListeners();
        jToolTip43.add((java.awt.Component) managementDashboard45, (java.lang.Object) hierarchyListenerArray59);
        managementDashboard12.remove((java.awt.Component) managementDashboard45);
        managementDashboard45.doLayout();
        java.awt.PopupMenu popupMenu63 = null;
        // The following exception was thrown during execution in test generation
        try {
            managementDashboard45.add(popupMenu63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"parent\" because \"popup\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(actionListener8);
        org.junit.Assert.assertNotNull(jToolTip9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dimension22);
        org.junit.Assert.assertNotNull(dimension23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(componentArray31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(inputMethodRequests37);
        org.junit.Assert.assertNull(container38);
        org.junit.Assert.assertNull(actionListener42);
        org.junit.Assert.assertNotNull(jToolTip43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(hierarchyListenerArray59);
        org.junit.Assert.assertArrayEquals(hierarchyListenerArray59, new java.awt.event.HierarchyListener[] {});
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        boolean boolean4 = managementDashboard1.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget5 = null;
        managementDashboard1.setDropTarget(dropTarget5);
        java.awt.Dimension dimension7 = null;
        managementDashboard1.setPreferredSize(dimension7);
        javax.swing.event.AncestorListener ancestorListener9 = null;
        managementDashboard1.removeAncestorListener(ancestorListener9);
        java.awt.Dimension dimension11 = managementDashboard1.getPreferredSize();
        java.awt.Dimension dimension12 = managementDashboard1.getPreferredSize();
        managementDashboard1.setDebugGraphicsOptions(10);
        java.awt.event.MouseListener mouseListener15 = null;
        managementDashboard1.removeMouseListener(mouseListener15);
        javax.swing.border.Border border17 = null;
        managementDashboard1.setBorder(border17);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertNotNull(dimension12);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        javax.swing.KeyStroke keyStroke7 = null;
        java.awt.event.ActionListener actionListener8 = managementDashboard1.getActionForKeyStroke(keyStroke7);
        javax.swing.JToolTip jToolTip9 = managementDashboard1.createToolTip();
        java.util.function.Consumer<java.lang.String> strConsumer10 = null;
        ManagementDashboard managementDashboard11 = new ManagementDashboard(strConsumer10);
        managementDashboard11.setRequestFocusEnabled(false);
        java.awt.Event event14 = null;
        boolean boolean16 = managementDashboard11.keyUp(event14, (int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer17 = null;
        ManagementDashboard managementDashboard18 = new ManagementDashboard(strConsumer17);
        managementDashboard18.setRequestFocusEnabled(false);
        java.awt.Event event21 = null;
        boolean boolean23 = managementDashboard18.keyUp(event21, (int) (short) 1);
        managementDashboard18.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        managementDashboard18.removePropertyChangeListener("", propertyChangeListener27);
        java.awt.Dimension dimension29 = managementDashboard18.getPreferredSize();
        managementDashboard11.setSize(dimension29);
        managementDashboard1.setMinimumSize(dimension29);
        java.awt.Event event32 = null;
        java.util.function.Consumer<java.lang.String> strConsumer33 = null;
        ManagementDashboard managementDashboard34 = new ManagementDashboard(strConsumer33);
        managementDashboard34.setRequestFocusEnabled(false);
        java.awt.Event event37 = null;
        boolean boolean39 = managementDashboard34.keyUp(event37, (int) (short) 1);
        managementDashboard34.setAutoscrolls(true);
        java.awt.event.HierarchyListener[] hierarchyListenerArray42 = managementDashboard34.getHierarchyListeners();
        java.awt.event.KeyListener keyListener43 = null;
        managementDashboard34.addKeyListener(keyListener43);
        boolean boolean45 = managementDashboard1.action(event32, (java.lang.Object) managementDashboard34);
        java.awt.event.FocusListener[] focusListenerArray46 = managementDashboard34.getFocusListeners();
        javax.swing.JRootPane jRootPane47 = managementDashboard34.getRootPane();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Color color48 = jRootPane47.getBackground();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(actionListener8);
        org.junit.Assert.assertNotNull(jToolTip9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dimension29);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(hierarchyListenerArray42);
        org.junit.Assert.assertArrayEquals(hierarchyListenerArray42, new java.awt.event.HierarchyListener[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(focusListenerArray46);
        org.junit.Assert.assertArrayEquals(focusListenerArray46, new java.awt.event.FocusListener[] {});
        org.junit.Assert.assertNull(jRootPane47);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        ParkingLot parkingLot1 = new ParkingLot("data/userData.csv");
        ParkingSpace[] parkingSpaceArray2 = parkingLot1.getSpaces();
        parkingLot1.setEnabled(true);
        ParkingSpace parkingSpace6 = parkingLot1.getSpace((int) '#');
        ParkingSpace parkingSpace8 = parkingLot1.getSpace((int) (byte) 0);
        org.junit.Assert.assertNotNull(parkingSpaceArray2);
        org.junit.Assert.assertNotNull(parkingSpace6);
        org.junit.Assert.assertNotNull(parkingSpace8);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        managementDashboard1.repaint(10, 100, 0, (int) (short) 1);
        boolean boolean12 = managementDashboard1.requestFocusInWindow();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        managementDashboard1.removePropertyChangeListener("ToolTipText", propertyChangeListener14);
        java.awt.event.ContainerListener[] containerListenerArray16 = managementDashboard1.getContainerListeners();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener17 = null;
        managementDashboard1.removeHierarchyBoundsListener(hierarchyBoundsListener17);
        java.awt.AWTKeyStroke[] aWTKeyStrokeArray20 = new java.awt.AWTKeyStroke[] {};
        java.util.LinkedHashSet<java.awt.AWTKeyStroke> aWTKeyStrokeSet21 = new java.util.LinkedHashSet<java.awt.AWTKeyStroke>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.awt.AWTKeyStroke>) aWTKeyStrokeSet21, aWTKeyStrokeArray20);
        // The following exception was thrown during execution in test generation
        try {
            managementDashboard1.setFocusTraversalKeys((int) '4', (java.util.Set<java.awt.AWTKeyStroke>) aWTKeyStrokeSet21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(containerListenerArray16);
        org.junit.Assert.assertArrayEquals(containerListenerArray16, new java.awt.event.ContainerListener[] {});
        org.junit.Assert.assertNotNull(aWTKeyStrokeArray20);
        org.junit.Assert.assertArrayEquals(aWTKeyStrokeArray20, new java.awt.AWTKeyStroke[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.event.ContainerListener containerListener5 = null;
        managementDashboard1.removeContainerListener(containerListener5);
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = managementDashboard1.getFocusTraversalPolicy();
        boolean boolean8 = managementDashboard1.isFocusTraversalPolicySet();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(focusTraversalPolicy7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy4 = null;
        managementDashboard1.setFocusTraversalPolicy(focusTraversalPolicy4);
        java.awt.Event event6 = null;
        boolean boolean9 = managementDashboard1.mouseDrag(event6, (int) (short) 10, 4);
        managementDashboard1.setEnabled(true);
        java.awt.Point point13 = managementDashboard1.getMousePosition(true);
        java.awt.Event event14 = null;
        boolean boolean17 = managementDashboard1.mouseMove(event14, (int) (short) 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(point13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        managementDashboard1.setName("");
        managementDashboard1.doLayout();
        java.awt.event.KeyListener keyListener7 = null;
        managementDashboard1.addKeyListener(keyListener7);
        java.util.function.Consumer<java.lang.String> strConsumer9 = null;
        ManagementDashboard managementDashboard10 = new ManagementDashboard(strConsumer9);
        managementDashboard10.setInheritsPopupMenu(true);
        boolean boolean13 = managementDashboard10.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget14 = null;
        managementDashboard10.setDropTarget(dropTarget14);
        boolean boolean16 = managementDashboard10.getAutoscrolls();
        java.util.function.Consumer<java.lang.String> strConsumer17 = null;
        ManagementDashboard managementDashboard18 = new ManagementDashboard(strConsumer17);
        managementDashboard18.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy21 = null;
        managementDashboard18.setFocusTraversalPolicy(focusTraversalPolicy21);
        java.lang.Object obj23 = managementDashboard10.getClientProperty((java.lang.Object) managementDashboard18);
        java.util.function.Consumer<java.lang.String> strConsumer24 = null;
        ManagementDashboard managementDashboard25 = new ManagementDashboard(strConsumer24);
        managementDashboard25.setRequestFocusEnabled(false);
        java.awt.Event event28 = null;
        boolean boolean30 = managementDashboard25.keyUp(event28, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener31 = null;
        managementDashboard25.addInputMethodListener(inputMethodListener31);
        java.awt.Dimension dimension33 = managementDashboard25.getMaximumSize();
        int int34 = managementDashboard10.getComponentZOrder((java.awt.Component) managementDashboard25);
        javax.swing.KeyStroke keyStroke35 = null;
        int int36 = managementDashboard10.getConditionForKeyStroke(keyStroke35);
        managementDashboard10.transferFocusUpCycle();
        java.awt.image.ImageProducer imageProducer38 = null;
        java.awt.Image image39 = managementDashboard10.createImage(imageProducer38);
        java.util.function.Consumer<java.lang.String> strConsumer40 = null;
        ManagementDashboard managementDashboard41 = new ManagementDashboard(strConsumer40);
        managementDashboard41.setRequestFocusEnabled(false);
        java.awt.Event event44 = null;
        boolean boolean46 = managementDashboard41.keyUp(event44, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener47 = null;
        managementDashboard41.addInputMethodListener(inputMethodListener47);
        java.awt.image.VolatileImage volatileImage51 = managementDashboard41.createVolatileImage((int) (short) 0, 1);
        boolean boolean52 = managementDashboard41.isOptimizedDrawingEnabled();
        javax.swing.ActionMap actionMap53 = managementDashboard41.getActionMap();
        int int54 = managementDashboard1.checkImage(image39, (java.awt.image.ImageObserver) managementDashboard41);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray56 = managementDashboard41.getPropertyChangeListeners("data/userData.csv");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dimension33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(image39);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(volatileImage51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(actionMap53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray56);
        org.junit.Assert.assertArrayEquals(propertyChangeListenerArray56, new java.beans.PropertyChangeListener[] {});
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy4 = null;
        managementDashboard1.setFocusTraversalPolicy(focusTraversalPolicy4);
        java.awt.Event event6 = null;
        boolean boolean9 = managementDashboard1.mouseDrag(event6, (int) (short) 10, 4);
        javax.swing.JPopupMenu jPopupMenu10 = managementDashboard1.getComponentPopupMenu();
        managementDashboard1.setAlignmentY((float) 1L);
        javax.swing.JRootPane jRootPane13 = managementDashboard1.getRootPane();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jPopupMenu10);
        org.junit.Assert.assertNull(jRootPane13);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        int int2 = managementDashboard1.getComponentCount();
        boolean boolean3 = managementDashboard1.isDoubleBuffered();
        java.awt.Event event4 = null;
        // The following exception was thrown during execution in test generation
        try {
            managementDashboard1.deliverEvent(event4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.event.ContainerListener containerListener5 = null;
        managementDashboard1.removeContainerListener(containerListener5);
        boolean boolean7 = managementDashboard1.getIgnoreRepaint();
        int int8 = managementDashboard1.getComponentCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.event.ContainerListener containerListener5 = null;
        managementDashboard1.removeContainerListener(containerListener5);
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = managementDashboard1.getFocusTraversalPolicy();
        managementDashboard1.remove(1);
        managementDashboard1.setVisible(true);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener12 = null;
        managementDashboard1.removeHierarchyBoundsListener(hierarchyBoundsListener12);
        javax.swing.JToolTip jToolTip14 = managementDashboard1.createToolTip();
        boolean boolean15 = managementDashboard1.isOpaque();
        int int16 = managementDashboard1.getX();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(focusTraversalPolicy7);
        org.junit.Assert.assertNotNull(jToolTip14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy4 = null;
        managementDashboard1.setFocusTraversalPolicy(focusTraversalPolicy4);
        java.awt.Event event6 = null;
        boolean boolean9 = managementDashboard1.mouseDrag(event6, (int) (short) 10, 4);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        managementDashboard1.removePropertyChangeListener("hi!", propertyChangeListener11);
        managementDashboard1.revalidate();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.event.ContainerListener containerListener5 = null;
        managementDashboard1.removeContainerListener(containerListener5);
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = managementDashboard1.getFocusTraversalPolicy();
        managementDashboard1.remove(1);
        managementDashboard1.setVisible(true);
        java.awt.Event event12 = null;
        // The following exception was thrown during execution in test generation
        try {
            managementDashboard1.deliverEvent(event12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(focusTraversalPolicy7);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        managementDashboard1.move((int) (byte) 1, (int) '#');
        managementDashboard1.layout();
        boolean boolean8 = managementDashboard1.isFocusCycleRoot();
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray9 = managementDashboard1.getMouseMotionListeners();
        java.util.function.Consumer<java.lang.String> strConsumer10 = null;
        ManagementDashboard managementDashboard11 = new ManagementDashboard(strConsumer10);
        boolean boolean12 = managementDashboard11.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests13 = managementDashboard11.getInputMethodRequests();
        managementDashboard11.move((int) (byte) 1, (int) '#');
        boolean boolean17 = managementDashboard11.isFocusTraversable();
        java.awt.event.FocusListener focusListener18 = null;
        managementDashboard11.removeFocusListener(focusListener18);
        java.awt.event.KeyListener[] keyListenerArray20 = managementDashboard11.getKeyListeners();
        managementDashboard11.requestFocus();
        java.awt.ImageCapabilities imageCapabilities24 = null;
        java.awt.image.VolatileImage volatileImage25 = managementDashboard11.createVolatileImage(32, (int) (byte) 10, imageCapabilities24);
        java.awt.event.ComponentListener componentListener26 = null;
        managementDashboard11.addComponentListener(componentListener26);
        java.util.function.Consumer<java.lang.String> strConsumer28 = null;
        ManagementDashboard managementDashboard29 = new ManagementDashboard(strConsumer28);
        boolean boolean30 = managementDashboard29.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests31 = managementDashboard29.getInputMethodRequests();
        java.awt.Container container32 = managementDashboard29.getTopLevelAncestor();
        java.awt.Color color33 = null;
        managementDashboard29.setForeground(color33);
        java.awt.event.HierarchyListener hierarchyListener35 = null;
        managementDashboard29.addHierarchyListener(hierarchyListener35);
        java.awt.Cursor cursor37 = null;
        managementDashboard29.setCursor(cursor37);
        java.util.function.Consumer<java.lang.String> strConsumer39 = null;
        ManagementDashboard managementDashboard40 = new ManagementDashboard(strConsumer39);
        boolean boolean41 = managementDashboard40.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests42 = managementDashboard40.getInputMethodRequests();
        java.awt.Container container43 = managementDashboard40.getTopLevelAncestor();
        java.awt.Color color44 = null;
        managementDashboard40.setForeground(color44);
        java.awt.event.HierarchyListener hierarchyListener46 = null;
        managementDashboard40.addHierarchyListener(hierarchyListener46);
        java.awt.Cursor cursor48 = null;
        managementDashboard40.setCursor(cursor48);
        java.awt.Point point51 = managementDashboard40.getMousePosition(false);
        java.awt.event.ContainerListener containerListener52 = null;
        managementDashboard40.removeContainerListener(containerListener52);
        java.awt.Color color54 = managementDashboard40.getBackground();
        managementDashboard29.setForeground(color54);
        managementDashboard11.setBackground(color54);
        managementDashboard1.setBackground(color54);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray9);
        org.junit.Assert.assertArrayEquals(mouseMotionListenerArray9, new java.awt.event.MouseMotionListener[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(inputMethodRequests13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(keyListenerArray20);
        org.junit.Assert.assertArrayEquals(keyListenerArray20, new java.awt.event.KeyListener[] {});
        org.junit.Assert.assertNull(volatileImage25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(inputMethodRequests31);
        org.junit.Assert.assertNull(container32);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(inputMethodRequests42);
        org.junit.Assert.assertNull(container43);
        org.junit.Assert.assertNull(point51);
        org.junit.Assert.assertNotNull(color54);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        javax.swing.KeyStroke keyStroke7 = null;
        java.awt.event.ActionListener actionListener8 = managementDashboard1.getActionForKeyStroke(keyStroke7);
        java.util.function.Consumer<java.lang.String> strConsumer9 = null;
        ManagementDashboard managementDashboard10 = new ManagementDashboard(strConsumer9);
        boolean boolean11 = managementDashboard10.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests12 = managementDashboard10.getInputMethodRequests();
        java.awt.Container container13 = managementDashboard10.getTopLevelAncestor();
        java.awt.event.ContainerListener containerListener14 = null;
        managementDashboard10.removeContainerListener(containerListener14);
        int int16 = managementDashboard1.getComponentZOrder((java.awt.Component) managementDashboard10);
        float float17 = managementDashboard10.getAlignmentY();
        java.awt.Point point18 = managementDashboard10.getLocation();
        float float19 = managementDashboard10.getAlignmentX();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(actionListener8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(inputMethodRequests12);
        org.junit.Assert.assertNull(container13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.5f + "'", float17 == 0.5f);
        org.junit.Assert.assertNotNull(point18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.5f + "'", float19 == 0.5f);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.Event event3 = null;
        boolean boolean5 = managementDashboard1.lostFocus(event3, (java.lang.Object) "");
        java.awt.Component[] componentArray6 = managementDashboard1.getComponents();
        java.awt.Dimension dimension7 = managementDashboard1.getMinimumSize();
        managementDashboard1.setVerifyInputWhenFocusTarget(true);
        java.util.function.Consumer<java.lang.String> strConsumer10 = null;
        ManagementDashboard managementDashboard11 = new ManagementDashboard(strConsumer10);
        boolean boolean12 = managementDashboard11.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests13 = managementDashboard11.getInputMethodRequests();
        java.awt.Container container14 = managementDashboard11.getTopLevelAncestor();
        java.awt.event.ContainerListener containerListener15 = null;
        managementDashboard11.removeContainerListener(containerListener15);
        javax.swing.JPopupMenu jPopupMenu17 = null;
        managementDashboard11.setComponentPopupMenu(jPopupMenu17);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener19 = null;
        managementDashboard11.addHierarchyBoundsListener(hierarchyBoundsListener19);
        java.awt.event.KeyListener[] keyListenerArray21 = managementDashboard11.getKeyListeners();
        java.awt.LayoutManager layoutManager22 = managementDashboard11.getLayout();
        managementDashboard1.setLayout(layoutManager22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(componentArray6);
        org.junit.Assert.assertNotNull(dimension7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(inputMethodRequests13);
        org.junit.Assert.assertNull(container14);
        org.junit.Assert.assertNotNull(keyListenerArray21);
        org.junit.Assert.assertArrayEquals(keyListenerArray21, new java.awt.event.KeyListener[] {});
        org.junit.Assert.assertNotNull(layoutManager22);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        java.awt.LayoutManager layoutManager4 = null;
        managementDashboard1.setLayout(layoutManager4);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        managementDashboard1.addPropertyChangeListener("data/managerData.csv", propertyChangeListener7);
        java.util.function.Consumer<java.lang.String> strConsumer9 = null;
        ManagementDashboard managementDashboard10 = new ManagementDashboard(strConsumer9);
        boolean boolean11 = managementDashboard10.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests12 = managementDashboard10.getInputMethodRequests();
        java.awt.Container container13 = managementDashboard10.getTopLevelAncestor();
        java.awt.Color color14 = null;
        managementDashboard10.setForeground(color14);
        managementDashboard10.repaint(10, 100, 0, (int) (short) 1);
        boolean boolean21 = managementDashboard1.isFocusCycleRoot((java.awt.Container) managementDashboard10);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        managementDashboard23.setRequestFocusEnabled(false);
        java.awt.Event event26 = null;
        boolean boolean28 = managementDashboard23.keyUp(event26, (int) (short) 1);
        managementDashboard23.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        managementDashboard23.removePropertyChangeListener("", propertyChangeListener32);
        managementDashboard23.doLayout();
        java.util.function.Consumer<java.lang.String> strConsumer35 = null;
        ManagementDashboard managementDashboard36 = new ManagementDashboard(strConsumer35);
        managementDashboard36.setInheritsPopupMenu(true);
        boolean boolean39 = managementDashboard36.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget40 = null;
        managementDashboard36.setDropTarget(dropTarget40);
        java.awt.Dimension dimension42 = null;
        managementDashboard36.setPreferredSize(dimension42);
        java.awt.Event event44 = null;
        boolean boolean47 = managementDashboard36.mouseExit(event44, (int) 'a', (int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer48 = null;
        ManagementDashboard managementDashboard49 = new ManagementDashboard(strConsumer48);
        boolean boolean50 = managementDashboard49.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests51 = managementDashboard49.getInputMethodRequests();
        java.awt.Container container52 = managementDashboard49.getTopLevelAncestor();
        java.awt.Color color53 = null;
        managementDashboard49.setForeground(color53);
        javax.swing.KeyStroke keyStroke55 = null;
        java.awt.event.ActionListener actionListener56 = managementDashboard49.getActionForKeyStroke(keyStroke55);
        javax.swing.JToolTip jToolTip57 = managementDashboard49.createToolTip();
        java.awt.Event event58 = null;
        java.util.function.Consumer<java.lang.String> strConsumer59 = null;
        ManagementDashboard managementDashboard60 = new ManagementDashboard(strConsumer59);
        managementDashboard60.setInheritsPopupMenu(true);
        boolean boolean63 = managementDashboard60.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget64 = null;
        managementDashboard60.setDropTarget(dropTarget64);
        java.awt.Dimension dimension66 = null;
        managementDashboard60.setPreferredSize(dimension66);
        javax.swing.event.AncestorListener ancestorListener68 = null;
        managementDashboard60.removeAncestorListener(ancestorListener68);
        java.awt.Dimension dimension70 = managementDashboard60.getPreferredSize();
        java.awt.Dimension dimension71 = managementDashboard60.getPreferredSize();
        managementDashboard60.setDebugGraphicsOptions(10);
        boolean boolean74 = jToolTip57.lostFocus(event58, (java.lang.Object) managementDashboard60);
        java.awt.Rectangle rectangle75 = jToolTip57.bounds();
        managementDashboard36.computeVisibleRect(rectangle75);
        managementDashboard23.setMixingCutoutShape((java.awt.Shape) rectangle75);
        javax.swing.JPopupMenu jPopupMenu78 = null;
        managementDashboard23.setComponentPopupMenu(jPopupMenu78);
        java.awt.image.ImageProducer imageProducer80 = null;
        java.awt.Image image81 = managementDashboard23.createImage(imageProducer80);
        java.awt.image.ImageObserver imageObserver84 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean85 = managementDashboard1.prepareImage(image81, (int) '4', 2, imageObserver84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.image.ImageProducer.startProduction(java.awt.image.ImageConsumer)\" because the return value of \"sun.awt.image.ToolkitImage.getSource()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(inputMethodRequests12);
        org.junit.Assert.assertNull(container13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(inputMethodRequests51);
        org.junit.Assert.assertNull(container52);
        org.junit.Assert.assertNull(actionListener56);
        org.junit.Assert.assertNotNull(jToolTip57);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(dimension70);
        org.junit.Assert.assertNotNull(dimension71);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(rectangle75);
        org.junit.Assert.assertNotNull(image81);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        boolean boolean4 = managementDashboard1.isValidateRoot();
        java.awt.LayoutManager layoutManager5 = null;
        managementDashboard1.setLayout(layoutManager5);
        boolean boolean7 = managementDashboard1.getFocusTraversalKeysEnabled();
        java.awt.Event event8 = null;
        boolean boolean11 = managementDashboard1.mouseEnter(event8, (int) (byte) 0, 0);
        java.awt.event.MouseEvent mouseEvent12 = null;
        java.awt.Point point13 = managementDashboard1.getPopupLocation(mouseEvent12);
        managementDashboard1.transferFocusUpCycle();
        java.awt.Point point15 = managementDashboard1.location();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(point13);
        org.junit.Assert.assertNotNull(point15);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        managementDashboard5.setInheritsPopupMenu(true);
        boolean boolean8 = managementDashboard5.isValidateRoot();
        int int9 = managementDashboard1.getComponentZOrder((java.awt.Component) managementDashboard5);
        java.awt.event.ContainerListener containerListener10 = null;
        managementDashboard5.addContainerListener(containerListener10);
        managementDashboard5.transferFocusBackward();
        managementDashboard5.setName("data/managerData.csv");
        java.awt.AWTKeyStroke[] aWTKeyStrokeArray16 = new java.awt.AWTKeyStroke[] {};
        java.util.LinkedHashSet<java.awt.AWTKeyStroke> aWTKeyStrokeSet17 = new java.util.LinkedHashSet<java.awt.AWTKeyStroke>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.awt.AWTKeyStroke>) aWTKeyStrokeSet17, aWTKeyStrokeArray16);
        // The following exception was thrown during execution in test generation
        try {
            managementDashboard5.setFocusTraversalKeys(32, (java.util.Set<java.awt.AWTKeyStroke>) aWTKeyStrokeSet17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(aWTKeyStrokeArray16);
        org.junit.Assert.assertArrayEquals(aWTKeyStrokeArray16, new java.awt.AWTKeyStroke[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        javax.swing.KeyStroke keyStroke7 = null;
        java.awt.event.ActionListener actionListener8 = managementDashboard1.getActionForKeyStroke(keyStroke7);
        java.util.function.Consumer<java.lang.String> strConsumer9 = null;
        ManagementDashboard managementDashboard10 = new ManagementDashboard(strConsumer9);
        boolean boolean11 = managementDashboard10.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests12 = managementDashboard10.getInputMethodRequests();
        java.awt.Container container13 = managementDashboard10.getTopLevelAncestor();
        java.awt.event.ContainerListener containerListener14 = null;
        managementDashboard10.removeContainerListener(containerListener14);
        int int16 = managementDashboard1.getComponentZOrder((java.awt.Component) managementDashboard10);
        float float17 = managementDashboard10.getAlignmentY();
        java.awt.Point point18 = managementDashboard10.getLocation();
        java.awt.event.MouseWheelListener mouseWheelListener19 = null;
        managementDashboard10.removeMouseWheelListener(mouseWheelListener19);
        managementDashboard10.enable();
        java.util.function.Consumer<java.lang.String> strConsumer23 = null;
        ManagementDashboard managementDashboard24 = new ManagementDashboard(strConsumer23);
        boolean boolean25 = managementDashboard24.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests26 = managementDashboard24.getInputMethodRequests();
        java.awt.Container container27 = managementDashboard24.getTopLevelAncestor();
        java.awt.Color color28 = null;
        managementDashboard24.setForeground(color28);
        javax.swing.KeyStroke keyStroke30 = null;
        java.awt.event.ActionListener actionListener31 = managementDashboard24.getActionForKeyStroke(keyStroke30);
        javax.swing.JToolTip jToolTip32 = managementDashboard24.createToolTip();
        java.awt.Event event33 = null;
        java.util.function.Consumer<java.lang.String> strConsumer34 = null;
        ManagementDashboard managementDashboard35 = new ManagementDashboard(strConsumer34);
        managementDashboard35.setInheritsPopupMenu(true);
        boolean boolean38 = managementDashboard35.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget39 = null;
        managementDashboard35.setDropTarget(dropTarget39);
        java.awt.Dimension dimension41 = null;
        managementDashboard35.setPreferredSize(dimension41);
        javax.swing.event.AncestorListener ancestorListener43 = null;
        managementDashboard35.removeAncestorListener(ancestorListener43);
        java.awt.Dimension dimension45 = managementDashboard35.getPreferredSize();
        java.awt.Dimension dimension46 = managementDashboard35.getPreferredSize();
        managementDashboard35.setDebugGraphicsOptions(10);
        boolean boolean49 = jToolTip32.lostFocus(event33, (java.lang.Object) managementDashboard35);
        boolean boolean50 = managementDashboard35.isOpaque();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component51 = managementDashboard10.add("ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", (java.awt.Component) managementDashboard35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cannot add to layout: unknown constraint: ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(actionListener8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(inputMethodRequests12);
        org.junit.Assert.assertNull(container13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.5f + "'", float17 == 0.5f);
        org.junit.Assert.assertNotNull(point18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(inputMethodRequests26);
        org.junit.Assert.assertNull(container27);
        org.junit.Assert.assertNull(actionListener31);
        org.junit.Assert.assertNotNull(jToolTip32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(dimension45);
        org.junit.Assert.assertNotNull(dimension46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.event.MouseMotionListener mouseMotionListener2 = null;
        managementDashboard1.addMouseMotionListener(mouseMotionListener2);
        java.awt.Component component5 = managementDashboard1.getComponent(0);
        java.awt.Color color6 = component5.getForeground();
        org.junit.Assert.assertNotNull(component5);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        java.awt.event.InputMethodListener[] inputMethodListenerArray7 = managementDashboard1.getInputMethodListeners();
        boolean boolean10 = managementDashboard1.contains((int) (short) 1, 0);
        boolean boolean11 = managementDashboard1.isPaintingForPrint();
        boolean boolean12 = managementDashboard1.isRequestFocusEnabled();
        java.awt.Point point13 = managementDashboard1.location();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(inputMethodListenerArray7);
        org.junit.Assert.assertArrayEquals(inputMethodListenerArray7, new java.awt.event.InputMethodListener[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(point13);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        boolean boolean4 = managementDashboard1.isValidateRoot();
        java.awt.LayoutManager layoutManager5 = null;
        managementDashboard1.setLayout(layoutManager5);
        boolean boolean7 = managementDashboard1.getFocusTraversalKeysEnabled();
        managementDashboard1.removeNotify();
        javax.swing.JPopupMenu jPopupMenu9 = managementDashboard1.getComponentPopupMenu();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(jPopupMenu9);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        javax.swing.KeyStroke keyStroke7 = null;
        java.awt.event.ActionListener actionListener8 = managementDashboard1.getActionForKeyStroke(keyStroke7);
        javax.swing.JToolTip jToolTip9 = managementDashboard1.createToolTip();
        java.util.function.Consumer<java.lang.String> strConsumer10 = null;
        ManagementDashboard managementDashboard11 = new ManagementDashboard(strConsumer10);
        managementDashboard11.setRequestFocusEnabled(false);
        java.awt.Event event14 = null;
        boolean boolean16 = managementDashboard11.keyUp(event14, (int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer17 = null;
        ManagementDashboard managementDashboard18 = new ManagementDashboard(strConsumer17);
        managementDashboard18.setRequestFocusEnabled(false);
        java.awt.Event event21 = null;
        boolean boolean23 = managementDashboard18.keyUp(event21, (int) (short) 1);
        managementDashboard18.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        managementDashboard18.removePropertyChangeListener("", propertyChangeListener27);
        java.awt.Dimension dimension29 = managementDashboard18.getPreferredSize();
        managementDashboard11.setSize(dimension29);
        managementDashboard1.setMinimumSize(dimension29);
        java.awt.Event event32 = null;
        java.util.function.Consumer<java.lang.String> strConsumer33 = null;
        ManagementDashboard managementDashboard34 = new ManagementDashboard(strConsumer33);
        managementDashboard34.setRequestFocusEnabled(false);
        java.awt.Event event37 = null;
        boolean boolean39 = managementDashboard34.keyUp(event37, (int) (short) 1);
        managementDashboard34.setAutoscrolls(true);
        java.awt.event.HierarchyListener[] hierarchyListenerArray42 = managementDashboard34.getHierarchyListeners();
        java.awt.event.KeyListener keyListener43 = null;
        managementDashboard34.addKeyListener(keyListener43);
        boolean boolean45 = managementDashboard1.action(event32, (java.lang.Object) managementDashboard34);
        java.util.function.Consumer<java.lang.String> strConsumer46 = null;
        ManagementDashboard managementDashboard47 = new ManagementDashboard(strConsumer46);
        managementDashboard47.setInheritsPopupMenu(true);
        boolean boolean50 = managementDashboard47.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget51 = null;
        managementDashboard47.setDropTarget(dropTarget51);
        java.awt.Dimension dimension53 = null;
        managementDashboard47.setPreferredSize(dimension53);
        javax.swing.event.AncestorListener ancestorListener55 = null;
        managementDashboard47.removeAncestorListener(ancestorListener55);
        java.util.function.Consumer<java.lang.String> strConsumer57 = null;
        ManagementDashboard managementDashboard58 = new ManagementDashboard(strConsumer57);
        managementDashboard58.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy61 = null;
        managementDashboard58.setFocusTraversalPolicy(focusTraversalPolicy61);
        java.awt.Event event63 = null;
        boolean boolean66 = managementDashboard58.mouseDrag(event63, (int) (short) 10, 4);
        managementDashboard58.setEnabled(true);
        java.awt.Component component69 = managementDashboard47.add((java.awt.Component) managementDashboard58);
        java.util.function.Consumer<java.lang.String> strConsumer70 = null;
        ManagementDashboard managementDashboard71 = new ManagementDashboard(strConsumer70);
        managementDashboard71.setInheritsPopupMenu(true);
        boolean boolean74 = managementDashboard71.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget75 = null;
        managementDashboard71.setDropTarget(dropTarget75);
        java.awt.Dimension dimension77 = null;
        managementDashboard71.setPreferredSize(dimension77);
        javax.swing.event.AncestorListener ancestorListener79 = null;
        managementDashboard71.removeAncestorListener(ancestorListener79);
        java.awt.Dimension dimension81 = managementDashboard71.getPreferredSize();
        managementDashboard58.resize(dimension81);
        managementDashboard34.setNextFocusableComponent((java.awt.Component) managementDashboard58);
        boolean boolean86 = managementDashboard34.contains(0, 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(actionListener8);
        org.junit.Assert.assertNotNull(jToolTip9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dimension29);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(hierarchyListenerArray42);
        org.junit.Assert.assertArrayEquals(hierarchyListenerArray42, new java.awt.event.HierarchyListener[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(component69);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(dimension81);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        javax.swing.KeyStroke keyStroke7 = null;
        java.awt.event.ActionListener actionListener8 = managementDashboard1.getActionForKeyStroke(keyStroke7);
        javax.swing.JToolTip jToolTip9 = managementDashboard1.createToolTip();
        java.util.function.Consumer<java.lang.String> strConsumer10 = null;
        ManagementDashboard managementDashboard11 = new ManagementDashboard(strConsumer10);
        managementDashboard11.setInheritsPopupMenu(true);
        managementDashboard11.setName("");
        managementDashboard11.doLayout();
        java.awt.event.KeyListener keyListener17 = null;
        managementDashboard11.addKeyListener(keyListener17);
        java.util.function.Consumer<java.lang.String> strConsumer19 = null;
        ManagementDashboard managementDashboard20 = new ManagementDashboard(strConsumer19);
        managementDashboard20.setInheritsPopupMenu(true);
        boolean boolean23 = managementDashboard20.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget24 = null;
        managementDashboard20.setDropTarget(dropTarget24);
        boolean boolean26 = managementDashboard20.getAutoscrolls();
        java.util.function.Consumer<java.lang.String> strConsumer27 = null;
        ManagementDashboard managementDashboard28 = new ManagementDashboard(strConsumer27);
        managementDashboard28.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy31 = null;
        managementDashboard28.setFocusTraversalPolicy(focusTraversalPolicy31);
        java.lang.Object obj33 = managementDashboard20.getClientProperty((java.lang.Object) managementDashboard28);
        java.util.function.Consumer<java.lang.String> strConsumer34 = null;
        ManagementDashboard managementDashboard35 = new ManagementDashboard(strConsumer34);
        managementDashboard35.setRequestFocusEnabled(false);
        java.awt.Event event38 = null;
        boolean boolean40 = managementDashboard35.keyUp(event38, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener41 = null;
        managementDashboard35.addInputMethodListener(inputMethodListener41);
        java.awt.Dimension dimension43 = managementDashboard35.getMaximumSize();
        int int44 = managementDashboard20.getComponentZOrder((java.awt.Component) managementDashboard35);
        javax.swing.KeyStroke keyStroke45 = null;
        int int46 = managementDashboard20.getConditionForKeyStroke(keyStroke45);
        managementDashboard20.transferFocusUpCycle();
        java.awt.image.ImageProducer imageProducer48 = null;
        java.awt.Image image49 = managementDashboard20.createImage(imageProducer48);
        java.util.function.Consumer<java.lang.String> strConsumer50 = null;
        ManagementDashboard managementDashboard51 = new ManagementDashboard(strConsumer50);
        managementDashboard51.setRequestFocusEnabled(false);
        java.awt.Event event54 = null;
        boolean boolean56 = managementDashboard51.keyUp(event54, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener57 = null;
        managementDashboard51.addInputMethodListener(inputMethodListener57);
        java.awt.image.VolatileImage volatileImage61 = managementDashboard51.createVolatileImage((int) (short) 0, 1);
        boolean boolean62 = managementDashboard51.isOptimizedDrawingEnabled();
        javax.swing.ActionMap actionMap63 = managementDashboard51.getActionMap();
        int int64 = managementDashboard11.checkImage(image49, (java.awt.image.ImageObserver) managementDashboard51);
        java.util.function.Consumer<java.lang.String> strConsumer65 = null;
        ManagementDashboard managementDashboard66 = new ManagementDashboard(strConsumer65);
        managementDashboard66.setRequestFocusEnabled(false);
        java.awt.Event event69 = null;
        boolean boolean71 = managementDashboard66.keyUp(event69, (int) (short) 1);
        managementDashboard66.list();
        javax.swing.plaf.PanelUI panelUI73 = managementDashboard66.getUI();
        javax.swing.border.Border border74 = null;
        managementDashboard66.setBorder(border74);
        int int76 = jToolTip9.checkImage(image49, (java.awt.image.ImageObserver) managementDashboard66);
        boolean boolean77 = jToolTip9.isPaintingForPrint();
        boolean boolean80 = jToolTip9.contains((int) (short) 0, (int) (short) 10);
        java.awt.dnd.DropTarget dropTarget81 = null;
        jToolTip9.setDropTarget(dropTarget81);
        java.awt.event.MouseListener mouseListener83 = null;
        jToolTip9.addMouseListener(mouseListener83);
        jToolTip9.setFocusTraversalKeysEnabled(true);
        jToolTip9.setFocusable(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(actionListener8);
        org.junit.Assert.assertNotNull(jToolTip9);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(dimension43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(image49);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(volatileImage61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(actionMap63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(panelUI73);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        managementDashboard1.enable();
        managementDashboard1.list();
        java.awt.Point point6 = managementDashboard1.location();
        managementDashboard1.removeAll();
        java.awt.Rectangle rectangle8 = managementDashboard1.getBounds();
        org.junit.Assert.assertNotNull(point6);
        org.junit.Assert.assertNotNull(rectangle8);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy4 = null;
        managementDashboard1.setFocusTraversalPolicy(focusTraversalPolicy4);
        javax.swing.JToolTip jToolTip6 = managementDashboard1.createToolTip();
        boolean boolean7 = managementDashboard1.isManagingFocus();
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        boolean boolean10 = managementDashboard9.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests11 = managementDashboard9.getInputMethodRequests();
        java.awt.Container container12 = managementDashboard9.getTopLevelAncestor();
        java.awt.Color color13 = null;
        managementDashboard9.setForeground(color13);
        javax.swing.KeyStroke keyStroke15 = null;
        java.awt.event.ActionListener actionListener16 = managementDashboard9.getActionForKeyStroke(keyStroke15);
        java.util.function.Consumer<java.lang.String> strConsumer17 = null;
        ManagementDashboard managementDashboard18 = new ManagementDashboard(strConsumer17);
        boolean boolean19 = managementDashboard18.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests20 = managementDashboard18.getInputMethodRequests();
        java.awt.Container container21 = managementDashboard18.getTopLevelAncestor();
        java.awt.event.ContainerListener containerListener22 = null;
        managementDashboard18.removeContainerListener(containerListener22);
        int int24 = managementDashboard9.getComponentZOrder((java.awt.Component) managementDashboard18);
        java.awt.Rectangle rectangle25 = managementDashboard9.getBounds();
        managementDashboard1.repaint(rectangle25);
        org.junit.Assert.assertNotNull(jToolTip6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(inputMethodRequests11);
        org.junit.Assert.assertNull(container12);
        org.junit.Assert.assertNull(actionListener16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(inputMethodRequests20);
        org.junit.Assert.assertNull(container21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(rectangle25);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Component component4 = managementDashboard1.getNextFocusableComponent();
        boolean boolean5 = managementDashboard1.isManagingFocus();
        javax.swing.plaf.PanelUI panelUI6 = managementDashboard1.getUI();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(component4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(panelUI6);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        managementDashboard1.list();
        javax.swing.plaf.PanelUI panelUI8 = managementDashboard1.getUI();
        java.awt.image.ColorModel colorModel9 = managementDashboard1.getColorModel();
        managementDashboard1.setVisible(true);
        boolean boolean12 = managementDashboard1.isLightweight();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(panelUI8);
        org.junit.Assert.assertNotNull(colorModel9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        managementDashboard1.repaint(10, 100, 0, (int) (short) 1);
        boolean boolean12 = managementDashboard1.requestFocusInWindow();
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        managementDashboard14.setRequestFocusEnabled(false);
        java.awt.Event event17 = null;
        boolean boolean19 = managementDashboard14.keyUp(event17, (int) (short) 1);
        managementDashboard14.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        managementDashboard14.removePropertyChangeListener("", propertyChangeListener23);
        managementDashboard14.doLayout();
        javax.swing.JPopupMenu jPopupMenu26 = managementDashboard14.getComponentPopupMenu();
        java.awt.Component component28 = managementDashboard1.add((java.awt.Component) managementDashboard14, 1);
        java.util.function.Consumer<java.lang.String> strConsumer29 = null;
        ManagementDashboard managementDashboard30 = new ManagementDashboard(strConsumer29);
        managementDashboard30.setRequestFocusEnabled(false);
        java.awt.Event event33 = null;
        boolean boolean35 = managementDashboard30.keyUp(event33, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener36 = null;
        managementDashboard30.addInputMethodListener(inputMethodListener36);
        java.awt.Dimension dimension38 = managementDashboard30.getMaximumSize();
        managementDashboard14.setPreferredSize(dimension38);
        managementDashboard14.firePropertyChange("data/managerData.csv", ' ', ' ');
        java.util.function.Consumer<java.lang.String> strConsumer44 = null;
        ManagementDashboard managementDashboard45 = new ManagementDashboard(strConsumer44);
        managementDashboard45.setRequestFocusEnabled(false);
        java.awt.Event event48 = null;
        boolean boolean50 = managementDashboard45.keyUp(event48, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener51 = null;
        managementDashboard45.addInputMethodListener(inputMethodListener51);
        java.awt.image.VolatileImage volatileImage55 = managementDashboard45.createVolatileImage((int) (short) 0, 1);
        boolean boolean56 = managementDashboard45.isOptimizedDrawingEnabled();
        javax.swing.ActionMap actionMap57 = managementDashboard45.getActionMap();
        managementDashboard14.setActionMap(actionMap57);
        boolean boolean59 = managementDashboard14.getFocusTraversalKeysEnabled();
        java.awt.Event event60 = null;
        java.util.function.Consumer<java.lang.String> strConsumer61 = null;
        ManagementDashboard managementDashboard62 = new ManagementDashboard(strConsumer61);
        managementDashboard62.setInheritsPopupMenu(true);
        boolean boolean65 = managementDashboard62.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget66 = null;
        managementDashboard62.setDropTarget(dropTarget66);
        java.awt.event.ComponentListener componentListener68 = null;
        managementDashboard62.removeComponentListener(componentListener68);
        managementDashboard62.nextFocus();
        boolean boolean71 = managementDashboard62.isFontSet();
        boolean boolean72 = managementDashboard14.lostFocus(event60, (java.lang.Object) boolean71);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(jPopupMenu26);
        org.junit.Assert.assertNotNull(component28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dimension38);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(volatileImage55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(actionMap57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        managementDashboard1.setAutoscrolls(true);
        int int9 = managementDashboard1.getDebugGraphicsOptions();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener10 = null;
        managementDashboard1.removeHierarchyBoundsListener(hierarchyBoundsListener10);
        boolean boolean12 = managementDashboard1.getVerifyInputWhenFocusTarget();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        javax.swing.KeyStroke keyStroke7 = null;
        java.awt.event.ActionListener actionListener8 = managementDashboard1.getActionForKeyStroke(keyStroke7);
        javax.swing.JToolTip jToolTip9 = managementDashboard1.createToolTip();
        java.util.function.Consumer<java.lang.String> strConsumer10 = null;
        ManagementDashboard managementDashboard11 = new ManagementDashboard(strConsumer10);
        managementDashboard11.setInheritsPopupMenu(true);
        managementDashboard11.setName("");
        managementDashboard11.doLayout();
        java.awt.event.KeyListener keyListener17 = null;
        managementDashboard11.addKeyListener(keyListener17);
        java.util.function.Consumer<java.lang.String> strConsumer19 = null;
        ManagementDashboard managementDashboard20 = new ManagementDashboard(strConsumer19);
        managementDashboard20.setInheritsPopupMenu(true);
        boolean boolean23 = managementDashboard20.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget24 = null;
        managementDashboard20.setDropTarget(dropTarget24);
        boolean boolean26 = managementDashboard20.getAutoscrolls();
        java.util.function.Consumer<java.lang.String> strConsumer27 = null;
        ManagementDashboard managementDashboard28 = new ManagementDashboard(strConsumer27);
        managementDashboard28.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy31 = null;
        managementDashboard28.setFocusTraversalPolicy(focusTraversalPolicy31);
        java.lang.Object obj33 = managementDashboard20.getClientProperty((java.lang.Object) managementDashboard28);
        java.util.function.Consumer<java.lang.String> strConsumer34 = null;
        ManagementDashboard managementDashboard35 = new ManagementDashboard(strConsumer34);
        managementDashboard35.setRequestFocusEnabled(false);
        java.awt.Event event38 = null;
        boolean boolean40 = managementDashboard35.keyUp(event38, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener41 = null;
        managementDashboard35.addInputMethodListener(inputMethodListener41);
        java.awt.Dimension dimension43 = managementDashboard35.getMaximumSize();
        int int44 = managementDashboard20.getComponentZOrder((java.awt.Component) managementDashboard35);
        javax.swing.KeyStroke keyStroke45 = null;
        int int46 = managementDashboard20.getConditionForKeyStroke(keyStroke45);
        managementDashboard20.transferFocusUpCycle();
        java.awt.image.ImageProducer imageProducer48 = null;
        java.awt.Image image49 = managementDashboard20.createImage(imageProducer48);
        java.util.function.Consumer<java.lang.String> strConsumer50 = null;
        ManagementDashboard managementDashboard51 = new ManagementDashboard(strConsumer50);
        managementDashboard51.setRequestFocusEnabled(false);
        java.awt.Event event54 = null;
        boolean boolean56 = managementDashboard51.keyUp(event54, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener57 = null;
        managementDashboard51.addInputMethodListener(inputMethodListener57);
        java.awt.image.VolatileImage volatileImage61 = managementDashboard51.createVolatileImage((int) (short) 0, 1);
        boolean boolean62 = managementDashboard51.isOptimizedDrawingEnabled();
        javax.swing.ActionMap actionMap63 = managementDashboard51.getActionMap();
        int int64 = managementDashboard11.checkImage(image49, (java.awt.image.ImageObserver) managementDashboard51);
        java.util.function.Consumer<java.lang.String> strConsumer65 = null;
        ManagementDashboard managementDashboard66 = new ManagementDashboard(strConsumer65);
        managementDashboard66.setRequestFocusEnabled(false);
        java.awt.Event event69 = null;
        boolean boolean71 = managementDashboard66.keyUp(event69, (int) (short) 1);
        managementDashboard66.list();
        javax.swing.plaf.PanelUI panelUI73 = managementDashboard66.getUI();
        javax.swing.border.Border border74 = null;
        managementDashboard66.setBorder(border74);
        int int76 = jToolTip9.checkImage(image49, (java.awt.image.ImageObserver) managementDashboard66);
        boolean boolean77 = jToolTip9.isPaintingForPrint();
        boolean boolean80 = jToolTip9.contains((int) (short) 0, (int) (short) 10);
        java.awt.dnd.DropTarget dropTarget81 = null;
        jToolTip9.setDropTarget(dropTarget81);
        java.awt.event.MouseListener mouseListener83 = null;
        jToolTip9.addMouseListener(mouseListener83);
        java.awt.Graphics graphics85 = null;
        jToolTip9.printComponents(graphics85);
        java.awt.Dimension dimension87 = jToolTip9.preferredSize();
        java.awt.Event event88 = null;
        // The following exception was thrown during execution in test generation
        try {
            jToolTip9.deliverEvent(event88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(actionListener8);
        org.junit.Assert.assertNotNull(jToolTip9);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(dimension43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(image49);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(volatileImage61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(actionMap63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(panelUI73);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(dimension87);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        managementDashboard1.move((int) (byte) 1, (int) '#');
        managementDashboard1.layout();
        managementDashboard1.setEnabled(false);
        java.awt.Image image10 = null;
        boolean boolean16 = managementDashboard1.imageUpdate(image10, 2, 10, (int) (byte) 0, 10, (int) (byte) 0);
        boolean boolean18 = managementDashboard1.requestFocus(false);
        java.awt.event.ComponentListener componentListener19 = null;
        managementDashboard1.removeComponentListener(componentListener19);
        java.awt.Graphics graphics21 = null;
        managementDashboard1.paintComponents(graphics21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        javax.swing.KeyStroke keyStroke7 = null;
        java.awt.event.ActionListener actionListener8 = managementDashboard1.getActionForKeyStroke(keyStroke7);
        javax.swing.JToolTip jToolTip9 = managementDashboard1.createToolTip();
        java.awt.Event event10 = null;
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        ManagementDashboard managementDashboard12 = new ManagementDashboard(strConsumer11);
        managementDashboard12.setInheritsPopupMenu(true);
        boolean boolean15 = managementDashboard12.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget16 = null;
        managementDashboard12.setDropTarget(dropTarget16);
        java.awt.Dimension dimension18 = null;
        managementDashboard12.setPreferredSize(dimension18);
        javax.swing.event.AncestorListener ancestorListener20 = null;
        managementDashboard12.removeAncestorListener(ancestorListener20);
        java.awt.Dimension dimension22 = managementDashboard12.getPreferredSize();
        java.awt.Dimension dimension23 = managementDashboard12.getPreferredSize();
        managementDashboard12.setDebugGraphicsOptions(10);
        boolean boolean26 = jToolTip9.lostFocus(event10, (java.lang.Object) managementDashboard12);
        jToolTip9.layout();
        java.lang.String str28 = jToolTip9.getName();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener29 = null;
        jToolTip9.addHierarchyBoundsListener(hierarchyBoundsListener29);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(actionListener8);
        org.junit.Assert.assertNotNull(jToolTip9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dimension22);
        org.junit.Assert.assertNotNull(dimension23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        boolean boolean4 = managementDashboard1.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget5 = null;
        managementDashboard1.setDropTarget(dropTarget5);
        java.awt.event.ComponentListener componentListener7 = null;
        managementDashboard1.removeComponentListener(componentListener7);
        managementDashboard1.nextFocus();
        boolean boolean10 = managementDashboard1.isFontSet();
        java.awt.Rectangle rectangle11 = managementDashboard1.getVisibleRect();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(rectangle11);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        managementDashboard1.setAutoscrolls(true);
        java.awt.event.HierarchyListener[] hierarchyListenerArray9 = managementDashboard1.getHierarchyListeners();
        java.awt.event.KeyListener keyListener10 = null;
        managementDashboard1.addKeyListener(keyListener10);
        java.awt.Cursor cursor12 = managementDashboard1.getCursor();
        boolean boolean13 = managementDashboard1.requestDefaultFocus();
        managementDashboard1.requestFocus();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(hierarchyListenerArray9);
        org.junit.Assert.assertArrayEquals(hierarchyListenerArray9, new java.awt.event.HierarchyListener[] {});
        org.junit.Assert.assertNotNull(cursor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.Event event3 = null;
        boolean boolean5 = managementDashboard1.lostFocus(event3, (java.lang.Object) "");
        java.awt.Component[] componentArray6 = managementDashboard1.getComponents();
        java.lang.Object obj7 = managementDashboard1.getTreeLock();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(componentArray6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        boolean boolean4 = managementDashboard1.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget5 = null;
        managementDashboard1.setDropTarget(dropTarget5);
        java.awt.Dimension dimension7 = null;
        managementDashboard1.setPreferredSize(dimension7);
        managementDashboard1.addNotify();
        managementDashboard1.removeNotify();
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        ManagementDashboard managementDashboard12 = new ManagementDashboard(strConsumer11);
        managementDashboard12.setRequestFocusEnabled(false);
        java.awt.Event event15 = null;
        boolean boolean17 = managementDashboard12.keyUp(event15, (int) (short) 1);
        managementDashboard12.list();
        javax.swing.plaf.PanelUI panelUI19 = managementDashboard12.getUI();
        javax.swing.border.Border border20 = null;
        managementDashboard12.setBorder(border20);
        java.util.Locale locale22 = managementDashboard12.getLocale();
        managementDashboard1.setLocale(locale22);
        java.awt.ImageCapabilities imageCapabilities26 = null;
        java.awt.image.VolatileImage volatileImage27 = managementDashboard1.createVolatileImage(1, 4, imageCapabilities26);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(panelUI19);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_CA");
        org.junit.Assert.assertNull(volatileImage27);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy4 = null;
        managementDashboard1.setFocusTraversalPolicy(focusTraversalPolicy4);
        java.awt.event.ComponentListener componentListener6 = null;
        managementDashboard1.removeComponentListener(componentListener6);
        boolean boolean8 = managementDashboard1.isOptimizedDrawingEnabled();
        java.io.PrintStream printStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            managementDashboard1.list(printStream9, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.print(String)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        managementDashboard5.setInheritsPopupMenu(true);
        boolean boolean8 = managementDashboard5.isValidateRoot();
        int int9 = managementDashboard1.getComponentZOrder((java.awt.Component) managementDashboard5);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        managementDashboard5.addPropertyChangeListener("hi!", propertyChangeListener11);
        boolean boolean13 = managementDashboard5.isPreferredSizeSet();
        managementDashboard5.setToolTipText("");
        java.awt.event.InputMethodListener inputMethodListener16 = null;
        managementDashboard5.removeInputMethodListener(inputMethodListener16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        managementDashboard19.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy22 = null;
        managementDashboard19.setFocusTraversalPolicy(focusTraversalPolicy22);
        java.awt.Event event24 = null;
        boolean boolean27 = managementDashboard19.mouseDrag(event24, (int) (short) 10, 4);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        managementDashboard19.removePropertyChangeListener("hi!", propertyChangeListener29);
        boolean boolean31 = managementDashboard19.isMaximumSizeSet();
        java.awt.Font font32 = managementDashboard19.getFont();
        java.awt.FontMetrics fontMetrics33 = managementDashboard5.getFontMetrics(font32);
        javax.swing.TransferHandler transferHandler34 = managementDashboard5.getTransferHandler();
        int int37 = managementDashboard5.getBaseline((int) '4', 10);
        java.awt.event.HierarchyListener hierarchyListener38 = null;
        managementDashboard5.removeHierarchyListener(hierarchyListener38);
        java.awt.event.MouseMotionListener mouseMotionListener40 = null;
        managementDashboard5.addMouseMotionListener(mouseMotionListener40);
        managementDashboard5.transferFocus();
        java.awt.event.KeyListener keyListener43 = null;
        managementDashboard5.addKeyListener(keyListener43);
        managementDashboard5.list();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(font32);
        org.junit.Assert.assertNotNull(fontMetrics33);
        org.junit.Assert.assertNull(transferHandler34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.Event event3 = null;
        boolean boolean5 = managementDashboard1.lostFocus(event3, (java.lang.Object) "");
        managementDashboard1.setAutoscrolls(false);
        java.lang.String str8 = managementDashboard1.getName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        javax.swing.KeyStroke keyStroke7 = null;
        java.awt.event.ActionListener actionListener8 = managementDashboard1.getActionForKeyStroke(keyStroke7);
        java.util.function.Consumer<java.lang.String> strConsumer9 = null;
        ManagementDashboard managementDashboard10 = new ManagementDashboard(strConsumer9);
        boolean boolean11 = managementDashboard10.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests12 = managementDashboard10.getInputMethodRequests();
        java.awt.Container container13 = managementDashboard10.getTopLevelAncestor();
        java.awt.event.ContainerListener containerListener14 = null;
        managementDashboard10.removeContainerListener(containerListener14);
        int int16 = managementDashboard1.getComponentZOrder((java.awt.Component) managementDashboard10);
        float float17 = managementDashboard10.getAlignmentY();
        managementDashboard10.reshape((int) (short) -1, 0, (int) '4', 1);
        java.awt.event.InputMethodListener inputMethodListener23 = null;
        managementDashboard10.removeInputMethodListener(inputMethodListener23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(actionListener8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(inputMethodRequests12);
        org.junit.Assert.assertNull(container13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.5f + "'", float17 == 0.5f);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        managementDashboard5.setInheritsPopupMenu(true);
        boolean boolean8 = managementDashboard5.isValidateRoot();
        int int9 = managementDashboard1.getComponentZOrder((java.awt.Component) managementDashboard5);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        managementDashboard5.addPropertyChangeListener("hi!", propertyChangeListener11);
        boolean boolean13 = managementDashboard5.isPreferredSizeSet();
        managementDashboard5.setToolTipText("");
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        managementDashboard5.addPropertyChangeListener("hi!", propertyChangeListener17);
        java.awt.Insets insets19 = null;
        java.awt.Insets insets20 = managementDashboard5.getInsets(insets19);
        managementDashboard5.validate();
        managementDashboard5.firePropertyChange("123456789", (byte) 10, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(insets20);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        boolean boolean4 = managementDashboard1.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget5 = null;
        managementDashboard1.setDropTarget(dropTarget5);
        java.awt.Dimension dimension7 = null;
        managementDashboard1.setPreferredSize(dimension7);
        java.awt.Component[] componentArray9 = managementDashboard1.getComponents();
        java.util.function.Consumer<java.lang.String> strConsumer10 = null;
        ManagementDashboard managementDashboard11 = new ManagementDashboard(strConsumer10);
        managementDashboard11.setInheritsPopupMenu(true);
        boolean boolean14 = managementDashboard11.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget15 = null;
        managementDashboard11.setDropTarget(dropTarget15);
        boolean boolean17 = managementDashboard11.getAutoscrolls();
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        managementDashboard19.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy22 = null;
        managementDashboard19.setFocusTraversalPolicy(focusTraversalPolicy22);
        java.lang.Object obj24 = managementDashboard11.getClientProperty((java.lang.Object) managementDashboard19);
        java.util.function.Consumer<java.lang.String> strConsumer25 = null;
        ManagementDashboard managementDashboard26 = new ManagementDashboard(strConsumer25);
        managementDashboard26.setRequestFocusEnabled(false);
        java.awt.Event event29 = null;
        boolean boolean31 = managementDashboard26.keyUp(event29, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener32 = null;
        managementDashboard26.addInputMethodListener(inputMethodListener32);
        java.awt.Dimension dimension34 = managementDashboard26.getMaximumSize();
        int int35 = managementDashboard11.getComponentZOrder((java.awt.Component) managementDashboard26);
        javax.swing.KeyStroke keyStroke36 = null;
        int int37 = managementDashboard11.getConditionForKeyStroke(keyStroke36);
        managementDashboard11.transferFocusUpCycle();
        java.awt.image.ImageProducer imageProducer39 = null;
        java.awt.Image image40 = managementDashboard11.createImage(imageProducer39);
        java.awt.image.ImageObserver imageObserver41 = null;
        int int42 = managementDashboard1.checkImage(image40, imageObserver41);
        managementDashboard1.paintImmediately(0, (int) (byte) 1, (int) 'a', 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(componentArray9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(dimension34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(image40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.event.ComponentListener componentListener4 = null;
        managementDashboard1.removeComponentListener(componentListener4);
        managementDashboard1.repaint();
        managementDashboard1.disable();
        java.awt.Dimension dimension8 = managementDashboard1.size();
        java.awt.Component component9 = managementDashboard1.getNextFocusableComponent();
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNull(component9);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        java.awt.LayoutManager layoutManager4 = null;
        managementDashboard1.setLayout(layoutManager4);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        managementDashboard1.addPropertyChangeListener("data/managerData.csv", propertyChangeListener7);
        java.util.function.Consumer<java.lang.String> strConsumer9 = null;
        ManagementDashboard managementDashboard10 = new ManagementDashboard(strConsumer9);
        boolean boolean11 = managementDashboard10.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests12 = managementDashboard10.getInputMethodRequests();
        java.awt.Container container13 = managementDashboard10.getTopLevelAncestor();
        java.awt.Color color14 = null;
        managementDashboard10.setForeground(color14);
        managementDashboard10.repaint(10, 100, 0, (int) (short) 1);
        boolean boolean21 = managementDashboard1.isFocusCycleRoot((java.awt.Container) managementDashboard10);
        boolean boolean22 = managementDashboard10.isFocusTraversable();
        managementDashboard10.grabFocus();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(inputMethodRequests12);
        org.junit.Assert.assertNull(container13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        managementDashboard5.setInheritsPopupMenu(true);
        boolean boolean8 = managementDashboard5.isValidateRoot();
        int int9 = managementDashboard1.getComponentZOrder((java.awt.Component) managementDashboard5);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        managementDashboard5.addPropertyChangeListener("hi!", propertyChangeListener11);
        boolean boolean13 = managementDashboard5.isPreferredSizeSet();
        managementDashboard5.setToolTipText("");
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        managementDashboard5.addPropertyChangeListener("hi!", propertyChangeListener17);
        managementDashboard5.repaint((long) (-1));
        java.awt.event.ComponentListener componentListener21 = null;
        managementDashboard5.addComponentListener(componentListener21);
        java.lang.String str23 = managementDashboard5.toString();
        java.awt.Insets insets24 = null;
        java.awt.Insets insets25 = managementDashboard5.getInsets(insets24);
        java.awt.Dimension dimension26 = managementDashboard5.minimumSize();
        managementDashboard5.setDebugGraphicsOptions(128);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=8388617,maximumSize=,minimumSize=,preferredSize=]" + "'", str23, "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=8388617,maximumSize=,minimumSize=,preferredSize=]");
        org.junit.Assert.assertNotNull(insets25);
        org.junit.Assert.assertNotNull(dimension26);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        managementDashboard5.setInheritsPopupMenu(true);
        boolean boolean8 = managementDashboard5.isValidateRoot();
        int int9 = managementDashboard1.getComponentZOrder((java.awt.Component) managementDashboard5);
        java.awt.event.ContainerListener containerListener10 = null;
        managementDashboard5.addContainerListener(containerListener10);
        managementDashboard5.transferFocusBackward();
        int int13 = managementDashboard5.getDebugGraphicsOptions();
        managementDashboard5.move((int) (short) 10, (int) (byte) 10);
        managementDashboard5.reshape((int) '#', (-1), 10, (int) ' ');
        java.awt.GraphicsConfiguration graphicsConfiguration22 = managementDashboard5.getGraphicsConfiguration();
        boolean boolean23 = managementDashboard5.isFontSet();
        java.util.function.Consumer<java.lang.String> strConsumer24 = null;
        ManagementDashboard managementDashboard25 = new ManagementDashboard(strConsumer24);
        managementDashboard25.setRequestFocusEnabled(false);
        java.awt.Event event28 = null;
        boolean boolean30 = managementDashboard25.keyUp(event28, (int) (short) 1);
        managementDashboard25.list();
        javax.swing.plaf.PanelUI panelUI32 = managementDashboard25.getUI();
        java.awt.image.ColorModel colorModel33 = managementDashboard25.getColorModel();
        java.util.function.Consumer<java.lang.String> strConsumer34 = null;
        ManagementDashboard managementDashboard35 = new ManagementDashboard(strConsumer34);
        boolean boolean36 = managementDashboard35.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests37 = managementDashboard35.getInputMethodRequests();
        java.awt.Container container38 = managementDashboard35.getTopLevelAncestor();
        java.awt.Color color39 = null;
        managementDashboard35.setForeground(color39);
        managementDashboard35.repaint(10, 100, 0, (int) (short) 1);
        boolean boolean46 = managementDashboard35.requestFocusInWindow();
        java.util.function.Consumer<java.lang.String> strConsumer47 = null;
        ManagementDashboard managementDashboard48 = new ManagementDashboard(strConsumer47);
        managementDashboard48.setRequestFocusEnabled(false);
        java.awt.Event event51 = null;
        boolean boolean53 = managementDashboard48.keyUp(event51, (int) (short) 1);
        managementDashboard48.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener57 = null;
        managementDashboard48.removePropertyChangeListener("", propertyChangeListener57);
        managementDashboard48.doLayout();
        javax.swing.JPopupMenu jPopupMenu60 = managementDashboard48.getComponentPopupMenu();
        java.awt.Component component62 = managementDashboard35.add((java.awt.Component) managementDashboard48, 1);
        java.util.function.Consumer<java.lang.String> strConsumer63 = null;
        ManagementDashboard managementDashboard64 = new ManagementDashboard(strConsumer63);
        managementDashboard64.setRequestFocusEnabled(false);
        java.awt.Event event67 = null;
        boolean boolean69 = managementDashboard64.keyUp(event67, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener70 = null;
        managementDashboard64.addInputMethodListener(inputMethodListener70);
        java.awt.Dimension dimension72 = managementDashboard64.getMaximumSize();
        managementDashboard48.setPreferredSize(dimension72);
        managementDashboard25.setMaximumSize(dimension72);
        managementDashboard5.setMinimumSize(dimension72);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(graphicsConfiguration22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(panelUI32);
        org.junit.Assert.assertNotNull(colorModel33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(inputMethodRequests37);
        org.junit.Assert.assertNull(container38);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(jPopupMenu60);
        org.junit.Assert.assertNotNull(component62);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(dimension72);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        boolean boolean4 = managementDashboard1.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget5 = null;
        managementDashboard1.setDropTarget(dropTarget5);
        java.awt.event.ComponentListener componentListener7 = null;
        managementDashboard1.removeComponentListener(componentListener7);
        managementDashboard1.nextFocus();
        boolean boolean10 = managementDashboard1.isFontSet();
        java.awt.AWTKeyStroke[] aWTKeyStrokeArray12 = new java.awt.AWTKeyStroke[] {};
        java.util.LinkedHashSet<java.awt.AWTKeyStroke> aWTKeyStrokeSet13 = new java.util.LinkedHashSet<java.awt.AWTKeyStroke>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.awt.AWTKeyStroke>) aWTKeyStrokeSet13, aWTKeyStrokeArray12);
        // The following exception was thrown during execution in test generation
        try {
            managementDashboard1.setFocusTraversalKeys((int) '4', (java.util.Set<java.awt.AWTKeyStroke>) aWTKeyStrokeSet13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(aWTKeyStrokeArray12);
        org.junit.Assert.assertArrayEquals(aWTKeyStrokeArray12, new java.awt.AWTKeyStroke[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        java.awt.event.HierarchyListener hierarchyListener7 = null;
        managementDashboard1.addHierarchyListener(hierarchyListener7);
        java.awt.Cursor cursor9 = null;
        managementDashboard1.setCursor(cursor9);
        java.awt.Point point12 = managementDashboard1.getMousePosition(false);
        managementDashboard1.resize(100, 64);
        java.util.function.Consumer<java.lang.String> strConsumer16 = null;
        ManagementDashboard managementDashboard17 = new ManagementDashboard(strConsumer16);
        boolean boolean18 = managementDashboard17.isCursorSet();
        java.awt.Event event19 = null;
        boolean boolean21 = managementDashboard17.lostFocus(event19, (java.lang.Object) "");
        managementDashboard17.setAutoscrolls(false);
        java.awt.Graphics graphics24 = null;
        managementDashboard17.update(graphics24);
        java.util.function.Consumer<java.lang.String> strConsumer26 = null;
        ManagementDashboard managementDashboard27 = new ManagementDashboard(strConsumer26);
        managementDashboard27.setInheritsPopupMenu(true);
        boolean boolean30 = managementDashboard27.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget31 = null;
        managementDashboard27.setDropTarget(dropTarget31);
        boolean boolean33 = managementDashboard27.getAutoscrolls();
        java.util.function.Consumer<java.lang.String> strConsumer34 = null;
        ManagementDashboard managementDashboard35 = new ManagementDashboard(strConsumer34);
        managementDashboard35.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy38 = null;
        managementDashboard35.setFocusTraversalPolicy(focusTraversalPolicy38);
        java.lang.Object obj40 = managementDashboard27.getClientProperty((java.lang.Object) managementDashboard35);
        java.util.function.Consumer<java.lang.String> strConsumer41 = null;
        ManagementDashboard managementDashboard42 = new ManagementDashboard(strConsumer41);
        managementDashboard42.setRequestFocusEnabled(false);
        java.awt.Event event45 = null;
        boolean boolean47 = managementDashboard42.keyUp(event45, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener48 = null;
        managementDashboard42.addInputMethodListener(inputMethodListener48);
        java.awt.Dimension dimension50 = managementDashboard42.getMaximumSize();
        int int51 = managementDashboard27.getComponentZOrder((java.awt.Component) managementDashboard42);
        javax.swing.KeyStroke keyStroke52 = null;
        int int53 = managementDashboard27.getConditionForKeyStroke(keyStroke52);
        managementDashboard27.transferFocusUpCycle();
        java.awt.image.ImageProducer imageProducer55 = null;
        java.awt.Image image56 = managementDashboard27.createImage(imageProducer55);
        boolean boolean62 = managementDashboard17.imageUpdate(image56, (int) (byte) 10, (int) (short) 10, 4, (int) (short) 0, 2);
        java.util.function.Consumer<java.lang.String> strConsumer63 = null;
        ManagementDashboard managementDashboard64 = new ManagementDashboard(strConsumer63);
        managementDashboard64.setRequestFocusEnabled(false);
        java.awt.Event event67 = null;
        boolean boolean69 = managementDashboard64.keyUp(event67, (int) (short) 1);
        managementDashboard64.list();
        javax.swing.plaf.PanelUI panelUI71 = managementDashboard64.getUI();
        java.awt.image.ColorModel colorModel72 = managementDashboard64.getColorModel();
        boolean boolean73 = managementDashboard64.hasFocus();
        javax.swing.KeyStroke keyStroke74 = null;
        int int75 = managementDashboard64.getConditionForKeyStroke(keyStroke74);
        managementDashboard64.reshape((int) (byte) 1, 4, 10, 0);
        int int81 = managementDashboard1.checkImage(image56, (java.awt.image.ImageObserver) managementDashboard64);
        managementDashboard1.layout();
        java.awt.Font font83 = managementDashboard1.getFont();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(point12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(dimension50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(image56);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(panelUI71);
        org.junit.Assert.assertNotNull(colorModel72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(font83);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        managementDashboard1.setAutoscrolls(true);
        int int9 = managementDashboard1.getDebugGraphicsOptions();
        boolean boolean10 = managementDashboard1.isMaximumSizeSet();
        managementDashboard1.nextFocus();
        java.util.function.Consumer<java.lang.String> strConsumer12 = null;
        ManagementDashboard managementDashboard13 = new ManagementDashboard(strConsumer12);
        managementDashboard13.setRequestFocusEnabled(false);
        managementDashboard13.enable();
        java.util.function.Consumer<java.lang.String> strConsumer17 = null;
        ManagementDashboard managementDashboard18 = new ManagementDashboard(strConsumer17);
        managementDashboard18.setInheritsPopupMenu(true);
        boolean boolean21 = managementDashboard18.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget22 = null;
        managementDashboard18.setDropTarget(dropTarget22);
        boolean boolean24 = managementDashboard18.getAutoscrolls();
        java.util.function.Consumer<java.lang.String> strConsumer25 = null;
        ManagementDashboard managementDashboard26 = new ManagementDashboard(strConsumer25);
        managementDashboard26.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy29 = null;
        managementDashboard26.setFocusTraversalPolicy(focusTraversalPolicy29);
        java.lang.Object obj31 = managementDashboard18.getClientProperty((java.lang.Object) managementDashboard26);
        java.awt.LayoutManager layoutManager32 = managementDashboard26.getLayout();
        managementDashboard26.setAlignmentX((float) 0);
        managementDashboard1.putClientProperty((java.lang.Object) managementDashboard13, (java.lang.Object) 0);
        java.awt.event.FocusListener[] focusListenerArray36 = managementDashboard1.getFocusListeners();
        java.awt.ComponentOrientation componentOrientation37 = managementDashboard1.getComponentOrientation();
        boolean boolean38 = managementDashboard1.isLightweight();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(layoutManager32);
        org.junit.Assert.assertNotNull(focusListenerArray36);
        org.junit.Assert.assertArrayEquals(focusListenerArray36, new java.awt.event.FocusListener[] {});
        org.junit.Assert.assertNotNull(componentOrientation37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        javax.swing.KeyStroke keyStroke7 = null;
        java.awt.event.ActionListener actionListener8 = managementDashboard1.getActionForKeyStroke(keyStroke7);
        javax.swing.JToolTip jToolTip9 = managementDashboard1.createToolTip();
        java.awt.FocusTraversalPolicy focusTraversalPolicy10 = managementDashboard1.getFocusTraversalPolicy();
        java.awt.event.MouseMotionListener mouseMotionListener11 = null;
        managementDashboard1.addMouseMotionListener(mouseMotionListener11);
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        managementDashboard14.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy17 = null;
        managementDashboard14.setFocusTraversalPolicy(focusTraversalPolicy17);
        java.awt.Event event19 = null;
        boolean boolean22 = managementDashboard14.mouseDrag(event19, (int) (short) 10, 4);
        managementDashboard14.setEnabled(true);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior25 = managementDashboard14.getBaselineResizeBehavior();
        java.util.function.Consumer<java.lang.String> strConsumer26 = null;
        ManagementDashboard managementDashboard27 = new ManagementDashboard(strConsumer26);
        managementDashboard27.setInheritsPopupMenu(true);
        boolean boolean30 = managementDashboard27.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget31 = null;
        managementDashboard27.setDropTarget(dropTarget31);
        boolean boolean33 = managementDashboard27.getAutoscrolls();
        java.util.function.Consumer<java.lang.String> strConsumer34 = null;
        ManagementDashboard managementDashboard35 = new ManagementDashboard(strConsumer34);
        managementDashboard35.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy38 = null;
        managementDashboard35.setFocusTraversalPolicy(focusTraversalPolicy38);
        java.lang.Object obj40 = managementDashboard27.getClientProperty((java.lang.Object) managementDashboard35);
        java.util.function.Consumer<java.lang.String> strConsumer41 = null;
        ManagementDashboard managementDashboard42 = new ManagementDashboard(strConsumer41);
        managementDashboard42.setRequestFocusEnabled(false);
        java.awt.Event event45 = null;
        boolean boolean47 = managementDashboard42.keyUp(event45, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener48 = null;
        managementDashboard42.addInputMethodListener(inputMethodListener48);
        java.awt.Dimension dimension50 = managementDashboard42.getMaximumSize();
        int int51 = managementDashboard27.getComponentZOrder((java.awt.Component) managementDashboard42);
        java.awt.Component component53 = managementDashboard27.getComponent(1);
        boolean boolean54 = managementDashboard14.isAncestorOf((java.awt.Component) managementDashboard27);
        javax.swing.event.AncestorListener[] ancestorListenerArray55 = managementDashboard14.getAncestorListeners();
        java.util.function.Consumer<java.lang.String> strConsumer56 = null;
        ManagementDashboard managementDashboard57 = new ManagementDashboard(strConsumer56);
        managementDashboard57.setInheritsPopupMenu(true);
        boolean boolean60 = managementDashboard57.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget61 = null;
        managementDashboard57.setDropTarget(dropTarget61);
        java.awt.Dimension dimension63 = null;
        managementDashboard57.setPreferredSize(dimension63);
        javax.swing.event.AncestorListener ancestorListener65 = null;
        managementDashboard57.removeAncestorListener(ancestorListener65);
        java.util.function.Consumer<java.lang.String> strConsumer67 = null;
        ManagementDashboard managementDashboard68 = new ManagementDashboard(strConsumer67);
        managementDashboard68.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy71 = null;
        managementDashboard68.setFocusTraversalPolicy(focusTraversalPolicy71);
        java.awt.Event event73 = null;
        boolean boolean76 = managementDashboard68.mouseDrag(event73, (int) (short) 10, 4);
        managementDashboard68.setEnabled(true);
        java.awt.Component component79 = managementDashboard57.add((java.awt.Component) managementDashboard68);
        managementDashboard1.putClientProperty((java.lang.Object) managementDashboard14, (java.lang.Object) managementDashboard68);
        java.awt.Color color81 = managementDashboard68.getBackground();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(actionListener8);
        org.junit.Assert.assertNotNull(jToolTip9);
        org.junit.Assert.assertNull(focusTraversalPolicy10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior25 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior25.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(dimension50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(component53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(ancestorListenerArray55);
        org.junit.Assert.assertArrayEquals(ancestorListenerArray55, new javax.swing.event.AncestorListener[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(component79);
        org.junit.Assert.assertNotNull(color81);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        managementDashboard1.list();
        java.beans.VetoableChangeListener vetoableChangeListener8 = null;
        managementDashboard1.addVetoableChangeListener(vetoableChangeListener8);
        java.awt.Graphics graphics10 = null;
        managementDashboard1.printComponents(graphics10);
        managementDashboard1.transferFocusBackward();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        UserDashboard userDashboard1 = new UserDashboard(strConsumer0);
        userDashboard1.transferFocusDownCycle();
        javax.swing.event.AncestorListener ancestorListener3 = null;
        userDashboard1.addAncestorListener(ancestorListener3);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        javax.swing.KeyStroke keyStroke7 = null;
        java.awt.event.ActionListener actionListener8 = managementDashboard1.getActionForKeyStroke(keyStroke7);
        javax.swing.JToolTip jToolTip9 = managementDashboard1.createToolTip();
        java.util.function.Consumer<java.lang.String> strConsumer10 = null;
        ManagementDashboard managementDashboard11 = new ManagementDashboard(strConsumer10);
        boolean boolean12 = managementDashboard11.isCursorSet();
        java.awt.Event event13 = null;
        boolean boolean15 = managementDashboard11.lostFocus(event13, (java.lang.Object) "");
        java.util.function.Consumer<java.lang.String> strConsumer16 = null;
        ManagementDashboard managementDashboard17 = new ManagementDashboard(strConsumer16);
        managementDashboard17.setRequestFocusEnabled(false);
        java.awt.Event event20 = null;
        boolean boolean22 = managementDashboard17.keyUp(event20, (int) (short) 1);
        managementDashboard17.setAutoscrolls(true);
        java.awt.event.HierarchyListener[] hierarchyListenerArray25 = managementDashboard17.getHierarchyListeners();
        jToolTip9.add((java.awt.Component) managementDashboard11, (java.lang.Object) hierarchyListenerArray25);
        boolean boolean27 = jToolTip9.requestDefaultFocus();
        jToolTip9.disable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(actionListener8);
        org.junit.Assert.assertNotNull(jToolTip9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(hierarchyListenerArray25);
        org.junit.Assert.assertArrayEquals(hierarchyListenerArray25, new java.awt.event.HierarchyListener[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer7 = null;
        ManagementDashboard managementDashboard8 = new ManagementDashboard(strConsumer7);
        managementDashboard8.setRequestFocusEnabled(false);
        java.awt.Event event11 = null;
        boolean boolean13 = managementDashboard8.keyUp(event11, (int) (short) 1);
        managementDashboard8.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        managementDashboard8.removePropertyChangeListener("", propertyChangeListener17);
        java.awt.Dimension dimension19 = managementDashboard8.getPreferredSize();
        managementDashboard1.setSize(dimension19);
        managementDashboard1.setRequestFocusEnabled(true);
        java.awt.Font font23 = null;
        managementDashboard1.setFont(font23);
        java.awt.image.VolatileImage volatileImage27 = managementDashboard1.createVolatileImage((int) (byte) 10, (int) (byte) -1);
        java.awt.GraphicsConfiguration graphicsConfiguration28 = managementDashboard1.getGraphicsConfiguration();
        java.awt.event.FocusEvent.Cause cause29 = null;
        boolean boolean30 = managementDashboard1.requestFocusInWindow(cause29);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dimension19);
        org.junit.Assert.assertNull(volatileImage27);
        org.junit.Assert.assertNull(graphicsConfiguration28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        managementDashboard5.setInheritsPopupMenu(true);
        boolean boolean8 = managementDashboard5.isValidateRoot();
        int int9 = managementDashboard1.getComponentZOrder((java.awt.Component) managementDashboard5);
        java.awt.event.ContainerListener containerListener10 = null;
        managementDashboard5.addContainerListener(containerListener10);
        managementDashboard5.transferFocusBackward();
        java.awt.image.VolatileImage volatileImage15 = managementDashboard5.createVolatileImage((int) (short) 0, 1);
        java.awt.image.VolatileImage volatileImage18 = managementDashboard5.createVolatileImage(0, 10);
        int int19 = managementDashboard5.getComponentCount();
        managementDashboard5.move((int) (byte) -1, (int) (byte) 10);
        java.awt.event.MouseMotionListener mouseMotionListener23 = null;
        managementDashboard5.removeMouseMotionListener(mouseMotionListener23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(volatileImage15);
        org.junit.Assert.assertNull(volatileImage18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        javax.swing.KeyStroke keyStroke7 = null;
        java.awt.event.ActionListener actionListener8 = managementDashboard1.getActionForKeyStroke(keyStroke7);
        javax.swing.JToolTip jToolTip9 = managementDashboard1.createToolTip();
        java.awt.Event event10 = null;
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        ManagementDashboard managementDashboard12 = new ManagementDashboard(strConsumer11);
        managementDashboard12.setInheritsPopupMenu(true);
        boolean boolean15 = managementDashboard12.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget16 = null;
        managementDashboard12.setDropTarget(dropTarget16);
        java.awt.Dimension dimension18 = null;
        managementDashboard12.setPreferredSize(dimension18);
        javax.swing.event.AncestorListener ancestorListener20 = null;
        managementDashboard12.removeAncestorListener(ancestorListener20);
        java.awt.Dimension dimension22 = managementDashboard12.getPreferredSize();
        java.awt.Dimension dimension23 = managementDashboard12.getPreferredSize();
        managementDashboard12.setDebugGraphicsOptions(10);
        boolean boolean26 = jToolTip9.lostFocus(event10, (java.lang.Object) managementDashboard12);
        boolean boolean27 = managementDashboard12.isOpaque();
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        managementDashboard12.addPropertyChangeListener("ToolTipText", propertyChangeListener29);
        java.awt.Component[] componentArray31 = managementDashboard12.getComponents();
        java.awt.Font font32 = null;
        managementDashboard12.setFont(font32);
        javax.swing.plaf.PanelUI panelUI34 = managementDashboard12.getUI();
        boolean boolean35 = managementDashboard12.isRequestFocusEnabled();
        java.util.function.Consumer<java.lang.String> strConsumer37 = null;
        ManagementDashboard managementDashboard38 = new ManagementDashboard(strConsumer37);
        managementDashboard38.setRequestFocusEnabled(false);
        java.awt.Event event41 = null;
        boolean boolean43 = managementDashboard38.keyUp(event41, (int) (short) 1);
        managementDashboard38.setAutoscrolls(true);
        boolean boolean46 = managementDashboard38.isRequestFocusEnabled();
        javax.swing.InputMap inputMap48 = managementDashboard38.getInputMap((int) (short) 1);
        managementDashboard12.setInputMap(1, inputMap48);
        managementDashboard12.addNotify();
        java.lang.String str51 = managementDashboard12.getName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(actionListener8);
        org.junit.Assert.assertNotNull(jToolTip9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dimension22);
        org.junit.Assert.assertNotNull(dimension23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(componentArray31);
        org.junit.Assert.assertNotNull(panelUI34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(inputMap48);
        org.junit.Assert.assertNull(str51);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        javax.swing.KeyStroke keyStroke7 = null;
        java.awt.event.ActionListener actionListener8 = managementDashboard1.getActionForKeyStroke(keyStroke7);
        javax.swing.JToolTip jToolTip9 = managementDashboard1.createToolTip();
        java.util.function.Consumer<java.lang.String> strConsumer10 = null;
        ManagementDashboard managementDashboard11 = new ManagementDashboard(strConsumer10);
        managementDashboard11.setRequestFocusEnabled(false);
        java.awt.Event event14 = null;
        boolean boolean16 = managementDashboard11.keyUp(event14, (int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer17 = null;
        ManagementDashboard managementDashboard18 = new ManagementDashboard(strConsumer17);
        managementDashboard18.setRequestFocusEnabled(false);
        java.awt.Event event21 = null;
        boolean boolean23 = managementDashboard18.keyUp(event21, (int) (short) 1);
        managementDashboard18.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        managementDashboard18.removePropertyChangeListener("", propertyChangeListener27);
        java.awt.Dimension dimension29 = managementDashboard18.getPreferredSize();
        managementDashboard11.setSize(dimension29);
        managementDashboard1.setMinimumSize(dimension29);
        java.util.function.Consumer<java.lang.String> strConsumer32 = null;
        ManagementDashboard managementDashboard33 = new ManagementDashboard(strConsumer32);
        managementDashboard33.setRequestFocusEnabled(false);
        java.awt.Event event36 = null;
        boolean boolean38 = managementDashboard33.keyUp(event36, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener39 = null;
        managementDashboard33.addInputMethodListener(inputMethodListener39);
        boolean boolean41 = managementDashboard33.isValidateRoot();
        boolean boolean42 = managementDashboard1.isFocusCycleRoot((java.awt.Container) managementDashboard33);
        java.awt.Container container43 = managementDashboard1.getTopLevelAncestor();
        managementDashboard1.setAlignmentX(0.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(actionListener8);
        org.junit.Assert.assertNotNull(jToolTip9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dimension29);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(container43);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        managementDashboard5.setInheritsPopupMenu(true);
        boolean boolean8 = managementDashboard5.isValidateRoot();
        int int9 = managementDashboard1.getComponentZOrder((java.awt.Component) managementDashboard5);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        managementDashboard5.addPropertyChangeListener("hi!", propertyChangeListener11);
        boolean boolean13 = managementDashboard5.isPreferredSizeSet();
        managementDashboard5.setToolTipText("");
        boolean boolean18 = managementDashboard5.inside((int) (byte) 100, (int) (short) 0);
        managementDashboard5.move((int) (short) -1, 16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        boolean boolean4 = managementDashboard1.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget5 = null;
        managementDashboard1.setDropTarget(dropTarget5);
        boolean boolean7 = managementDashboard1.getAutoscrolls();
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        managementDashboard9.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        managementDashboard9.setFocusTraversalPolicy(focusTraversalPolicy12);
        java.lang.Object obj14 = managementDashboard1.getClientProperty((java.lang.Object) managementDashboard9);
        java.awt.Graphics graphics15 = null;
        managementDashboard1.printComponents(graphics15);
        java.awt.event.HierarchyListener hierarchyListener17 = null;
        managementDashboard1.addHierarchyListener(hierarchyListener17);
        java.awt.Component component21 = managementDashboard1.findComponentAt((int) (byte) -1, (int) (short) -1);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        managementDashboard23.setRequestFocusEnabled(false);
        java.awt.Event event26 = null;
        boolean boolean28 = managementDashboard23.keyUp(event26, (int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer29 = null;
        ManagementDashboard managementDashboard30 = new ManagementDashboard(strConsumer29);
        managementDashboard30.setRequestFocusEnabled(false);
        java.awt.Event event33 = null;
        boolean boolean35 = managementDashboard30.keyUp(event33, (int) (short) 1);
        managementDashboard30.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        managementDashboard30.removePropertyChangeListener("", propertyChangeListener39);
        java.awt.Dimension dimension41 = managementDashboard30.getPreferredSize();
        managementDashboard23.setSize(dimension41);
        java.util.function.Consumer<java.lang.String> strConsumer43 = null;
        ManagementDashboard managementDashboard44 = new ManagementDashboard(strConsumer43);
        managementDashboard44.setInheritsPopupMenu(true);
        boolean boolean47 = managementDashboard44.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget48 = null;
        managementDashboard44.setDropTarget(dropTarget48);
        boolean boolean50 = managementDashboard44.getAutoscrolls();
        java.awt.event.KeyListener[] keyListenerArray51 = managementDashboard44.getKeyListeners();
        managementDashboard44.firePropertyChange("ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=4194313,maximumSize=,minimumSize=,preferredSize=]", (byte) 0, (byte) -1);
        javax.swing.plaf.PanelUI panelUI56 = managementDashboard44.getUI();
        managementDashboard23.setUI(panelUI56);
        managementDashboard1.setUI(panelUI56);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(component21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dimension41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(keyListenerArray51);
        org.junit.Assert.assertArrayEquals(keyListenerArray51, new java.awt.event.KeyListener[] {});
        org.junit.Assert.assertNotNull(panelUI56);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener7 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener7);
        managementDashboard1.move((int) (byte) 0, 8);
        java.awt.Event event12 = null;
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        boolean boolean15 = managementDashboard14.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests16 = managementDashboard14.getInputMethodRequests();
        java.awt.Container container17 = managementDashboard14.getTopLevelAncestor();
        boolean boolean18 = managementDashboard1.gotFocus(event12, (java.lang.Object) container17);
        managementDashboard1.hide();
        boolean boolean20 = managementDashboard1.isFocusTraversable();
        boolean boolean21 = managementDashboard1.getInheritsPopupMenu();
        java.awt.Graphics graphics22 = null;
        managementDashboard1.paint(graphics22);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputMethodRequests16);
        org.junit.Assert.assertNull(container17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        ParkingLot parkingLot1 = new ParkingLot("data/userData.csv");
        ParkingSpace parkingSpace3 = parkingLot1.getSpace((int) (byte) 10);
        parkingLot1.setEnabled(false);
        boolean boolean6 = parkingLot1.getEnabled();
        ParkingSpace[] parkingSpaceArray7 = parkingLot1.getSpaces();
        ParkingSpace parkingSpace9 = parkingLot1.getSpace(8);
        java.lang.String str10 = parkingSpace9.getCurrentUser();
        org.junit.Assert.assertNotNull(parkingSpace3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(parkingSpaceArray7);
        org.junit.Assert.assertNotNull(parkingSpace9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty" + "'", str10, "Empty");
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        managementDashboard5.setInheritsPopupMenu(true);
        boolean boolean8 = managementDashboard5.isValidateRoot();
        int int9 = managementDashboard1.getComponentZOrder((java.awt.Component) managementDashboard5);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        managementDashboard5.addPropertyChangeListener("hi!", propertyChangeListener11);
        boolean boolean13 = managementDashboard5.isPreferredSizeSet();
        managementDashboard5.setToolTipText("");
        java.awt.event.InputMethodListener inputMethodListener16 = null;
        managementDashboard5.removeInputMethodListener(inputMethodListener16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        managementDashboard19.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy22 = null;
        managementDashboard19.setFocusTraversalPolicy(focusTraversalPolicy22);
        java.awt.Event event24 = null;
        boolean boolean27 = managementDashboard19.mouseDrag(event24, (int) (short) 10, 4);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        managementDashboard19.removePropertyChangeListener("hi!", propertyChangeListener29);
        boolean boolean31 = managementDashboard19.isMaximumSizeSet();
        java.awt.Font font32 = managementDashboard19.getFont();
        java.awt.FontMetrics fontMetrics33 = managementDashboard5.getFontMetrics(font32);
        javax.swing.TransferHandler transferHandler34 = managementDashboard5.getTransferHandler();
        java.awt.im.InputMethodRequests inputMethodRequests35 = managementDashboard5.getInputMethodRequests();
        java.awt.event.MouseMotionListener mouseMotionListener36 = null;
        managementDashboard5.removeMouseMotionListener(mouseMotionListener36);
        java.awt.Graphics graphics38 = managementDashboard5.getGraphics();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(font32);
        org.junit.Assert.assertNotNull(fontMetrics33);
        org.junit.Assert.assertNull(transferHandler34);
        org.junit.Assert.assertNull(inputMethodRequests35);
        org.junit.Assert.assertNull(graphics38);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        ParkingLot parkingLot1 = new ParkingLot("data/userData.csv");
        ParkingSpace parkingSpace3 = parkingLot1.getSpace((int) (byte) 10);
        parkingLot1.removeBooking(128);
        boolean boolean6 = parkingLot1.getEnabled();
        parkingLot1.removeBooking((int) (short) 10);
        ParkingSpace parkingSpace10 = parkingLot1.getSpace(4);
        org.junit.Assert.assertNotNull(parkingSpace3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(parkingSpace10);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener7 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener7);
        managementDashboard1.move((int) (byte) 0, 8);
        java.awt.Event event12 = null;
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        boolean boolean15 = managementDashboard14.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests16 = managementDashboard14.getInputMethodRequests();
        java.awt.Container container17 = managementDashboard14.getTopLevelAncestor();
        boolean boolean18 = managementDashboard1.gotFocus(event12, (java.lang.Object) container17);
        managementDashboard1.hide();
        java.awt.Container container20 = managementDashboard1.getTopLevelAncestor();
        managementDashboard1.setSize((int) 'a', (int) (short) -1);
        java.awt.FocusTraversalPolicy focusTraversalPolicy24 = null;
        managementDashboard1.setFocusTraversalPolicy(focusTraversalPolicy24);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        managementDashboard1.addPropertyChangeListener("ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", propertyChangeListener27);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputMethodRequests16);
        org.junit.Assert.assertNull(container17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(container20);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.event.ComponentListener componentListener4 = null;
        managementDashboard1.removeComponentListener(componentListener4);
        managementDashboard1.repaint();
        managementDashboard1.disable();
        boolean boolean8 = managementDashboard1.isOptimizedDrawingEnabled();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        managementDashboard1.setAutoscrolls(true);
        int int9 = managementDashboard1.getDebugGraphicsOptions();
        boolean boolean10 = managementDashboard1.isMaximumSizeSet();
        managementDashboard1.nextFocus();
        boolean boolean12 = managementDashboard1.isFocusTraversalPolicySet();
        java.awt.event.ComponentListener componentListener13 = null;
        managementDashboard1.removeComponentListener(componentListener13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        SuperManager superManager0 = new SuperManager();
        java.lang.String str1 = superManager0.getPassword();
        java.lang.String str2 = superManager0.getUsername();
        MainSystem.currentManager = superManager0;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "123456789" + "'", str1, "123456789");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SUPERMAN" + "'", str2, "SUPERMAN");
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        managementDashboard5.setInheritsPopupMenu(true);
        boolean boolean8 = managementDashboard5.isValidateRoot();
        int int9 = managementDashboard1.getComponentZOrder((java.awt.Component) managementDashboard5);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        managementDashboard5.addPropertyChangeListener("hi!", propertyChangeListener11);
        boolean boolean13 = managementDashboard5.isPreferredSizeSet();
        managementDashboard5.setToolTipText("");
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        managementDashboard5.addPropertyChangeListener("hi!", propertyChangeListener17);
        java.awt.Insets insets19 = null;
        java.awt.Insets insets20 = managementDashboard5.getInsets(insets19);
        MobilePayment mobilePayment21 = new MobilePayment();
        java.lang.Object obj22 = managementDashboard5.getClientProperty((java.lang.Object) mobilePayment21);
        PaymentProcessor paymentProcessor23 = new PaymentProcessor((PaymentStrategy) mobilePayment21);
        mobilePayment21.pay((double) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(insets20);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener7 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener7);
        boolean boolean9 = managementDashboard1.isValidateRoot();
        java.awt.Graphics graphics10 = null;
        managementDashboard1.paint(graphics10);
        managementDashboard1.updateUI();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.Event event3 = null;
        boolean boolean5 = managementDashboard1.lostFocus(event3, (java.lang.Object) "");
        managementDashboard1.setAutoscrolls(false);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        managementDashboard9.setRequestFocusEnabled(false);
        java.awt.Event event12 = null;
        boolean boolean14 = managementDashboard9.keyUp(event12, (int) (short) 1);
        managementDashboard9.list();
        javax.swing.plaf.PanelUI panelUI16 = managementDashboard9.getUI();
        java.awt.image.ColorModel colorModel17 = managementDashboard9.getColorModel();
        boolean boolean18 = managementDashboard9.hasFocus();
        boolean boolean19 = managementDashboard9.isMinimumSizeSet();
        boolean boolean20 = managementDashboard1.isFocusCycleRoot((java.awt.Container) managementDashboard9);
        java.io.PrintStream printStream21 = null;
        // The following exception was thrown during execution in test generation
        try {
            managementDashboard9.list(printStream21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(panelUI16);
        org.junit.Assert.assertNotNull(colorModel17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.Event event3 = null;
        boolean boolean5 = managementDashboard1.lostFocus(event3, (java.lang.Object) "");
        managementDashboard1.setAutoscrolls(false);
        java.awt.Graphics graphics8 = null;
        managementDashboard1.update(graphics8);
        managementDashboard1.setFocusCycleRoot(false);
        java.beans.VetoableChangeListener[] vetoableChangeListenerArray12 = managementDashboard1.getVetoableChangeListeners();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(vetoableChangeListenerArray12);
        org.junit.Assert.assertArrayEquals(vetoableChangeListenerArray12, new java.beans.VetoableChangeListener[] {});
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        managementDashboard1.move((int) (byte) 1, (int) '#');
        boolean boolean7 = managementDashboard1.isFocusTraversable();
        java.awt.event.ComponentListener[] componentListenerArray8 = managementDashboard1.getComponentListeners();
        managementDashboard1.firePropertyChange("SUPERMAN", 'a', '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(componentListenerArray8);
        org.junit.Assert.assertArrayEquals(componentListenerArray8, new java.awt.event.ComponentListener[] {});
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        boolean boolean4 = managementDashboard1.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget5 = null;
        managementDashboard1.setDropTarget(dropTarget5);
        java.awt.Dimension dimension7 = null;
        managementDashboard1.setPreferredSize(dimension7);
        managementDashboard1.addNotify();
        javax.swing.JPopupMenu jPopupMenu10 = null;
        managementDashboard1.setComponentPopupMenu(jPopupMenu10);
        java.awt.Event event12 = null;
        boolean boolean15 = managementDashboard1.mouseEnter(event12, (int) (short) 100, 64);
        managementDashboard1.repaint((int) 'a', 32, (int) (byte) 10, 1);
        java.util.function.Consumer<java.lang.String> strConsumer21 = null;
        ManagementDashboard managementDashboard22 = new ManagementDashboard(strConsumer21);
        boolean boolean23 = managementDashboard22.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests24 = managementDashboard22.getInputMethodRequests();
        java.awt.Container container25 = managementDashboard22.getTopLevelAncestor();
        java.awt.Color color26 = null;
        managementDashboard22.setForeground(color26);
        managementDashboard22.repaint(10, 100, 0, (int) (short) 1);
        boolean boolean33 = managementDashboard22.requestFocusInWindow();
        java.util.function.Consumer<java.lang.String> strConsumer34 = null;
        ManagementDashboard managementDashboard35 = new ManagementDashboard(strConsumer34);
        managementDashboard35.setRequestFocusEnabled(false);
        java.awt.Event event38 = null;
        boolean boolean40 = managementDashboard35.keyUp(event38, (int) (short) 1);
        managementDashboard35.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        managementDashboard35.removePropertyChangeListener("", propertyChangeListener44);
        managementDashboard35.doLayout();
        javax.swing.JPopupMenu jPopupMenu47 = managementDashboard35.getComponentPopupMenu();
        java.awt.Component component49 = managementDashboard22.add((java.awt.Component) managementDashboard35, 1);
        java.awt.Rectangle rectangle50 = managementDashboard22.getBounds();
        managementDashboard1.setBounds(rectangle50);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener52 = null;
        managementDashboard1.addHierarchyBoundsListener(hierarchyBoundsListener52);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(inputMethodRequests24);
        org.junit.Assert.assertNull(container25);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(jPopupMenu47);
        org.junit.Assert.assertNotNull(component49);
        org.junit.Assert.assertNotNull(rectangle50);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        java.awt.event.HierarchyListener hierarchyListener7 = null;
        managementDashboard1.addHierarchyListener(hierarchyListener7);
        java.awt.Cursor cursor9 = null;
        managementDashboard1.setCursor(cursor9);
        java.awt.Point point12 = managementDashboard1.getMousePosition(false);
        javax.swing.border.Border border13 = managementDashboard1.getBorder();
        boolean boolean14 = managementDashboard1.isFocusOwner();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(point12);
        org.junit.Assert.assertNull(border13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        javax.swing.KeyStroke keyStroke7 = null;
        java.awt.event.ActionListener actionListener8 = managementDashboard1.getActionForKeyStroke(keyStroke7);
        javax.swing.JToolTip jToolTip9 = managementDashboard1.createToolTip();
        java.awt.Event event10 = null;
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        ManagementDashboard managementDashboard12 = new ManagementDashboard(strConsumer11);
        managementDashboard12.setInheritsPopupMenu(true);
        boolean boolean15 = managementDashboard12.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget16 = null;
        managementDashboard12.setDropTarget(dropTarget16);
        java.awt.Dimension dimension18 = null;
        managementDashboard12.setPreferredSize(dimension18);
        javax.swing.event.AncestorListener ancestorListener20 = null;
        managementDashboard12.removeAncestorListener(ancestorListener20);
        java.awt.Dimension dimension22 = managementDashboard12.getPreferredSize();
        java.awt.Dimension dimension23 = managementDashboard12.getPreferredSize();
        managementDashboard12.setDebugGraphicsOptions(10);
        boolean boolean26 = jToolTip9.lostFocus(event10, (java.lang.Object) managementDashboard12);
        jToolTip9.setFocusTraversalPolicyProvider(true);
        javax.swing.JPopupMenu jPopupMenu29 = jToolTip9.getComponentPopupMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = jPopupMenu29.isFocusable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(actionListener8);
        org.junit.Assert.assertNotNull(jToolTip9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dimension22);
        org.junit.Assert.assertNotNull(dimension23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(jPopupMenu29);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy4 = null;
        managementDashboard1.setFocusTraversalPolicy(focusTraversalPolicy4);
        java.awt.Event event6 = null;
        boolean boolean9 = managementDashboard1.mouseDrag(event6, (int) (short) 10, 4);
        managementDashboard1.setEnabled(true);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior12 = managementDashboard1.getBaselineResizeBehavior();
        boolean boolean13 = managementDashboard1.isFontSet();
        managementDashboard1.list();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior12 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior12.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        java.awt.LayoutManager layoutManager4 = null;
        managementDashboard1.setLayout(layoutManager4);
        java.util.function.Consumer<java.lang.String> strConsumer6 = null;
        ManagementDashboard managementDashboard7 = new ManagementDashboard(strConsumer6);
        boolean boolean8 = managementDashboard7.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests9 = managementDashboard7.getInputMethodRequests();
        java.awt.Container container10 = managementDashboard7.getTopLevelAncestor();
        java.awt.Color color11 = null;
        managementDashboard7.setForeground(color11);
        javax.swing.KeyStroke keyStroke13 = null;
        java.awt.event.ActionListener actionListener14 = managementDashboard7.getActionForKeyStroke(keyStroke13);
        javax.swing.JToolTip jToolTip15 = managementDashboard7.createToolTip();
        java.awt.Event event16 = null;
        java.util.function.Consumer<java.lang.String> strConsumer17 = null;
        ManagementDashboard managementDashboard18 = new ManagementDashboard(strConsumer17);
        managementDashboard18.setInheritsPopupMenu(true);
        boolean boolean21 = managementDashboard18.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget22 = null;
        managementDashboard18.setDropTarget(dropTarget22);
        java.awt.Dimension dimension24 = null;
        managementDashboard18.setPreferredSize(dimension24);
        javax.swing.event.AncestorListener ancestorListener26 = null;
        managementDashboard18.removeAncestorListener(ancestorListener26);
        java.awt.Dimension dimension28 = managementDashboard18.getPreferredSize();
        java.awt.Dimension dimension29 = managementDashboard18.getPreferredSize();
        managementDashboard18.setDebugGraphicsOptions(10);
        boolean boolean32 = jToolTip15.lostFocus(event16, (java.lang.Object) managementDashboard18);
        java.awt.Component component33 = managementDashboard1.add((java.awt.Component) jToolTip15);
        jToolTip15.setInheritsPopupMenu(false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputMethodRequests9);
        org.junit.Assert.assertNull(container10);
        org.junit.Assert.assertNull(actionListener14);
        org.junit.Assert.assertNotNull(jToolTip15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dimension28);
        org.junit.Assert.assertNotNull(dimension29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(component33);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        SuperManager superManager0 = new SuperManager();
        MainSystem.currentManager = superManager0;
        java.lang.String str2 = superManager0.getPassword();
        java.lang.String str3 = superManager0.getPassword();
        java.lang.String str4 = superManager0.getUsername();
        java.lang.String str5 = superManager0.getUsername();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "123456789" + "'", str2, "123456789");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "123456789" + "'", str3, "123456789");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SUPERMAN" + "'", str4, "SUPERMAN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SUPERMAN" + "'", str5, "SUPERMAN");
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        managementDashboard1.setName("");
        managementDashboard1.doLayout();
        java.awt.event.KeyListener keyListener7 = null;
        managementDashboard1.addKeyListener(keyListener7);
        java.util.function.Consumer<java.lang.String> strConsumer9 = null;
        ManagementDashboard managementDashboard10 = new ManagementDashboard(strConsumer9);
        managementDashboard10.setInheritsPopupMenu(true);
        boolean boolean13 = managementDashboard10.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget14 = null;
        managementDashboard10.setDropTarget(dropTarget14);
        boolean boolean16 = managementDashboard10.getAutoscrolls();
        java.util.function.Consumer<java.lang.String> strConsumer17 = null;
        ManagementDashboard managementDashboard18 = new ManagementDashboard(strConsumer17);
        managementDashboard18.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy21 = null;
        managementDashboard18.setFocusTraversalPolicy(focusTraversalPolicy21);
        java.lang.Object obj23 = managementDashboard10.getClientProperty((java.lang.Object) managementDashboard18);
        java.util.function.Consumer<java.lang.String> strConsumer24 = null;
        ManagementDashboard managementDashboard25 = new ManagementDashboard(strConsumer24);
        managementDashboard25.setRequestFocusEnabled(false);
        java.awt.Event event28 = null;
        boolean boolean30 = managementDashboard25.keyUp(event28, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener31 = null;
        managementDashboard25.addInputMethodListener(inputMethodListener31);
        java.awt.Dimension dimension33 = managementDashboard25.getMaximumSize();
        int int34 = managementDashboard10.getComponentZOrder((java.awt.Component) managementDashboard25);
        javax.swing.KeyStroke keyStroke35 = null;
        int int36 = managementDashboard10.getConditionForKeyStroke(keyStroke35);
        managementDashboard10.transferFocusUpCycle();
        java.awt.image.ImageProducer imageProducer38 = null;
        java.awt.Image image39 = managementDashboard10.createImage(imageProducer38);
        java.util.function.Consumer<java.lang.String> strConsumer40 = null;
        ManagementDashboard managementDashboard41 = new ManagementDashboard(strConsumer40);
        managementDashboard41.setRequestFocusEnabled(false);
        java.awt.Event event44 = null;
        boolean boolean46 = managementDashboard41.keyUp(event44, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener47 = null;
        managementDashboard41.addInputMethodListener(inputMethodListener47);
        java.awt.image.VolatileImage volatileImage51 = managementDashboard41.createVolatileImage((int) (short) 0, 1);
        boolean boolean52 = managementDashboard41.isOptimizedDrawingEnabled();
        javax.swing.ActionMap actionMap53 = managementDashboard41.getActionMap();
        int int54 = managementDashboard1.checkImage(image39, (java.awt.image.ImageObserver) managementDashboard41);
        java.util.function.Consumer<java.lang.String> strConsumer55 = null;
        ManagementDashboard managementDashboard56 = new ManagementDashboard(strConsumer55);
        boolean boolean57 = managementDashboard56.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests58 = managementDashboard56.getInputMethodRequests();
        java.awt.Container container59 = managementDashboard56.getTopLevelAncestor();
        java.awt.Color color60 = null;
        managementDashboard56.setForeground(color60);
        managementDashboard56.repaint(10, 100, 0, (int) (short) 1);
        boolean boolean67 = managementDashboard56.requestFocusInWindow();
        java.util.function.Consumer<java.lang.String> strConsumer68 = null;
        ManagementDashboard managementDashboard69 = new ManagementDashboard(strConsumer68);
        managementDashboard69.setRequestFocusEnabled(false);
        java.awt.Event event72 = null;
        boolean boolean74 = managementDashboard69.keyUp(event72, (int) (short) 1);
        managementDashboard69.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener78 = null;
        managementDashboard69.removePropertyChangeListener("", propertyChangeListener78);
        managementDashboard69.doLayout();
        javax.swing.JPopupMenu jPopupMenu81 = managementDashboard69.getComponentPopupMenu();
        java.awt.Component component83 = managementDashboard56.add((java.awt.Component) managementDashboard69, 1);
        managementDashboard69.firePropertyChange("ToolTipText", (short) 1, (short) (byte) 100);
        boolean boolean88 = managementDashboard69.isFocusTraversalPolicyProvider();
        java.awt.Rectangle rectangle89 = managementDashboard69.getVisibleRect();
        managementDashboard41.paintImmediately(rectangle89);
        javax.swing.KeyStroke keyStroke91 = null;
        java.awt.event.ActionListener actionListener92 = managementDashboard41.getActionForKeyStroke(keyStroke91);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dimension33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(image39);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(volatileImage51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(actionMap53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(inputMethodRequests58);
        org.junit.Assert.assertNull(container59);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(jPopupMenu81);
        org.junit.Assert.assertNotNull(component83);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(rectangle89);
        org.junit.Assert.assertNull(actionListener92);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        java.lang.String str7 = managementDashboard1.toString();
        managementDashboard1.setOpaque(true);
        java.awt.Component component12 = managementDashboard1.locate((int) (byte) 1, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=4194313,maximumSize=,minimumSize=,preferredSize=]" + "'", str7, "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=4194313,maximumSize=,minimumSize=,preferredSize=]");
        org.junit.Assert.assertNull(component12);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer7 = null;
        ManagementDashboard managementDashboard8 = new ManagementDashboard(strConsumer7);
        managementDashboard8.setRequestFocusEnabled(false);
        java.awt.Event event11 = null;
        boolean boolean13 = managementDashboard8.keyUp(event11, (int) (short) 1);
        managementDashboard8.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        managementDashboard8.removePropertyChangeListener("", propertyChangeListener17);
        java.awt.Dimension dimension19 = managementDashboard8.getPreferredSize();
        managementDashboard1.setSize(dimension19);
        managementDashboard1.setRequestFocusEnabled(true);
        java.awt.Font font23 = null;
        managementDashboard1.setFont(font23);
        java.awt.image.VolatileImage volatileImage27 = managementDashboard1.createVolatileImage((int) (byte) 10, (int) (byte) -1);
        java.awt.GraphicsConfiguration graphicsConfiguration28 = managementDashboard1.getGraphicsConfiguration();
        managementDashboard1.resetKeyboardActions();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray30 = managementDashboard1.getPropertyChangeListeners();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dimension19);
        org.junit.Assert.assertNull(volatileImage27);
        org.junit.Assert.assertNull(graphicsConfiguration28);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray30);
        org.junit.Assert.assertArrayEquals(propertyChangeListenerArray30, new java.beans.PropertyChangeListener[] {});
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        managementDashboard5.setInheritsPopupMenu(true);
        boolean boolean8 = managementDashboard5.isValidateRoot();
        int int9 = managementDashboard1.getComponentZOrder((java.awt.Component) managementDashboard5);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        managementDashboard5.addPropertyChangeListener("hi!", propertyChangeListener11);
        managementDashboard5.enable();
        java.awt.Event event14 = null;
        boolean boolean17 = managementDashboard5.mouseDown(event14, (int) 'a', (int) (byte) 1);
        java.awt.event.MouseEvent mouseEvent18 = null;
        java.awt.Point point19 = managementDashboard5.getToolTipLocation(mouseEvent18);
        javax.accessibility.AccessibleContext accessibleContext20 = managementDashboard5.getAccessibleContext();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(point19);
        org.junit.Assert.assertNotNull(accessibleContext20);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        boolean boolean4 = managementDashboard1.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget5 = null;
        managementDashboard1.setDropTarget(dropTarget5);
        boolean boolean7 = managementDashboard1.getAutoscrolls();
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        managementDashboard9.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        managementDashboard9.setFocusTraversalPolicy(focusTraversalPolicy12);
        java.lang.Object obj14 = managementDashboard1.getClientProperty((java.lang.Object) managementDashboard9);
        java.util.function.Consumer<java.lang.String> strConsumer15 = null;
        ManagementDashboard managementDashboard16 = new ManagementDashboard(strConsumer15);
        managementDashboard16.setRequestFocusEnabled(false);
        java.awt.Event event19 = null;
        boolean boolean21 = managementDashboard16.keyUp(event19, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener22 = null;
        managementDashboard16.addInputMethodListener(inputMethodListener22);
        java.awt.Dimension dimension24 = managementDashboard16.getMaximumSize();
        int int25 = managementDashboard1.getComponentZOrder((java.awt.Component) managementDashboard16);
        java.awt.Component component26 = managementDashboard1.getNextFocusableComponent();
        java.awt.Insets insets27 = managementDashboard1.insets();
        java.util.function.Consumer<java.lang.String> strConsumer28 = null;
        ManagementDashboard managementDashboard29 = new ManagementDashboard(strConsumer28);
        managementDashboard29.setInheritsPopupMenu(true);
        java.awt.LayoutManager layoutManager32 = null;
        managementDashboard29.setLayout(layoutManager32);
        managementDashboard29.setFocusTraversalPolicyProvider(true);
        java.awt.Dimension dimension36 = managementDashboard29.getMaximumSize();
        java.awt.Dimension dimension37 = managementDashboard1.getSize(dimension36);
        managementDashboard1.firePropertyChange("hi!", true, false);
        java.awt.Insets insets42 = managementDashboard1.getInsets();
        java.awt.event.InputMethodListener inputMethodListener43 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener43);
        javax.swing.event.AncestorListener[] ancestorListenerArray45 = managementDashboard1.getAncestorListeners();
        managementDashboard1.firePropertyChange("data/managerData.csv", ' ', 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dimension24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(component26);
        org.junit.Assert.assertNotNull(insets27);
        org.junit.Assert.assertNotNull(dimension36);
        org.junit.Assert.assertNotNull(dimension37);
        org.junit.Assert.assertNotNull(insets42);
        org.junit.Assert.assertNotNull(ancestorListenerArray45);
        org.junit.Assert.assertArrayEquals(ancestorListenerArray45, new javax.swing.event.AncestorListener[] {});
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        managementDashboard1.move((int) (byte) 1, (int) '#');
        managementDashboard1.layout();
        managementDashboard1.setEnabled(false);
        int int10 = managementDashboard1.getY();
        java.awt.Component component13 = managementDashboard1.locate((-1), (int) '#');
        int int14 = managementDashboard1.getDebugGraphicsOptions();
        javax.swing.border.Border border15 = managementDashboard1.getBorder();
        java.util.function.Consumer<java.lang.String> strConsumer16 = null;
        ManagementDashboard managementDashboard17 = new ManagementDashboard(strConsumer16);
        managementDashboard17.setRequestFocusEnabled(false);
        java.awt.Event event20 = null;
        boolean boolean22 = managementDashboard17.keyUp(event20, (int) (short) 1);
        boolean boolean23 = managementDashboard17.isCursorSet();
        java.awt.Dimension dimension24 = managementDashboard17.size();
        managementDashboard1.setPreferredSize(dimension24);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNull(component13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(border15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dimension24);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        java.awt.LayoutManager layoutManager4 = null;
        managementDashboard1.setLayout(layoutManager4);
        managementDashboard1.setFocusTraversalPolicyProvider(true);
        java.awt.Dimension dimension8 = managementDashboard1.getMaximumSize();
        java.awt.event.ContainerListener containerListener9 = null;
        managementDashboard1.addContainerListener(containerListener9);
        org.junit.Assert.assertNotNull(dimension8);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        ParkingLot parkingLot1 = new ParkingLot("data/userData.csv");
        ParkingSpace[] parkingSpaceArray2 = parkingLot1.getSpaces();
        parkingLot1.setEnabled(true);
        ParkingSpace parkingSpace6 = parkingLot1.getSpace((int) '#');
        parkingLot1.setSpace(64, "data/lotData.csv", "", "");
        org.junit.Assert.assertNotNull(parkingSpaceArray2);
        org.junit.Assert.assertNotNull(parkingSpace6);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.event.ContainerListener containerListener5 = null;
        managementDashboard1.removeContainerListener(containerListener5);
        javax.swing.JPopupMenu jPopupMenu7 = null;
        managementDashboard1.setComponentPopupMenu(jPopupMenu7);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener9 = null;
        managementDashboard1.addHierarchyBoundsListener(hierarchyBoundsListener9);
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        ManagementDashboard managementDashboard12 = new ManagementDashboard(strConsumer11);
        managementDashboard12.setRequestFocusEnabled(false);
        java.awt.Event event15 = null;
        boolean boolean17 = managementDashboard12.keyUp(event15, (int) (short) 1);
        managementDashboard12.list();
        javax.swing.plaf.PanelUI panelUI19 = managementDashboard12.getUI();
        java.awt.image.ColorModel colorModel20 = managementDashboard12.getColorModel();
        java.awt.Point point21 = managementDashboard12.location();
        boolean boolean22 = managementDashboard1.contains(point21);
        boolean boolean23 = managementDashboard1.isPaintingTile();
        int int24 = managementDashboard1.getHeight();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(panelUI19);
        org.junit.Assert.assertNotNull(colorModel20);
        org.junit.Assert.assertNotNull(point21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        managementDashboard1.list();
        java.beans.VetoableChangeListener vetoableChangeListener8 = null;
        managementDashboard1.addVetoableChangeListener(vetoableChangeListener8);
        java.awt.Graphics graphics10 = null;
        managementDashboard1.print(graphics10);
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        boolean boolean15 = managementDashboard14.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests16 = managementDashboard14.getInputMethodRequests();
        java.awt.Container container17 = managementDashboard14.getTopLevelAncestor();
        java.awt.Color color18 = null;
        managementDashboard14.setForeground(color18);
        java.awt.event.HierarchyListener hierarchyListener20 = null;
        managementDashboard14.addHierarchyListener(hierarchyListener20);
        java.awt.Cursor cursor22 = null;
        managementDashboard14.setCursor(cursor22);
        java.awt.Event event24 = null;
        boolean boolean27 = managementDashboard14.mouseDown(event24, (-1), (int) (short) 10);
        managementDashboard14.resize((int) (byte) 1, (int) (byte) 10);
        boolean boolean31 = managementDashboard14.isFocusCycleRoot();
        javax.swing.InputMap inputMap33 = managementDashboard14.getInputMap((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            managementDashboard1.setInputMap((int) (byte) -1, inputMap33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition must be one of JComponent.WHEN_IN_FOCUSED_WINDOW, JComponent.WHEN_FOCUSED or JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputMethodRequests16);
        org.junit.Assert.assertNull(container17);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(inputMap33);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener7 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener7);
        managementDashboard1.move((int) (byte) 0, 8);
        java.util.function.Consumer<java.lang.String> strConsumer12 = null;
        ManagementDashboard managementDashboard13 = new ManagementDashboard(strConsumer12);
        boolean boolean14 = managementDashboard13.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests15 = managementDashboard13.getInputMethodRequests();
        java.awt.Container container16 = managementDashboard13.getTopLevelAncestor();
        java.awt.Color color17 = null;
        managementDashboard13.setForeground(color17);
        managementDashboard13.repaint(10, 100, 0, (int) (short) 1);
        boolean boolean24 = managementDashboard13.requestFocusInWindow();
        java.util.function.Consumer<java.lang.String> strConsumer25 = null;
        ManagementDashboard managementDashboard26 = new ManagementDashboard(strConsumer25);
        managementDashboard26.setRequestFocusEnabled(false);
        java.awt.Event event29 = null;
        boolean boolean31 = managementDashboard26.keyUp(event29, (int) (short) 1);
        managementDashboard26.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        managementDashboard26.removePropertyChangeListener("", propertyChangeListener35);
        managementDashboard26.doLayout();
        javax.swing.JPopupMenu jPopupMenu38 = managementDashboard26.getComponentPopupMenu();
        java.awt.Component component40 = managementDashboard13.add((java.awt.Component) managementDashboard26, 1);
        java.util.function.Consumer<java.lang.String> strConsumer41 = null;
        ManagementDashboard managementDashboard42 = new ManagementDashboard(strConsumer41);
        managementDashboard42.setRequestFocusEnabled(false);
        java.awt.Event event45 = null;
        boolean boolean47 = managementDashboard42.keyUp(event45, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener48 = null;
        managementDashboard42.addInputMethodListener(inputMethodListener48);
        java.awt.Dimension dimension50 = managementDashboard42.getMaximumSize();
        managementDashboard26.setPreferredSize(dimension50);
        managementDashboard26.firePropertyChange("data/managerData.csv", ' ', ' ');
        java.util.function.Consumer<java.lang.String> strConsumer56 = null;
        ManagementDashboard managementDashboard57 = new ManagementDashboard(strConsumer56);
        managementDashboard57.setRequestFocusEnabled(false);
        java.awt.Event event60 = null;
        boolean boolean62 = managementDashboard57.keyUp(event60, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener63 = null;
        managementDashboard57.addInputMethodListener(inputMethodListener63);
        java.awt.image.VolatileImage volatileImage67 = managementDashboard57.createVolatileImage((int) (short) 0, 1);
        boolean boolean68 = managementDashboard57.isOptimizedDrawingEnabled();
        javax.swing.ActionMap actionMap69 = managementDashboard57.getActionMap();
        managementDashboard26.setActionMap(actionMap69);
        java.awt.Rectangle rectangle71 = managementDashboard26.getBounds();
        managementDashboard1.scrollRectToVisible(rectangle71);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(inputMethodRequests15);
        org.junit.Assert.assertNull(container16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(jPopupMenu38);
        org.junit.Assert.assertNotNull(component40);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(dimension50);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(volatileImage67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(actionMap69);
        org.junit.Assert.assertNotNull(rectangle71);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.event.ComponentListener componentListener4 = null;
        managementDashboard1.removeComponentListener(componentListener4);
        managementDashboard1.repaint();
        java.util.function.Consumer<java.lang.String> strConsumer7 = null;
        ManagementDashboard managementDashboard8 = new ManagementDashboard(strConsumer7);
        managementDashboard8.setInheritsPopupMenu(true);
        boolean boolean11 = managementDashboard8.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget12 = null;
        managementDashboard8.setDropTarget(dropTarget12);
        java.awt.Dimension dimension14 = null;
        managementDashboard8.setPreferredSize(dimension14);
        managementDashboard8.addNotify();
        javax.swing.JPopupMenu jPopupMenu17 = null;
        managementDashboard8.setComponentPopupMenu(jPopupMenu17);
        java.awt.Event event19 = null;
        boolean boolean22 = managementDashboard8.mouseEnter(event19, (int) (short) 100, 64);
        managementDashboard8.repaint((int) 'a', 32, (int) (byte) 10, 1);
        java.util.function.Consumer<java.lang.String> strConsumer28 = null;
        ManagementDashboard managementDashboard29 = new ManagementDashboard(strConsumer28);
        boolean boolean30 = managementDashboard29.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests31 = managementDashboard29.getInputMethodRequests();
        java.awt.Container container32 = managementDashboard29.getTopLevelAncestor();
        java.awt.Color color33 = null;
        managementDashboard29.setForeground(color33);
        managementDashboard29.repaint(10, 100, 0, (int) (short) 1);
        boolean boolean40 = managementDashboard29.requestFocusInWindow();
        java.util.function.Consumer<java.lang.String> strConsumer41 = null;
        ManagementDashboard managementDashboard42 = new ManagementDashboard(strConsumer41);
        managementDashboard42.setRequestFocusEnabled(false);
        java.awt.Event event45 = null;
        boolean boolean47 = managementDashboard42.keyUp(event45, (int) (short) 1);
        managementDashboard42.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener51 = null;
        managementDashboard42.removePropertyChangeListener("", propertyChangeListener51);
        managementDashboard42.doLayout();
        javax.swing.JPopupMenu jPopupMenu54 = managementDashboard42.getComponentPopupMenu();
        java.awt.Component component56 = managementDashboard29.add((java.awt.Component) managementDashboard42, 1);
        java.awt.Rectangle rectangle57 = managementDashboard29.getBounds();
        managementDashboard8.setBounds(rectangle57);
        managementDashboard1.setMixingCutoutShape((java.awt.Shape) rectangle57);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(inputMethodRequests31);
        org.junit.Assert.assertNull(container32);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(jPopupMenu54);
        org.junit.Assert.assertNotNull(component56);
        org.junit.Assert.assertNotNull(rectangle57);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        ParkingSpace parkingSpace4 = new ParkingSpace(8, "PanelUI", "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=4194313,maximumSize=,minimumSize=,preferredSize=]", "data/parkingSpaceData.csv");
        java.lang.String str5 = parkingSpace4.getCurrentUser();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=4194313,maximumSize=,minimumSize=,preferredSize=]" + "'", str5, "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=4194313,maximumSize=,minimumSize=,preferredSize=]");
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        UserBookingsView userBookingsView1 = new UserBookingsView(strConsumer0);
        userBookingsView1.invalidate();
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        javax.swing.KeyStroke keyStroke7 = null;
        java.awt.event.ActionListener actionListener8 = managementDashboard1.getActionForKeyStroke(keyStroke7);
        javax.swing.JToolTip jToolTip9 = managementDashboard1.createToolTip();
        java.awt.Event event10 = null;
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        ManagementDashboard managementDashboard12 = new ManagementDashboard(strConsumer11);
        managementDashboard12.setInheritsPopupMenu(true);
        boolean boolean15 = managementDashboard12.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget16 = null;
        managementDashboard12.setDropTarget(dropTarget16);
        java.awt.Dimension dimension18 = null;
        managementDashboard12.setPreferredSize(dimension18);
        javax.swing.event.AncestorListener ancestorListener20 = null;
        managementDashboard12.removeAncestorListener(ancestorListener20);
        java.awt.Dimension dimension22 = managementDashboard12.getPreferredSize();
        java.awt.Dimension dimension23 = managementDashboard12.getPreferredSize();
        managementDashboard12.setDebugGraphicsOptions(10);
        boolean boolean26 = jToolTip9.lostFocus(event10, (java.lang.Object) managementDashboard12);
        jToolTip9.layout();
        java.awt.Image image30 = jToolTip9.createImage((-1), (int) '4');
        java.awt.event.HierarchyListener hierarchyListener31 = null;
        jToolTip9.removeHierarchyListener(hierarchyListener31);
        int int33 = jToolTip9.getDebugGraphicsOptions();
        boolean boolean34 = jToolTip9.isFocusCycleRoot();
        boolean boolean35 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) jToolTip9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(actionListener8);
        org.junit.Assert.assertNotNull(jToolTip9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dimension22);
        org.junit.Assert.assertNotNull(dimension23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(image30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        javax.swing.KeyStroke keyStroke7 = null;
        java.awt.event.ActionListener actionListener8 = managementDashboard1.getActionForKeyStroke(keyStroke7);
        javax.swing.JToolTip jToolTip9 = managementDashboard1.createToolTip();
        java.awt.Event event10 = null;
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        ManagementDashboard managementDashboard12 = new ManagementDashboard(strConsumer11);
        managementDashboard12.setInheritsPopupMenu(true);
        boolean boolean15 = managementDashboard12.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget16 = null;
        managementDashboard12.setDropTarget(dropTarget16);
        java.awt.Dimension dimension18 = null;
        managementDashboard12.setPreferredSize(dimension18);
        javax.swing.event.AncestorListener ancestorListener20 = null;
        managementDashboard12.removeAncestorListener(ancestorListener20);
        java.awt.Dimension dimension22 = managementDashboard12.getPreferredSize();
        java.awt.Dimension dimension23 = managementDashboard12.getPreferredSize();
        managementDashboard12.setDebugGraphicsOptions(10);
        boolean boolean26 = jToolTip9.lostFocus(event10, (java.lang.Object) managementDashboard12);
        boolean boolean27 = managementDashboard12.isOpaque();
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        managementDashboard12.addPropertyChangeListener("ToolTipText", propertyChangeListener29);
        boolean boolean31 = managementDashboard12.getIgnoreRepaint();
        managementDashboard12.validate();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(actionListener8);
        org.junit.Assert.assertNotNull(jToolTip9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dimension22);
        org.junit.Assert.assertNotNull(dimension23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        java.awt.LayoutManager layoutManager4 = null;
        managementDashboard1.setLayout(layoutManager4);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        managementDashboard1.addPropertyChangeListener("data/managerData.csv", propertyChangeListener7);
        java.util.function.Consumer<java.lang.String> strConsumer9 = null;
        ManagementDashboard managementDashboard10 = new ManagementDashboard(strConsumer9);
        boolean boolean11 = managementDashboard10.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests12 = managementDashboard10.getInputMethodRequests();
        java.awt.Container container13 = managementDashboard10.getTopLevelAncestor();
        java.awt.Color color14 = null;
        managementDashboard10.setForeground(color14);
        managementDashboard10.repaint(10, 100, 0, (int) (short) 1);
        boolean boolean21 = managementDashboard1.isFocusCycleRoot((java.awt.Container) managementDashboard10);
        java.awt.Graphics graphics22 = null;
        managementDashboard1.paint(graphics22);
        java.awt.GraphicsConfiguration graphicsConfiguration24 = managementDashboard1.getGraphicsConfiguration();
        managementDashboard1.enable();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(inputMethodRequests12);
        org.junit.Assert.assertNull(container13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(graphicsConfiguration24);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        java.awt.LayoutManager layoutManager4 = null;
        managementDashboard1.setLayout(layoutManager4);
        java.util.function.Consumer<java.lang.String> strConsumer6 = null;
        ManagementDashboard managementDashboard7 = new ManagementDashboard(strConsumer6);
        boolean boolean8 = managementDashboard7.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests9 = managementDashboard7.getInputMethodRequests();
        java.awt.Container container10 = managementDashboard7.getTopLevelAncestor();
        java.awt.Color color11 = null;
        managementDashboard7.setForeground(color11);
        javax.swing.KeyStroke keyStroke13 = null;
        java.awt.event.ActionListener actionListener14 = managementDashboard7.getActionForKeyStroke(keyStroke13);
        javax.swing.JToolTip jToolTip15 = managementDashboard7.createToolTip();
        java.awt.Event event16 = null;
        java.util.function.Consumer<java.lang.String> strConsumer17 = null;
        ManagementDashboard managementDashboard18 = new ManagementDashboard(strConsumer17);
        managementDashboard18.setInheritsPopupMenu(true);
        boolean boolean21 = managementDashboard18.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget22 = null;
        managementDashboard18.setDropTarget(dropTarget22);
        java.awt.Dimension dimension24 = null;
        managementDashboard18.setPreferredSize(dimension24);
        javax.swing.event.AncestorListener ancestorListener26 = null;
        managementDashboard18.removeAncestorListener(ancestorListener26);
        java.awt.Dimension dimension28 = managementDashboard18.getPreferredSize();
        java.awt.Dimension dimension29 = managementDashboard18.getPreferredSize();
        managementDashboard18.setDebugGraphicsOptions(10);
        boolean boolean32 = jToolTip15.lostFocus(event16, (java.lang.Object) managementDashboard18);
        java.awt.Component component33 = managementDashboard1.add((java.awt.Component) jToolTip15);
        java.awt.Event event34 = null;
        boolean boolean36 = component33.keyUp(event34, 8);
        java.awt.image.ColorModel colorModel37 = component33.getColorModel();
        boolean boolean38 = component33.isDisplayable();
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        component33.removePropertyChangeListener("SUPERMAN", propertyChangeListener40);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputMethodRequests9);
        org.junit.Assert.assertNull(container10);
        org.junit.Assert.assertNull(actionListener14);
        org.junit.Assert.assertNotNull(jToolTip15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dimension28);
        org.junit.Assert.assertNotNull(dimension29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(component33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(colorModel37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.event.FocusListener[] focusListenerArray4 = managementDashboard1.getFocusListeners();
        java.awt.Graphics graphics5 = null;
        managementDashboard1.paint(graphics5);
        managementDashboard1.firePropertyChange("ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=8388617,maximumSize=,minimumSize=,preferredSize=]", (short) (byte) -1, (short) (byte) 0);
        java.awt.Graphics graphics11 = managementDashboard1.getGraphics();
        boolean boolean12 = managementDashboard1.isManagingFocus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNotNull(focusListenerArray4);
        org.junit.Assert.assertArrayEquals(focusListenerArray4, new java.awt.event.FocusListener[] {});
        org.junit.Assert.assertNull(graphics11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        managementDashboard1.setName("");
        managementDashboard1.doLayout();
        java.awt.event.KeyListener keyListener7 = null;
        managementDashboard1.addKeyListener(keyListener7);
        boolean boolean9 = managementDashboard1.isFocusTraversalPolicySet();
        java.util.function.Consumer<java.lang.String> strConsumer10 = null;
        ManagementDashboard managementDashboard11 = new ManagementDashboard(strConsumer10);
        boolean boolean12 = managementDashboard11.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests13 = managementDashboard11.getInputMethodRequests();
        java.util.function.Consumer<java.lang.String> strConsumer14 = null;
        ManagementDashboard managementDashboard15 = new ManagementDashboard(strConsumer14);
        managementDashboard15.setInheritsPopupMenu(true);
        boolean boolean18 = managementDashboard15.isValidateRoot();
        int int19 = managementDashboard11.getComponentZOrder((java.awt.Component) managementDashboard15);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        managementDashboard15.addPropertyChangeListener("hi!", propertyChangeListener21);
        boolean boolean23 = managementDashboard15.isPreferredSizeSet();
        managementDashboard15.setToolTipText("");
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        managementDashboard15.addPropertyChangeListener("hi!", propertyChangeListener27);
        javax.swing.event.AncestorListener ancestorListener29 = null;
        managementDashboard15.addAncestorListener(ancestorListener29);
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        managementDashboard32.setInheritsPopupMenu(true);
        boolean boolean35 = managementDashboard32.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget36 = null;
        managementDashboard32.setDropTarget(dropTarget36);
        java.awt.Dimension dimension38 = null;
        managementDashboard32.setPreferredSize(dimension38);
        javax.swing.event.AncestorListener ancestorListener40 = null;
        managementDashboard32.removeAncestorListener(ancestorListener40);
        java.awt.Dimension dimension42 = managementDashboard32.getPreferredSize();
        java.awt.Dimension dimension43 = managementDashboard32.getPreferredSize();
        java.util.function.Consumer<java.lang.String> strConsumer44 = null;
        ManagementDashboard managementDashboard45 = new ManagementDashboard(strConsumer44);
        managementDashboard45.setRequestFocusEnabled(false);
        java.awt.Event event48 = null;
        boolean boolean50 = managementDashboard45.keyUp(event48, (int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer51 = null;
        ManagementDashboard managementDashboard52 = new ManagementDashboard(strConsumer51);
        managementDashboard52.setRequestFocusEnabled(false);
        java.awt.Event event55 = null;
        boolean boolean57 = managementDashboard52.keyUp(event55, (int) (short) 1);
        managementDashboard52.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener61 = null;
        managementDashboard52.removePropertyChangeListener("", propertyChangeListener61);
        java.awt.Dimension dimension63 = managementDashboard52.getPreferredSize();
        managementDashboard45.setSize(dimension63);
        java.awt.Dimension dimension65 = managementDashboard32.getSize(dimension63);
        managementDashboard15.setMinimumSize(dimension65);
        managementDashboard1.setPreferredSize(dimension65);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(inputMethodRequests13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dimension42);
        org.junit.Assert.assertNotNull(dimension43);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(dimension63);
        org.junit.Assert.assertNotNull(dimension65);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        managementDashboard1.setAutoscrolls(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy9 = managementDashboard1.getFocusTraversalPolicy();
        javax.swing.KeyStroke keyStroke10 = null;
        managementDashboard1.unregisterKeyboardAction(keyStroke10);
        java.awt.event.InputMethodListener inputMethodListener12 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener12);
        java.awt.Event event14 = null;
        java.util.function.Consumer<java.lang.String> strConsumer15 = null;
        ManagementDashboard managementDashboard16 = new ManagementDashboard(strConsumer15);
        boolean boolean17 = managementDashboard16.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests18 = managementDashboard16.getInputMethodRequests();
        java.awt.Container container19 = managementDashboard16.getTopLevelAncestor();
        java.awt.Color color20 = null;
        managementDashboard16.setForeground(color20);
        managementDashboard16.repaint(10, 100, 0, (int) (short) 1);
        boolean boolean27 = managementDashboard16.requestFocusInWindow();
        java.util.function.Consumer<java.lang.String> strConsumer28 = null;
        ManagementDashboard managementDashboard29 = new ManagementDashboard(strConsumer28);
        managementDashboard29.setRequestFocusEnabled(false);
        java.awt.Event event32 = null;
        boolean boolean34 = managementDashboard29.keyUp(event32, (int) (short) 1);
        managementDashboard29.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        managementDashboard29.removePropertyChangeListener("", propertyChangeListener38);
        managementDashboard29.doLayout();
        javax.swing.JPopupMenu jPopupMenu41 = managementDashboard29.getComponentPopupMenu();
        java.awt.Component component43 = managementDashboard16.add((java.awt.Component) managementDashboard29, 1);
        java.util.function.Consumer<java.lang.String> strConsumer44 = null;
        ManagementDashboard managementDashboard45 = new ManagementDashboard(strConsumer44);
        managementDashboard45.setRequestFocusEnabled(false);
        java.awt.Event event48 = null;
        boolean boolean50 = managementDashboard45.keyUp(event48, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener51 = null;
        managementDashboard45.addInputMethodListener(inputMethodListener51);
        java.awt.Dimension dimension53 = managementDashboard45.getMaximumSize();
        managementDashboard29.setPreferredSize(dimension53);
        managementDashboard29.firePropertyChange("data/managerData.csv", ' ', ' ');
        java.util.function.Consumer<java.lang.String> strConsumer59 = null;
        ManagementDashboard managementDashboard60 = new ManagementDashboard(strConsumer59);
        managementDashboard60.setRequestFocusEnabled(false);
        java.awt.Event event63 = null;
        boolean boolean65 = managementDashboard60.keyUp(event63, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener66 = null;
        managementDashboard60.addInputMethodListener(inputMethodListener66);
        java.awt.image.VolatileImage volatileImage70 = managementDashboard60.createVolatileImage((int) (short) 0, 1);
        boolean boolean71 = managementDashboard60.isOptimizedDrawingEnabled();
        javax.swing.ActionMap actionMap72 = managementDashboard60.getActionMap();
        managementDashboard29.setActionMap(actionMap72);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray74 = managementDashboard29.getPropertyChangeListeners();
        boolean boolean75 = managementDashboard1.action(event14, (java.lang.Object) propertyChangeListenerArray74);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(focusTraversalPolicy9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(inputMethodRequests18);
        org.junit.Assert.assertNull(container19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(jPopupMenu41);
        org.junit.Assert.assertNotNull(component43);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(dimension53);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(volatileImage70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(actionMap72);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray74);
        org.junit.Assert.assertArrayEquals(propertyChangeListenerArray74, new java.beans.PropertyChangeListener[] {});
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.Event event3 = null;
        boolean boolean5 = managementDashboard1.lostFocus(event3, (java.lang.Object) "");
        managementDashboard1.setAutoscrolls(false);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        managementDashboard9.setRequestFocusEnabled(false);
        java.awt.Event event12 = null;
        boolean boolean14 = managementDashboard9.keyUp(event12, (int) (short) 1);
        managementDashboard9.list();
        javax.swing.plaf.PanelUI panelUI16 = managementDashboard9.getUI();
        java.awt.image.ColorModel colorModel17 = managementDashboard9.getColorModel();
        boolean boolean18 = managementDashboard9.hasFocus();
        boolean boolean19 = managementDashboard9.isMinimumSizeSet();
        boolean boolean20 = managementDashboard1.isFocusCycleRoot((java.awt.Container) managementDashboard9);
        java.awt.event.MouseWheelListener mouseWheelListener21 = null;
        managementDashboard9.removeMouseWheelListener(mouseWheelListener21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(panelUI16);
        org.junit.Assert.assertNotNull(colorModel17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        boolean boolean4 = managementDashboard1.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget5 = null;
        managementDashboard1.setDropTarget(dropTarget5);
        boolean boolean7 = managementDashboard1.getAutoscrolls();
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        managementDashboard9.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        managementDashboard9.setFocusTraversalPolicy(focusTraversalPolicy12);
        java.lang.Object obj14 = managementDashboard1.getClientProperty((java.lang.Object) managementDashboard9);
        java.util.function.Consumer<java.lang.String> strConsumer15 = null;
        ManagementDashboard managementDashboard16 = new ManagementDashboard(strConsumer15);
        managementDashboard16.setRequestFocusEnabled(false);
        java.awt.Event event19 = null;
        boolean boolean21 = managementDashboard16.keyUp(event19, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener22 = null;
        managementDashboard16.addInputMethodListener(inputMethodListener22);
        java.awt.Dimension dimension24 = managementDashboard16.getMaximumSize();
        int int25 = managementDashboard1.getComponentZOrder((java.awt.Component) managementDashboard16);
        java.awt.Component component26 = managementDashboard1.getNextFocusableComponent();
        java.awt.Insets insets27 = managementDashboard1.insets();
        java.util.function.Consumer<java.lang.String> strConsumer28 = null;
        ManagementDashboard managementDashboard29 = new ManagementDashboard(strConsumer28);
        boolean boolean30 = managementDashboard29.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests31 = managementDashboard29.getInputMethodRequests();
        java.awt.Container container32 = managementDashboard29.getTopLevelAncestor();
        java.awt.Color color33 = null;
        managementDashboard29.setForeground(color33);
        javax.swing.KeyStroke keyStroke35 = null;
        java.awt.event.ActionListener actionListener36 = managementDashboard29.getActionForKeyStroke(keyStroke35);
        javax.swing.JToolTip jToolTip37 = managementDashboard29.createToolTip();
        java.util.function.Consumer<java.lang.String> strConsumer38 = null;
        ManagementDashboard managementDashboard39 = new ManagementDashboard(strConsumer38);
        managementDashboard39.setRequestFocusEnabled(false);
        java.awt.Event event42 = null;
        boolean boolean44 = managementDashboard39.keyUp(event42, (int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer45 = null;
        ManagementDashboard managementDashboard46 = new ManagementDashboard(strConsumer45);
        managementDashboard46.setRequestFocusEnabled(false);
        java.awt.Event event49 = null;
        boolean boolean51 = managementDashboard46.keyUp(event49, (int) (short) 1);
        managementDashboard46.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener55 = null;
        managementDashboard46.removePropertyChangeListener("", propertyChangeListener55);
        java.awt.Dimension dimension57 = managementDashboard46.getPreferredSize();
        managementDashboard39.setSize(dimension57);
        managementDashboard29.setMinimumSize(dimension57);
        java.util.function.Consumer<java.lang.String> strConsumer60 = null;
        ManagementDashboard managementDashboard61 = new ManagementDashboard(strConsumer60);
        managementDashboard61.setRequestFocusEnabled(false);
        java.awt.Event event64 = null;
        boolean boolean66 = managementDashboard61.keyUp(event64, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener67 = null;
        managementDashboard61.addInputMethodListener(inputMethodListener67);
        boolean boolean69 = managementDashboard61.isValidateRoot();
        boolean boolean70 = managementDashboard29.isFocusCycleRoot((java.awt.Container) managementDashboard61);
        boolean boolean71 = managementDashboard29.isForegroundSet();
        managementDashboard29.hide();
        int int75 = managementDashboard29.getBaseline((int) (byte) 10, (int) (short) 0);
        java.util.function.Consumer<java.lang.String> strConsumer76 = null;
        ManagementDashboard managementDashboard77 = new ManagementDashboard(strConsumer76);
        boolean boolean78 = managementDashboard77.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests79 = managementDashboard77.getInputMethodRequests();
        managementDashboard77.move((int) (byte) 1, (int) '#');
        boolean boolean83 = managementDashboard77.isFocusTraversable();
        java.util.function.Consumer<java.lang.String> strConsumer84 = null;
        ManagementDashboard managementDashboard85 = new ManagementDashboard(strConsumer84);
        managementDashboard85.setRequestFocusEnabled(false);
        managementDashboard85.enable();
        managementDashboard85.list();
        java.awt.Point point90 = managementDashboard85.location();
        boolean boolean91 = managementDashboard77.contains(point90);
        java.awt.Point point92 = managementDashboard29.getLocation(point90);
        java.awt.Component component93 = managementDashboard1.findComponentAt(point90);
        managementDashboard1.setRequestFocusEnabled(true);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior96 = managementDashboard1.getBaselineResizeBehavior();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dimension24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(component26);
        org.junit.Assert.assertNotNull(insets27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(inputMethodRequests31);
        org.junit.Assert.assertNull(container32);
        org.junit.Assert.assertNull(actionListener36);
        org.junit.Assert.assertNotNull(jToolTip37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(dimension57);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(inputMethodRequests79);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(point90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(point92);
        org.junit.Assert.assertNull(component93);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior96 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior96.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer7 = null;
        ManagementDashboard managementDashboard8 = new ManagementDashboard(strConsumer7);
        managementDashboard8.setRequestFocusEnabled(false);
        java.awt.Event event11 = null;
        boolean boolean13 = managementDashboard8.keyUp(event11, (int) (short) 1);
        managementDashboard8.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        managementDashboard8.removePropertyChangeListener("", propertyChangeListener17);
        java.awt.Dimension dimension19 = managementDashboard8.getPreferredSize();
        managementDashboard1.setSize(dimension19);
        managementDashboard1.setRequestFocusEnabled(true);
        java.awt.Font font23 = null;
        managementDashboard1.setFont(font23);
        java.awt.image.VolatileImage volatileImage27 = managementDashboard1.createVolatileImage((int) (byte) 10, (int) (byte) -1);
        managementDashboard1.repaint((long) (byte) 1, (int) (short) 0, (int) (short) -1, (int) (short) 100, 4);
        java.awt.Dimension dimension34 = managementDashboard1.getMinimumSize();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dimension19);
        org.junit.Assert.assertNull(volatileImage27);
        org.junit.Assert.assertNotNull(dimension34);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        managementDashboard1.repaint(10, 100, 0, (int) (short) 1);
        boolean boolean12 = managementDashboard1.requestFocusInWindow();
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        managementDashboard14.setRequestFocusEnabled(false);
        java.awt.Event event17 = null;
        boolean boolean19 = managementDashboard14.keyUp(event17, (int) (short) 1);
        managementDashboard14.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        managementDashboard14.removePropertyChangeListener("", propertyChangeListener23);
        managementDashboard14.doLayout();
        javax.swing.JPopupMenu jPopupMenu26 = managementDashboard14.getComponentPopupMenu();
        java.awt.Component component28 = managementDashboard1.add((java.awt.Component) managementDashboard14, 1);
        managementDashboard14.firePropertyChange("ToolTipText", (short) 1, (short) (byte) 100);
        javax.swing.JPopupMenu jPopupMenu33 = managementDashboard14.getComponentPopupMenu();
        java.util.function.Consumer<java.lang.String> strConsumer34 = null;
        ManagementDashboard managementDashboard35 = new ManagementDashboard(strConsumer34);
        managementDashboard35.setInheritsPopupMenu(true);
        managementDashboard35.setName("");
        managementDashboard35.doLayout();
        managementDashboard35.repaint();
        boolean boolean42 = managementDashboard35.isForegroundSet();
        managementDashboard35.setToolTipText("");
        java.util.function.Consumer<java.lang.String> strConsumer45 = null;
        UserBookingsView userBookingsView46 = new UserBookingsView(strConsumer45);
        userBookingsView46.removeNotify();
        java.util.function.Consumer<java.lang.String> strConsumer48 = null;
        ManagementDashboard managementDashboard49 = new ManagementDashboard(strConsumer48);
        boolean boolean50 = managementDashboard49.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests51 = managementDashboard49.getInputMethodRequests();
        java.awt.Container container52 = managementDashboard49.getTopLevelAncestor();
        java.awt.Color color53 = null;
        managementDashboard49.setForeground(color53);
        managementDashboard49.repaint(10, 100, 0, (int) (short) 1);
        boolean boolean60 = managementDashboard49.requestFocusInWindow();
        java.util.function.Consumer<java.lang.String> strConsumer61 = null;
        ManagementDashboard managementDashboard62 = new ManagementDashboard(strConsumer61);
        managementDashboard62.setRequestFocusEnabled(false);
        java.awt.Event event65 = null;
        boolean boolean67 = managementDashboard62.keyUp(event65, (int) (short) 1);
        managementDashboard62.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener71 = null;
        managementDashboard62.removePropertyChangeListener("", propertyChangeListener71);
        managementDashboard62.doLayout();
        javax.swing.JPopupMenu jPopupMenu74 = managementDashboard62.getComponentPopupMenu();
        java.awt.Component component76 = managementDashboard49.add((java.awt.Component) managementDashboard62, 1);
        java.util.function.Consumer<java.lang.String> strConsumer77 = null;
        ManagementDashboard managementDashboard78 = new ManagementDashboard(strConsumer77);
        managementDashboard78.setRequestFocusEnabled(false);
        java.awt.Event event81 = null;
        boolean boolean83 = managementDashboard78.keyUp(event81, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener84 = null;
        managementDashboard78.addInputMethodListener(inputMethodListener84);
        java.awt.Dimension dimension86 = managementDashboard78.getMaximumSize();
        managementDashboard62.setPreferredSize(dimension86);
        java.awt.Point point88 = managementDashboard62.location();
        java.awt.Point point89 = userBookingsView46.getLocation(point88);
        java.awt.Component component90 = managementDashboard35.findComponentAt(point89);
        managementDashboard14.setLocation(point89);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(jPopupMenu26);
        org.junit.Assert.assertNotNull(component28);
        org.junit.Assert.assertNull(jPopupMenu33);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(inputMethodRequests51);
        org.junit.Assert.assertNull(container52);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(jPopupMenu74);
        org.junit.Assert.assertNotNull(component76);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(dimension86);
        org.junit.Assert.assertNotNull(point88);
        org.junit.Assert.assertNotNull(point89);
        org.junit.Assert.assertNull(component90);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.event.ContainerListener containerListener5 = null;
        managementDashboard1.removeContainerListener(containerListener5);
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = managementDashboard1.getFocusTraversalPolicy();
        java.awt.event.MouseListener mouseListener8 = null;
        managementDashboard1.addMouseListener(mouseListener8);
        java.util.function.Consumer<java.lang.String> strConsumer10 = null;
        ManagementDashboard managementDashboard11 = new ManagementDashboard(strConsumer10);
        managementDashboard11.setInheritsPopupMenu(true);
        boolean boolean14 = managementDashboard11.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget15 = null;
        managementDashboard11.setDropTarget(dropTarget15);
        boolean boolean17 = managementDashboard11.getAutoscrolls();
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        managementDashboard19.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy22 = null;
        managementDashboard19.setFocusTraversalPolicy(focusTraversalPolicy22);
        java.lang.Object obj24 = managementDashboard11.getClientProperty((java.lang.Object) managementDashboard19);
        java.awt.Point point25 = managementDashboard11.location();
        java.util.function.Consumer<java.lang.String> strConsumer26 = null;
        ManagementDashboard managementDashboard27 = new ManagementDashboard(strConsumer26);
        managementDashboard27.setRequestFocusEnabled(false);
        java.awt.Event event30 = null;
        boolean boolean32 = managementDashboard27.keyUp(event30, (int) (short) 1);
        boolean boolean33 = managementDashboard27.isCursorSet();
        java.awt.event.KeyListener keyListener34 = null;
        managementDashboard27.removeKeyListener(keyListener34);
        java.awt.image.ImageProducer imageProducer36 = null;
        java.awt.Image image37 = managementDashboard27.createImage(imageProducer36);
        java.util.function.Consumer<java.lang.String> strConsumer38 = null;
        ManagementDashboard managementDashboard39 = new ManagementDashboard(strConsumer38);
        boolean boolean40 = managementDashboard39.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests41 = managementDashboard39.getInputMethodRequests();
        java.awt.Container container42 = managementDashboard39.getTopLevelAncestor();
        java.awt.Color color43 = null;
        managementDashboard39.setForeground(color43);
        managementDashboard39.repaint(10, 100, 0, (int) (short) 1);
        boolean boolean50 = managementDashboard39.requestFocusInWindow();
        java.util.function.Consumer<java.lang.String> strConsumer51 = null;
        ManagementDashboard managementDashboard52 = new ManagementDashboard(strConsumer51);
        managementDashboard52.setRequestFocusEnabled(false);
        java.awt.Event event55 = null;
        boolean boolean57 = managementDashboard52.keyUp(event55, (int) (short) 1);
        managementDashboard52.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener61 = null;
        managementDashboard52.removePropertyChangeListener("", propertyChangeListener61);
        managementDashboard52.doLayout();
        javax.swing.JPopupMenu jPopupMenu64 = managementDashboard52.getComponentPopupMenu();
        java.awt.Component component66 = managementDashboard39.add((java.awt.Component) managementDashboard52, 1);
        boolean boolean67 = component66.isEnabled();
        java.beans.PropertyChangeListener propertyChangeListener68 = null;
        component66.removePropertyChangeListener(propertyChangeListener68);
        int int70 = managementDashboard11.checkImage(image37, (java.awt.image.ImageObserver) component66);
        boolean boolean76 = managementDashboard1.imageUpdate(image37, 4, 4, (int) (byte) 10, 32, 32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(focusTraversalPolicy7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(point25);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(image37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(inputMethodRequests41);
        org.junit.Assert.assertNull(container42);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(jPopupMenu64);
        org.junit.Assert.assertNotNull(component66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        managementDashboard1.list();
        javax.swing.plaf.PanelUI panelUI8 = managementDashboard1.getUI();
        javax.swing.border.Border border9 = null;
        managementDashboard1.setBorder(border9);
        int int11 = managementDashboard1.getY();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(panelUI8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        boolean boolean4 = managementDashboard1.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget5 = null;
        managementDashboard1.setDropTarget(dropTarget5);
        java.awt.Dimension dimension7 = null;
        managementDashboard1.setPreferredSize(dimension7);
        managementDashboard1.addNotify();
        javax.swing.JPopupMenu jPopupMenu10 = null;
        managementDashboard1.setComponentPopupMenu(jPopupMenu10);
        java.awt.Event event12 = null;
        boolean boolean15 = managementDashboard1.mouseEnter(event12, (int) (short) 100, 64);
        managementDashboard1.repaint((int) 'a', 32, (int) (byte) 10, 1);
        java.util.function.Consumer<java.lang.String> strConsumer21 = null;
        ManagementDashboard managementDashboard22 = new ManagementDashboard(strConsumer21);
        boolean boolean23 = managementDashboard22.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests24 = managementDashboard22.getInputMethodRequests();
        java.awt.Container container25 = managementDashboard22.getTopLevelAncestor();
        java.awt.Color color26 = null;
        managementDashboard22.setForeground(color26);
        managementDashboard22.repaint(10, 100, 0, (int) (short) 1);
        boolean boolean33 = managementDashboard22.requestFocusInWindow();
        java.util.function.Consumer<java.lang.String> strConsumer34 = null;
        ManagementDashboard managementDashboard35 = new ManagementDashboard(strConsumer34);
        managementDashboard35.setRequestFocusEnabled(false);
        java.awt.Event event38 = null;
        boolean boolean40 = managementDashboard35.keyUp(event38, (int) (short) 1);
        managementDashboard35.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        managementDashboard35.removePropertyChangeListener("", propertyChangeListener44);
        managementDashboard35.doLayout();
        javax.swing.JPopupMenu jPopupMenu47 = managementDashboard35.getComponentPopupMenu();
        java.awt.Component component49 = managementDashboard22.add((java.awt.Component) managementDashboard35, 1);
        java.awt.Rectangle rectangle50 = managementDashboard22.getBounds();
        managementDashboard1.setBounds(rectangle50);
        java.awt.event.FocusListener focusListener52 = null;
        managementDashboard1.removeFocusListener(focusListener52);
        java.awt.Graphics graphics54 = null;
        // The following exception was thrown during execution in test generation
        try {
            managementDashboard1.paintAll(graphics54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics.getClip()\" because \"g\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(inputMethodRequests24);
        org.junit.Assert.assertNull(container25);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(jPopupMenu47);
        org.junit.Assert.assertNotNull(component49);
        org.junit.Assert.assertNotNull(rectangle50);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        boolean boolean4 = managementDashboard1.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget5 = null;
        managementDashboard1.setDropTarget(dropTarget5);
        java.awt.Dimension dimension7 = null;
        managementDashboard1.setPreferredSize(dimension7);
        javax.swing.event.AncestorListener ancestorListener9 = null;
        managementDashboard1.removeAncestorListener(ancestorListener9);
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        ManagementDashboard managementDashboard12 = new ManagementDashboard(strConsumer11);
        managementDashboard12.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy15 = null;
        managementDashboard12.setFocusTraversalPolicy(focusTraversalPolicy15);
        java.awt.Event event17 = null;
        boolean boolean20 = managementDashboard12.mouseDrag(event17, (int) (short) 10, 4);
        managementDashboard12.setEnabled(true);
        java.awt.Component component23 = managementDashboard1.add((java.awt.Component) managementDashboard12);
        java.awt.Component component24 = managementDashboard1.getNextFocusableComponent();
        managementDashboard1.setDoubleBuffered(false);
        managementDashboard1.grabFocus();
        java.awt.Graphics graphics28 = null;
        managementDashboard1.printComponents(graphics28);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(component23);
        org.junit.Assert.assertNull(component24);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.event.FocusListener[] focusListenerArray4 = managementDashboard1.getFocusListeners();
        java.awt.Component component5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component6 = managementDashboard1.add(component5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNotNull(focusListenerArray4);
        org.junit.Assert.assertArrayEquals(focusListenerArray4, new java.awt.event.FocusListener[] {});
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        java.awt.event.HierarchyListener hierarchyListener7 = null;
        managementDashboard1.addHierarchyListener(hierarchyListener7);
        java.awt.Cursor cursor9 = null;
        managementDashboard1.setCursor(cursor9);
        java.awt.Point point12 = managementDashboard1.getMousePosition(false);
        managementDashboard1.resize(100, 64);
        java.util.function.Consumer<java.lang.String> strConsumer16 = null;
        ManagementDashboard managementDashboard17 = new ManagementDashboard(strConsumer16);
        boolean boolean18 = managementDashboard17.isCursorSet();
        java.awt.Event event19 = null;
        boolean boolean21 = managementDashboard17.lostFocus(event19, (java.lang.Object) "");
        managementDashboard17.setAutoscrolls(false);
        java.awt.Graphics graphics24 = null;
        managementDashboard17.update(graphics24);
        java.util.function.Consumer<java.lang.String> strConsumer26 = null;
        ManagementDashboard managementDashboard27 = new ManagementDashboard(strConsumer26);
        managementDashboard27.setInheritsPopupMenu(true);
        boolean boolean30 = managementDashboard27.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget31 = null;
        managementDashboard27.setDropTarget(dropTarget31);
        boolean boolean33 = managementDashboard27.getAutoscrolls();
        java.util.function.Consumer<java.lang.String> strConsumer34 = null;
        ManagementDashboard managementDashboard35 = new ManagementDashboard(strConsumer34);
        managementDashboard35.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy38 = null;
        managementDashboard35.setFocusTraversalPolicy(focusTraversalPolicy38);
        java.lang.Object obj40 = managementDashboard27.getClientProperty((java.lang.Object) managementDashboard35);
        java.util.function.Consumer<java.lang.String> strConsumer41 = null;
        ManagementDashboard managementDashboard42 = new ManagementDashboard(strConsumer41);
        managementDashboard42.setRequestFocusEnabled(false);
        java.awt.Event event45 = null;
        boolean boolean47 = managementDashboard42.keyUp(event45, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener48 = null;
        managementDashboard42.addInputMethodListener(inputMethodListener48);
        java.awt.Dimension dimension50 = managementDashboard42.getMaximumSize();
        int int51 = managementDashboard27.getComponentZOrder((java.awt.Component) managementDashboard42);
        javax.swing.KeyStroke keyStroke52 = null;
        int int53 = managementDashboard27.getConditionForKeyStroke(keyStroke52);
        managementDashboard27.transferFocusUpCycle();
        java.awt.image.ImageProducer imageProducer55 = null;
        java.awt.Image image56 = managementDashboard27.createImage(imageProducer55);
        boolean boolean62 = managementDashboard17.imageUpdate(image56, (int) (byte) 10, (int) (short) 10, 4, (int) (short) 0, 2);
        java.util.function.Consumer<java.lang.String> strConsumer63 = null;
        ManagementDashboard managementDashboard64 = new ManagementDashboard(strConsumer63);
        managementDashboard64.setRequestFocusEnabled(false);
        java.awt.Event event67 = null;
        boolean boolean69 = managementDashboard64.keyUp(event67, (int) (short) 1);
        managementDashboard64.list();
        javax.swing.plaf.PanelUI panelUI71 = managementDashboard64.getUI();
        java.awt.image.ColorModel colorModel72 = managementDashboard64.getColorModel();
        boolean boolean73 = managementDashboard64.hasFocus();
        javax.swing.KeyStroke keyStroke74 = null;
        int int75 = managementDashboard64.getConditionForKeyStroke(keyStroke74);
        managementDashboard64.reshape((int) (byte) 1, 4, 10, 0);
        int int81 = managementDashboard1.checkImage(image56, (java.awt.image.ImageObserver) managementDashboard64);
        managementDashboard1.layout();
        boolean boolean85 = managementDashboard1.inside((int) (byte) 100, (int) (short) 100);
        javax.swing.border.Border border86 = managementDashboard1.getBorder();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(point12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(dimension50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(image56);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(panelUI71);
        org.junit.Assert.assertNotNull(colorModel72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNull(border86);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        boolean boolean4 = managementDashboard1.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget5 = null;
        managementDashboard1.setDropTarget(dropTarget5);
        java.awt.Dimension dimension7 = null;
        managementDashboard1.setPreferredSize(dimension7);
        javax.swing.event.AncestorListener ancestorListener9 = null;
        managementDashboard1.removeAncestorListener(ancestorListener9);
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        ManagementDashboard managementDashboard12 = new ManagementDashboard(strConsumer11);
        managementDashboard12.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy15 = null;
        managementDashboard12.setFocusTraversalPolicy(focusTraversalPolicy15);
        java.awt.Event event17 = null;
        boolean boolean20 = managementDashboard12.mouseDrag(event17, (int) (short) 10, 4);
        managementDashboard12.setEnabled(true);
        java.awt.Component component23 = managementDashboard1.add((java.awt.Component) managementDashboard12);
        java.awt.Event event24 = null;
        java.lang.Object obj25 = null;
        boolean boolean26 = managementDashboard1.action(event24, obj25);
        java.awt.Event event27 = null;
        boolean boolean29 = managementDashboard1.keyDown(event27, (int) (short) -1);
        javax.swing.InputVerifier inputVerifier30 = managementDashboard1.getInputVerifier();
        java.awt.Component component31 = managementDashboard1.getNextFocusableComponent();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(component23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(inputVerifier30);
        org.junit.Assert.assertNull(component31);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        managementDashboard5.setInheritsPopupMenu(true);
        boolean boolean8 = managementDashboard5.isValidateRoot();
        int int9 = managementDashboard1.getComponentZOrder((java.awt.Component) managementDashboard5);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard5.addPropertyChangeListener(propertyChangeListener10);
        managementDashboard5.setVisible(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        managementDashboard1.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard1.removePropertyChangeListener("", propertyChangeListener10);
        managementDashboard1.setVisible(false);
        boolean boolean16 = managementDashboard1.contains((int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener7 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener7);
        java.awt.image.VolatileImage volatileImage11 = managementDashboard1.createVolatileImage((int) (short) 0, 1);
        boolean boolean12 = managementDashboard1.isOptimizedDrawingEnabled();
        java.awt.Graphics graphics13 = null;
        managementDashboard1.paint(graphics13);
        managementDashboard1.firePropertyChange("PanelUI", (short) -1, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(volatileImage11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.event.ComponentListener componentListener4 = null;
        managementDashboard1.removeComponentListener(componentListener4);
        javax.swing.plaf.PanelUI panelUI6 = null;
        managementDashboard1.setUI(panelUI6);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        managementDashboard1.setAutoscrolls(true);
        java.awt.event.HierarchyListener[] hierarchyListenerArray9 = managementDashboard1.getHierarchyListeners();
        java.awt.event.KeyListener keyListener10 = null;
        managementDashboard1.addKeyListener(keyListener10);
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray12 = managementDashboard1.getHierarchyBoundsListeners();
        managementDashboard1.list();
        managementDashboard1.setInheritsPopupMenu(true);
        float float16 = managementDashboard1.getAlignmentX();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(hierarchyListenerArray9);
        org.junit.Assert.assertArrayEquals(hierarchyListenerArray9, new java.awt.event.HierarchyListener[] {});
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray12);
        org.junit.Assert.assertArrayEquals(hierarchyBoundsListenerArray12, new java.awt.event.HierarchyBoundsListener[] {});
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.5f + "'", float16 == 0.5f);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        managementDashboard1.repaint(10, 100, 0, (int) (short) 1);
        boolean boolean12 = managementDashboard1.requestFocusInWindow();
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        managementDashboard14.setRequestFocusEnabled(false);
        java.awt.Event event17 = null;
        boolean boolean19 = managementDashboard14.keyUp(event17, (int) (short) 1);
        managementDashboard14.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        managementDashboard14.removePropertyChangeListener("", propertyChangeListener23);
        managementDashboard14.doLayout();
        javax.swing.JPopupMenu jPopupMenu26 = managementDashboard14.getComponentPopupMenu();
        java.awt.Component component28 = managementDashboard1.add((java.awt.Component) managementDashboard14, 1);
        boolean boolean29 = component28.isLightweight();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(jPopupMenu26);
        org.junit.Assert.assertNotNull(component28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        UserDashboard userDashboard1 = new UserDashboard(strConsumer0);
        userDashboard1.transferFocusDownCycle();
        javax.swing.TransferHandler transferHandler3 = null;
        userDashboard1.setTransferHandler(transferHandler3);
        java.awt.Point point5 = userDashboard1.getMousePosition();
        userDashboard1.updateUI();
        org.junit.Assert.assertNull(point5);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.event.ContainerListener containerListener5 = null;
        managementDashboard1.removeContainerListener(containerListener5);
        javax.swing.JPopupMenu jPopupMenu7 = null;
        managementDashboard1.setComponentPopupMenu(jPopupMenu7);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener9 = null;
        managementDashboard1.addHierarchyBoundsListener(hierarchyBoundsListener9);
        java.awt.event.FocusListener focusListener11 = null;
        managementDashboard1.removeFocusListener(focusListener11);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior13 = managementDashboard1.getBaselineResizeBehavior();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior13 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior13.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        managementDashboard5.setInheritsPopupMenu(true);
        boolean boolean8 = managementDashboard5.isValidateRoot();
        int int9 = managementDashboard1.getComponentZOrder((java.awt.Component) managementDashboard5);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        managementDashboard5.addPropertyChangeListener("hi!", propertyChangeListener11);
        boolean boolean13 = managementDashboard5.isPreferredSizeSet();
        managementDashboard5.setToolTipText("");
        java.awt.event.InputMethodListener inputMethodListener16 = null;
        managementDashboard5.removeInputMethodListener(inputMethodListener16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        managementDashboard19.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy22 = null;
        managementDashboard19.setFocusTraversalPolicy(focusTraversalPolicy22);
        java.awt.Event event24 = null;
        boolean boolean27 = managementDashboard19.mouseDrag(event24, (int) (short) 10, 4);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        managementDashboard19.removePropertyChangeListener("hi!", propertyChangeListener29);
        boolean boolean31 = managementDashboard19.isMaximumSizeSet();
        java.awt.Font font32 = managementDashboard19.getFont();
        java.awt.FontMetrics fontMetrics33 = managementDashboard5.getFontMetrics(font32);
        javax.swing.TransferHandler transferHandler34 = managementDashboard5.getTransferHandler();
        java.awt.im.InputMethodRequests inputMethodRequests35 = managementDashboard5.getInputMethodRequests();
        java.beans.VetoableChangeListener vetoableChangeListener36 = null;
        managementDashboard5.addVetoableChangeListener(vetoableChangeListener36);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(font32);
        org.junit.Assert.assertNotNull(fontMetrics33);
        org.junit.Assert.assertNull(transferHandler34);
        org.junit.Assert.assertNull(inputMethodRequests35);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.event.ContainerListener containerListener5 = null;
        managementDashboard1.removeContainerListener(containerListener5);
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = managementDashboard1.getFocusTraversalPolicy();
        java.awt.ImageCapabilities imageCapabilities10 = null;
        java.awt.image.VolatileImage volatileImage11 = managementDashboard1.createVolatileImage((int) (short) 1, 32, imageCapabilities10);
        float float12 = managementDashboard1.getAlignmentY();
        managementDashboard1.list();
        java.awt.Component component14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component15 = managementDashboard1.add(component14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(focusTraversalPolicy7);
        org.junit.Assert.assertNull(volatileImage11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        boolean boolean4 = managementDashboard1.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget5 = null;
        managementDashboard1.setDropTarget(dropTarget5);
        java.awt.Dimension dimension7 = null;
        managementDashboard1.setPreferredSize(dimension7);
        javax.swing.event.AncestorListener ancestorListener9 = null;
        managementDashboard1.removeAncestorListener(ancestorListener9);
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        ManagementDashboard managementDashboard12 = new ManagementDashboard(strConsumer11);
        managementDashboard12.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy15 = null;
        managementDashboard12.setFocusTraversalPolicy(focusTraversalPolicy15);
        java.awt.Event event17 = null;
        boolean boolean20 = managementDashboard12.mouseDrag(event17, (int) (short) 10, 4);
        managementDashboard12.setEnabled(true);
        java.awt.Component component23 = managementDashboard1.add((java.awt.Component) managementDashboard12);
        java.awt.Event event24 = null;
        java.lang.Object obj25 = null;
        boolean boolean26 = managementDashboard1.action(event24, obj25);
        managementDashboard1.setLocation(2, 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(component23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener7 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener7);
        managementDashboard1.move((int) (byte) 0, 8);
        java.awt.Event event12 = null;
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        boolean boolean15 = managementDashboard14.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests16 = managementDashboard14.getInputMethodRequests();
        java.awt.Container container17 = managementDashboard14.getTopLevelAncestor();
        boolean boolean18 = managementDashboard1.gotFocus(event12, (java.lang.Object) container17);
        managementDashboard1.hide();
        java.awt.Container container20 = managementDashboard1.getTopLevelAncestor();
        managementDashboard1.setSize((int) 'a', (int) (short) -1);
        java.awt.FocusTraversalPolicy focusTraversalPolicy24 = null;
        managementDashboard1.setFocusTraversalPolicy(focusTraversalPolicy24);
        managementDashboard1.firePropertyChange("data/parkingSpaceData.csv", (double) (byte) 100, (double) 1);
        javax.swing.KeyStroke keyStroke30 = null;
        java.awt.event.ActionListener actionListener31 = managementDashboard1.getActionForKeyStroke(keyStroke30);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputMethodRequests16);
        org.junit.Assert.assertNull(container17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(container20);
        org.junit.Assert.assertNull(actionListener31);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        java.awt.LayoutManager layoutManager4 = null;
        managementDashboard1.setLayout(layoutManager4);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        managementDashboard1.addPropertyChangeListener("data/managerData.csv", propertyChangeListener7);
        java.util.function.Consumer<java.lang.String> strConsumer9 = null;
        ManagementDashboard managementDashboard10 = new ManagementDashboard(strConsumer9);
        boolean boolean11 = managementDashboard10.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests12 = managementDashboard10.getInputMethodRequests();
        java.awt.Container container13 = managementDashboard10.getTopLevelAncestor();
        java.awt.Color color14 = null;
        managementDashboard10.setForeground(color14);
        managementDashboard10.repaint(10, 100, 0, (int) (short) 1);
        boolean boolean21 = managementDashboard1.isFocusCycleRoot((java.awt.Container) managementDashboard10);
        java.awt.Graphics graphics22 = null;
        managementDashboard1.paint(graphics22);
        java.awt.GraphicsConfiguration graphicsConfiguration24 = managementDashboard1.getGraphicsConfiguration();
        javax.swing.event.AncestorListener[] ancestorListenerArray25 = managementDashboard1.getAncestorListeners();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(inputMethodRequests12);
        org.junit.Assert.assertNull(container13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(graphicsConfiguration24);
        org.junit.Assert.assertNotNull(ancestorListenerArray25);
        org.junit.Assert.assertArrayEquals(ancestorListenerArray25, new javax.swing.event.AncestorListener[] {});
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer7 = null;
        ManagementDashboard managementDashboard8 = new ManagementDashboard(strConsumer7);
        managementDashboard8.setRequestFocusEnabled(false);
        java.awt.Event event11 = null;
        boolean boolean13 = managementDashboard8.keyUp(event11, (int) (short) 1);
        managementDashboard8.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        managementDashboard8.removePropertyChangeListener("", propertyChangeListener17);
        java.awt.Dimension dimension19 = managementDashboard8.getPreferredSize();
        managementDashboard1.setSize(dimension19);
        managementDashboard1.setRequestFocusEnabled(true);
        managementDashboard1.addNotify();
        int int24 = managementDashboard1.getX();
        boolean boolean25 = managementDashboard1.isLightweight();
        java.util.function.Consumer<java.lang.String> strConsumer26 = null;
        ManagementDashboard managementDashboard27 = new ManagementDashboard(strConsumer26);
        managementDashboard27.setInheritsPopupMenu(true);
        boolean boolean30 = managementDashboard27.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget31 = null;
        managementDashboard27.setDropTarget(dropTarget31);
        java.awt.Dimension dimension33 = null;
        managementDashboard27.setPreferredSize(dimension33);
        javax.swing.event.AncestorListener ancestorListener35 = null;
        managementDashboard27.removeAncestorListener(ancestorListener35);
        java.awt.Dimension dimension37 = managementDashboard27.getPreferredSize();
        java.awt.Dimension dimension38 = managementDashboard27.getPreferredSize();
        java.awt.Point point40 = managementDashboard27.getMousePosition(true);
        java.awt.Color color41 = managementDashboard27.getForeground();
        java.awt.ComponentOrientation componentOrientation42 = managementDashboard27.getComponentOrientation();
        managementDashboard1.applyComponentOrientation(componentOrientation42);
        int int44 = managementDashboard1.getX();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dimension19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dimension37);
        org.junit.Assert.assertNotNull(dimension38);
        org.junit.Assert.assertNull(point40);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertNotNull(componentOrientation42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        java.awt.LayoutManager layoutManager4 = null;
        managementDashboard1.setLayout(layoutManager4);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        managementDashboard1.addPropertyChangeListener("data/managerData.csv", propertyChangeListener7);
        java.util.function.Consumer<java.lang.String> strConsumer9 = null;
        ManagementDashboard managementDashboard10 = new ManagementDashboard(strConsumer9);
        boolean boolean11 = managementDashboard10.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests12 = managementDashboard10.getInputMethodRequests();
        java.awt.Container container13 = managementDashboard10.getTopLevelAncestor();
        java.awt.Color color14 = null;
        managementDashboard10.setForeground(color14);
        managementDashboard10.repaint(10, 100, 0, (int) (short) 1);
        boolean boolean21 = managementDashboard1.isFocusCycleRoot((java.awt.Container) managementDashboard10);
        java.awt.Graphics graphics22 = null;
        managementDashboard1.paint(graphics22);
        java.awt.GraphicsConfiguration graphicsConfiguration24 = managementDashboard1.getGraphicsConfiguration();
        java.awt.Event event25 = null;
        boolean boolean28 = managementDashboard1.mouseMove(event25, (int) (byte) 10, 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(inputMethodRequests12);
        org.junit.Assert.assertNull(container13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(graphicsConfiguration24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        boolean boolean4 = managementDashboard1.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget5 = null;
        managementDashboard1.setDropTarget(dropTarget5);
        boolean boolean7 = managementDashboard1.getAutoscrolls();
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        managementDashboard9.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        managementDashboard9.setFocusTraversalPolicy(focusTraversalPolicy12);
        java.lang.Object obj14 = managementDashboard1.getClientProperty((java.lang.Object) managementDashboard9);
        java.util.function.Consumer<java.lang.String> strConsumer15 = null;
        ManagementDashboard managementDashboard16 = new ManagementDashboard(strConsumer15);
        managementDashboard16.setRequestFocusEnabled(false);
        java.awt.Event event19 = null;
        boolean boolean21 = managementDashboard16.keyUp(event19, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener22 = null;
        managementDashboard16.addInputMethodListener(inputMethodListener22);
        java.awt.Dimension dimension24 = managementDashboard16.getMaximumSize();
        int int25 = managementDashboard1.getComponentZOrder((java.awt.Component) managementDashboard16);
        javax.swing.KeyStroke keyStroke26 = null;
        int int27 = managementDashboard1.getConditionForKeyStroke(keyStroke26);
        java.util.function.Consumer<java.lang.String> strConsumer28 = null;
        ManagementDashboard managementDashboard29 = new ManagementDashboard(strConsumer28);
        managementDashboard29.setInheritsPopupMenu(true);
        boolean boolean32 = managementDashboard29.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget33 = null;
        managementDashboard29.setDropTarget(dropTarget33);
        boolean boolean35 = managementDashboard29.getAutoscrolls();
        java.util.function.Consumer<java.lang.String> strConsumer36 = null;
        ManagementDashboard managementDashboard37 = new ManagementDashboard(strConsumer36);
        managementDashboard37.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy40 = null;
        managementDashboard37.setFocusTraversalPolicy(focusTraversalPolicy40);
        java.lang.Object obj42 = managementDashboard29.getClientProperty((java.lang.Object) managementDashboard37);
        java.util.function.Consumer<java.lang.String> strConsumer43 = null;
        ManagementDashboard managementDashboard44 = new ManagementDashboard(strConsumer43);
        managementDashboard44.setRequestFocusEnabled(false);
        java.awt.Event event47 = null;
        boolean boolean49 = managementDashboard44.keyUp(event47, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener50 = null;
        managementDashboard44.addInputMethodListener(inputMethodListener50);
        java.awt.Dimension dimension52 = managementDashboard44.getMaximumSize();
        int int53 = managementDashboard29.getComponentZOrder((java.awt.Component) managementDashboard44);
        java.awt.Component component55 = managementDashboard29.getComponent(1);
        java.awt.Point point56 = managementDashboard29.location();
        java.awt.Component component57 = managementDashboard1.getComponentAt(point56);
        managementDashboard1.grabFocus();
        java.awt.Component component61 = managementDashboard1.findComponentAt(35, 32);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dimension24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(dimension52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(component55);
        org.junit.Assert.assertNotNull(point56);
        org.junit.Assert.assertNull(component57);
        org.junit.Assert.assertNull(component61);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        boolean boolean4 = managementDashboard1.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget5 = null;
        managementDashboard1.setDropTarget(dropTarget5);
        java.awt.Dimension dimension7 = null;
        managementDashboard1.setPreferredSize(dimension7);
        managementDashboard1.resetKeyboardActions();
        java.awt.FocusTraversalPolicy focusTraversalPolicy10 = null;
        managementDashboard1.setFocusTraversalPolicy(focusTraversalPolicy10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        java.awt.LayoutManager layoutManager4 = null;
        managementDashboard1.setLayout(layoutManager4);
        managementDashboard1.setFocusTraversalPolicyProvider(true);
        java.awt.Dimension dimension8 = managementDashboard1.getMaximumSize();
        java.util.function.Consumer<java.lang.String> strConsumer9 = null;
        ManagementDashboard managementDashboard10 = new ManagementDashboard(strConsumer9);
        managementDashboard10.setInheritsPopupMenu(true);
        java.awt.LayoutManager layoutManager13 = null;
        managementDashboard10.setLayout(layoutManager13);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        managementDashboard10.addPropertyChangeListener("data/managerData.csv", propertyChangeListener16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        boolean boolean20 = managementDashboard19.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests21 = managementDashboard19.getInputMethodRequests();
        java.awt.Container container22 = managementDashboard19.getTopLevelAncestor();
        java.awt.Color color23 = null;
        managementDashboard19.setForeground(color23);
        managementDashboard19.repaint(10, 100, 0, (int) (short) 1);
        boolean boolean30 = managementDashboard10.isFocusCycleRoot((java.awt.Container) managementDashboard19);
        java.awt.Rectangle rectangle31 = managementDashboard10.bounds();
        managementDashboard1.repaint(rectangle31);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(inputMethodRequests21);
        org.junit.Assert.assertNull(container22);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(rectangle31);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy4 = null;
        managementDashboard1.setFocusTraversalPolicy(focusTraversalPolicy4);
        java.awt.Event event6 = null;
        boolean boolean9 = managementDashboard1.mouseDrag(event6, (int) (short) 10, 4);
        managementDashboard1.setEnabled(true);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior12 = managementDashboard1.getBaselineResizeBehavior();
        java.util.function.Consumer<java.lang.String> strConsumer14 = null;
        ManagementDashboard managementDashboard15 = new ManagementDashboard(strConsumer14);
        boolean boolean16 = managementDashboard15.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests17 = managementDashboard15.getInputMethodRequests();
        managementDashboard15.move((int) (byte) 1, (int) '#');
        managementDashboard15.layout();
        managementDashboard15.setEnabled(false);
        java.awt.Event event24 = null;
        java.util.function.Consumer<java.lang.String> strConsumer25 = null;
        ManagementDashboard managementDashboard26 = new ManagementDashboard(strConsumer25);
        managementDashboard26.setInheritsPopupMenu(true);
        managementDashboard26.setName("");
        managementDashboard26.doLayout();
        java.awt.event.KeyListener keyListener32 = null;
        managementDashboard26.addKeyListener(keyListener32);
        java.util.function.Consumer<java.lang.String> strConsumer34 = null;
        ManagementDashboard managementDashboard35 = new ManagementDashboard(strConsumer34);
        managementDashboard35.setInheritsPopupMenu(true);
        boolean boolean38 = managementDashboard35.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget39 = null;
        managementDashboard35.setDropTarget(dropTarget39);
        boolean boolean41 = managementDashboard35.getAutoscrolls();
        java.util.function.Consumer<java.lang.String> strConsumer42 = null;
        ManagementDashboard managementDashboard43 = new ManagementDashboard(strConsumer42);
        managementDashboard43.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy46 = null;
        managementDashboard43.setFocusTraversalPolicy(focusTraversalPolicy46);
        java.lang.Object obj48 = managementDashboard35.getClientProperty((java.lang.Object) managementDashboard43);
        java.util.function.Consumer<java.lang.String> strConsumer49 = null;
        ManagementDashboard managementDashboard50 = new ManagementDashboard(strConsumer49);
        managementDashboard50.setRequestFocusEnabled(false);
        java.awt.Event event53 = null;
        boolean boolean55 = managementDashboard50.keyUp(event53, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener56 = null;
        managementDashboard50.addInputMethodListener(inputMethodListener56);
        java.awt.Dimension dimension58 = managementDashboard50.getMaximumSize();
        int int59 = managementDashboard35.getComponentZOrder((java.awt.Component) managementDashboard50);
        javax.swing.KeyStroke keyStroke60 = null;
        int int61 = managementDashboard35.getConditionForKeyStroke(keyStroke60);
        managementDashboard35.transferFocusUpCycle();
        java.awt.image.ImageProducer imageProducer63 = null;
        java.awt.Image image64 = managementDashboard35.createImage(imageProducer63);
        java.util.function.Consumer<java.lang.String> strConsumer65 = null;
        ManagementDashboard managementDashboard66 = new ManagementDashboard(strConsumer65);
        managementDashboard66.setRequestFocusEnabled(false);
        java.awt.Event event69 = null;
        boolean boolean71 = managementDashboard66.keyUp(event69, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener72 = null;
        managementDashboard66.addInputMethodListener(inputMethodListener72);
        java.awt.image.VolatileImage volatileImage76 = managementDashboard66.createVolatileImage((int) (short) 0, 1);
        boolean boolean77 = managementDashboard66.isOptimizedDrawingEnabled();
        javax.swing.ActionMap actionMap78 = managementDashboard66.getActionMap();
        int int79 = managementDashboard26.checkImage(image64, (java.awt.image.ImageObserver) managementDashboard66);
        boolean boolean80 = managementDashboard15.action(event24, (java.lang.Object) image64);
        java.awt.event.MouseMotionListener mouseMotionListener81 = null;
        managementDashboard15.addMouseMotionListener(mouseMotionListener81);
        java.util.Set<java.awt.AWTKeyStroke> aWTKeyStrokeSet84 = managementDashboard15.getFocusTraversalKeys(1);
        // The following exception was thrown during execution in test generation
        try {
            managementDashboard1.setFocusTraversalKeys(8, aWTKeyStrokeSet84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior12 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior12.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(inputMethodRequests17);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(dimension58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(image64);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(volatileImage76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(actionMap78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(aWTKeyStrokeSet84);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        managementDashboard1.setAutoscrolls(true);
        int int9 = managementDashboard1.getDebugGraphicsOptions();
        boolean boolean10 = managementDashboard1.isMaximumSizeSet();
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        ManagementDashboard managementDashboard12 = new ManagementDashboard(strConsumer11);
        boolean boolean13 = managementDashboard12.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests14 = managementDashboard12.getInputMethodRequests();
        managementDashboard12.move((int) (byte) 1, (int) '#');
        managementDashboard12.layout();
        managementDashboard12.setEnabled(false);
        java.awt.Event event21 = null;
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        managementDashboard23.setInheritsPopupMenu(true);
        managementDashboard23.setName("");
        managementDashboard23.doLayout();
        java.awt.event.KeyListener keyListener29 = null;
        managementDashboard23.addKeyListener(keyListener29);
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        managementDashboard32.setInheritsPopupMenu(true);
        boolean boolean35 = managementDashboard32.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget36 = null;
        managementDashboard32.setDropTarget(dropTarget36);
        boolean boolean38 = managementDashboard32.getAutoscrolls();
        java.util.function.Consumer<java.lang.String> strConsumer39 = null;
        ManagementDashboard managementDashboard40 = new ManagementDashboard(strConsumer39);
        managementDashboard40.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy43 = null;
        managementDashboard40.setFocusTraversalPolicy(focusTraversalPolicy43);
        java.lang.Object obj45 = managementDashboard32.getClientProperty((java.lang.Object) managementDashboard40);
        java.util.function.Consumer<java.lang.String> strConsumer46 = null;
        ManagementDashboard managementDashboard47 = new ManagementDashboard(strConsumer46);
        managementDashboard47.setRequestFocusEnabled(false);
        java.awt.Event event50 = null;
        boolean boolean52 = managementDashboard47.keyUp(event50, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener53 = null;
        managementDashboard47.addInputMethodListener(inputMethodListener53);
        java.awt.Dimension dimension55 = managementDashboard47.getMaximumSize();
        int int56 = managementDashboard32.getComponentZOrder((java.awt.Component) managementDashboard47);
        javax.swing.KeyStroke keyStroke57 = null;
        int int58 = managementDashboard32.getConditionForKeyStroke(keyStroke57);
        managementDashboard32.transferFocusUpCycle();
        java.awt.image.ImageProducer imageProducer60 = null;
        java.awt.Image image61 = managementDashboard32.createImage(imageProducer60);
        java.util.function.Consumer<java.lang.String> strConsumer62 = null;
        ManagementDashboard managementDashboard63 = new ManagementDashboard(strConsumer62);
        managementDashboard63.setRequestFocusEnabled(false);
        java.awt.Event event66 = null;
        boolean boolean68 = managementDashboard63.keyUp(event66, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener69 = null;
        managementDashboard63.addInputMethodListener(inputMethodListener69);
        java.awt.image.VolatileImage volatileImage73 = managementDashboard63.createVolatileImage((int) (short) 0, 1);
        boolean boolean74 = managementDashboard63.isOptimizedDrawingEnabled();
        javax.swing.ActionMap actionMap75 = managementDashboard63.getActionMap();
        int int76 = managementDashboard23.checkImage(image61, (java.awt.image.ImageObserver) managementDashboard63);
        boolean boolean77 = managementDashboard12.action(event21, (java.lang.Object) image61);
        java.util.function.Consumer<java.lang.String> strConsumer78 = null;
        ManagementDashboard managementDashboard79 = new ManagementDashboard(strConsumer78);
        managementDashboard79.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy82 = null;
        managementDashboard79.setFocusTraversalPolicy(focusTraversalPolicy82);
        java.awt.Event event84 = null;
        boolean boolean87 = managementDashboard79.mouseDrag(event84, (int) (short) 10, 4);
        java.beans.PropertyChangeListener propertyChangeListener89 = null;
        managementDashboard79.removePropertyChangeListener("hi!", propertyChangeListener89);
        boolean boolean91 = managementDashboard79.isMaximumSizeSet();
        java.awt.Font font92 = managementDashboard79.getFont();
        managementDashboard12.setFont(font92);
        java.awt.FontMetrics fontMetrics94 = managementDashboard1.getFontMetrics(font92);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(inputMethodRequests14);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(dimension55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(image61);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(volatileImage73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(actionMap75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(font92);
        org.junit.Assert.assertNotNull(fontMetrics94);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.event.ContainerListener containerListener5 = null;
        managementDashboard1.removeContainerListener(containerListener5);
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = managementDashboard1.getFocusTraversalPolicy();
        managementDashboard1.remove(1);
        managementDashboard1.setVisible(true);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener12 = null;
        managementDashboard1.removeHierarchyBoundsListener(hierarchyBoundsListener12);
        javax.swing.JToolTip jToolTip14 = managementDashboard1.createToolTip();
        boolean boolean15 = managementDashboard1.isOpaque();
        javax.swing.border.Border border16 = null;
        managementDashboard1.setBorder(border16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        managementDashboard19.setRequestFocusEnabled(false);
        java.awt.Event event22 = null;
        boolean boolean24 = managementDashboard19.keyUp(event22, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener25 = null;
        managementDashboard19.addInputMethodListener(inputMethodListener25);
        java.awt.image.VolatileImage volatileImage29 = managementDashboard19.createVolatileImage((int) (short) 0, 1);
        managementDashboard19.doLayout();
        java.util.function.Consumer<java.lang.String> strConsumer31 = null;
        ManagementDashboard managementDashboard32 = new ManagementDashboard(strConsumer31);
        managementDashboard32.setInheritsPopupMenu(true);
        boolean boolean35 = managementDashboard32.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget36 = null;
        managementDashboard32.setDropTarget(dropTarget36);
        java.awt.Dimension dimension38 = null;
        managementDashboard32.setPreferredSize(dimension38);
        javax.swing.event.AncestorListener ancestorListener40 = null;
        managementDashboard32.removeAncestorListener(ancestorListener40);
        java.awt.Dimension dimension42 = managementDashboard32.getPreferredSize();
        java.util.function.Consumer<java.lang.String> strConsumer43 = null;
        ManagementDashboard managementDashboard44 = new ManagementDashboard(strConsumer43);
        managementDashboard44.setInheritsPopupMenu(true);
        boolean boolean47 = managementDashboard44.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget48 = null;
        managementDashboard44.setDropTarget(dropTarget48);
        java.awt.Dimension dimension50 = null;
        managementDashboard44.setPreferredSize(dimension50);
        java.awt.Event event52 = null;
        boolean boolean55 = managementDashboard44.mouseExit(event52, (int) 'a', (int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer56 = null;
        ManagementDashboard managementDashboard57 = new ManagementDashboard(strConsumer56);
        boolean boolean58 = managementDashboard57.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests59 = managementDashboard57.getInputMethodRequests();
        java.awt.Container container60 = managementDashboard57.getTopLevelAncestor();
        java.awt.Color color61 = null;
        managementDashboard57.setForeground(color61);
        javax.swing.KeyStroke keyStroke63 = null;
        java.awt.event.ActionListener actionListener64 = managementDashboard57.getActionForKeyStroke(keyStroke63);
        javax.swing.JToolTip jToolTip65 = managementDashboard57.createToolTip();
        java.awt.Event event66 = null;
        java.util.function.Consumer<java.lang.String> strConsumer67 = null;
        ManagementDashboard managementDashboard68 = new ManagementDashboard(strConsumer67);
        managementDashboard68.setInheritsPopupMenu(true);
        boolean boolean71 = managementDashboard68.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget72 = null;
        managementDashboard68.setDropTarget(dropTarget72);
        java.awt.Dimension dimension74 = null;
        managementDashboard68.setPreferredSize(dimension74);
        javax.swing.event.AncestorListener ancestorListener76 = null;
        managementDashboard68.removeAncestorListener(ancestorListener76);
        java.awt.Dimension dimension78 = managementDashboard68.getPreferredSize();
        java.awt.Dimension dimension79 = managementDashboard68.getPreferredSize();
        managementDashboard68.setDebugGraphicsOptions(10);
        boolean boolean82 = jToolTip65.lostFocus(event66, (java.lang.Object) managementDashboard68);
        java.awt.Rectangle rectangle83 = jToolTip65.bounds();
        managementDashboard44.computeVisibleRect(rectangle83);
        managementDashboard32.computeVisibleRect(rectangle83);
        java.util.function.Consumer<java.lang.String> strConsumer86 = null;
        ManagementDashboard managementDashboard87 = new ManagementDashboard(strConsumer86);
        managementDashboard87.setRequestFocusEnabled(false);
        managementDashboard87.enable();
        managementDashboard87.list();
        java.awt.Point point92 = managementDashboard87.location();
        managementDashboard87.removeAll();
        java.awt.Color color94 = managementDashboard87.getBackground();
        managementDashboard32.setForeground(color94);
        // The following exception was thrown during execution in test generation
        try {
            managementDashboard1.add((java.awt.Component) managementDashboard19, (java.lang.Object) color94);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cannot add to layout: constraint must be a string (or null)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(focusTraversalPolicy7);
        org.junit.Assert.assertNotNull(jToolTip14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(volatileImage29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dimension42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(inputMethodRequests59);
        org.junit.Assert.assertNull(container60);
        org.junit.Assert.assertNull(actionListener64);
        org.junit.Assert.assertNotNull(jToolTip65);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(dimension78);
        org.junit.Assert.assertNotNull(dimension79);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(rectangle83);
        org.junit.Assert.assertNotNull(point92);
        org.junit.Assert.assertNotNull(color94);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        managementDashboard1.setAutoscrolls(true);
        int int9 = managementDashboard1.getDebugGraphicsOptions();
        boolean boolean10 = managementDashboard1.isMaximumSizeSet();
        managementDashboard1.addNotify();
        java.awt.im.InputContext inputContext12 = managementDashboard1.getInputContext();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(inputContext12);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        boolean boolean4 = managementDashboard1.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget5 = null;
        managementDashboard1.setDropTarget(dropTarget5);
        java.awt.Dimension dimension7 = null;
        managementDashboard1.setPreferredSize(dimension7);
        managementDashboard1.invalidate();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener10 = null;
        managementDashboard1.removeHierarchyBoundsListener(hierarchyBoundsListener10);
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = managementDashboard1.getFocusTraversalPolicy();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(focusTraversalPolicy12);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        managementDashboard1.move((int) (byte) 1, (int) '#');
        managementDashboard1.layout();
        managementDashboard1.setEnabled(false);
        java.awt.Event event10 = null;
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        ManagementDashboard managementDashboard12 = new ManagementDashboard(strConsumer11);
        managementDashboard12.setInheritsPopupMenu(true);
        managementDashboard12.setName("");
        managementDashboard12.doLayout();
        java.awt.event.KeyListener keyListener18 = null;
        managementDashboard12.addKeyListener(keyListener18);
        java.util.function.Consumer<java.lang.String> strConsumer20 = null;
        ManagementDashboard managementDashboard21 = new ManagementDashboard(strConsumer20);
        managementDashboard21.setInheritsPopupMenu(true);
        boolean boolean24 = managementDashboard21.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget25 = null;
        managementDashboard21.setDropTarget(dropTarget25);
        boolean boolean27 = managementDashboard21.getAutoscrolls();
        java.util.function.Consumer<java.lang.String> strConsumer28 = null;
        ManagementDashboard managementDashboard29 = new ManagementDashboard(strConsumer28);
        managementDashboard29.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy32 = null;
        managementDashboard29.setFocusTraversalPolicy(focusTraversalPolicy32);
        java.lang.Object obj34 = managementDashboard21.getClientProperty((java.lang.Object) managementDashboard29);
        java.util.function.Consumer<java.lang.String> strConsumer35 = null;
        ManagementDashboard managementDashboard36 = new ManagementDashboard(strConsumer35);
        managementDashboard36.setRequestFocusEnabled(false);
        java.awt.Event event39 = null;
        boolean boolean41 = managementDashboard36.keyUp(event39, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener42 = null;
        managementDashboard36.addInputMethodListener(inputMethodListener42);
        java.awt.Dimension dimension44 = managementDashboard36.getMaximumSize();
        int int45 = managementDashboard21.getComponentZOrder((java.awt.Component) managementDashboard36);
        javax.swing.KeyStroke keyStroke46 = null;
        int int47 = managementDashboard21.getConditionForKeyStroke(keyStroke46);
        managementDashboard21.transferFocusUpCycle();
        java.awt.image.ImageProducer imageProducer49 = null;
        java.awt.Image image50 = managementDashboard21.createImage(imageProducer49);
        java.util.function.Consumer<java.lang.String> strConsumer51 = null;
        ManagementDashboard managementDashboard52 = new ManagementDashboard(strConsumer51);
        managementDashboard52.setRequestFocusEnabled(false);
        java.awt.Event event55 = null;
        boolean boolean57 = managementDashboard52.keyUp(event55, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener58 = null;
        managementDashboard52.addInputMethodListener(inputMethodListener58);
        java.awt.image.VolatileImage volatileImage62 = managementDashboard52.createVolatileImage((int) (short) 0, 1);
        boolean boolean63 = managementDashboard52.isOptimizedDrawingEnabled();
        javax.swing.ActionMap actionMap64 = managementDashboard52.getActionMap();
        int int65 = managementDashboard12.checkImage(image50, (java.awt.image.ImageObserver) managementDashboard52);
        boolean boolean66 = managementDashboard1.action(event10, (java.lang.Object) image50);
        managementDashboard1.doLayout();
        java.awt.Dimension dimension68 = null;
        managementDashboard1.setMaximumSize(dimension68);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(dimension44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(image50);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(volatileImage62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(actionMap64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        javax.swing.KeyStroke keyStroke7 = null;
        java.awt.event.ActionListener actionListener8 = managementDashboard1.getActionForKeyStroke(keyStroke7);
        javax.swing.JToolTip jToolTip9 = managementDashboard1.createToolTip();
        java.awt.Event event10 = null;
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        ManagementDashboard managementDashboard12 = new ManagementDashboard(strConsumer11);
        managementDashboard12.setInheritsPopupMenu(true);
        boolean boolean15 = managementDashboard12.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget16 = null;
        managementDashboard12.setDropTarget(dropTarget16);
        java.awt.Dimension dimension18 = null;
        managementDashboard12.setPreferredSize(dimension18);
        javax.swing.event.AncestorListener ancestorListener20 = null;
        managementDashboard12.removeAncestorListener(ancestorListener20);
        java.awt.Dimension dimension22 = managementDashboard12.getPreferredSize();
        java.awt.Dimension dimension23 = managementDashboard12.getPreferredSize();
        managementDashboard12.setDebugGraphicsOptions(10);
        boolean boolean26 = jToolTip9.lostFocus(event10, (java.lang.Object) managementDashboard12);
        jToolTip9.setFocusTraversalPolicyProvider(true);
        java.lang.Object obj29 = jToolTip9.getTreeLock();
        java.awt.event.InputMethodListener inputMethodListener30 = null;
        jToolTip9.removeInputMethodListener(inputMethodListener30);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(actionListener8);
        org.junit.Assert.assertNotNull(jToolTip9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dimension22);
        org.junit.Assert.assertNotNull(dimension23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        managementDashboard1.repaint(10, 100, 0, (int) (short) 1);
        boolean boolean12 = managementDashboard1.requestFocusInWindow();
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        managementDashboard14.setRequestFocusEnabled(false);
        java.awt.Event event17 = null;
        boolean boolean19 = managementDashboard14.keyUp(event17, (int) (short) 1);
        managementDashboard14.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        managementDashboard14.removePropertyChangeListener("", propertyChangeListener23);
        managementDashboard14.doLayout();
        javax.swing.JPopupMenu jPopupMenu26 = managementDashboard14.getComponentPopupMenu();
        java.awt.Component component28 = managementDashboard1.add((java.awt.Component) managementDashboard14, 1);
        java.awt.Rectangle rectangle29 = managementDashboard1.getBounds();
        java.util.function.Consumer<java.lang.String> strConsumer30 = null;
        ManagementDashboard managementDashboard31 = new ManagementDashboard(strConsumer30);
        boolean boolean32 = managementDashboard31.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests33 = managementDashboard31.getInputMethodRequests();
        java.awt.Container container34 = managementDashboard31.getTopLevelAncestor();
        java.awt.Color color35 = null;
        managementDashboard31.setForeground(color35);
        managementDashboard31.repaint(10, 100, 0, (int) (short) 1);
        boolean boolean42 = managementDashboard31.requestFocusInWindow();
        java.util.function.Consumer<java.lang.String> strConsumer43 = null;
        ManagementDashboard managementDashboard44 = new ManagementDashboard(strConsumer43);
        managementDashboard44.setRequestFocusEnabled(false);
        java.awt.Event event47 = null;
        boolean boolean49 = managementDashboard44.keyUp(event47, (int) (short) 1);
        managementDashboard44.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener53 = null;
        managementDashboard44.removePropertyChangeListener("", propertyChangeListener53);
        managementDashboard44.doLayout();
        javax.swing.JPopupMenu jPopupMenu56 = managementDashboard44.getComponentPopupMenu();
        java.awt.Component component58 = managementDashboard31.add((java.awt.Component) managementDashboard44, 1);
        java.awt.Rectangle rectangle59 = managementDashboard31.getBounds();
        java.lang.Object obj60 = managementDashboard1.getClientProperty((java.lang.Object) rectangle59);
        boolean boolean61 = managementDashboard1.isBackgroundSet();
        java.awt.event.MouseListener mouseListener62 = null;
        managementDashboard1.addMouseListener(mouseListener62);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(jPopupMenu26);
        org.junit.Assert.assertNotNull(component28);
        org.junit.Assert.assertNotNull(rectangle29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(inputMethodRequests33);
        org.junit.Assert.assertNull(container34);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(jPopupMenu56);
        org.junit.Assert.assertNotNull(component58);
        org.junit.Assert.assertNotNull(rectangle59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener7 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener7);
        managementDashboard1.move((int) (byte) 0, 8);
        java.awt.Event event12 = null;
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        boolean boolean15 = managementDashboard14.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests16 = managementDashboard14.getInputMethodRequests();
        java.awt.Container container17 = managementDashboard14.getTopLevelAncestor();
        boolean boolean18 = managementDashboard1.gotFocus(event12, (java.lang.Object) container17);
        managementDashboard1.hide();
        java.awt.Container container20 = managementDashboard1.getTopLevelAncestor();
        managementDashboard1.setAlignmentX((float) 64);
        java.awt.Insets insets23 = managementDashboard1.insets();
        managementDashboard1.invalidate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputMethodRequests16);
        org.junit.Assert.assertNull(container17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(container20);
        org.junit.Assert.assertNotNull(insets23);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        managementDashboard1.repaint(10, 100, 0, (int) (short) 1);
        boolean boolean12 = managementDashboard1.requestFocusInWindow();
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        managementDashboard14.setRequestFocusEnabled(false);
        java.awt.Event event17 = null;
        boolean boolean19 = managementDashboard14.keyUp(event17, (int) (short) 1);
        managementDashboard14.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        managementDashboard14.removePropertyChangeListener("", propertyChangeListener23);
        managementDashboard14.doLayout();
        javax.swing.JPopupMenu jPopupMenu26 = managementDashboard14.getComponentPopupMenu();
        java.awt.Component component28 = managementDashboard1.add((java.awt.Component) managementDashboard14, 1);
        managementDashboard14.firePropertyChange("ToolTipText", (short) 1, (short) (byte) 100);
        boolean boolean33 = managementDashboard14.isFocusTraversalPolicyProvider();
        javax.swing.JPopupMenu jPopupMenu34 = managementDashboard14.getComponentPopupMenu();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(jPopupMenu26);
        org.junit.Assert.assertNotNull(component28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(jPopupMenu34);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        ParkingLot parkingLot1 = new ParkingLot("data/userData.csv");
        ParkingSpace parkingSpace3 = parkingLot1.getSpace((int) (byte) 10);
        parkingSpace3.empty();
        parkingSpace3.book("PanelUI");
        org.junit.Assert.assertNotNull(parkingSpace3);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        managementDashboard1.list();
        javax.swing.plaf.PanelUI panelUI8 = managementDashboard1.getUI();
        boolean boolean9 = managementDashboard1.getAutoscrolls();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(panelUI8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        managementDashboard5.setInheritsPopupMenu(true);
        boolean boolean8 = managementDashboard5.isValidateRoot();
        int int9 = managementDashboard1.getComponentZOrder((java.awt.Component) managementDashboard5);
        managementDashboard5.requestFocus();
        java.awt.Toolkit toolkit11 = managementDashboard5.getToolkit();
        managementDashboard5.setFocusTraversalPolicyProvider(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(toolkit11);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        javax.swing.KeyStroke keyStroke7 = null;
        java.awt.event.ActionListener actionListener8 = managementDashboard1.getActionForKeyStroke(keyStroke7);
        javax.swing.JToolTip jToolTip9 = managementDashboard1.createToolTip();
        java.awt.Event event10 = null;
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        ManagementDashboard managementDashboard12 = new ManagementDashboard(strConsumer11);
        managementDashboard12.setInheritsPopupMenu(true);
        boolean boolean15 = managementDashboard12.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget16 = null;
        managementDashboard12.setDropTarget(dropTarget16);
        java.awt.Dimension dimension18 = null;
        managementDashboard12.setPreferredSize(dimension18);
        javax.swing.event.AncestorListener ancestorListener20 = null;
        managementDashboard12.removeAncestorListener(ancestorListener20);
        java.awt.Dimension dimension22 = managementDashboard12.getPreferredSize();
        java.awt.Dimension dimension23 = managementDashboard12.getPreferredSize();
        managementDashboard12.setDebugGraphicsOptions(10);
        boolean boolean26 = jToolTip9.lostFocus(event10, (java.lang.Object) managementDashboard12);
        jToolTip9.layout();
        java.awt.Image image30 = jToolTip9.createImage((-1), (int) '4');
        java.awt.event.ContainerListener containerListener31 = null;
        jToolTip9.removeContainerListener(containerListener31);
        jToolTip9.revalidate();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(actionListener8);
        org.junit.Assert.assertNotNull(jToolTip9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dimension22);
        org.junit.Assert.assertNotNull(dimension23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(image30);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        java.awt.LayoutManager layoutManager4 = null;
        managementDashboard1.setLayout(layoutManager4);
        managementDashboard1.setFocusTraversalPolicyProvider(true);
        java.awt.Dimension dimension8 = managementDashboard1.getMaximumSize();
        java.util.function.Consumer<java.lang.String> strConsumer9 = null;
        ManagementDashboard managementDashboard10 = new ManagementDashboard(strConsumer9);
        managementDashboard10.setRequestFocusEnabled(false);
        java.awt.Event event13 = null;
        boolean boolean15 = managementDashboard10.keyUp(event13, (int) (short) 1);
        managementDashboard10.list();
        javax.swing.plaf.PanelUI panelUI17 = managementDashboard10.getUI();
        managementDashboard1.setUI(panelUI17);
        java.awt.Event event19 = null;
        // The following exception was thrown during execution in test generation
        try {
            managementDashboard1.deliverEvent(event19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(panelUI17);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        ParkingLot parkingLot1 = new ParkingLot("data/userData.csv");
        ParkingSpace[] parkingSpaceArray2 = parkingLot1.getSpaces();
        parkingLot1.setEnabled(true);
        ParkingSpace parkingSpace6 = parkingLot1.getSpace((int) '#');
        parkingSpace6.setMaintenance();
        parkingSpace6.book("PanelUI");
        org.junit.Assert.assertNotNull(parkingSpaceArray2);
        org.junit.Assert.assertNotNull(parkingSpace6);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        boolean boolean4 = managementDashboard1.isValidateRoot();
        java.awt.LayoutManager layoutManager5 = null;
        managementDashboard1.setLayout(layoutManager5);
        boolean boolean7 = managementDashboard1.getFocusTraversalKeysEnabled();
        java.awt.Event event8 = null;
        boolean boolean11 = managementDashboard1.mouseEnter(event8, (int) (byte) 0, 0);
        java.awt.event.MouseEvent mouseEvent12 = null;
        java.awt.Point point13 = managementDashboard1.getPopupLocation(mouseEvent12);
        java.util.function.Consumer<java.lang.String> strConsumer14 = null;
        ManagementDashboard managementDashboard15 = new ManagementDashboard(strConsumer14);
        managementDashboard15.setInheritsPopupMenu(true);
        boolean boolean18 = managementDashboard15.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget19 = null;
        managementDashboard15.setDropTarget(dropTarget19);
        boolean boolean21 = managementDashboard15.getAutoscrolls();
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        managementDashboard23.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy26 = null;
        managementDashboard23.setFocusTraversalPolicy(focusTraversalPolicy26);
        java.lang.Object obj28 = managementDashboard15.getClientProperty((java.lang.Object) managementDashboard23);
        java.util.function.Consumer<java.lang.String> strConsumer29 = null;
        ManagementDashboard managementDashboard30 = new ManagementDashboard(strConsumer29);
        managementDashboard30.setRequestFocusEnabled(false);
        java.awt.Event event33 = null;
        boolean boolean35 = managementDashboard30.keyUp(event33, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener36 = null;
        managementDashboard30.addInputMethodListener(inputMethodListener36);
        java.awt.Dimension dimension38 = managementDashboard30.getMaximumSize();
        int int39 = managementDashboard15.getComponentZOrder((java.awt.Component) managementDashboard30);
        java.awt.Component component40 = managementDashboard15.getNextFocusableComponent();
        java.awt.Insets insets41 = managementDashboard15.insets();
        java.awt.Insets insets42 = managementDashboard1.getInsets(insets41);
        managementDashboard1.setIgnoreRepaint(true);
        boolean boolean45 = managementDashboard1.isPaintingTile();
        java.awt.Point point46 = managementDashboard1.getLocation();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(point13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dimension38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNull(component40);
        org.junit.Assert.assertNotNull(insets41);
        org.junit.Assert.assertNotNull(insets42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(point46);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        managementDashboard1.move((int) (byte) 1, (int) '#');
        managementDashboard1.layout();
        managementDashboard1.setEnabled(false);
        int int10 = managementDashboard1.getY();
        managementDashboard1.setName("Empty");
        boolean boolean13 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) managementDashboard1);
        boolean boolean14 = managementDashboard1.isForegroundSet();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        boolean boolean4 = managementDashboard1.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget5 = null;
        managementDashboard1.setDropTarget(dropTarget5);
        boolean boolean7 = managementDashboard1.getAutoscrolls();
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        managementDashboard9.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        managementDashboard9.setFocusTraversalPolicy(focusTraversalPolicy12);
        java.lang.Object obj14 = managementDashboard1.getClientProperty((java.lang.Object) managementDashboard9);
        java.util.function.Consumer<java.lang.String> strConsumer15 = null;
        ManagementDashboard managementDashboard16 = new ManagementDashboard(strConsumer15);
        managementDashboard16.setRequestFocusEnabled(false);
        java.awt.Event event19 = null;
        boolean boolean21 = managementDashboard16.keyUp(event19, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener22 = null;
        managementDashboard16.addInputMethodListener(inputMethodListener22);
        java.awt.Dimension dimension24 = managementDashboard16.getMaximumSize();
        int int25 = managementDashboard1.getComponentZOrder((java.awt.Component) managementDashboard16);
        managementDashboard1.setSize((int) (short) -1, (int) (short) -1);
        boolean boolean29 = managementDashboard1.isPaintingTile();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dimension24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        UserDashboard userDashboard1 = new UserDashboard(strConsumer0);
        userDashboard1.transferFocusDownCycle();
        boolean boolean3 = userDashboard1.isManagingFocus();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener4 = null;
        userDashboard1.removeHierarchyBoundsListener(hierarchyBoundsListener4);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        managementDashboard5.setInheritsPopupMenu(true);
        boolean boolean8 = managementDashboard5.isValidateRoot();
        int int9 = managementDashboard1.getComponentZOrder((java.awt.Component) managementDashboard5);
        java.awt.Dimension dimension10 = managementDashboard1.size();
        java.awt.dnd.DropTarget dropTarget11 = null;
        managementDashboard1.setDropTarget(dropTarget11);
        java.awt.Image image15 = managementDashboard1.createImage(2, 16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertNull(image15);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        boolean boolean4 = managementDashboard1.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget5 = null;
        managementDashboard1.setDropTarget(dropTarget5);
        boolean boolean7 = managementDashboard1.getAutoscrolls();
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        managementDashboard9.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        managementDashboard9.setFocusTraversalPolicy(focusTraversalPolicy12);
        java.lang.Object obj14 = managementDashboard1.getClientProperty((java.lang.Object) managementDashboard9);
        java.util.function.Consumer<java.lang.String> strConsumer15 = null;
        ManagementDashboard managementDashboard16 = new ManagementDashboard(strConsumer15);
        managementDashboard16.setRequestFocusEnabled(false);
        java.awt.Event event19 = null;
        boolean boolean21 = managementDashboard16.keyUp(event19, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener22 = null;
        managementDashboard16.addInputMethodListener(inputMethodListener22);
        java.awt.Dimension dimension24 = managementDashboard16.getMaximumSize();
        int int25 = managementDashboard1.getComponentZOrder((java.awt.Component) managementDashboard16);
        managementDashboard1.setSize((int) (short) -1, (int) (short) -1);
        javax.swing.KeyStroke keyStroke29 = null;
        int int30 = managementDashboard1.getConditionForKeyStroke(keyStroke29);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dimension24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        managementDashboard1.move((int) (byte) 1, (int) '#');
        managementDashboard1.layout();
        managementDashboard1.setEnabled(false);
        java.awt.Event event10 = null;
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        ManagementDashboard managementDashboard12 = new ManagementDashboard(strConsumer11);
        managementDashboard12.setInheritsPopupMenu(true);
        managementDashboard12.setName("");
        managementDashboard12.doLayout();
        java.awt.event.KeyListener keyListener18 = null;
        managementDashboard12.addKeyListener(keyListener18);
        java.util.function.Consumer<java.lang.String> strConsumer20 = null;
        ManagementDashboard managementDashboard21 = new ManagementDashboard(strConsumer20);
        managementDashboard21.setInheritsPopupMenu(true);
        boolean boolean24 = managementDashboard21.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget25 = null;
        managementDashboard21.setDropTarget(dropTarget25);
        boolean boolean27 = managementDashboard21.getAutoscrolls();
        java.util.function.Consumer<java.lang.String> strConsumer28 = null;
        ManagementDashboard managementDashboard29 = new ManagementDashboard(strConsumer28);
        managementDashboard29.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy32 = null;
        managementDashboard29.setFocusTraversalPolicy(focusTraversalPolicy32);
        java.lang.Object obj34 = managementDashboard21.getClientProperty((java.lang.Object) managementDashboard29);
        java.util.function.Consumer<java.lang.String> strConsumer35 = null;
        ManagementDashboard managementDashboard36 = new ManagementDashboard(strConsumer35);
        managementDashboard36.setRequestFocusEnabled(false);
        java.awt.Event event39 = null;
        boolean boolean41 = managementDashboard36.keyUp(event39, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener42 = null;
        managementDashboard36.addInputMethodListener(inputMethodListener42);
        java.awt.Dimension dimension44 = managementDashboard36.getMaximumSize();
        int int45 = managementDashboard21.getComponentZOrder((java.awt.Component) managementDashboard36);
        javax.swing.KeyStroke keyStroke46 = null;
        int int47 = managementDashboard21.getConditionForKeyStroke(keyStroke46);
        managementDashboard21.transferFocusUpCycle();
        java.awt.image.ImageProducer imageProducer49 = null;
        java.awt.Image image50 = managementDashboard21.createImage(imageProducer49);
        java.util.function.Consumer<java.lang.String> strConsumer51 = null;
        ManagementDashboard managementDashboard52 = new ManagementDashboard(strConsumer51);
        managementDashboard52.setRequestFocusEnabled(false);
        java.awt.Event event55 = null;
        boolean boolean57 = managementDashboard52.keyUp(event55, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener58 = null;
        managementDashboard52.addInputMethodListener(inputMethodListener58);
        java.awt.image.VolatileImage volatileImage62 = managementDashboard52.createVolatileImage((int) (short) 0, 1);
        boolean boolean63 = managementDashboard52.isOptimizedDrawingEnabled();
        javax.swing.ActionMap actionMap64 = managementDashboard52.getActionMap();
        int int65 = managementDashboard12.checkImage(image50, (java.awt.image.ImageObserver) managementDashboard52);
        boolean boolean66 = managementDashboard1.action(event10, (java.lang.Object) image50);
        managementDashboard1.doLayout();
        java.awt.Event event68 = null;
        boolean boolean71 = managementDashboard1.mouseDown(event68, 128, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(dimension44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(image50);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(volatileImage62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(actionMap64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        javax.swing.KeyStroke keyStroke7 = null;
        java.awt.event.ActionListener actionListener8 = managementDashboard1.getActionForKeyStroke(keyStroke7);
        javax.swing.JToolTip jToolTip9 = managementDashboard1.createToolTip();
        java.awt.Event event10 = null;
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        ManagementDashboard managementDashboard12 = new ManagementDashboard(strConsumer11);
        managementDashboard12.setInheritsPopupMenu(true);
        boolean boolean15 = managementDashboard12.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget16 = null;
        managementDashboard12.setDropTarget(dropTarget16);
        java.awt.Dimension dimension18 = null;
        managementDashboard12.setPreferredSize(dimension18);
        javax.swing.event.AncestorListener ancestorListener20 = null;
        managementDashboard12.removeAncestorListener(ancestorListener20);
        java.awt.Dimension dimension22 = managementDashboard12.getPreferredSize();
        java.awt.Dimension dimension23 = managementDashboard12.getPreferredSize();
        managementDashboard12.setDebugGraphicsOptions(10);
        boolean boolean26 = jToolTip9.lostFocus(event10, (java.lang.Object) managementDashboard12);
        javax.swing.JPopupMenu jPopupMenu27 = null;
        managementDashboard12.setComponentPopupMenu(jPopupMenu27);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray30 = managementDashboard12.getPropertyChangeListeners("data/lotData.csv");
        java.awt.Dimension dimension31 = managementDashboard12.getMaximumSize();
        java.awt.im.InputContext inputContext32 = managementDashboard12.getInputContext();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(actionListener8);
        org.junit.Assert.assertNotNull(jToolTip9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dimension22);
        org.junit.Assert.assertNotNull(dimension23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray30);
        org.junit.Assert.assertArrayEquals(propertyChangeListenerArray30, new java.beans.PropertyChangeListener[] {});
        org.junit.Assert.assertNotNull(dimension31);
        org.junit.Assert.assertNull(inputContext32);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        boolean boolean4 = managementDashboard1.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget5 = null;
        managementDashboard1.setDropTarget(dropTarget5);
        boolean boolean7 = managementDashboard1.getAutoscrolls();
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        managementDashboard9.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        managementDashboard9.setFocusTraversalPolicy(focusTraversalPolicy12);
        java.lang.Object obj14 = managementDashboard1.getClientProperty((java.lang.Object) managementDashboard9);
        java.util.function.Consumer<java.lang.String> strConsumer15 = null;
        ManagementDashboard managementDashboard16 = new ManagementDashboard(strConsumer15);
        managementDashboard16.setRequestFocusEnabled(false);
        java.awt.Event event19 = null;
        boolean boolean21 = managementDashboard16.keyUp(event19, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener22 = null;
        managementDashboard16.addInputMethodListener(inputMethodListener22);
        java.awt.Dimension dimension24 = managementDashboard16.getMaximumSize();
        int int25 = managementDashboard1.getComponentZOrder((java.awt.Component) managementDashboard16);
        managementDashboard1.setSize((int) (short) -1, (int) (short) -1);
        javax.swing.JRootPane jRootPane29 = managementDashboard1.getRootPane();
        managementDashboard1.paintImmediately(128, (int) (byte) 0, (int) (short) 1, 16);
        managementDashboard1.setDoubleBuffered(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dimension24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(jRootPane29);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        javax.swing.KeyStroke keyStroke7 = null;
        java.awt.event.ActionListener actionListener8 = managementDashboard1.getActionForKeyStroke(keyStroke7);
        javax.swing.JToolTip jToolTip9 = managementDashboard1.createToolTip();
        java.awt.Event event10 = null;
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        ManagementDashboard managementDashboard12 = new ManagementDashboard(strConsumer11);
        managementDashboard12.setInheritsPopupMenu(true);
        boolean boolean15 = managementDashboard12.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget16 = null;
        managementDashboard12.setDropTarget(dropTarget16);
        java.awt.Dimension dimension18 = null;
        managementDashboard12.setPreferredSize(dimension18);
        javax.swing.event.AncestorListener ancestorListener20 = null;
        managementDashboard12.removeAncestorListener(ancestorListener20);
        java.awt.Dimension dimension22 = managementDashboard12.getPreferredSize();
        java.awt.Dimension dimension23 = managementDashboard12.getPreferredSize();
        managementDashboard12.setDebugGraphicsOptions(10);
        boolean boolean26 = jToolTip9.lostFocus(event10, (java.lang.Object) managementDashboard12);
        boolean boolean27 = managementDashboard12.isOpaque();
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        managementDashboard12.addPropertyChangeListener("ToolTipText", propertyChangeListener29);
        java.awt.Component[] componentArray31 = managementDashboard12.getComponents();
        java.awt.Font font32 = null;
        managementDashboard12.setFont(font32);
        javax.swing.plaf.PanelUI panelUI34 = managementDashboard12.getUI();
        java.awt.event.HierarchyListener hierarchyListener35 = null;
        managementDashboard12.removeHierarchyListener(hierarchyListener35);
        java.lang.String str37 = managementDashboard12.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(actionListener8);
        org.junit.Assert.assertNotNull(jToolTip9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dimension22);
        org.junit.Assert.assertNotNull(dimension23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(componentArray31);
        org.junit.Assert.assertNotNull(panelUI34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=8388617,maximumSize=,minimumSize=,preferredSize=]" + "'", str37, "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=8388617,maximumSize=,minimumSize=,preferredSize=]");
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.event.ContainerListener containerListener5 = null;
        managementDashboard1.removeContainerListener(containerListener5);
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = managementDashboard1.getFocusTraversalPolicy();
        managementDashboard1.remove(1);
        managementDashboard1.setVisible(true);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener12 = null;
        managementDashboard1.removeHierarchyBoundsListener(hierarchyBoundsListener12);
        javax.swing.JToolTip jToolTip14 = managementDashboard1.createToolTip();
        boolean boolean15 = managementDashboard1.isOpaque();
        javax.swing.border.Border border16 = null;
        managementDashboard1.setBorder(border16);
        managementDashboard1.firePropertyChange("data/parkingSpaceData.csv", (double) ' ', (double) 'a');
        java.awt.event.ComponentListener componentListener22 = null;
        managementDashboard1.removeComponentListener(componentListener22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(focusTraversalPolicy7);
        org.junit.Assert.assertNotNull(jToolTip14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        managementDashboard1.setAutoscrolls(true);
        int int9 = managementDashboard1.getDebugGraphicsOptions();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener10 = null;
        managementDashboard1.removeHierarchyBoundsListener(hierarchyBoundsListener10);
        java.awt.Component component14 = managementDashboard1.findComponentAt((int) (short) 0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            component14.enable(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(component14);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        java.awt.event.HierarchyListener hierarchyListener7 = null;
        managementDashboard1.addHierarchyListener(hierarchyListener7);
        java.awt.Cursor cursor9 = null;
        managementDashboard1.setCursor(cursor9);
        java.awt.event.MouseEvent mouseEvent11 = null;
        java.awt.Point point12 = managementDashboard1.getToolTipLocation(mouseEvent11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(point12);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        boolean boolean4 = managementDashboard1.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget5 = null;
        managementDashboard1.setDropTarget(dropTarget5);
        boolean boolean7 = managementDashboard1.getAutoscrolls();
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        managementDashboard9.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        managementDashboard9.setFocusTraversalPolicy(focusTraversalPolicy12);
        java.lang.Object obj14 = managementDashboard1.getClientProperty((java.lang.Object) managementDashboard9);
        java.util.function.Consumer<java.lang.String> strConsumer15 = null;
        ManagementDashboard managementDashboard16 = new ManagementDashboard(strConsumer15);
        managementDashboard16.setRequestFocusEnabled(false);
        java.awt.Event event19 = null;
        boolean boolean21 = managementDashboard16.keyUp(event19, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener22 = null;
        managementDashboard16.addInputMethodListener(inputMethodListener22);
        java.awt.Dimension dimension24 = managementDashboard16.getMaximumSize();
        int int25 = managementDashboard1.getComponentZOrder((java.awt.Component) managementDashboard16);
        managementDashboard1.transferFocusBackward();
        java.awt.dnd.DropTarget dropTarget27 = null;
        managementDashboard1.setDropTarget(dropTarget27);
        managementDashboard1.reshape((int) (byte) -1, (int) (short) 0, (int) (short) 1, (int) (byte) 1);
        javax.accessibility.AccessibleContext accessibleContext34 = managementDashboard1.getAccessibleContext();
        java.util.function.Consumer<java.lang.String> strConsumer35 = null;
        ManagementDashboard managementDashboard36 = new ManagementDashboard(strConsumer35);
        managementDashboard36.setRequestFocusEnabled(false);
        java.awt.Event event39 = null;
        boolean boolean41 = managementDashboard36.keyUp(event39, (int) (short) 1);
        managementDashboard36.list();
        java.beans.VetoableChangeListener vetoableChangeListener43 = null;
        managementDashboard36.addVetoableChangeListener(vetoableChangeListener43);
        java.awt.Graphics graphics45 = null;
        managementDashboard36.print(graphics45);
        managementDashboard36.doLayout();
        java.awt.Dimension dimension48 = managementDashboard36.getMaximumSize();
        boolean boolean49 = managementDashboard1.isAncestorOf((java.awt.Component) managementDashboard36);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dimension24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(accessibleContext34);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(dimension48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        ParkingLot parkingLot1 = new ParkingLot("data/userData.csv");
        ParkingSpace parkingSpace3 = parkingLot1.getSpace((int) (byte) 10);
        parkingLot1.removeBooking(128);
        boolean boolean6 = parkingLot1.getEnabled();
        parkingLot1.setEnabled(true);
        parkingLot1.setEnabled(true);
        java.lang.String str11 = parkingLot1.getLotName();
        parkingLot1.setSpace((int) (short) 10, "", "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=37748745,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=2147483647,height=2147483647]]", "SUPERMAN");
        ParkingSpace[] parkingSpaceArray17 = parkingLot1.getSpaces();
        java.lang.String str18 = parkingLot1.getLotAvailability();
        org.junit.Assert.assertNotNull(parkingSpace3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "data/userData.csv" + "'", str11, "data/userData.csv");
        org.junit.Assert.assertNotNull(parkingSpaceArray17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy4 = null;
        managementDashboard1.setFocusTraversalPolicy(focusTraversalPolicy4);
        java.awt.Event event6 = null;
        boolean boolean9 = managementDashboard1.mouseDrag(event6, (int) (short) 10, 4);
        java.awt.Graphics graphics10 = null;
        managementDashboard1.update(graphics10);
        java.util.function.Consumer<java.lang.String> strConsumer12 = null;
        ManagementDashboard managementDashboard13 = new ManagementDashboard(strConsumer12);
        managementDashboard13.setInheritsPopupMenu(true);
        boolean boolean16 = managementDashboard13.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget17 = null;
        managementDashboard13.setDropTarget(dropTarget17);
        java.awt.Dimension dimension19 = null;
        managementDashboard13.setPreferredSize(dimension19);
        javax.swing.event.AncestorListener ancestorListener21 = null;
        managementDashboard13.removeAncestorListener(ancestorListener21);
        java.util.function.Consumer<java.lang.String> strConsumer23 = null;
        ManagementDashboard managementDashboard24 = new ManagementDashboard(strConsumer23);
        managementDashboard24.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy27 = null;
        managementDashboard24.setFocusTraversalPolicy(focusTraversalPolicy27);
        java.awt.Event event29 = null;
        boolean boolean32 = managementDashboard24.mouseDrag(event29, (int) (short) 10, 4);
        managementDashboard24.setEnabled(true);
        java.awt.Component component35 = managementDashboard13.add((java.awt.Component) managementDashboard24);
        java.awt.Event event36 = null;
        java.lang.Object obj37 = null;
        boolean boolean38 = managementDashboard13.action(event36, obj37);
        java.awt.Event event39 = null;
        boolean boolean41 = managementDashboard13.keyDown(event39, (int) (short) -1);
        javax.swing.InputVerifier inputVerifier42 = managementDashboard13.getInputVerifier();
        java.beans.VetoableChangeListener[] vetoableChangeListenerArray43 = managementDashboard13.getVetoableChangeListeners();
        managementDashboard13.paintImmediately((int) 'a', (int) (byte) 10, (int) (byte) 0, (-1));
        java.awt.LayoutManager layoutManager49 = managementDashboard13.getLayout();
        javax.accessibility.AccessibleContext accessibleContext50 = managementDashboard13.getAccessibleContext();
        java.awt.Rectangle rectangle51 = managementDashboard13.getBounds();
        java.awt.Component component52 = managementDashboard1.add((java.awt.Component) managementDashboard13);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(component35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(inputVerifier42);
        org.junit.Assert.assertNotNull(vetoableChangeListenerArray43);
        org.junit.Assert.assertArrayEquals(vetoableChangeListenerArray43, new java.beans.VetoableChangeListener[] {});
        org.junit.Assert.assertNotNull(layoutManager49);
        org.junit.Assert.assertNotNull(accessibleContext50);
        org.junit.Assert.assertNotNull(rectangle51);
        org.junit.Assert.assertNotNull(component52);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        boolean boolean4 = managementDashboard1.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget5 = null;
        managementDashboard1.setDropTarget(dropTarget5);
        java.awt.Dimension dimension7 = null;
        managementDashboard1.setPreferredSize(dimension7);
        managementDashboard1.addNotify();
        javax.swing.JPopupMenu jPopupMenu10 = null;
        managementDashboard1.setComponentPopupMenu(jPopupMenu10);
        java.awt.Event event12 = null;
        boolean boolean15 = managementDashboard1.mouseEnter(event12, (int) (short) 100, 64);
        managementDashboard1.repaint((int) 'a', 32, (int) (byte) 10, 1);
        managementDashboard1.show(true);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener23 = null;
        managementDashboard1.addHierarchyBoundsListener(hierarchyBoundsListener23);
        java.lang.String str25 = managementDashboard1.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=8388617,maximumSize=,minimumSize=,preferredSize=]" + "'", str25, "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=8388617,maximumSize=,minimumSize=,preferredSize=]");
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        managementDashboard1.move((int) (byte) 1, (int) '#');
        boolean boolean7 = managementDashboard1.isFocusTraversable();
        java.awt.event.FocusListener focusListener8 = null;
        managementDashboard1.removeFocusListener(focusListener8);
        java.awt.event.KeyListener[] keyListenerArray10 = managementDashboard1.getKeyListeners();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray11 = managementDashboard1.getHierarchyBoundsListeners();
        boolean boolean12 = managementDashboard1.isMaximumSizeSet();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(keyListenerArray10);
        org.junit.Assert.assertArrayEquals(keyListenerArray10, new java.awt.event.KeyListener[] {});
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray11);
        org.junit.Assert.assertArrayEquals(hierarchyBoundsListenerArray11, new java.awt.event.HierarchyBoundsListener[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        managementDashboard1.setAutoscrolls(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy9 = managementDashboard1.getFocusTraversalPolicy();
        javax.swing.KeyStroke keyStroke10 = null;
        managementDashboard1.unregisterKeyboardAction(keyStroke10);
        managementDashboard1.setLocation((int) (short) 1, 100);
        java.awt.event.HierarchyListener hierarchyListener15 = null;
        managementDashboard1.removeHierarchyListener(hierarchyListener15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(focusTraversalPolicy9);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        managementDashboard1.setAutoscrolls(true);
        managementDashboard1.layout();
        java.util.function.Consumer<java.lang.String> strConsumer10 = null;
        ManagementDashboard managementDashboard11 = new ManagementDashboard(strConsumer10);
        managementDashboard11.setInheritsPopupMenu(true);
        boolean boolean14 = managementDashboard11.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget15 = null;
        managementDashboard11.setDropTarget(dropTarget15);
        java.awt.Dimension dimension17 = null;
        managementDashboard11.setPreferredSize(dimension17);
        managementDashboard11.invalidate();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener20 = null;
        managementDashboard11.removeHierarchyBoundsListener(hierarchyBoundsListener20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        managementDashboard23.setInheritsPopupMenu(true);
        boolean boolean26 = managementDashboard23.isValidateRoot();
        java.awt.LayoutManager layoutManager27 = null;
        managementDashboard23.setLayout(layoutManager27);
        managementDashboard11.setComponentZOrder((java.awt.Component) managementDashboard23, (int) (short) 0);
        java.awt.Component component31 = managementDashboard1.add((java.awt.Component) managementDashboard11);
        managementDashboard1.disable();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(component31);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        managementDashboard1.move((int) (byte) 1, (int) '#');
        managementDashboard1.layout();
        boolean boolean8 = managementDashboard1.isFocusCycleRoot();
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray9 = managementDashboard1.getMouseMotionListeners();
        managementDashboard1.transferFocus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray9);
        org.junit.Assert.assertArrayEquals(mouseMotionListenerArray9, new java.awt.event.MouseMotionListener[] {});
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        boolean boolean4 = managementDashboard1.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget5 = null;
        managementDashboard1.setDropTarget(dropTarget5);
        managementDashboard1.setFocusable(false);
        java.awt.Image image9 = null;
        java.util.function.Consumer<java.lang.String> strConsumer12 = null;
        ManagementDashboard managementDashboard13 = new ManagementDashboard(strConsumer12);
        boolean boolean14 = managementDashboard13.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests15 = managementDashboard13.getInputMethodRequests();
        java.awt.Container container16 = managementDashboard13.getTopLevelAncestor();
        boolean boolean17 = managementDashboard1.prepareImage(image9, 8, (int) (byte) 100, (java.awt.image.ImageObserver) container16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        boolean boolean20 = managementDashboard19.isCursorSet();
        java.awt.Event event21 = null;
        boolean boolean23 = managementDashboard19.lostFocus(event21, (java.lang.Object) "");
        managementDashboard19.setAutoscrolls(false);
        java.awt.Graphics graphics26 = null;
        managementDashboard19.update(graphics26);
        java.util.function.Consumer<java.lang.String> strConsumer28 = null;
        ManagementDashboard managementDashboard29 = new ManagementDashboard(strConsumer28);
        managementDashboard29.setInheritsPopupMenu(true);
        boolean boolean32 = managementDashboard29.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget33 = null;
        managementDashboard29.setDropTarget(dropTarget33);
        boolean boolean35 = managementDashboard29.getAutoscrolls();
        java.util.function.Consumer<java.lang.String> strConsumer36 = null;
        ManagementDashboard managementDashboard37 = new ManagementDashboard(strConsumer36);
        managementDashboard37.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy40 = null;
        managementDashboard37.setFocusTraversalPolicy(focusTraversalPolicy40);
        java.lang.Object obj42 = managementDashboard29.getClientProperty((java.lang.Object) managementDashboard37);
        java.util.function.Consumer<java.lang.String> strConsumer43 = null;
        ManagementDashboard managementDashboard44 = new ManagementDashboard(strConsumer43);
        managementDashboard44.setRequestFocusEnabled(false);
        java.awt.Event event47 = null;
        boolean boolean49 = managementDashboard44.keyUp(event47, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener50 = null;
        managementDashboard44.addInputMethodListener(inputMethodListener50);
        java.awt.Dimension dimension52 = managementDashboard44.getMaximumSize();
        int int53 = managementDashboard29.getComponentZOrder((java.awt.Component) managementDashboard44);
        javax.swing.KeyStroke keyStroke54 = null;
        int int55 = managementDashboard29.getConditionForKeyStroke(keyStroke54);
        managementDashboard29.transferFocusUpCycle();
        java.awt.image.ImageProducer imageProducer57 = null;
        java.awt.Image image58 = managementDashboard29.createImage(imageProducer57);
        boolean boolean64 = managementDashboard19.imageUpdate(image58, (int) (byte) 10, (int) (short) 10, 4, (int) (short) 0, 2);
        managementDashboard19.enableInputMethods(false);
        java.util.function.Consumer<java.lang.String> strConsumer67 = null;
        ManagementDashboard managementDashboard68 = new ManagementDashboard(strConsumer67);
        managementDashboard68.setRequestFocusEnabled(false);
        java.awt.Event event71 = null;
        boolean boolean73 = managementDashboard68.keyUp(event71, (int) (short) 1);
        java.lang.String str74 = managementDashboard68.toString();
        managementDashboard68.setOpaque(true);
        managementDashboard19.remove((java.awt.Component) managementDashboard68);
        java.util.function.Consumer<java.lang.String> strConsumer78 = null;
        ManagementDashboard managementDashboard79 = new ManagementDashboard(strConsumer78);
        managementDashboard79.setInheritsPopupMenu(true);
        boolean boolean82 = managementDashboard79.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget83 = null;
        managementDashboard79.setDropTarget(dropTarget83);
        java.awt.Dimension dimension85 = null;
        managementDashboard79.setPreferredSize(dimension85);
        javax.swing.event.AncestorListener ancestorListener87 = null;
        managementDashboard79.removeAncestorListener(ancestorListener87);
        java.awt.Dimension dimension89 = managementDashboard79.getPreferredSize();
        java.awt.Dimension dimension90 = managementDashboard79.getPreferredSize();
        java.awt.Point point92 = managementDashboard79.getMousePosition(true);
        java.awt.Color color93 = managementDashboard79.getForeground();
        managementDashboard1.putClientProperty((java.lang.Object) managementDashboard68, (java.lang.Object) color93);
        managementDashboard1.firePropertyChange("ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", false, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(inputMethodRequests15);
        org.junit.Assert.assertNull(container16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(dimension52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(image58);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=4194313,maximumSize=,minimumSize=,preferredSize=]" + "'", str74, "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=4194313,maximumSize=,minimumSize=,preferredSize=]");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(dimension89);
        org.junit.Assert.assertNotNull(dimension90);
        org.junit.Assert.assertNull(point92);
        org.junit.Assert.assertNotNull(color93);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        ParkingLot parkingLot1 = new ParkingLot("data/userData.csv");
        ParkingSpace parkingSpace3 = parkingLot1.getSpace((int) (byte) 10);
        java.lang.String str4 = parkingSpace3.getCurrentCar();
        parkingSpace3.book("");
        parkingSpace3.setMaintenance();
        org.junit.Assert.assertNotNull(parkingSpace3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Empty" + "'", str4, "Empty");
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.Event event3 = null;
        boolean boolean5 = managementDashboard1.lostFocus(event3, (java.lang.Object) "");
        managementDashboard1.setAutoscrolls(false);
        java.awt.Graphics graphics8 = null;
        managementDashboard1.update(graphics8);
        managementDashboard1.firePropertyChange("", (byte) 0, (byte) 10);
        managementDashboard1.list();
        boolean boolean15 = managementDashboard1.isRequestFocusEnabled();
        java.util.function.Consumer<java.lang.String> strConsumer16 = null;
        ManagementDashboard managementDashboard17 = new ManagementDashboard(strConsumer16);
        managementDashboard17.setInheritsPopupMenu(true);
        boolean boolean20 = managementDashboard17.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget21 = null;
        managementDashboard17.setDropTarget(dropTarget21);
        java.awt.Dimension dimension23 = null;
        managementDashboard17.setPreferredSize(dimension23);
        javax.swing.event.AncestorListener ancestorListener25 = null;
        managementDashboard17.removeAncestorListener(ancestorListener25);
        java.awt.Dimension dimension27 = managementDashboard17.getPreferredSize();
        java.awt.Dimension dimension28 = managementDashboard17.getPreferredSize();
        java.awt.Point point30 = managementDashboard17.getMousePosition(true);
        java.awt.Color color31 = managementDashboard17.getForeground();
        managementDashboard1.setBackground(color31);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dimension27);
        org.junit.Assert.assertNotNull(dimension28);
        org.junit.Assert.assertNull(point30);
        org.junit.Assert.assertNotNull(color31);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.event.ContainerListener containerListener5 = null;
        managementDashboard1.removeContainerListener(containerListener5);
        javax.swing.JPopupMenu jPopupMenu7 = null;
        managementDashboard1.setComponentPopupMenu(jPopupMenu7);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener9 = null;
        managementDashboard1.addHierarchyBoundsListener(hierarchyBoundsListener9);
        managementDashboard1.enable(false);
        java.awt.GraphicsConfiguration graphicsConfiguration13 = managementDashboard1.getGraphicsConfiguration();
        boolean boolean14 = managementDashboard1.isFocusTraversalPolicySet();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(graphicsConfiguration13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        SuperManager superManager0 = SuperManager.getInstance();
        java.lang.String str1 = superManager0.getPassword();
        java.lang.String str2 = superManager0.getUsername();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "123456789" + "'", str1, "123456789");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SUPERMAN" + "'", str2, "SUPERMAN");
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        managementDashboard1.repaint(10, 100, 0, (int) (short) 1);
        boolean boolean12 = managementDashboard1.requestFocusInWindow();
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        managementDashboard14.setRequestFocusEnabled(false);
        java.awt.Event event17 = null;
        boolean boolean19 = managementDashboard14.keyUp(event17, (int) (short) 1);
        managementDashboard14.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        managementDashboard14.removePropertyChangeListener("", propertyChangeListener23);
        managementDashboard14.doLayout();
        javax.swing.JPopupMenu jPopupMenu26 = managementDashboard14.getComponentPopupMenu();
        java.awt.Component component28 = managementDashboard1.add((java.awt.Component) managementDashboard14, 1);
        managementDashboard14.firePropertyChange("ToolTipText", (short) 1, (short) (byte) 100);
        managementDashboard14.grabFocus();
        java.awt.Dimension dimension34 = managementDashboard14.minimumSize();
        java.awt.Event event35 = null;
        boolean boolean38 = managementDashboard14.mouseUp(event35, 32, (-1));
        // The following exception was thrown during execution in test generation
        try {
            managementDashboard14.remove(32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(jPopupMenu26);
        org.junit.Assert.assertNotNull(component28);
        org.junit.Assert.assertNotNull(dimension34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        boolean boolean4 = managementDashboard1.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget5 = null;
        managementDashboard1.setDropTarget(dropTarget5);
        java.awt.Dimension dimension7 = null;
        managementDashboard1.setPreferredSize(dimension7);
        javax.swing.event.AncestorListener ancestorListener9 = null;
        managementDashboard1.removeAncestorListener(ancestorListener9);
        java.awt.Dimension dimension11 = managementDashboard1.getPreferredSize();
        java.awt.Dimension dimension12 = managementDashboard1.getPreferredSize();
        managementDashboard1.setDebugGraphicsOptions(10);
        java.awt.event.MouseListener mouseListener15 = null;
        managementDashboard1.removeMouseListener(mouseListener15);
        managementDashboard1.removeNotify();
        managementDashboard1.firePropertyChange("Empty", (double) (-1), (double) 0.0f);
        java.awt.event.ContainerListener[] containerListenerArray22 = managementDashboard1.getContainerListeners();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertNotNull(dimension12);
        org.junit.Assert.assertNotNull(containerListenerArray22);
        org.junit.Assert.assertArrayEquals(containerListenerArray22, new java.awt.event.ContainerListener[] {});
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        managementDashboard1.setAutoscrolls(true);
        boolean boolean9 = managementDashboard1.isDoubleBuffered();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        SuperManager superManager0 = new SuperManager();
        MainSystem.currentManager = superManager0;
        java.lang.String str2 = superManager0.getUsername();
        MainSystem.currentManager = superManager0;
        java.lang.String str4 = superManager0.getUsername();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SUPERMAN" + "'", str2, "SUPERMAN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SUPERMAN" + "'", str4, "SUPERMAN");
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        managementDashboard1.repaint(10, 100, 0, (int) (short) 1);
        boolean boolean12 = managementDashboard1.requestFocusInWindow();
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        managementDashboard14.setRequestFocusEnabled(false);
        java.awt.Event event17 = null;
        boolean boolean19 = managementDashboard14.keyUp(event17, (int) (short) 1);
        managementDashboard14.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        managementDashboard14.removePropertyChangeListener("", propertyChangeListener23);
        managementDashboard14.doLayout();
        javax.swing.JPopupMenu jPopupMenu26 = managementDashboard14.getComponentPopupMenu();
        java.awt.Component component28 = managementDashboard1.add((java.awt.Component) managementDashboard14, 1);
        java.util.function.Consumer<java.lang.String> strConsumer29 = null;
        ManagementDashboard managementDashboard30 = new ManagementDashboard(strConsumer29);
        managementDashboard30.setRequestFocusEnabled(false);
        java.awt.Event event33 = null;
        boolean boolean35 = managementDashboard30.keyUp(event33, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener36 = null;
        managementDashboard30.addInputMethodListener(inputMethodListener36);
        java.awt.Dimension dimension38 = managementDashboard30.getMaximumSize();
        managementDashboard14.setPreferredSize(dimension38);
        managementDashboard14.firePropertyChange("data/managerData.csv", ' ', ' ');
        java.awt.ComponentOrientation componentOrientation44 = managementDashboard14.getComponentOrientation();
        java.awt.Container container45 = managementDashboard14.getParent();
        java.awt.Rectangle rectangle46 = managementDashboard14.bounds();
        java.beans.VetoableChangeListener[] vetoableChangeListenerArray47 = managementDashboard14.getVetoableChangeListeners();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(jPopupMenu26);
        org.junit.Assert.assertNotNull(component28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dimension38);
        org.junit.Assert.assertNotNull(componentOrientation44);
        org.junit.Assert.assertNotNull(container45);
        org.junit.Assert.assertNotNull(rectangle46);
        org.junit.Assert.assertNotNull(vetoableChangeListenerArray47);
        org.junit.Assert.assertArrayEquals(vetoableChangeListenerArray47, new java.beans.VetoableChangeListener[] {});
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        managementDashboard5.setInheritsPopupMenu(true);
        boolean boolean8 = managementDashboard5.isValidateRoot();
        int int9 = managementDashboard1.getComponentZOrder((java.awt.Component) managementDashboard5);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        managementDashboard5.addPropertyChangeListener("hi!", propertyChangeListener11);
        boolean boolean13 = managementDashboard5.isPreferredSizeSet();
        managementDashboard5.setToolTipText("");
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        managementDashboard5.addPropertyChangeListener("hi!", propertyChangeListener17);
        java.util.function.Consumer<java.lang.String> strConsumer19 = null;
        ManagementDashboard managementDashboard20 = new ManagementDashboard(strConsumer19);
        boolean boolean21 = managementDashboard20.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests22 = managementDashboard20.getInputMethodRequests();
        java.awt.Container container23 = managementDashboard20.getTopLevelAncestor();
        java.awt.Color color24 = null;
        managementDashboard20.setForeground(color24);
        managementDashboard20.repaint(10, 100, 0, (int) (short) 1);
        boolean boolean31 = managementDashboard20.requestFocusInWindow();
        java.util.function.Consumer<java.lang.String> strConsumer32 = null;
        ManagementDashboard managementDashboard33 = new ManagementDashboard(strConsumer32);
        managementDashboard33.setRequestFocusEnabled(false);
        java.awt.Event event36 = null;
        boolean boolean38 = managementDashboard33.keyUp(event36, (int) (short) 1);
        managementDashboard33.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        managementDashboard33.removePropertyChangeListener("", propertyChangeListener42);
        managementDashboard33.doLayout();
        javax.swing.JPopupMenu jPopupMenu45 = managementDashboard33.getComponentPopupMenu();
        java.awt.Component component47 = managementDashboard20.add((java.awt.Component) managementDashboard33, 1);
        java.util.function.Consumer<java.lang.String> strConsumer48 = null;
        ManagementDashboard managementDashboard49 = new ManagementDashboard(strConsumer48);
        managementDashboard49.setRequestFocusEnabled(false);
        java.awt.Event event52 = null;
        boolean boolean54 = managementDashboard49.keyUp(event52, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener55 = null;
        managementDashboard49.addInputMethodListener(inputMethodListener55);
        java.awt.Dimension dimension57 = managementDashboard49.getMaximumSize();
        managementDashboard33.setPreferredSize(dimension57);
        managementDashboard33.firePropertyChange("data/managerData.csv", ' ', ' ');
        java.awt.ComponentOrientation componentOrientation63 = managementDashboard33.getComponentOrientation();
        managementDashboard5.setComponentOrientation(componentOrientation63);
        java.awt.Point point66 = managementDashboard5.getMousePosition(false);
        boolean boolean67 = managementDashboard5.isForegroundSet();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(inputMethodRequests22);
        org.junit.Assert.assertNull(container23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(jPopupMenu45);
        org.junit.Assert.assertNotNull(component47);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(dimension57);
        org.junit.Assert.assertNotNull(componentOrientation63);
        org.junit.Assert.assertNull(point66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        boolean boolean4 = managementDashboard1.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget5 = null;
        managementDashboard1.setDropTarget(dropTarget5);
        java.awt.Dimension dimension7 = null;
        managementDashboard1.setPreferredSize(dimension7);
        managementDashboard1.invalidate();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener10 = null;
        managementDashboard1.removeHierarchyBoundsListener(hierarchyBoundsListener10);
        java.util.function.Consumer<java.lang.String> strConsumer12 = null;
        ManagementDashboard managementDashboard13 = new ManagementDashboard(strConsumer12);
        managementDashboard13.setInheritsPopupMenu(true);
        boolean boolean16 = managementDashboard13.isValidateRoot();
        java.awt.LayoutManager layoutManager17 = null;
        managementDashboard13.setLayout(layoutManager17);
        managementDashboard1.setComponentZOrder((java.awt.Component) managementDashboard13, (int) (short) 0);
        managementDashboard1.setVisible(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.Event event3 = null;
        boolean boolean5 = managementDashboard1.lostFocus(event3, (java.lang.Object) "");
        java.util.function.Consumer<java.lang.String> strConsumer6 = null;
        ManagementDashboard managementDashboard7 = new ManagementDashboard(strConsumer6);
        boolean boolean8 = managementDashboard7.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests9 = managementDashboard7.getInputMethodRequests();
        java.awt.Container container10 = managementDashboard7.getTopLevelAncestor();
        java.awt.event.ContainerListener containerListener11 = null;
        managementDashboard7.removeContainerListener(containerListener11);
        java.awt.FocusTraversalPolicy focusTraversalPolicy13 = managementDashboard7.getFocusTraversalPolicy();
        java.util.function.Consumer<java.lang.String> strConsumer14 = null;
        ManagementDashboard managementDashboard15 = new ManagementDashboard(strConsumer14);
        managementDashboard15.setInheritsPopupMenu(true);
        boolean boolean18 = managementDashboard15.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget19 = null;
        managementDashboard15.setDropTarget(dropTarget19);
        java.awt.Dimension dimension21 = null;
        managementDashboard15.setPreferredSize(dimension21);
        java.awt.Event event23 = null;
        boolean boolean26 = managementDashboard15.mouseExit(event23, (int) 'a', (int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer27 = null;
        ManagementDashboard managementDashboard28 = new ManagementDashboard(strConsumer27);
        boolean boolean29 = managementDashboard28.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests30 = managementDashboard28.getInputMethodRequests();
        java.awt.Container container31 = managementDashboard28.getTopLevelAncestor();
        java.awt.Color color32 = null;
        managementDashboard28.setForeground(color32);
        javax.swing.KeyStroke keyStroke34 = null;
        java.awt.event.ActionListener actionListener35 = managementDashboard28.getActionForKeyStroke(keyStroke34);
        javax.swing.JToolTip jToolTip36 = managementDashboard28.createToolTip();
        java.awt.Event event37 = null;
        java.util.function.Consumer<java.lang.String> strConsumer38 = null;
        ManagementDashboard managementDashboard39 = new ManagementDashboard(strConsumer38);
        managementDashboard39.setInheritsPopupMenu(true);
        boolean boolean42 = managementDashboard39.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget43 = null;
        managementDashboard39.setDropTarget(dropTarget43);
        java.awt.Dimension dimension45 = null;
        managementDashboard39.setPreferredSize(dimension45);
        javax.swing.event.AncestorListener ancestorListener47 = null;
        managementDashboard39.removeAncestorListener(ancestorListener47);
        java.awt.Dimension dimension49 = managementDashboard39.getPreferredSize();
        java.awt.Dimension dimension50 = managementDashboard39.getPreferredSize();
        managementDashboard39.setDebugGraphicsOptions(10);
        boolean boolean53 = jToolTip36.lostFocus(event37, (java.lang.Object) managementDashboard39);
        java.awt.Rectangle rectangle54 = jToolTip36.bounds();
        managementDashboard15.computeVisibleRect(rectangle54);
        java.awt.Rectangle rectangle56 = managementDashboard7.getBounds(rectangle54);
        int int57 = managementDashboard1.getComponentZOrder((java.awt.Component) managementDashboard7);
        java.awt.event.MouseMotionListener mouseMotionListener58 = null;
        managementDashboard1.removeMouseMotionListener(mouseMotionListener58);
        managementDashboard1.firePropertyChange("data/userData.csv", (byte) 10, (byte) 0);
        boolean boolean64 = managementDashboard1.getInheritsPopupMenu();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputMethodRequests9);
        org.junit.Assert.assertNull(container10);
        org.junit.Assert.assertNull(focusTraversalPolicy13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(inputMethodRequests30);
        org.junit.Assert.assertNull(container31);
        org.junit.Assert.assertNull(actionListener35);
        org.junit.Assert.assertNotNull(jToolTip36);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(dimension49);
        org.junit.Assert.assertNotNull(dimension50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(rectangle54);
        org.junit.Assert.assertNotNull(rectangle56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        managementDashboard5.setInheritsPopupMenu(true);
        boolean boolean8 = managementDashboard5.isValidateRoot();
        int int9 = managementDashboard1.getComponentZOrder((java.awt.Component) managementDashboard5);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        managementDashboard5.addPropertyChangeListener("hi!", propertyChangeListener11);
        boolean boolean13 = managementDashboard5.isPreferredSizeSet();
        managementDashboard5.setToolTipText("");
        java.awt.event.InputMethodListener inputMethodListener16 = null;
        managementDashboard5.removeInputMethodListener(inputMethodListener16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        managementDashboard19.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy22 = null;
        managementDashboard19.setFocusTraversalPolicy(focusTraversalPolicy22);
        java.awt.Event event24 = null;
        boolean boolean27 = managementDashboard19.mouseDrag(event24, (int) (short) 10, 4);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        managementDashboard19.removePropertyChangeListener("hi!", propertyChangeListener29);
        boolean boolean31 = managementDashboard19.isMaximumSizeSet();
        java.awt.Font font32 = managementDashboard19.getFont();
        java.awt.FontMetrics fontMetrics33 = managementDashboard5.getFontMetrics(font32);
        javax.swing.TransferHandler transferHandler34 = managementDashboard5.getTransferHandler();
        int int37 = managementDashboard5.getBaseline((int) '4', 10);
        java.awt.event.HierarchyListener hierarchyListener38 = null;
        managementDashboard5.removeHierarchyListener(hierarchyListener38);
        java.awt.event.MouseMotionListener mouseMotionListener40 = null;
        managementDashboard5.addMouseMotionListener(mouseMotionListener40);
        managementDashboard5.transferFocus();
        java.util.function.Consumer<java.lang.String> strConsumer43 = null;
        ManagementDashboard managementDashboard44 = new ManagementDashboard(strConsumer43);
        managementDashboard44.setInheritsPopupMenu(true);
        boolean boolean47 = managementDashboard44.isValidateRoot();
        java.awt.LayoutManager layoutManager48 = null;
        managementDashboard44.setLayout(layoutManager48);
        java.awt.Color color50 = managementDashboard44.getForeground();
        managementDashboard5.setBackground(color50);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(font32);
        org.junit.Assert.assertNotNull(fontMetrics33);
        org.junit.Assert.assertNull(transferHandler34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(color50);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Dimension dimension4 = managementDashboard1.getPreferredSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNotNull(dimension4);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        managementDashboard5.setInheritsPopupMenu(true);
        boolean boolean8 = managementDashboard5.isValidateRoot();
        int int9 = managementDashboard1.getComponentZOrder((java.awt.Component) managementDashboard5);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        managementDashboard5.addPropertyChangeListener("hi!", propertyChangeListener11);
        boolean boolean13 = managementDashboard5.isPreferredSizeSet();
        managementDashboard5.setToolTipText("");
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        managementDashboard5.addPropertyChangeListener("hi!", propertyChangeListener17);
        managementDashboard5.repaint((long) (-1));
        java.awt.event.MouseListener mouseListener21 = null;
        managementDashboard5.removeMouseListener(mouseListener21);
        boolean boolean23 = managementDashboard5.isFocusTraversable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        javax.swing.KeyStroke keyStroke7 = null;
        java.awt.event.ActionListener actionListener8 = managementDashboard1.getActionForKeyStroke(keyStroke7);
        javax.swing.JToolTip jToolTip9 = managementDashboard1.createToolTip();
        java.util.function.Consumer<java.lang.String> strConsumer10 = null;
        ManagementDashboard managementDashboard11 = new ManagementDashboard(strConsumer10);
        boolean boolean12 = managementDashboard11.isCursorSet();
        java.awt.Event event13 = null;
        boolean boolean15 = managementDashboard11.lostFocus(event13, (java.lang.Object) "");
        java.util.function.Consumer<java.lang.String> strConsumer16 = null;
        ManagementDashboard managementDashboard17 = new ManagementDashboard(strConsumer16);
        managementDashboard17.setRequestFocusEnabled(false);
        java.awt.Event event20 = null;
        boolean boolean22 = managementDashboard17.keyUp(event20, (int) (short) 1);
        managementDashboard17.setAutoscrolls(true);
        java.awt.event.HierarchyListener[] hierarchyListenerArray25 = managementDashboard17.getHierarchyListeners();
        jToolTip9.add((java.awt.Component) managementDashboard11, (java.lang.Object) hierarchyListenerArray25);
        boolean boolean27 = jToolTip9.requestDefaultFocus();
        java.awt.Image image30 = jToolTip9.createImage((int) (short) 10, 2);
        jToolTip9.firePropertyChange("ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=4194313,maximumSize=,minimumSize=,preferredSize=]", (long) 32, (long) 2);
        jToolTip9.transferFocusUpCycle();
        javax.swing.InputVerifier inputVerifier36 = jToolTip9.getInputVerifier();
        javax.swing.border.Border border37 = jToolTip9.getBorder();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(actionListener8);
        org.junit.Assert.assertNotNull(jToolTip9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(hierarchyListenerArray25);
        org.junit.Assert.assertArrayEquals(hierarchyListenerArray25, new java.awt.event.HierarchyListener[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(image30);
        org.junit.Assert.assertNull(inputVerifier36);
        org.junit.Assert.assertNotNull(border37);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        boolean boolean4 = managementDashboard1.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget5 = null;
        managementDashboard1.setDropTarget(dropTarget5);
        boolean boolean7 = managementDashboard1.getAutoscrolls();
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        managementDashboard9.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        managementDashboard9.setFocusTraversalPolicy(focusTraversalPolicy12);
        java.lang.Object obj14 = managementDashboard1.getClientProperty((java.lang.Object) managementDashboard9);
        java.util.function.Consumer<java.lang.String> strConsumer15 = null;
        ManagementDashboard managementDashboard16 = new ManagementDashboard(strConsumer15);
        managementDashboard16.setRequestFocusEnabled(false);
        java.awt.Event event19 = null;
        boolean boolean21 = managementDashboard16.keyUp(event19, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener22 = null;
        managementDashboard16.addInputMethodListener(inputMethodListener22);
        java.awt.Dimension dimension24 = managementDashboard16.getMaximumSize();
        int int25 = managementDashboard1.getComponentZOrder((java.awt.Component) managementDashboard16);
        java.awt.Component component26 = managementDashboard1.getNextFocusableComponent();
        java.awt.FocusTraversalPolicy focusTraversalPolicy27 = null;
        managementDashboard1.setFocusTraversalPolicy(focusTraversalPolicy27);
        boolean boolean29 = managementDashboard1.isFocusTraversalPolicySet();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dimension24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(component26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.event.ContainerListener containerListener5 = null;
        managementDashboard1.removeContainerListener(containerListener5);
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = managementDashboard1.getFocusTraversalPolicy();
        managementDashboard1.layout();
        java.awt.Event event9 = null;
        boolean boolean11 = managementDashboard1.keyUp(event9, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(focusTraversalPolicy7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.event.MouseMotionListener mouseMotionListener2 = null;
        managementDashboard1.addMouseMotionListener(mouseMotionListener2);
        java.awt.Component component5 = managementDashboard1.getComponent(0);
        java.awt.Point point6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = managementDashboard1.contains(point6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"p\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(component5);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        managementDashboard1.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard1.removePropertyChangeListener("", propertyChangeListener10);
        managementDashboard1.doLayout();
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        managementDashboard14.setInheritsPopupMenu(true);
        boolean boolean17 = managementDashboard14.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget18 = null;
        managementDashboard14.setDropTarget(dropTarget18);
        java.awt.Dimension dimension20 = null;
        managementDashboard14.setPreferredSize(dimension20);
        java.awt.Event event22 = null;
        boolean boolean25 = managementDashboard14.mouseExit(event22, (int) 'a', (int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer26 = null;
        ManagementDashboard managementDashboard27 = new ManagementDashboard(strConsumer26);
        boolean boolean28 = managementDashboard27.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests29 = managementDashboard27.getInputMethodRequests();
        java.awt.Container container30 = managementDashboard27.getTopLevelAncestor();
        java.awt.Color color31 = null;
        managementDashboard27.setForeground(color31);
        javax.swing.KeyStroke keyStroke33 = null;
        java.awt.event.ActionListener actionListener34 = managementDashboard27.getActionForKeyStroke(keyStroke33);
        javax.swing.JToolTip jToolTip35 = managementDashboard27.createToolTip();
        java.awt.Event event36 = null;
        java.util.function.Consumer<java.lang.String> strConsumer37 = null;
        ManagementDashboard managementDashboard38 = new ManagementDashboard(strConsumer37);
        managementDashboard38.setInheritsPopupMenu(true);
        boolean boolean41 = managementDashboard38.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget42 = null;
        managementDashboard38.setDropTarget(dropTarget42);
        java.awt.Dimension dimension44 = null;
        managementDashboard38.setPreferredSize(dimension44);
        javax.swing.event.AncestorListener ancestorListener46 = null;
        managementDashboard38.removeAncestorListener(ancestorListener46);
        java.awt.Dimension dimension48 = managementDashboard38.getPreferredSize();
        java.awt.Dimension dimension49 = managementDashboard38.getPreferredSize();
        managementDashboard38.setDebugGraphicsOptions(10);
        boolean boolean52 = jToolTip35.lostFocus(event36, (java.lang.Object) managementDashboard38);
        java.awt.Rectangle rectangle53 = jToolTip35.bounds();
        managementDashboard14.computeVisibleRect(rectangle53);
        managementDashboard1.setMixingCutoutShape((java.awt.Shape) rectangle53);
        javax.swing.JPopupMenu jPopupMenu56 = null;
        managementDashboard1.setComponentPopupMenu(jPopupMenu56);
        java.awt.event.MouseWheelListener mouseWheelListener58 = null;
        managementDashboard1.removeMouseWheelListener(mouseWheelListener58);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(inputMethodRequests29);
        org.junit.Assert.assertNull(container30);
        org.junit.Assert.assertNull(actionListener34);
        org.junit.Assert.assertNotNull(jToolTip35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(dimension48);
        org.junit.Assert.assertNotNull(dimension49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(rectangle53);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        managementDashboard1.enable();
        boolean boolean5 = managementDashboard1.hasFocus();
        javax.swing.KeyStroke keyStroke6 = null;
        managementDashboard1.unregisterKeyboardAction(keyStroke6);
        managementDashboard1.setIgnoreRepaint(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        javax.swing.KeyStroke keyStroke7 = null;
        java.awt.event.ActionListener actionListener8 = managementDashboard1.getActionForKeyStroke(keyStroke7);
        javax.swing.JToolTip jToolTip9 = managementDashboard1.createToolTip();
        java.awt.Event event10 = null;
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        ManagementDashboard managementDashboard12 = new ManagementDashboard(strConsumer11);
        managementDashboard12.setInheritsPopupMenu(true);
        boolean boolean15 = managementDashboard12.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget16 = null;
        managementDashboard12.setDropTarget(dropTarget16);
        java.awt.Dimension dimension18 = null;
        managementDashboard12.setPreferredSize(dimension18);
        javax.swing.event.AncestorListener ancestorListener20 = null;
        managementDashboard12.removeAncestorListener(ancestorListener20);
        java.awt.Dimension dimension22 = managementDashboard12.getPreferredSize();
        java.awt.Dimension dimension23 = managementDashboard12.getPreferredSize();
        managementDashboard12.setDebugGraphicsOptions(10);
        boolean boolean26 = jToolTip9.lostFocus(event10, (java.lang.Object) managementDashboard12);
        java.awt.event.HierarchyListener hierarchyListener27 = null;
        jToolTip9.removeHierarchyListener(hierarchyListener27);
        javax.swing.event.AncestorListener ancestorListener29 = null;
        jToolTip9.removeAncestorListener(ancestorListener29);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(actionListener8);
        org.junit.Assert.assertNotNull(jToolTip9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dimension22);
        org.junit.Assert.assertNotNull(dimension23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener7 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener7);
        managementDashboard1.move((int) (byte) 0, 8);
        java.awt.Event event12 = null;
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        boolean boolean15 = managementDashboard14.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests16 = managementDashboard14.getInputMethodRequests();
        java.awt.Container container17 = managementDashboard14.getTopLevelAncestor();
        boolean boolean18 = managementDashboard1.gotFocus(event12, (java.lang.Object) container17);
        managementDashboard1.hide();
        boolean boolean20 = managementDashboard1.isFocusTraversable();
        java.awt.event.MouseMotionListener mouseMotionListener21 = null;
        managementDashboard1.removeMouseMotionListener(mouseMotionListener21);
        managementDashboard1.updateUI();
        java.awt.Graphics graphics24 = null;
        managementDashboard1.update(graphics24);
        java.awt.event.KeyListener[] keyListenerArray26 = managementDashboard1.getKeyListeners();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputMethodRequests16);
        org.junit.Assert.assertNull(container17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(keyListenerArray26);
        org.junit.Assert.assertArrayEquals(keyListenerArray26, new java.awt.event.KeyListener[] {});
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        UserDashboard userDashboard1 = new UserDashboard(strConsumer0);
        userDashboard1.transferFocusDownCycle();
        boolean boolean3 = userDashboard1.isManagingFocus();
        java.awt.im.InputContext inputContext4 = userDashboard1.getInputContext();
        userDashboard1.removeNotify();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(inputContext4);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        managementDashboard1.setAutoscrolls(true);
        managementDashboard1.layout();
        java.util.function.Consumer<java.lang.String> strConsumer10 = null;
        ManagementDashboard managementDashboard11 = new ManagementDashboard(strConsumer10);
        managementDashboard11.setInheritsPopupMenu(true);
        boolean boolean14 = managementDashboard11.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget15 = null;
        managementDashboard11.setDropTarget(dropTarget15);
        java.awt.Dimension dimension17 = null;
        managementDashboard11.setPreferredSize(dimension17);
        managementDashboard11.invalidate();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener20 = null;
        managementDashboard11.removeHierarchyBoundsListener(hierarchyBoundsListener20);
        java.util.function.Consumer<java.lang.String> strConsumer22 = null;
        ManagementDashboard managementDashboard23 = new ManagementDashboard(strConsumer22);
        managementDashboard23.setInheritsPopupMenu(true);
        boolean boolean26 = managementDashboard23.isValidateRoot();
        java.awt.LayoutManager layoutManager27 = null;
        managementDashboard23.setLayout(layoutManager27);
        managementDashboard11.setComponentZOrder((java.awt.Component) managementDashboard23, (int) (short) 0);
        java.awt.Component component31 = managementDashboard1.add((java.awt.Component) managementDashboard11);
        java.awt.FocusTraversalPolicy focusTraversalPolicy32 = managementDashboard1.getFocusTraversalPolicy();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(component31);
        org.junit.Assert.assertNull(focusTraversalPolicy32);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer7 = null;
        ManagementDashboard managementDashboard8 = new ManagementDashboard(strConsumer7);
        managementDashboard8.setRequestFocusEnabled(false);
        java.awt.Event event11 = null;
        boolean boolean13 = managementDashboard8.keyUp(event11, (int) (short) 1);
        managementDashboard8.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        managementDashboard8.removePropertyChangeListener("", propertyChangeListener17);
        java.awt.Dimension dimension19 = managementDashboard8.getPreferredSize();
        managementDashboard1.setSize(dimension19);
        managementDashboard1.setRequestFocusEnabled(true);
        java.awt.Image image25 = managementDashboard1.createImage(100, (int) (byte) 1);
        java.awt.Dimension dimension26 = managementDashboard1.getPreferredSize();
        java.awt.event.MouseMotionListener mouseMotionListener27 = null;
        managementDashboard1.addMouseMotionListener(mouseMotionListener27);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dimension19);
        org.junit.Assert.assertNull(image25);
        org.junit.Assert.assertNotNull(dimension26);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.Dimension dimension3 = managementDashboard1.size();
        java.util.function.Consumer<java.lang.String> strConsumer5 = null;
        ManagementDashboard managementDashboard6 = new ManagementDashboard(strConsumer5);
        boolean boolean7 = managementDashboard6.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests8 = managementDashboard6.getInputMethodRequests();
        java.awt.Container container9 = managementDashboard6.getTopLevelAncestor();
        java.awt.Color color10 = null;
        managementDashboard6.setForeground(color10);
        java.awt.event.HierarchyListener hierarchyListener12 = null;
        managementDashboard6.addHierarchyListener(hierarchyListener12);
        java.awt.Cursor cursor14 = null;
        managementDashboard6.setCursor(cursor14);
        java.awt.Event event16 = null;
        boolean boolean19 = managementDashboard6.mouseDown(event16, (-1), (int) (short) 10);
        managementDashboard6.resize((int) (byte) 1, (int) (byte) 10);
        boolean boolean23 = managementDashboard6.isFocusCycleRoot();
        javax.swing.InputMap inputMap25 = managementDashboard6.getInputMap((int) (byte) 0);
        managementDashboard1.setInputMap(0, inputMap25);
        java.awt.Event event27 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = managementDashboard1.handleEvent(event27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(inputMethodRequests8);
        org.junit.Assert.assertNull(container9);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(inputMap25);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer7 = null;
        ManagementDashboard managementDashboard8 = new ManagementDashboard(strConsumer7);
        managementDashboard8.setRequestFocusEnabled(false);
        java.awt.Event event11 = null;
        boolean boolean13 = managementDashboard8.keyUp(event11, (int) (short) 1);
        managementDashboard8.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        managementDashboard8.removePropertyChangeListener("", propertyChangeListener17);
        java.awt.Dimension dimension19 = managementDashboard8.getPreferredSize();
        managementDashboard1.setSize(dimension19);
        managementDashboard1.setRequestFocusEnabled(true);
        java.awt.Image image25 = managementDashboard1.createImage(100, (int) (byte) 1);
        java.awt.Dimension dimension26 = managementDashboard1.getPreferredSize();
        java.beans.VetoableChangeListener vetoableChangeListener27 = null;
        managementDashboard1.removeVetoableChangeListener(vetoableChangeListener27);
        java.io.PrintStream printStream29 = null;
        // The following exception was thrown during execution in test generation
        try {
            managementDashboard1.list(printStream29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dimension19);
        org.junit.Assert.assertNull(image25);
        org.junit.Assert.assertNotNull(dimension26);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        managementDashboard1.move((int) (byte) 1, (int) '#');
        managementDashboard1.layout();
        boolean boolean8 = managementDashboard1.isFocusCycleRoot();
        java.awt.event.HierarchyListener[] hierarchyListenerArray9 = managementDashboard1.getHierarchyListeners();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(hierarchyListenerArray9);
        org.junit.Assert.assertArrayEquals(hierarchyListenerArray9, new java.awt.event.HierarchyListener[] {});
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        PaymentStrategy paymentStrategy0 = null;
        PaymentProcessor paymentProcessor1 = new PaymentProcessor(paymentStrategy0);
        CreditCardPayment creditCardPayment2 = new CreditCardPayment();
        paymentProcessor1.setPaymentStrategy((PaymentStrategy) creditCardPayment2);
        PaymentStrategy paymentStrategy4 = null;
        PaymentProcessor paymentProcessor5 = new PaymentProcessor(paymentStrategy4);
        CreditCardPayment creditCardPayment6 = new CreditCardPayment();
        paymentProcessor5.setPaymentStrategy((PaymentStrategy) creditCardPayment6);
        paymentProcessor1.setPaymentStrategy((PaymentStrategy) creditCardPayment6);
        PaymentStrategy paymentStrategy9 = null;
        PaymentProcessor paymentProcessor10 = new PaymentProcessor(paymentStrategy9);
        CreditCardPayment creditCardPayment11 = new CreditCardPayment();
        paymentProcessor10.setPaymentStrategy((PaymentStrategy) creditCardPayment11);
        PaymentStrategy paymentStrategy13 = null;
        PaymentProcessor paymentProcessor14 = new PaymentProcessor(paymentStrategy13);
        CreditCardPayment creditCardPayment15 = new CreditCardPayment();
        paymentProcessor14.setPaymentStrategy((PaymentStrategy) creditCardPayment15);
        paymentProcessor10.setPaymentStrategy((PaymentStrategy) creditCardPayment15);
        paymentProcessor1.setPaymentStrategy((PaymentStrategy) creditCardPayment15);
        PaymentStrategy paymentStrategy19 = null;
        PaymentProcessor paymentProcessor20 = new PaymentProcessor(paymentStrategy19);
        CreditCardPayment creditCardPayment21 = new CreditCardPayment();
        paymentProcessor20.setPaymentStrategy((PaymentStrategy) creditCardPayment21);
        PaymentStrategy paymentStrategy23 = null;
        PaymentProcessor paymentProcessor24 = new PaymentProcessor(paymentStrategy23);
        CreditCardPayment creditCardPayment25 = new CreditCardPayment();
        paymentProcessor24.setPaymentStrategy((PaymentStrategy) creditCardPayment25);
        paymentProcessor20.setPaymentStrategy((PaymentStrategy) creditCardPayment25);
        PaymentStrategy paymentStrategy28 = null;
        PaymentProcessor paymentProcessor29 = new PaymentProcessor(paymentStrategy28);
        CreditCardPayment creditCardPayment30 = new CreditCardPayment();
        paymentProcessor29.setPaymentStrategy((PaymentStrategy) creditCardPayment30);
        PaymentStrategy paymentStrategy32 = null;
        PaymentProcessor paymentProcessor33 = new PaymentProcessor(paymentStrategy32);
        CreditCardPayment creditCardPayment34 = new CreditCardPayment();
        paymentProcessor33.setPaymentStrategy((PaymentStrategy) creditCardPayment34);
        paymentProcessor29.setPaymentStrategy((PaymentStrategy) creditCardPayment34);
        paymentProcessor20.setPaymentStrategy((PaymentStrategy) creditCardPayment34);
        PaymentStrategy paymentStrategy38 = null;
        PaymentProcessor paymentProcessor39 = new PaymentProcessor(paymentStrategy38);
        CreditCardPayment creditCardPayment40 = new CreditCardPayment();
        paymentProcessor39.setPaymentStrategy((PaymentStrategy) creditCardPayment40);
        paymentProcessor20.setPaymentStrategy((PaymentStrategy) creditCardPayment40);
        PaymentProcessor paymentProcessor43 = new PaymentProcessor((PaymentStrategy) creditCardPayment40);
        paymentProcessor1.setPaymentStrategy((PaymentStrategy) creditCardPayment40);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        managementDashboard1.repaint(10, 100, 0, (int) (short) 1);
        boolean boolean12 = managementDashboard1.requestFocusInWindow();
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        managementDashboard14.setRequestFocusEnabled(false);
        java.awt.Event event17 = null;
        boolean boolean19 = managementDashboard14.keyUp(event17, (int) (short) 1);
        managementDashboard14.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        managementDashboard14.removePropertyChangeListener("", propertyChangeListener23);
        managementDashboard14.doLayout();
        javax.swing.JPopupMenu jPopupMenu26 = managementDashboard14.getComponentPopupMenu();
        java.awt.Component component28 = managementDashboard1.add((java.awt.Component) managementDashboard14, 1);
        java.util.function.Consumer<java.lang.String> strConsumer29 = null;
        ManagementDashboard managementDashboard30 = new ManagementDashboard(strConsumer29);
        managementDashboard30.setRequestFocusEnabled(false);
        java.awt.Event event33 = null;
        boolean boolean35 = managementDashboard30.keyUp(event33, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener36 = null;
        managementDashboard30.addInputMethodListener(inputMethodListener36);
        java.awt.Dimension dimension38 = managementDashboard30.getMaximumSize();
        managementDashboard14.setPreferredSize(dimension38);
        managementDashboard14.show(false);
        int int44 = managementDashboard14.getBaseline((int) (byte) 10, (int) 'a');
        boolean boolean45 = managementDashboard14.isRequestFocusEnabled();
        java.awt.event.HierarchyListener hierarchyListener46 = null;
        managementDashboard14.addHierarchyListener(hierarchyListener46);
        java.awt.Event event48 = null;
        boolean boolean51 = managementDashboard14.mouseMove(event48, 0, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(jPopupMenu26);
        org.junit.Assert.assertNotNull(component28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dimension38);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        managementDashboard1.move((int) (byte) 1, (int) '#');
        boolean boolean7 = managementDashboard1.isFocusTraversable();
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        boolean boolean10 = managementDashboard9.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests11 = managementDashboard9.getInputMethodRequests();
        managementDashboard9.move((int) (byte) 1, (int) '#');
        managementDashboard9.layout();
        boolean boolean16 = managementDashboard9.isFocusCycleRoot();
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray17 = managementDashboard9.getMouseMotionListeners();
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        managementDashboard19.setInheritsPopupMenu(true);
        boolean boolean22 = managementDashboard19.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget23 = null;
        managementDashboard19.setDropTarget(dropTarget23);
        boolean boolean25 = managementDashboard19.getAutoscrolls();
        java.util.function.Consumer<java.lang.String> strConsumer26 = null;
        ManagementDashboard managementDashboard27 = new ManagementDashboard(strConsumer26);
        managementDashboard27.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy30 = null;
        managementDashboard27.setFocusTraversalPolicy(focusTraversalPolicy30);
        java.lang.Object obj32 = managementDashboard19.getClientProperty((java.lang.Object) managementDashboard27);
        java.util.function.Consumer<java.lang.String> strConsumer33 = null;
        ManagementDashboard managementDashboard34 = new ManagementDashboard(strConsumer33);
        managementDashboard34.setRequestFocusEnabled(false);
        java.awt.Event event37 = null;
        boolean boolean39 = managementDashboard34.keyUp(event37, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener40 = null;
        managementDashboard34.addInputMethodListener(inputMethodListener40);
        java.awt.Dimension dimension42 = managementDashboard34.getMaximumSize();
        int int43 = managementDashboard19.getComponentZOrder((java.awt.Component) managementDashboard34);
        managementDashboard19.transferFocusBackward();
        java.awt.dnd.DropTarget dropTarget45 = null;
        managementDashboard19.setDropTarget(dropTarget45);
        boolean boolean47 = managementDashboard19.isFontSet();
        java.awt.Point point48 = managementDashboard19.getLocation();
        java.awt.Point point49 = managementDashboard9.getLocation(point48);
        java.awt.Component component50 = managementDashboard1.getComponentAt(point49);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(inputMethodRequests11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray17);
        org.junit.Assert.assertArrayEquals(mouseMotionListenerArray17, new java.awt.event.MouseMotionListener[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(dimension42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(point48);
        org.junit.Assert.assertNotNull(point49);
        org.junit.Assert.assertNull(component50);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        ParkingLot parkingLot1 = new ParkingLot("hi!");
        java.lang.String str2 = parkingLot1.getLotName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        managementDashboard1.repaint(10, 100, 0, (int) (short) 1);
        boolean boolean12 = managementDashboard1.requestFocusInWindow();
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        managementDashboard14.setRequestFocusEnabled(false);
        java.awt.Event event17 = null;
        boolean boolean19 = managementDashboard14.keyUp(event17, (int) (short) 1);
        managementDashboard14.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        managementDashboard14.removePropertyChangeListener("", propertyChangeListener23);
        managementDashboard14.doLayout();
        javax.swing.JPopupMenu jPopupMenu26 = managementDashboard14.getComponentPopupMenu();
        java.awt.Component component28 = managementDashboard1.add((java.awt.Component) managementDashboard14, 1);
        java.util.function.Consumer<java.lang.String> strConsumer29 = null;
        ManagementDashboard managementDashboard30 = new ManagementDashboard(strConsumer29);
        managementDashboard30.setRequestFocusEnabled(false);
        java.awt.Event event33 = null;
        boolean boolean35 = managementDashboard30.keyUp(event33, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener36 = null;
        managementDashboard30.addInputMethodListener(inputMethodListener36);
        java.awt.Dimension dimension38 = managementDashboard30.getMaximumSize();
        managementDashboard14.setPreferredSize(dimension38);
        java.util.function.Consumer<java.lang.String> strConsumer40 = null;
        ManagementDashboard managementDashboard41 = new ManagementDashboard(strConsumer40);
        managementDashboard41.setInheritsPopupMenu(true);
        boolean boolean44 = managementDashboard41.isValidateRoot();
        java.awt.Color color45 = managementDashboard41.getBackground();
        managementDashboard14.setBackground(color45);
        java.awt.event.FocusListener focusListener47 = null;
        managementDashboard14.addFocusListener(focusListener47);
        java.awt.Image image51 = managementDashboard14.createImage((int) (short) 100, 100);
        java.util.function.Consumer<java.lang.String> strConsumer52 = null;
        ManagementDashboard managementDashboard53 = new ManagementDashboard(strConsumer52);
        boolean boolean54 = managementDashboard53.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests55 = managementDashboard53.getInputMethodRequests();
        java.awt.Container container56 = managementDashboard53.getTopLevelAncestor();
        java.awt.Color color57 = null;
        managementDashboard53.setForeground(color57);
        java.awt.event.HierarchyListener hierarchyListener59 = null;
        managementDashboard53.addHierarchyListener(hierarchyListener59);
        java.awt.Cursor cursor61 = null;
        managementDashboard53.setCursor(cursor61);
        java.util.function.Consumer<java.lang.String> strConsumer63 = null;
        ManagementDashboard managementDashboard64 = new ManagementDashboard(strConsumer63);
        boolean boolean65 = managementDashboard64.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests66 = managementDashboard64.getInputMethodRequests();
        java.awt.Container container67 = managementDashboard64.getTopLevelAncestor();
        java.awt.Color color68 = null;
        managementDashboard64.setForeground(color68);
        javax.swing.KeyStroke keyStroke70 = null;
        java.awt.event.ActionListener actionListener71 = managementDashboard64.getActionForKeyStroke(keyStroke70);
        javax.swing.JToolTip jToolTip72 = managementDashboard64.createToolTip();
        java.awt.Event event73 = null;
        java.util.function.Consumer<java.lang.String> strConsumer74 = null;
        ManagementDashboard managementDashboard75 = new ManagementDashboard(strConsumer74);
        managementDashboard75.setInheritsPopupMenu(true);
        boolean boolean78 = managementDashboard75.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget79 = null;
        managementDashboard75.setDropTarget(dropTarget79);
        java.awt.Dimension dimension81 = null;
        managementDashboard75.setPreferredSize(dimension81);
        javax.swing.event.AncestorListener ancestorListener83 = null;
        managementDashboard75.removeAncestorListener(ancestorListener83);
        java.awt.Dimension dimension85 = managementDashboard75.getPreferredSize();
        java.awt.Dimension dimension86 = managementDashboard75.getPreferredSize();
        managementDashboard75.setDebugGraphicsOptions(10);
        boolean boolean89 = jToolTip72.lostFocus(event73, (java.lang.Object) managementDashboard75);
        java.awt.Rectangle rectangle90 = jToolTip72.bounds();
        managementDashboard53.setMixingCutoutShape((java.awt.Shape) rectangle90);
        managementDashboard14.scrollRectToVisible(rectangle90);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(jPopupMenu26);
        org.junit.Assert.assertNotNull(component28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dimension38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertNull(image51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(inputMethodRequests55);
        org.junit.Assert.assertNull(container56);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(inputMethodRequests66);
        org.junit.Assert.assertNull(container67);
        org.junit.Assert.assertNull(actionListener71);
        org.junit.Assert.assertNotNull(jToolTip72);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(dimension85);
        org.junit.Assert.assertNotNull(dimension86);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(rectangle90);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.event.ContainerListener containerListener5 = null;
        managementDashboard1.removeContainerListener(containerListener5);
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = managementDashboard1.getFocusTraversalPolicy();
        java.beans.VetoableChangeListener vetoableChangeListener8 = null;
        managementDashboard1.removeVetoableChangeListener(vetoableChangeListener8);
        boolean boolean10 = managementDashboard1.isPaintingTile();
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        ManagementDashboard managementDashboard12 = new ManagementDashboard(strConsumer11);
        boolean boolean13 = managementDashboard12.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests14 = managementDashboard12.getInputMethodRequests();
        java.awt.Container container15 = managementDashboard12.getTopLevelAncestor();
        java.awt.Color color16 = null;
        managementDashboard12.setForeground(color16);
        managementDashboard12.repaint(10, 100, 0, (int) (short) 1);
        boolean boolean23 = managementDashboard12.requestFocusInWindow();
        java.util.function.Consumer<java.lang.String> strConsumer24 = null;
        ManagementDashboard managementDashboard25 = new ManagementDashboard(strConsumer24);
        managementDashboard25.setRequestFocusEnabled(false);
        java.awt.Event event28 = null;
        boolean boolean30 = managementDashboard25.keyUp(event28, (int) (short) 1);
        managementDashboard25.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        managementDashboard25.removePropertyChangeListener("", propertyChangeListener34);
        managementDashboard25.doLayout();
        javax.swing.JPopupMenu jPopupMenu37 = managementDashboard25.getComponentPopupMenu();
        java.awt.Component component39 = managementDashboard12.add((java.awt.Component) managementDashboard25, 1);
        managementDashboard25.firePropertyChange("ToolTipText", (short) 1, (short) (byte) 100);
        boolean boolean44 = managementDashboard25.isFocusTraversalPolicyProvider();
        managementDashboard25.setAlignmentY((float) 64);
        managementDashboard1.remove((java.awt.Component) managementDashboard25);
        java.awt.event.HierarchyListener[] hierarchyListenerArray48 = managementDashboard1.getHierarchyListeners();
        java.awt.event.MouseEvent mouseEvent49 = null;
        java.awt.Point point50 = managementDashboard1.getPopupLocation(mouseEvent49);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(focusTraversalPolicy7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(inputMethodRequests14);
        org.junit.Assert.assertNull(container15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(jPopupMenu37);
        org.junit.Assert.assertNotNull(component39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(hierarchyListenerArray48);
        org.junit.Assert.assertArrayEquals(hierarchyListenerArray48, new java.awt.event.HierarchyListener[] {});
        org.junit.Assert.assertNull(point50);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        ParkingLot parkingLot1 = new ParkingLot("ToolTipText");
        ParkingSpace parkingSpace3 = parkingLot1.getSpace(2);
        org.junit.Assert.assertNotNull(parkingSpace3);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        java.awt.event.MouseMotionListener mouseMotionListener2 = null;
        managementDashboard1.addMouseMotionListener(mouseMotionListener2);
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        boolean boolean6 = managementDashboard5.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests7 = managementDashboard5.getInputMethodRequests();
        java.awt.Container container8 = managementDashboard5.getTopLevelAncestor();
        java.awt.event.ContainerListener containerListener9 = null;
        managementDashboard5.removeContainerListener(containerListener9);
        javax.swing.JPopupMenu jPopupMenu11 = null;
        managementDashboard5.setComponentPopupMenu(jPopupMenu11);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener13 = null;
        managementDashboard5.addHierarchyBoundsListener(hierarchyBoundsListener13);
        javax.swing.event.AncestorListener[] ancestorListenerArray15 = managementDashboard5.getAncestorListeners();
        java.awt.event.ContainerListener containerListener16 = null;
        managementDashboard5.addContainerListener(containerListener16);
        int int18 = managementDashboard1.getComponentZOrder((java.awt.Component) managementDashboard5);
        boolean boolean19 = managementDashboard1.isCursorSet();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(inputMethodRequests7);
        org.junit.Assert.assertNull(container8);
        org.junit.Assert.assertNotNull(ancestorListenerArray15);
        org.junit.Assert.assertArrayEquals(ancestorListenerArray15, new javax.swing.event.AncestorListener[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        boolean boolean4 = managementDashboard1.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget5 = null;
        managementDashboard1.setDropTarget(dropTarget5);
        java.awt.Dimension dimension7 = null;
        managementDashboard1.setPreferredSize(dimension7);
        javax.swing.event.AncestorListener ancestorListener9 = null;
        managementDashboard1.removeAncestorListener(ancestorListener9);
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        ManagementDashboard managementDashboard12 = new ManagementDashboard(strConsumer11);
        managementDashboard12.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy15 = null;
        managementDashboard12.setFocusTraversalPolicy(focusTraversalPolicy15);
        java.awt.Event event17 = null;
        boolean boolean20 = managementDashboard12.mouseDrag(event17, (int) (short) 10, 4);
        managementDashboard12.setEnabled(true);
        java.awt.Component component23 = managementDashboard1.add((java.awt.Component) managementDashboard12);
        java.awt.Event event24 = null;
        java.lang.Object obj25 = null;
        boolean boolean26 = managementDashboard1.action(event24, obj25);
        java.awt.Event event27 = null;
        boolean boolean29 = managementDashboard1.keyDown(event27, (int) (short) -1);
        javax.swing.InputVerifier inputVerifier30 = managementDashboard1.getInputVerifier();
        java.beans.VetoableChangeListener vetoableChangeListener31 = null;
        managementDashboard1.removeVetoableChangeListener(vetoableChangeListener31);
        managementDashboard1.repaint((long) (-1), 16, (int) (short) 10, 8, 128);
        java.awt.im.InputMethodRequests inputMethodRequests39 = managementDashboard1.getInputMethodRequests();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(component23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(inputVerifier30);
        org.junit.Assert.assertNull(inputMethodRequests39);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.event.ContainerListener containerListener5 = null;
        managementDashboard1.removeContainerListener(containerListener5);
        javax.swing.JPopupMenu jPopupMenu7 = null;
        managementDashboard1.setComponentPopupMenu(jPopupMenu7);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener9 = null;
        managementDashboard1.addHierarchyBoundsListener(hierarchyBoundsListener9);
        java.awt.Cursor cursor11 = managementDashboard1.getCursor();
        java.util.function.Consumer<java.lang.String> strConsumer12 = null;
        ManagementDashboard managementDashboard13 = new ManagementDashboard(strConsumer12);
        boolean boolean14 = managementDashboard13.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests15 = managementDashboard13.getInputMethodRequests();
        java.util.function.Consumer<java.lang.String> strConsumer16 = null;
        ManagementDashboard managementDashboard17 = new ManagementDashboard(strConsumer16);
        managementDashboard17.setInheritsPopupMenu(true);
        boolean boolean20 = managementDashboard17.isValidateRoot();
        int int21 = managementDashboard13.getComponentZOrder((java.awt.Component) managementDashboard17);
        java.awt.Dimension dimension22 = managementDashboard13.size();
        managementDashboard1.setMinimumSize(dimension22);
        boolean boolean24 = managementDashboard1.isShowing();
        managementDashboard1.repaint((long) (byte) 100, (int) (byte) 1, 10, (int) 'a', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNotNull(cursor11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(inputMethodRequests15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(dimension22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        boolean boolean4 = managementDashboard1.isValidateRoot();
        java.awt.LayoutManager layoutManager5 = null;
        managementDashboard1.setLayout(layoutManager5);
        boolean boolean7 = managementDashboard1.isOptimizedDrawingEnabled();
        managementDashboard1.updateUI();
        javax.swing.TransferHandler transferHandler9 = null;
        managementDashboard1.setTransferHandler(transferHandler9);
        boolean boolean11 = managementDashboard1.getAutoscrolls();
        java.awt.event.InputMethodListener inputMethodListener12 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener12);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        boolean boolean4 = managementDashboard1.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget5 = null;
        managementDashboard1.setDropTarget(dropTarget5);
        java.awt.Dimension dimension7 = null;
        managementDashboard1.setPreferredSize(dimension7);
        javax.swing.event.AncestorListener ancestorListener9 = null;
        managementDashboard1.removeAncestorListener(ancestorListener9);
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        ManagementDashboard managementDashboard12 = new ManagementDashboard(strConsumer11);
        managementDashboard12.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy15 = null;
        managementDashboard12.setFocusTraversalPolicy(focusTraversalPolicy15);
        java.awt.Event event17 = null;
        boolean boolean20 = managementDashboard12.mouseDrag(event17, (int) (short) 10, 4);
        managementDashboard12.setEnabled(true);
        java.awt.Component component23 = managementDashboard1.add((java.awt.Component) managementDashboard12);
        java.awt.Event event24 = null;
        java.lang.Object obj25 = null;
        boolean boolean26 = managementDashboard1.action(event24, obj25);
        java.awt.Event event27 = null;
        boolean boolean29 = managementDashboard1.keyDown(event27, (int) (short) -1);
        javax.swing.InputVerifier inputVerifier30 = managementDashboard1.getInputVerifier();
        java.beans.VetoableChangeListener vetoableChangeListener31 = null;
        managementDashboard1.removeVetoableChangeListener(vetoableChangeListener31);
        boolean boolean33 = managementDashboard1.isFocusTraversable();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(component23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(inputVerifier30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.Event event3 = null;
        boolean boolean5 = managementDashboard1.lostFocus(event3, (java.lang.Object) "");
        managementDashboard1.setAutoscrolls(false);
        java.awt.Graphics graphics8 = null;
        managementDashboard1.update(graphics8);
        java.util.function.Consumer<java.lang.String> strConsumer10 = null;
        ManagementDashboard managementDashboard11 = new ManagementDashboard(strConsumer10);
        managementDashboard11.setInheritsPopupMenu(true);
        boolean boolean14 = managementDashboard11.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget15 = null;
        managementDashboard11.setDropTarget(dropTarget15);
        boolean boolean17 = managementDashboard11.getAutoscrolls();
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        managementDashboard19.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy22 = null;
        managementDashboard19.setFocusTraversalPolicy(focusTraversalPolicy22);
        java.lang.Object obj24 = managementDashboard11.getClientProperty((java.lang.Object) managementDashboard19);
        java.util.function.Consumer<java.lang.String> strConsumer25 = null;
        ManagementDashboard managementDashboard26 = new ManagementDashboard(strConsumer25);
        managementDashboard26.setRequestFocusEnabled(false);
        java.awt.Event event29 = null;
        boolean boolean31 = managementDashboard26.keyUp(event29, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener32 = null;
        managementDashboard26.addInputMethodListener(inputMethodListener32);
        java.awt.Dimension dimension34 = managementDashboard26.getMaximumSize();
        int int35 = managementDashboard11.getComponentZOrder((java.awt.Component) managementDashboard26);
        javax.swing.KeyStroke keyStroke36 = null;
        int int37 = managementDashboard11.getConditionForKeyStroke(keyStroke36);
        managementDashboard11.transferFocusUpCycle();
        java.awt.image.ImageProducer imageProducer39 = null;
        java.awt.Image image40 = managementDashboard11.createImage(imageProducer39);
        boolean boolean46 = managementDashboard1.imageUpdate(image40, (int) (byte) 10, (int) (short) 10, 4, (int) (short) 0, 2);
        managementDashboard1.enableInputMethods(false);
        java.util.function.Consumer<java.lang.String> strConsumer49 = null;
        ManagementDashboard managementDashboard50 = new ManagementDashboard(strConsumer49);
        managementDashboard50.setRequestFocusEnabled(false);
        java.awt.Event event53 = null;
        boolean boolean55 = managementDashboard50.keyUp(event53, (int) (short) 1);
        java.lang.String str56 = managementDashboard50.toString();
        managementDashboard50.setOpaque(true);
        managementDashboard1.remove((java.awt.Component) managementDashboard50);
        java.awt.Image image62 = managementDashboard50.createImage((int) '4', 0);
        boolean boolean63 = managementDashboard50.isManagingFocus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(dimension34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(image40);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=4194313,maximumSize=,minimumSize=,preferredSize=]" + "'", str56, "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=4194313,maximumSize=,minimumSize=,preferredSize=]");
        org.junit.Assert.assertNull(image62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        managementDashboard1.setName("");
        managementDashboard1.doLayout();
        java.awt.event.KeyListener keyListener7 = null;
        managementDashboard1.addKeyListener(keyListener7);
        boolean boolean9 = managementDashboard1.isValidateRoot();
        java.util.function.Consumer<java.lang.String> strConsumer10 = null;
        ManagementDashboard managementDashboard11 = new ManagementDashboard(strConsumer10);
        managementDashboard11.setInheritsPopupMenu(true);
        boolean boolean14 = managementDashboard11.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget15 = null;
        managementDashboard11.setDropTarget(dropTarget15);
        java.awt.Dimension dimension17 = null;
        managementDashboard11.setPreferredSize(dimension17);
        javax.swing.event.AncestorListener ancestorListener19 = null;
        managementDashboard11.removeAncestorListener(ancestorListener19);
        java.awt.Dimension dimension21 = managementDashboard11.getPreferredSize();
        java.awt.Dimension dimension22 = managementDashboard11.getPreferredSize();
        java.util.function.Consumer<java.lang.String> strConsumer23 = null;
        ManagementDashboard managementDashboard24 = new ManagementDashboard(strConsumer23);
        managementDashboard24.setRequestFocusEnabled(false);
        java.awt.Event event27 = null;
        boolean boolean29 = managementDashboard24.keyUp(event27, (int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer30 = null;
        ManagementDashboard managementDashboard31 = new ManagementDashboard(strConsumer30);
        managementDashboard31.setRequestFocusEnabled(false);
        java.awt.Event event34 = null;
        boolean boolean36 = managementDashboard31.keyUp(event34, (int) (short) 1);
        managementDashboard31.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        managementDashboard31.removePropertyChangeListener("", propertyChangeListener40);
        java.awt.Dimension dimension42 = managementDashboard31.getPreferredSize();
        managementDashboard24.setSize(dimension42);
        java.awt.Dimension dimension44 = managementDashboard11.getSize(dimension42);
        java.awt.event.MouseWheelListener[] mouseWheelListenerArray45 = managementDashboard11.getMouseWheelListeners();
        java.awt.image.ImageProducer imageProducer46 = null;
        java.awt.Image image47 = managementDashboard11.createImage(imageProducer46);
        java.util.function.Consumer<java.lang.String> strConsumer50 = null;
        ManagementDashboard managementDashboard51 = new ManagementDashboard(strConsumer50);
        managementDashboard51.setInheritsPopupMenu(true);
        boolean boolean54 = managementDashboard51.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget55 = null;
        managementDashboard51.setDropTarget(dropTarget55);
        boolean boolean57 = managementDashboard51.getAutoscrolls();
        java.util.function.Consumer<java.lang.String> strConsumer58 = null;
        ManagementDashboard managementDashboard59 = new ManagementDashboard(strConsumer58);
        managementDashboard59.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy62 = null;
        managementDashboard59.setFocusTraversalPolicy(focusTraversalPolicy62);
        java.lang.Object obj64 = managementDashboard51.getClientProperty((java.lang.Object) managementDashboard59);
        java.util.function.Consumer<java.lang.String> strConsumer65 = null;
        ManagementDashboard managementDashboard66 = new ManagementDashboard(strConsumer65);
        managementDashboard66.setRequestFocusEnabled(false);
        java.awt.Event event69 = null;
        boolean boolean71 = managementDashboard66.keyUp(event69, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener72 = null;
        managementDashboard66.addInputMethodListener(inputMethodListener72);
        java.awt.Dimension dimension74 = managementDashboard66.getMaximumSize();
        int int75 = managementDashboard51.getComponentZOrder((java.awt.Component) managementDashboard66);
        java.awt.Component component76 = managementDashboard51.getNextFocusableComponent();
        java.awt.Insets insets77 = managementDashboard51.insets();
        java.util.function.Consumer<java.lang.String> strConsumer78 = null;
        ManagementDashboard managementDashboard79 = new ManagementDashboard(strConsumer78);
        managementDashboard79.setInheritsPopupMenu(true);
        java.awt.LayoutManager layoutManager82 = null;
        managementDashboard79.setLayout(layoutManager82);
        managementDashboard79.setFocusTraversalPolicyProvider(true);
        java.awt.Dimension dimension86 = managementDashboard79.getMaximumSize();
        java.awt.Dimension dimension87 = managementDashboard51.getSize(dimension86);
        managementDashboard51.firePropertyChange("hi!", true, false);
        java.awt.Insets insets92 = managementDashboard51.getInsets();
        java.awt.event.InputMethodListener inputMethodListener93 = null;
        managementDashboard51.addInputMethodListener(inputMethodListener93);
        javax.swing.event.AncestorListener[] ancestorListenerArray95 = managementDashboard51.getAncestorListeners();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean96 = managementDashboard1.prepareImage(image47, 2, (int) (short) 100, (java.awt.image.ImageObserver) managementDashboard51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.image.ImageProducer.startProduction(java.awt.image.ImageConsumer)\" because the return value of \"sun.awt.image.ToolkitImage.getSource()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dimension21);
        org.junit.Assert.assertNotNull(dimension22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(dimension42);
        org.junit.Assert.assertNotNull(dimension44);
        org.junit.Assert.assertNotNull(mouseWheelListenerArray45);
        org.junit.Assert.assertArrayEquals(mouseWheelListenerArray45, new java.awt.event.MouseWheelListener[] {});
        org.junit.Assert.assertNotNull(image47);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(dimension74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNull(component76);
        org.junit.Assert.assertNotNull(insets77);
        org.junit.Assert.assertNotNull(dimension86);
        org.junit.Assert.assertNotNull(dimension87);
        org.junit.Assert.assertNotNull(insets92);
        org.junit.Assert.assertNotNull(ancestorListenerArray95);
        org.junit.Assert.assertArrayEquals(ancestorListenerArray95, new javax.swing.event.AncestorListener[] {});
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        ParkingLot parkingLot1 = new ParkingLot("data/userData.csv");
        ParkingSpace parkingSpace3 = parkingLot1.getSpace((int) (byte) 10);
        parkingLot1.removeBooking(128);
        boolean boolean6 = parkingLot1.getEnabled();
        parkingLot1.setEnabled(true);
        parkingLot1.setEnabled(true);
        boolean boolean11 = parkingLot1.getEnabled();
        org.junit.Assert.assertNotNull(parkingSpace3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        managementDashboard1.invalidate();
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        java.awt.LayoutManager layoutManager4 = null;
        managementDashboard1.setLayout(layoutManager4);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        managementDashboard1.addPropertyChangeListener("data/managerData.csv", propertyChangeListener7);
        java.util.function.Consumer<java.lang.String> strConsumer9 = null;
        ManagementDashboard managementDashboard10 = new ManagementDashboard(strConsumer9);
        boolean boolean11 = managementDashboard10.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests12 = managementDashboard10.getInputMethodRequests();
        java.awt.Container container13 = managementDashboard10.getTopLevelAncestor();
        java.awt.Color color14 = null;
        managementDashboard10.setForeground(color14);
        managementDashboard10.repaint(10, 100, 0, (int) (short) 1);
        boolean boolean21 = managementDashboard1.isFocusCycleRoot((java.awt.Container) managementDashboard10);
        java.awt.Graphics graphics22 = null;
        managementDashboard1.paint(graphics22);
        managementDashboard1.repaint();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(inputMethodRequests12);
        org.junit.Assert.assertNull(container13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        javax.swing.KeyStroke keyStroke7 = null;
        java.awt.event.ActionListener actionListener8 = managementDashboard1.getActionForKeyStroke(keyStroke7);
        javax.swing.JToolTip jToolTip9 = managementDashboard1.createToolTip();
        java.util.function.Consumer<java.lang.String> strConsumer10 = null;
        ManagementDashboard managementDashboard11 = new ManagementDashboard(strConsumer10);
        boolean boolean12 = managementDashboard11.isCursorSet();
        java.awt.Event event13 = null;
        boolean boolean15 = managementDashboard11.lostFocus(event13, (java.lang.Object) "");
        java.util.function.Consumer<java.lang.String> strConsumer16 = null;
        ManagementDashboard managementDashboard17 = new ManagementDashboard(strConsumer16);
        managementDashboard17.setRequestFocusEnabled(false);
        java.awt.Event event20 = null;
        boolean boolean22 = managementDashboard17.keyUp(event20, (int) (short) 1);
        managementDashboard17.setAutoscrolls(true);
        java.awt.event.HierarchyListener[] hierarchyListenerArray25 = managementDashboard17.getHierarchyListeners();
        jToolTip9.add((java.awt.Component) managementDashboard11, (java.lang.Object) hierarchyListenerArray25);
        boolean boolean27 = jToolTip9.requestDefaultFocus();
        jToolTip9.enableInputMethods(false);
        boolean boolean30 = jToolTip9.isShowing();
        jToolTip9.setDebugGraphicsOptions((int) (byte) 0);
        jToolTip9.move(1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(actionListener8);
        org.junit.Assert.assertNotNull(jToolTip9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(hierarchyListenerArray25);
        org.junit.Assert.assertArrayEquals(hierarchyListenerArray25, new java.awt.event.HierarchyListener[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        javax.swing.KeyStroke keyStroke7 = null;
        java.awt.event.ActionListener actionListener8 = managementDashboard1.getActionForKeyStroke(keyStroke7);
        javax.swing.JToolTip jToolTip9 = managementDashboard1.createToolTip();
        java.util.function.Consumer<java.lang.String> strConsumer10 = null;
        ManagementDashboard managementDashboard11 = new ManagementDashboard(strConsumer10);
        managementDashboard11.setRequestFocusEnabled(false);
        java.awt.Event event14 = null;
        boolean boolean16 = managementDashboard11.keyUp(event14, (int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer17 = null;
        ManagementDashboard managementDashboard18 = new ManagementDashboard(strConsumer17);
        managementDashboard18.setRequestFocusEnabled(false);
        java.awt.Event event21 = null;
        boolean boolean23 = managementDashboard18.keyUp(event21, (int) (short) 1);
        managementDashboard18.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        managementDashboard18.removePropertyChangeListener("", propertyChangeListener27);
        java.awt.Dimension dimension29 = managementDashboard18.getPreferredSize();
        managementDashboard11.setSize(dimension29);
        managementDashboard1.setMinimumSize(dimension29);
        java.util.function.Consumer<java.lang.String> strConsumer32 = null;
        ManagementDashboard managementDashboard33 = new ManagementDashboard(strConsumer32);
        managementDashboard33.setRequestFocusEnabled(false);
        java.awt.Event event36 = null;
        boolean boolean38 = managementDashboard33.keyUp(event36, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener39 = null;
        managementDashboard33.addInputMethodListener(inputMethodListener39);
        boolean boolean41 = managementDashboard33.isValidateRoot();
        boolean boolean42 = managementDashboard1.isFocusCycleRoot((java.awt.Container) managementDashboard33);
        java.awt.Container container43 = managementDashboard1.getTopLevelAncestor();
        java.util.function.Consumer<java.lang.String> strConsumer44 = null;
        ManagementDashboard managementDashboard45 = new ManagementDashboard(strConsumer44);
        boolean boolean46 = managementDashboard45.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests47 = managementDashboard45.getInputMethodRequests();
        java.util.function.Consumer<java.lang.String> strConsumer48 = null;
        ManagementDashboard managementDashboard49 = new ManagementDashboard(strConsumer48);
        managementDashboard49.setInheritsPopupMenu(true);
        boolean boolean52 = managementDashboard49.isValidateRoot();
        int int53 = managementDashboard45.getComponentZOrder((java.awt.Component) managementDashboard49);
        java.beans.PropertyChangeListener propertyChangeListener55 = null;
        managementDashboard49.addPropertyChangeListener("hi!", propertyChangeListener55);
        boolean boolean57 = managementDashboard49.isPreferredSizeSet();
        managementDashboard49.setToolTipText("");
        java.awt.event.InputMethodListener inputMethodListener60 = null;
        managementDashboard49.removeInputMethodListener(inputMethodListener60);
        java.util.function.Consumer<java.lang.String> strConsumer62 = null;
        ManagementDashboard managementDashboard63 = new ManagementDashboard(strConsumer62);
        managementDashboard63.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy66 = null;
        managementDashboard63.setFocusTraversalPolicy(focusTraversalPolicy66);
        java.awt.Event event68 = null;
        boolean boolean71 = managementDashboard63.mouseDrag(event68, (int) (short) 10, 4);
        java.beans.PropertyChangeListener propertyChangeListener73 = null;
        managementDashboard63.removePropertyChangeListener("hi!", propertyChangeListener73);
        boolean boolean75 = managementDashboard63.isMaximumSizeSet();
        java.awt.Font font76 = managementDashboard63.getFont();
        java.awt.FontMetrics fontMetrics77 = managementDashboard49.getFontMetrics(font76);
        java.awt.FontMetrics fontMetrics78 = managementDashboard1.getFontMetrics(font76);
        java.awt.Event event79 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean80 = managementDashboard1.postEvent(event79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(actionListener8);
        org.junit.Assert.assertNotNull(jToolTip9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dimension29);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(container43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(inputMethodRequests47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(font76);
        org.junit.Assert.assertNotNull(fontMetrics77);
        org.junit.Assert.assertNotNull(fontMetrics78);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        java.lang.String str7 = managementDashboard1.toString();
        boolean boolean8 = managementDashboard1.isFocusTraversalPolicySet();
        java.awt.Rectangle rectangle9 = managementDashboard1.getVisibleRect();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=4194313,maximumSize=,minimumSize=,preferredSize=]" + "'", str7, "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=4194313,maximumSize=,minimumSize=,preferredSize=]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangle9);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener7 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener7);
        managementDashboard1.move((int) (byte) 0, 8);
        java.awt.Event event12 = null;
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        boolean boolean15 = managementDashboard14.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests16 = managementDashboard14.getInputMethodRequests();
        java.awt.Container container17 = managementDashboard14.getTopLevelAncestor();
        boolean boolean18 = managementDashboard1.gotFocus(event12, (java.lang.Object) container17);
        managementDashboard1.hide();
        boolean boolean20 = managementDashboard1.isFocusTraversable();
        java.awt.event.MouseMotionListener mouseMotionListener21 = null;
        managementDashboard1.removeMouseMotionListener(mouseMotionListener21);
        managementDashboard1.updateUI();
        java.awt.Graphics graphics24 = null;
        managementDashboard1.update(graphics24);
        java.awt.image.VolatileImage volatileImage28 = managementDashboard1.createVolatileImage(35, 32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputMethodRequests16);
        org.junit.Assert.assertNull(container17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(volatileImage28);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        javax.swing.KeyStroke keyStroke7 = null;
        java.awt.event.ActionListener actionListener8 = managementDashboard1.getActionForKeyStroke(keyStroke7);
        javax.swing.JToolTip jToolTip9 = managementDashboard1.createToolTip();
        java.util.function.Consumer<java.lang.String> strConsumer10 = null;
        ManagementDashboard managementDashboard11 = new ManagementDashboard(strConsumer10);
        boolean boolean12 = managementDashboard11.isCursorSet();
        java.awt.Event event13 = null;
        boolean boolean15 = managementDashboard11.lostFocus(event13, (java.lang.Object) "");
        java.util.function.Consumer<java.lang.String> strConsumer16 = null;
        ManagementDashboard managementDashboard17 = new ManagementDashboard(strConsumer16);
        managementDashboard17.setRequestFocusEnabled(false);
        java.awt.Event event20 = null;
        boolean boolean22 = managementDashboard17.keyUp(event20, (int) (short) 1);
        managementDashboard17.setAutoscrolls(true);
        java.awt.event.HierarchyListener[] hierarchyListenerArray25 = managementDashboard17.getHierarchyListeners();
        jToolTip9.add((java.awt.Component) managementDashboard11, (java.lang.Object) hierarchyListenerArray25);
        boolean boolean27 = jToolTip9.requestDefaultFocus();
        java.awt.Image image30 = jToolTip9.createImage((int) (short) 10, 2);
        jToolTip9.firePropertyChange("ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=4194313,maximumSize=,minimumSize=,preferredSize=]", (long) 32, (long) 2);
        jToolTip9.transferFocusUpCycle();
        javax.swing.InputVerifier inputVerifier36 = jToolTip9.getInputVerifier();
        java.awt.Insets insets37 = jToolTip9.getInsets();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(actionListener8);
        org.junit.Assert.assertNotNull(jToolTip9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(hierarchyListenerArray25);
        org.junit.Assert.assertArrayEquals(hierarchyListenerArray25, new java.awt.event.HierarchyListener[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(image30);
        org.junit.Assert.assertNull(inputVerifier36);
        org.junit.Assert.assertNotNull(insets37);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        managementDashboard1.setName("");
        boolean boolean6 = managementDashboard1.isPaintingForPrint();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Point point7 = managementDashboard1.getLocationOnScreen();
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: component must be showing on the screen to determine its location");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer7 = null;
        ManagementDashboard managementDashboard8 = new ManagementDashboard(strConsumer7);
        managementDashboard8.setRequestFocusEnabled(false);
        java.awt.Event event11 = null;
        boolean boolean13 = managementDashboard8.keyUp(event11, (int) (short) 1);
        managementDashboard8.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        managementDashboard8.removePropertyChangeListener("", propertyChangeListener17);
        java.awt.Dimension dimension19 = managementDashboard8.getPreferredSize();
        managementDashboard1.setSize(dimension19);
        managementDashboard1.setRequestFocusEnabled(true);
        java.awt.Font font23 = null;
        managementDashboard1.setFont(font23);
        java.awt.image.VolatileImage volatileImage27 = managementDashboard1.createVolatileImage((int) (byte) 10, (int) (byte) -1);
        boolean boolean28 = managementDashboard1.isDisplayable();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dimension19);
        org.junit.Assert.assertNull(volatileImage27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        managementDashboard1.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard1.removePropertyChangeListener("", propertyChangeListener10);
        java.awt.event.MouseEvent mouseEvent12 = null;
        java.awt.Point point13 = managementDashboard1.getPopupLocation(mouseEvent12);
        java.awt.Component component14 = managementDashboard1.getNextFocusableComponent();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(point13);
        org.junit.Assert.assertNull(component14);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer7 = null;
        ManagementDashboard managementDashboard8 = new ManagementDashboard(strConsumer7);
        managementDashboard8.setRequestFocusEnabled(false);
        java.awt.Event event11 = null;
        boolean boolean13 = managementDashboard8.keyUp(event11, (int) (short) 1);
        managementDashboard8.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        managementDashboard8.removePropertyChangeListener("", propertyChangeListener17);
        java.awt.Dimension dimension19 = managementDashboard8.getPreferredSize();
        managementDashboard1.setSize(dimension19);
        managementDashboard1.setRequestFocusEnabled(true);
        java.awt.Font font23 = null;
        managementDashboard1.setFont(font23);
        java.awt.Event event25 = null;
        boolean boolean28 = managementDashboard1.mouseExit(event25, (int) '#', (int) (short) 1);
        java.awt.Font font29 = managementDashboard1.getFont();
        managementDashboard1.setFocusable(false);
        managementDashboard1.setFocusCycleRoot(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dimension19);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(font29);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        managementDashboard1.setAutoscrolls(true);
        java.awt.event.HierarchyListener[] hierarchyListenerArray9 = managementDashboard1.getHierarchyListeners();
        java.awt.event.KeyListener keyListener10 = null;
        managementDashboard1.addKeyListener(keyListener10);
        javax.swing.TransferHandler transferHandler12 = null;
        managementDashboard1.setTransferHandler(transferHandler12);
        managementDashboard1.setInheritsPopupMenu(false);
        managementDashboard1.setFocusCycleRoot(false);
        java.lang.String str18 = managementDashboard1.getUIClassID();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(hierarchyListenerArray9);
        org.junit.Assert.assertArrayEquals(hierarchyListenerArray9, new java.awt.event.HierarchyListener[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PanelUI" + "'", str18, "PanelUI");
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        javax.swing.KeyStroke keyStroke7 = null;
        java.awt.event.ActionListener actionListener8 = managementDashboard1.getActionForKeyStroke(keyStroke7);
        javax.swing.JToolTip jToolTip9 = managementDashboard1.createToolTip();
        java.awt.Event event10 = null;
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        ManagementDashboard managementDashboard12 = new ManagementDashboard(strConsumer11);
        managementDashboard12.setInheritsPopupMenu(true);
        boolean boolean15 = managementDashboard12.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget16 = null;
        managementDashboard12.setDropTarget(dropTarget16);
        java.awt.Dimension dimension18 = null;
        managementDashboard12.setPreferredSize(dimension18);
        javax.swing.event.AncestorListener ancestorListener20 = null;
        managementDashboard12.removeAncestorListener(ancestorListener20);
        java.awt.Dimension dimension22 = managementDashboard12.getPreferredSize();
        java.awt.Dimension dimension23 = managementDashboard12.getPreferredSize();
        managementDashboard12.setDebugGraphicsOptions(10);
        boolean boolean26 = jToolTip9.lostFocus(event10, (java.lang.Object) managementDashboard12);
        boolean boolean27 = managementDashboard12.isOpaque();
        int int28 = managementDashboard12.getWidth();
        java.awt.Dimension dimension29 = managementDashboard12.getMaximumSize();
        java.beans.VetoableChangeListener vetoableChangeListener30 = null;
        managementDashboard12.removeVetoableChangeListener(vetoableChangeListener30);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(actionListener8);
        org.junit.Assert.assertNotNull(jToolTip9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dimension22);
        org.junit.Assert.assertNotNull(dimension23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(dimension29);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        managementDashboard1.setAutoscrolls(true);
        java.awt.event.HierarchyListener[] hierarchyListenerArray9 = managementDashboard1.getHierarchyListeners();
        java.awt.event.KeyListener keyListener10 = null;
        managementDashboard1.addKeyListener(keyListener10);
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray12 = managementDashboard1.getHierarchyBoundsListeners();
        javax.swing.event.AncestorListener ancestorListener13 = null;
        managementDashboard1.removeAncestorListener(ancestorListener13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(hierarchyListenerArray9);
        org.junit.Assert.assertArrayEquals(hierarchyListenerArray9, new java.awt.event.HierarchyListener[] {});
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray12);
        org.junit.Assert.assertArrayEquals(hierarchyBoundsListenerArray12, new java.awt.event.HierarchyBoundsListener[] {});
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        ParkingSpace parkingSpace4 = new ParkingSpace((int) (byte) 10, "data/managerData.csv", "", "ToolTipText");
        java.lang.String str5 = parkingSpace4.getCurrentUser();
        java.lang.String str6 = parkingSpace4.getCurrentCar();
        java.lang.String str7 = parkingSpace4.getCurrentCar();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ToolTipText" + "'", str6, "ToolTipText");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ToolTipText" + "'", str7, "ToolTipText");
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        java.awt.LayoutManager layoutManager4 = null;
        managementDashboard1.setLayout(layoutManager4);
        java.util.function.Consumer<java.lang.String> strConsumer6 = null;
        ManagementDashboard managementDashboard7 = new ManagementDashboard(strConsumer6);
        boolean boolean8 = managementDashboard7.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests9 = managementDashboard7.getInputMethodRequests();
        java.awt.Container container10 = managementDashboard7.getTopLevelAncestor();
        java.awt.Color color11 = null;
        managementDashboard7.setForeground(color11);
        javax.swing.KeyStroke keyStroke13 = null;
        java.awt.event.ActionListener actionListener14 = managementDashboard7.getActionForKeyStroke(keyStroke13);
        javax.swing.JToolTip jToolTip15 = managementDashboard7.createToolTip();
        java.awt.Event event16 = null;
        java.util.function.Consumer<java.lang.String> strConsumer17 = null;
        ManagementDashboard managementDashboard18 = new ManagementDashboard(strConsumer17);
        managementDashboard18.setInheritsPopupMenu(true);
        boolean boolean21 = managementDashboard18.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget22 = null;
        managementDashboard18.setDropTarget(dropTarget22);
        java.awt.Dimension dimension24 = null;
        managementDashboard18.setPreferredSize(dimension24);
        javax.swing.event.AncestorListener ancestorListener26 = null;
        managementDashboard18.removeAncestorListener(ancestorListener26);
        java.awt.Dimension dimension28 = managementDashboard18.getPreferredSize();
        java.awt.Dimension dimension29 = managementDashboard18.getPreferredSize();
        managementDashboard18.setDebugGraphicsOptions(10);
        boolean boolean32 = jToolTip15.lostFocus(event16, (java.lang.Object) managementDashboard18);
        java.awt.Component component33 = managementDashboard1.add((java.awt.Component) jToolTip15);
        boolean boolean34 = managementDashboard1.requestFocusInWindow();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputMethodRequests9);
        org.junit.Assert.assertNull(container10);
        org.junit.Assert.assertNull(actionListener14);
        org.junit.Assert.assertNotNull(jToolTip15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dimension28);
        org.junit.Assert.assertNotNull(dimension29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(component33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        managementDashboard1.setName("");
        managementDashboard1.doLayout();
        java.util.function.Consumer<java.lang.String> strConsumer7 = null;
        ManagementDashboard managementDashboard8 = new ManagementDashboard(strConsumer7);
        managementDashboard8.setInheritsPopupMenu(true);
        boolean boolean11 = managementDashboard8.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget12 = null;
        managementDashboard8.setDropTarget(dropTarget12);
        java.awt.Dimension dimension14 = null;
        managementDashboard8.setPreferredSize(dimension14);
        javax.swing.event.AncestorListener ancestorListener16 = null;
        managementDashboard8.removeAncestorListener(ancestorListener16);
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        managementDashboard19.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy22 = null;
        managementDashboard19.setFocusTraversalPolicy(focusTraversalPolicy22);
        java.awt.Event event24 = null;
        boolean boolean27 = managementDashboard19.mouseDrag(event24, (int) (short) 10, 4);
        managementDashboard19.setEnabled(true);
        java.awt.Component component30 = managementDashboard8.add((java.awt.Component) managementDashboard19);
        java.awt.Point point31 = component30.getLocation();
        java.awt.Component component32 = managementDashboard1.getComponentAt(point31);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(component30);
        org.junit.Assert.assertNotNull(point31);
        org.junit.Assert.assertNull(component32);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.event.ContainerListener containerListener5 = null;
        managementDashboard1.removeContainerListener(containerListener5);
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = managementDashboard1.getFocusTraversalPolicy();
        java.beans.VetoableChangeListener vetoableChangeListener8 = null;
        managementDashboard1.removeVetoableChangeListener(vetoableChangeListener8);
        java.awt.FocusTraversalPolicy focusTraversalPolicy10 = managementDashboard1.getFocusTraversalPolicy();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(focusTraversalPolicy7);
        org.junit.Assert.assertNull(focusTraversalPolicy10);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener7 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener7);
        managementDashboard1.move((int) (byte) 0, 8);
        java.awt.Event event12 = null;
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        boolean boolean15 = managementDashboard14.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests16 = managementDashboard14.getInputMethodRequests();
        java.awt.Container container17 = managementDashboard14.getTopLevelAncestor();
        boolean boolean18 = managementDashboard1.gotFocus(event12, (java.lang.Object) container17);
        managementDashboard1.hide();
        boolean boolean20 = managementDashboard1.isFocusTraversable();
        java.awt.event.MouseMotionListener mouseMotionListener21 = null;
        managementDashboard1.removeMouseMotionListener(mouseMotionListener21);
        managementDashboard1.updateUI();
        java.awt.Graphics graphics24 = null;
        managementDashboard1.update(graphics24);
        java.lang.Class<?> wildcardClass26 = managementDashboard1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputMethodRequests16);
        org.junit.Assert.assertNull(container17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        boolean boolean4 = managementDashboard1.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget5 = null;
        managementDashboard1.setDropTarget(dropTarget5);
        boolean boolean7 = managementDashboard1.getAutoscrolls();
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        managementDashboard9.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        managementDashboard9.setFocusTraversalPolicy(focusTraversalPolicy12);
        java.lang.Object obj14 = managementDashboard1.getClientProperty((java.lang.Object) managementDashboard9);
        java.awt.Point point15 = managementDashboard1.location();
        managementDashboard1.enable();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(point15);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        boolean boolean4 = managementDashboard1.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget5 = null;
        managementDashboard1.setDropTarget(dropTarget5);
        boolean boolean7 = managementDashboard1.getAutoscrolls();
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        managementDashboard9.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        managementDashboard9.setFocusTraversalPolicy(focusTraversalPolicy12);
        java.lang.Object obj14 = managementDashboard1.getClientProperty((java.lang.Object) managementDashboard9);
        java.util.function.Consumer<java.lang.String> strConsumer15 = null;
        ManagementDashboard managementDashboard16 = new ManagementDashboard(strConsumer15);
        managementDashboard16.setRequestFocusEnabled(false);
        java.awt.Event event19 = null;
        boolean boolean21 = managementDashboard16.keyUp(event19, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener22 = null;
        managementDashboard16.addInputMethodListener(inputMethodListener22);
        java.awt.Dimension dimension24 = managementDashboard16.getMaximumSize();
        int int25 = managementDashboard1.getComponentZOrder((java.awt.Component) managementDashboard16);
        java.awt.Component component26 = managementDashboard1.getNextFocusableComponent();
        java.awt.Insets insets27 = managementDashboard1.insets();
        java.util.function.Consumer<java.lang.String> strConsumer28 = null;
        ManagementDashboard managementDashboard29 = new ManagementDashboard(strConsumer28);
        boolean boolean30 = managementDashboard29.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests31 = managementDashboard29.getInputMethodRequests();
        java.awt.Container container32 = managementDashboard29.getTopLevelAncestor();
        java.awt.Color color33 = null;
        managementDashboard29.setForeground(color33);
        javax.swing.KeyStroke keyStroke35 = null;
        java.awt.event.ActionListener actionListener36 = managementDashboard29.getActionForKeyStroke(keyStroke35);
        javax.swing.JToolTip jToolTip37 = managementDashboard29.createToolTip();
        java.util.function.Consumer<java.lang.String> strConsumer38 = null;
        ManagementDashboard managementDashboard39 = new ManagementDashboard(strConsumer38);
        managementDashboard39.setRequestFocusEnabled(false);
        java.awt.Event event42 = null;
        boolean boolean44 = managementDashboard39.keyUp(event42, (int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer45 = null;
        ManagementDashboard managementDashboard46 = new ManagementDashboard(strConsumer45);
        managementDashboard46.setRequestFocusEnabled(false);
        java.awt.Event event49 = null;
        boolean boolean51 = managementDashboard46.keyUp(event49, (int) (short) 1);
        managementDashboard46.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener55 = null;
        managementDashboard46.removePropertyChangeListener("", propertyChangeListener55);
        java.awt.Dimension dimension57 = managementDashboard46.getPreferredSize();
        managementDashboard39.setSize(dimension57);
        managementDashboard29.setMinimumSize(dimension57);
        java.util.function.Consumer<java.lang.String> strConsumer60 = null;
        ManagementDashboard managementDashboard61 = new ManagementDashboard(strConsumer60);
        managementDashboard61.setRequestFocusEnabled(false);
        java.awt.Event event64 = null;
        boolean boolean66 = managementDashboard61.keyUp(event64, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener67 = null;
        managementDashboard61.addInputMethodListener(inputMethodListener67);
        boolean boolean69 = managementDashboard61.isValidateRoot();
        boolean boolean70 = managementDashboard29.isFocusCycleRoot((java.awt.Container) managementDashboard61);
        boolean boolean71 = managementDashboard29.isForegroundSet();
        managementDashboard29.hide();
        int int75 = managementDashboard29.getBaseline((int) (byte) 10, (int) (short) 0);
        java.util.function.Consumer<java.lang.String> strConsumer76 = null;
        ManagementDashboard managementDashboard77 = new ManagementDashboard(strConsumer76);
        boolean boolean78 = managementDashboard77.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests79 = managementDashboard77.getInputMethodRequests();
        managementDashboard77.move((int) (byte) 1, (int) '#');
        boolean boolean83 = managementDashboard77.isFocusTraversable();
        java.util.function.Consumer<java.lang.String> strConsumer84 = null;
        ManagementDashboard managementDashboard85 = new ManagementDashboard(strConsumer84);
        managementDashboard85.setRequestFocusEnabled(false);
        managementDashboard85.enable();
        managementDashboard85.list();
        java.awt.Point point90 = managementDashboard85.location();
        boolean boolean91 = managementDashboard77.contains(point90);
        java.awt.Point point92 = managementDashboard29.getLocation(point90);
        java.awt.Component component93 = managementDashboard1.findComponentAt(point90);
        boolean boolean94 = managementDashboard1.isValidateRoot();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dimension24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(component26);
        org.junit.Assert.assertNotNull(insets27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(inputMethodRequests31);
        org.junit.Assert.assertNull(container32);
        org.junit.Assert.assertNull(actionListener36);
        org.junit.Assert.assertNotNull(jToolTip37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(dimension57);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(inputMethodRequests79);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(point90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(point92);
        org.junit.Assert.assertNull(component93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        managementDashboard5.setInheritsPopupMenu(true);
        boolean boolean8 = managementDashboard5.isValidateRoot();
        int int9 = managementDashboard1.getComponentZOrder((java.awt.Component) managementDashboard5);
        managementDashboard1.setDebugGraphicsOptions((int) (byte) -1);
        boolean boolean12 = managementDashboard1.isCursorSet();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        boolean boolean4 = managementDashboard1.isValidateRoot();
        java.awt.LayoutManager layoutManager5 = null;
        managementDashboard1.setLayout(layoutManager5);
        boolean boolean7 = managementDashboard1.getFocusTraversalKeysEnabled();
        managementDashboard1.removeNotify();
        java.awt.Rectangle rectangle9 = managementDashboard1.getVisibleRect();
        managementDashboard1.setLocation((int) (byte) 1, 10);
        java.awt.Container container13 = managementDashboard1.getTopLevelAncestor();
        managementDashboard1.setDebugGraphicsOptions((-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(rectangle9);
        org.junit.Assert.assertNull(container13);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        managementDashboard1.move((int) (byte) 1, (int) '#');
        java.util.function.Consumer<java.lang.String> strConsumer7 = null;
        ManagementDashboard managementDashboard8 = new ManagementDashboard(strConsumer7);
        managementDashboard8.setRequestFocusEnabled(false);
        java.awt.Event event11 = null;
        boolean boolean13 = managementDashboard8.keyUp(event11, (int) (short) 1);
        managementDashboard8.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        managementDashboard8.removePropertyChangeListener("", propertyChangeListener17);
        java.awt.Dimension dimension19 = managementDashboard8.getPreferredSize();
        java.awt.Dimension dimension20 = managementDashboard1.getSize(dimension19);
        java.awt.Graphics graphics21 = null;
        managementDashboard1.paintComponents(graphics21);
        java.util.function.Consumer<java.lang.String> strConsumer24 = null;
        ManagementDashboard managementDashboard25 = new ManagementDashboard(strConsumer24);
        boolean boolean26 = managementDashboard25.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests27 = managementDashboard25.getInputMethodRequests();
        java.awt.Container container28 = managementDashboard25.getTopLevelAncestor();
        java.awt.event.ContainerListener containerListener29 = null;
        managementDashboard25.removeContainerListener(containerListener29);
        java.awt.FocusTraversalPolicy focusTraversalPolicy31 = managementDashboard25.getFocusTraversalPolicy();
        javax.swing.InputMap inputMap32 = managementDashboard25.getInputMap();
        // The following exception was thrown during execution in test generation
        try {
            managementDashboard1.setInputMap(32, inputMap32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition must be one of JComponent.WHEN_IN_FOCUSED_WINDOW, JComponent.WHEN_FOCUSED or JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dimension19);
        org.junit.Assert.assertNotNull(dimension20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(inputMethodRequests27);
        org.junit.Assert.assertNull(container28);
        org.junit.Assert.assertNull(focusTraversalPolicy31);
        org.junit.Assert.assertNotNull(inputMap32);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        ParkingLot parkingLot1 = new ParkingLot("ToolTipText");
        parkingLot1.setSpace(0, "data/managerData.csv", "data/lotData.csv", "ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=4194313,maximumSize=,minimumSize=,preferredSize=]");
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        javax.swing.KeyStroke keyStroke7 = null;
        java.awt.event.ActionListener actionListener8 = managementDashboard1.getActionForKeyStroke(keyStroke7);
        javax.swing.JToolTip jToolTip9 = managementDashboard1.createToolTip();
        java.util.function.Consumer<java.lang.String> strConsumer10 = null;
        ManagementDashboard managementDashboard11 = new ManagementDashboard(strConsumer10);
        managementDashboard11.setRequestFocusEnabled(false);
        java.awt.Event event14 = null;
        boolean boolean16 = managementDashboard11.keyUp(event14, (int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer17 = null;
        ManagementDashboard managementDashboard18 = new ManagementDashboard(strConsumer17);
        managementDashboard18.setRequestFocusEnabled(false);
        java.awt.Event event21 = null;
        boolean boolean23 = managementDashboard18.keyUp(event21, (int) (short) 1);
        managementDashboard18.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        managementDashboard18.removePropertyChangeListener("", propertyChangeListener27);
        java.awt.Dimension dimension29 = managementDashboard18.getPreferredSize();
        managementDashboard11.setSize(dimension29);
        managementDashboard1.setMinimumSize(dimension29);
        java.util.function.Consumer<java.lang.String> strConsumer32 = null;
        ManagementDashboard managementDashboard33 = new ManagementDashboard(strConsumer32);
        managementDashboard33.setRequestFocusEnabled(false);
        java.awt.Event event36 = null;
        boolean boolean38 = managementDashboard33.keyUp(event36, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener39 = null;
        managementDashboard33.addInputMethodListener(inputMethodListener39);
        boolean boolean41 = managementDashboard33.isValidateRoot();
        boolean boolean42 = managementDashboard1.isFocusCycleRoot((java.awt.Container) managementDashboard33);
        managementDashboard33.firePropertyChange("hi!", false, true);
        boolean boolean47 = managementDashboard33.isDisplayable();
        java.beans.VetoableChangeListener[] vetoableChangeListenerArray48 = managementDashboard33.getVetoableChangeListeners();
        java.util.function.Consumer<java.lang.String> strConsumer49 = null;
        ManagementDashboard managementDashboard50 = new ManagementDashboard(strConsumer49);
        boolean boolean51 = managementDashboard50.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests52 = managementDashboard50.getInputMethodRequests();
        java.awt.Container container53 = managementDashboard50.getTopLevelAncestor();
        java.awt.Color color54 = null;
        managementDashboard50.setForeground(color54);
        javax.swing.KeyStroke keyStroke56 = null;
        java.awt.event.ActionListener actionListener57 = managementDashboard50.getActionForKeyStroke(keyStroke56);
        java.util.function.Consumer<java.lang.String> strConsumer58 = null;
        ManagementDashboard managementDashboard59 = new ManagementDashboard(strConsumer58);
        boolean boolean60 = managementDashboard59.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests61 = managementDashboard59.getInputMethodRequests();
        java.awt.Container container62 = managementDashboard59.getTopLevelAncestor();
        java.awt.event.ContainerListener containerListener63 = null;
        managementDashboard59.removeContainerListener(containerListener63);
        int int65 = managementDashboard50.getComponentZOrder((java.awt.Component) managementDashboard59);
        java.util.function.Consumer<java.lang.String> strConsumer66 = null;
        ManagementDashboard managementDashboard67 = new ManagementDashboard(strConsumer66);
        managementDashboard67.setInheritsPopupMenu(true);
        java.awt.LayoutManager layoutManager70 = null;
        managementDashboard67.setLayout(layoutManager70);
        java.beans.PropertyChangeListener propertyChangeListener73 = null;
        managementDashboard67.addPropertyChangeListener("data/managerData.csv", propertyChangeListener73);
        java.awt.Dimension dimension75 = managementDashboard67.getPreferredSize();
        managementDashboard50.setMaximumSize(dimension75);
        managementDashboard33.setMaximumSize(dimension75);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(actionListener8);
        org.junit.Assert.assertNotNull(jToolTip9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dimension29);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(vetoableChangeListenerArray48);
        org.junit.Assert.assertArrayEquals(vetoableChangeListenerArray48, new java.beans.VetoableChangeListener[] {});
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(inputMethodRequests52);
        org.junit.Assert.assertNull(container53);
        org.junit.Assert.assertNull(actionListener57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(inputMethodRequests61);
        org.junit.Assert.assertNull(container62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(dimension75);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        javax.swing.KeyStroke keyStroke7 = null;
        java.awt.event.ActionListener actionListener8 = managementDashboard1.getActionForKeyStroke(keyStroke7);
        javax.swing.JToolTip jToolTip9 = managementDashboard1.createToolTip();
        java.awt.Event event10 = null;
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        ManagementDashboard managementDashboard12 = new ManagementDashboard(strConsumer11);
        managementDashboard12.setInheritsPopupMenu(true);
        boolean boolean15 = managementDashboard12.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget16 = null;
        managementDashboard12.setDropTarget(dropTarget16);
        java.awt.Dimension dimension18 = null;
        managementDashboard12.setPreferredSize(dimension18);
        javax.swing.event.AncestorListener ancestorListener20 = null;
        managementDashboard12.removeAncestorListener(ancestorListener20);
        java.awt.Dimension dimension22 = managementDashboard12.getPreferredSize();
        java.awt.Dimension dimension23 = managementDashboard12.getPreferredSize();
        managementDashboard12.setDebugGraphicsOptions(10);
        boolean boolean26 = jToolTip9.lostFocus(event10, (java.lang.Object) managementDashboard12);
        boolean boolean27 = managementDashboard12.isOpaque();
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        managementDashboard12.addPropertyChangeListener("ToolTipText", propertyChangeListener29);
        java.awt.Component[] componentArray31 = managementDashboard12.getComponents();
        java.awt.Font font32 = null;
        managementDashboard12.setFont(font32);
        javax.swing.plaf.PanelUI panelUI34 = managementDashboard12.getUI();
        boolean boolean35 = managementDashboard12.isRequestFocusEnabled();
        java.awt.event.HierarchyListener hierarchyListener36 = null;
        managementDashboard12.removeHierarchyListener(hierarchyListener36);
        managementDashboard12.setSize(4, (int) (short) 100);
        managementDashboard12.firePropertyChange("ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=8388617,maximumSize=,minimumSize=,preferredSize=]", (byte) 1, (byte) 1);
        java.awt.event.KeyListener keyListener45 = null;
        managementDashboard12.removeKeyListener(keyListener45);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(actionListener8);
        org.junit.Assert.assertNotNull(jToolTip9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dimension22);
        org.junit.Assert.assertNotNull(dimension23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(componentArray31);
        org.junit.Assert.assertNotNull(panelUI34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        managementDashboard1.enable();
        managementDashboard1.list();
        java.awt.Point point6 = managementDashboard1.location();
        managementDashboard1.removeAll();
        managementDashboard1.setDoubleBuffered(false);
        javax.swing.InputVerifier inputVerifier10 = null;
        managementDashboard1.setInputVerifier(inputVerifier10);
        org.junit.Assert.assertNotNull(point6);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        boolean boolean7 = managementDashboard1.isCursorSet();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        managementDashboard1.addPropertyChangeListener("data/userData.csv", propertyChangeListener9);
        java.awt.Dimension dimension11 = managementDashboard1.getMinimumSize();
        java.awt.dnd.DropTarget dropTarget12 = managementDashboard1.getDropTarget();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertNull(dropTarget12);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        managementDashboard1.repaint(10, 100, 0, (int) (short) 1);
        boolean boolean12 = managementDashboard1.requestFocusInWindow();
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        managementDashboard14.setRequestFocusEnabled(false);
        java.awt.Event event17 = null;
        boolean boolean19 = managementDashboard14.keyUp(event17, (int) (short) 1);
        managementDashboard14.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        managementDashboard14.removePropertyChangeListener("", propertyChangeListener23);
        managementDashboard14.doLayout();
        javax.swing.JPopupMenu jPopupMenu26 = managementDashboard14.getComponentPopupMenu();
        java.awt.Component component28 = managementDashboard1.add((java.awt.Component) managementDashboard14, 1);
        java.util.function.Consumer<java.lang.String> strConsumer29 = null;
        ManagementDashboard managementDashboard30 = new ManagementDashboard(strConsumer29);
        managementDashboard30.setRequestFocusEnabled(false);
        java.awt.Event event33 = null;
        boolean boolean35 = managementDashboard30.keyUp(event33, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener36 = null;
        managementDashboard30.addInputMethodListener(inputMethodListener36);
        java.awt.Dimension dimension38 = managementDashboard30.getMaximumSize();
        managementDashboard14.setPreferredSize(dimension38);
        managementDashboard14.show(false);
        int int44 = managementDashboard14.getBaseline((int) (byte) 10, (int) 'a');
        managementDashboard14.repaint((long) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(jPopupMenu26);
        org.junit.Assert.assertNotNull(component28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dimension38);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        managementDashboard1.list();
        javax.swing.plaf.PanelUI panelUI8 = managementDashboard1.getUI();
        java.awt.image.ColorModel colorModel9 = managementDashboard1.getColorModel();
        boolean boolean10 = managementDashboard1.hasFocus();
        java.awt.event.FocusListener[] focusListenerArray11 = managementDashboard1.getFocusListeners();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(panelUI8);
        org.junit.Assert.assertNotNull(colorModel9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(focusListenerArray11);
        org.junit.Assert.assertArrayEquals(focusListenerArray11, new java.awt.event.FocusListener[] {});
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer7 = null;
        ManagementDashboard managementDashboard8 = new ManagementDashboard(strConsumer7);
        managementDashboard8.setRequestFocusEnabled(false);
        java.awt.Event event11 = null;
        boolean boolean13 = managementDashboard8.keyUp(event11, (int) (short) 1);
        managementDashboard8.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        managementDashboard8.removePropertyChangeListener("", propertyChangeListener17);
        java.awt.Dimension dimension19 = managementDashboard8.getPreferredSize();
        managementDashboard1.setSize(dimension19);
        managementDashboard1.setRequestFocusEnabled(true);
        managementDashboard1.addNotify();
        managementDashboard1.firePropertyChange("hi!", (byte) -1, (byte) 100);
        java.util.function.Consumer<java.lang.String> strConsumer28 = null;
        ManagementDashboard managementDashboard29 = new ManagementDashboard(strConsumer28);
        managementDashboard29.setInheritsPopupMenu(true);
        boolean boolean32 = managementDashboard29.isValidateRoot();
        java.awt.LayoutManager layoutManager33 = null;
        managementDashboard29.setLayout(layoutManager33);
        boolean boolean35 = managementDashboard29.getFocusTraversalKeysEnabled();
        java.awt.Event event36 = null;
        boolean boolean39 = managementDashboard29.mouseEnter(event36, (int) (byte) 0, 0);
        java.awt.event.MouseEvent mouseEvent40 = null;
        java.awt.Point point41 = managementDashboard29.getPopupLocation(mouseEvent40);
        java.util.function.Consumer<java.lang.String> strConsumer42 = null;
        ManagementDashboard managementDashboard43 = new ManagementDashboard(strConsumer42);
        managementDashboard43.setInheritsPopupMenu(true);
        boolean boolean46 = managementDashboard43.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget47 = null;
        managementDashboard43.setDropTarget(dropTarget47);
        boolean boolean49 = managementDashboard43.getAutoscrolls();
        java.util.function.Consumer<java.lang.String> strConsumer50 = null;
        ManagementDashboard managementDashboard51 = new ManagementDashboard(strConsumer50);
        managementDashboard51.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy54 = null;
        managementDashboard51.setFocusTraversalPolicy(focusTraversalPolicy54);
        java.lang.Object obj56 = managementDashboard43.getClientProperty((java.lang.Object) managementDashboard51);
        java.util.function.Consumer<java.lang.String> strConsumer57 = null;
        ManagementDashboard managementDashboard58 = new ManagementDashboard(strConsumer57);
        managementDashboard58.setRequestFocusEnabled(false);
        java.awt.Event event61 = null;
        boolean boolean63 = managementDashboard58.keyUp(event61, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener64 = null;
        managementDashboard58.addInputMethodListener(inputMethodListener64);
        java.awt.Dimension dimension66 = managementDashboard58.getMaximumSize();
        int int67 = managementDashboard43.getComponentZOrder((java.awt.Component) managementDashboard58);
        java.awt.Component component68 = managementDashboard43.getNextFocusableComponent();
        java.awt.Insets insets69 = managementDashboard43.insets();
        java.awt.Insets insets70 = managementDashboard29.getInsets(insets69);
        java.awt.Insets insets71 = managementDashboard1.getInsets(insets69);
        managementDashboard1.updateUI();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dimension19);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(point41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(dimension66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNull(component68);
        org.junit.Assert.assertNotNull(insets69);
        org.junit.Assert.assertNotNull(insets70);
        org.junit.Assert.assertNotNull(insets71);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        boolean boolean7 = managementDashboard1.isCursorSet();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        managementDashboard1.addPropertyChangeListener("data/userData.csv", propertyChangeListener9);
        java.awt.Component component13 = managementDashboard1.findComponentAt(0, 1);
        java.util.function.Consumer<java.lang.String> strConsumer14 = null;
        ManagementDashboard managementDashboard15 = new ManagementDashboard(strConsumer14);
        boolean boolean16 = managementDashboard15.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests17 = managementDashboard15.getInputMethodRequests();
        java.util.function.Consumer<java.lang.String> strConsumer18 = null;
        ManagementDashboard managementDashboard19 = new ManagementDashboard(strConsumer18);
        managementDashboard19.setInheritsPopupMenu(true);
        boolean boolean22 = managementDashboard19.isValidateRoot();
        int int23 = managementDashboard15.getComponentZOrder((java.awt.Component) managementDashboard19);
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        managementDashboard19.addPropertyChangeListener("hi!", propertyChangeListener25);
        boolean boolean27 = managementDashboard19.isPreferredSizeSet();
        managementDashboard19.setToolTipText("");
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        managementDashboard19.addPropertyChangeListener("hi!", propertyChangeListener31);
        java.awt.Insets insets33 = null;
        java.awt.Insets insets34 = managementDashboard19.getInsets(insets33);
        MobilePayment mobilePayment35 = new MobilePayment();
        java.lang.Object obj36 = managementDashboard19.getClientProperty((java.lang.Object) mobilePayment35);
        java.util.function.Consumer<java.lang.String> strConsumer37 = null;
        ManagementDashboard managementDashboard38 = new ManagementDashboard(strConsumer37);
        boolean boolean39 = managementDashboard38.isCursorSet();
        java.awt.Event event40 = null;
        boolean boolean42 = managementDashboard38.lostFocus(event40, (java.lang.Object) "");
        java.util.function.Consumer<java.lang.String> strConsumer43 = null;
        ManagementDashboard managementDashboard44 = new ManagementDashboard(strConsumer43);
        boolean boolean45 = managementDashboard44.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests46 = managementDashboard44.getInputMethodRequests();
        java.awt.Container container47 = managementDashboard44.getTopLevelAncestor();
        java.awt.event.ContainerListener containerListener48 = null;
        managementDashboard44.removeContainerListener(containerListener48);
        java.awt.FocusTraversalPolicy focusTraversalPolicy50 = managementDashboard44.getFocusTraversalPolicy();
        java.util.function.Consumer<java.lang.String> strConsumer51 = null;
        ManagementDashboard managementDashboard52 = new ManagementDashboard(strConsumer51);
        managementDashboard52.setInheritsPopupMenu(true);
        boolean boolean55 = managementDashboard52.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget56 = null;
        managementDashboard52.setDropTarget(dropTarget56);
        java.awt.Dimension dimension58 = null;
        managementDashboard52.setPreferredSize(dimension58);
        java.awt.Event event60 = null;
        boolean boolean63 = managementDashboard52.mouseExit(event60, (int) 'a', (int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer64 = null;
        ManagementDashboard managementDashboard65 = new ManagementDashboard(strConsumer64);
        boolean boolean66 = managementDashboard65.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests67 = managementDashboard65.getInputMethodRequests();
        java.awt.Container container68 = managementDashboard65.getTopLevelAncestor();
        java.awt.Color color69 = null;
        managementDashboard65.setForeground(color69);
        javax.swing.KeyStroke keyStroke71 = null;
        java.awt.event.ActionListener actionListener72 = managementDashboard65.getActionForKeyStroke(keyStroke71);
        javax.swing.JToolTip jToolTip73 = managementDashboard65.createToolTip();
        java.awt.Event event74 = null;
        java.util.function.Consumer<java.lang.String> strConsumer75 = null;
        ManagementDashboard managementDashboard76 = new ManagementDashboard(strConsumer75);
        managementDashboard76.setInheritsPopupMenu(true);
        boolean boolean79 = managementDashboard76.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget80 = null;
        managementDashboard76.setDropTarget(dropTarget80);
        java.awt.Dimension dimension82 = null;
        managementDashboard76.setPreferredSize(dimension82);
        javax.swing.event.AncestorListener ancestorListener84 = null;
        managementDashboard76.removeAncestorListener(ancestorListener84);
        java.awt.Dimension dimension86 = managementDashboard76.getPreferredSize();
        java.awt.Dimension dimension87 = managementDashboard76.getPreferredSize();
        managementDashboard76.setDebugGraphicsOptions(10);
        boolean boolean90 = jToolTip73.lostFocus(event74, (java.lang.Object) managementDashboard76);
        java.awt.Rectangle rectangle91 = jToolTip73.bounds();
        managementDashboard52.computeVisibleRect(rectangle91);
        java.awt.Rectangle rectangle93 = managementDashboard44.getBounds(rectangle91);
        int int94 = managementDashboard38.getComponentZOrder((java.awt.Component) managementDashboard44);
        managementDashboard1.putClientProperty((java.lang.Object) mobilePayment35, (java.lang.Object) int94);
        PaymentProcessor paymentProcessor96 = new PaymentProcessor((PaymentStrategy) mobilePayment35);
        mobilePayment35.pay((double) 64);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(component13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(inputMethodRequests17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(insets34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(inputMethodRequests46);
        org.junit.Assert.assertNull(container47);
        org.junit.Assert.assertNull(focusTraversalPolicy50);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(inputMethodRequests67);
        org.junit.Assert.assertNull(container68);
        org.junit.Assert.assertNull(actionListener72);
        org.junit.Assert.assertNotNull(jToolTip73);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(dimension86);
        org.junit.Assert.assertNotNull(dimension87);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(rectangle91);
        org.junit.Assert.assertNotNull(rectangle93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        managementDashboard1.move((int) (byte) 1, (int) '#');
        managementDashboard1.layout();
        managementDashboard1.setEnabled(false);
        java.awt.Image image10 = null;
        boolean boolean16 = managementDashboard1.imageUpdate(image10, 2, 10, (int) (byte) 0, 10, (int) (byte) 0);
        boolean boolean18 = managementDashboard1.requestFocus(false);
        java.awt.Color color19 = managementDashboard1.getBackground();
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        managementDashboard1.removePropertyChangeListener("data/parkingSpaceData.csv", propertyChangeListener21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(color19);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        boolean boolean4 = managementDashboard1.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget5 = null;
        managementDashboard1.setDropTarget(dropTarget5);
        java.awt.Dimension dimension7 = null;
        managementDashboard1.setPreferredSize(dimension7);
        javax.swing.event.AncestorListener ancestorListener9 = null;
        managementDashboard1.removeAncestorListener(ancestorListener9);
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        ManagementDashboard managementDashboard12 = new ManagementDashboard(strConsumer11);
        managementDashboard12.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy15 = null;
        managementDashboard12.setFocusTraversalPolicy(focusTraversalPolicy15);
        java.awt.Event event17 = null;
        boolean boolean20 = managementDashboard12.mouseDrag(event17, (int) (short) 10, 4);
        managementDashboard12.setEnabled(true);
        java.awt.Component component23 = managementDashboard1.add((java.awt.Component) managementDashboard12);
        java.awt.Event event24 = null;
        java.lang.Object obj25 = null;
        boolean boolean26 = managementDashboard1.action(event24, obj25);
        java.awt.Event event27 = null;
        boolean boolean29 = managementDashboard1.keyDown(event27, (int) (short) -1);
        javax.swing.InputVerifier inputVerifier30 = managementDashboard1.getInputVerifier();
        java.beans.VetoableChangeListener vetoableChangeListener31 = null;
        managementDashboard1.removeVetoableChangeListener(vetoableChangeListener31);
        managementDashboard1.repaint((long) (-1), 16, (int) (short) 10, 8, 128);
        managementDashboard1.firePropertyChange("data/lotData.csv", (double) 1L, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(component23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(inputVerifier30);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.event.ContainerListener containerListener5 = null;
        managementDashboard1.removeContainerListener(containerListener5);
        javax.swing.JPopupMenu jPopupMenu7 = null;
        managementDashboard1.setComponentPopupMenu(jPopupMenu7);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener9 = null;
        managementDashboard1.addHierarchyBoundsListener(hierarchyBoundsListener9);
        java.awt.event.KeyListener[] keyListenerArray11 = managementDashboard1.getKeyListeners();
        javax.swing.TransferHandler transferHandler12 = null;
        managementDashboard1.setTransferHandler(transferHandler12);
        managementDashboard1.setDoubleBuffered(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNotNull(keyListenerArray11);
        org.junit.Assert.assertArrayEquals(keyListenerArray11, new java.awt.event.KeyListener[] {});
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        java.awt.event.HierarchyListener hierarchyListener7 = null;
        managementDashboard1.addHierarchyListener(hierarchyListener7);
        java.awt.Cursor cursor9 = null;
        managementDashboard1.setCursor(cursor9);
        java.awt.Point point12 = managementDashboard1.getMousePosition(false);
        javax.swing.border.Border border13 = managementDashboard1.getBorder();
        java.awt.Font font14 = managementDashboard1.getFont();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(point12);
        org.junit.Assert.assertNull(border13);
        org.junit.Assert.assertNotNull(font14);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        javax.swing.KeyStroke keyStroke7 = null;
        java.awt.event.ActionListener actionListener8 = managementDashboard1.getActionForKeyStroke(keyStroke7);
        javax.swing.JToolTip jToolTip9 = managementDashboard1.createToolTip();
        java.awt.Event event10 = null;
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        ManagementDashboard managementDashboard12 = new ManagementDashboard(strConsumer11);
        managementDashboard12.setInheritsPopupMenu(true);
        boolean boolean15 = managementDashboard12.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget16 = null;
        managementDashboard12.setDropTarget(dropTarget16);
        java.awt.Dimension dimension18 = null;
        managementDashboard12.setPreferredSize(dimension18);
        javax.swing.event.AncestorListener ancestorListener20 = null;
        managementDashboard12.removeAncestorListener(ancestorListener20);
        java.awt.Dimension dimension22 = managementDashboard12.getPreferredSize();
        java.awt.Dimension dimension23 = managementDashboard12.getPreferredSize();
        managementDashboard12.setDebugGraphicsOptions(10);
        boolean boolean26 = jToolTip9.lostFocus(event10, (java.lang.Object) managementDashboard12);
        java.awt.Rectangle rectangle27 = jToolTip9.bounds();
        java.awt.Graphics graphics28 = null;
        jToolTip9.printAll(graphics28);
        java.awt.Container container30 = jToolTip9.getTopLevelAncestor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(actionListener8);
        org.junit.Assert.assertNotNull(jToolTip9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dimension22);
        org.junit.Assert.assertNotNull(dimension23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(rectangle27);
        org.junit.Assert.assertNull(container30);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        javax.swing.KeyStroke keyStroke7 = null;
        java.awt.event.ActionListener actionListener8 = managementDashboard1.getActionForKeyStroke(keyStroke7);
        javax.swing.JToolTip jToolTip9 = managementDashboard1.createToolTip();
        java.awt.Event event10 = null;
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        ManagementDashboard managementDashboard12 = new ManagementDashboard(strConsumer11);
        managementDashboard12.setInheritsPopupMenu(true);
        boolean boolean15 = managementDashboard12.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget16 = null;
        managementDashboard12.setDropTarget(dropTarget16);
        java.awt.Dimension dimension18 = null;
        managementDashboard12.setPreferredSize(dimension18);
        javax.swing.event.AncestorListener ancestorListener20 = null;
        managementDashboard12.removeAncestorListener(ancestorListener20);
        java.awt.Dimension dimension22 = managementDashboard12.getPreferredSize();
        java.awt.Dimension dimension23 = managementDashboard12.getPreferredSize();
        managementDashboard12.setDebugGraphicsOptions(10);
        boolean boolean26 = jToolTip9.lostFocus(event10, (java.lang.Object) managementDashboard12);
        boolean boolean27 = managementDashboard12.isOpaque();
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        managementDashboard12.addPropertyChangeListener("ToolTipText", propertyChangeListener29);
        java.awt.Component[] componentArray31 = managementDashboard12.getComponents();
        java.awt.Font font32 = null;
        managementDashboard12.setFont(font32);
        managementDashboard12.setVisible(true);
        java.beans.VetoableChangeListener vetoableChangeListener36 = null;
        managementDashboard12.addVetoableChangeListener(vetoableChangeListener36);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(actionListener8);
        org.junit.Assert.assertNotNull(jToolTip9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dimension22);
        org.junit.Assert.assertNotNull(dimension23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(componentArray31);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        javax.swing.KeyStroke keyStroke7 = null;
        java.awt.event.ActionListener actionListener8 = managementDashboard1.getActionForKeyStroke(keyStroke7);
        javax.swing.JToolTip jToolTip9 = managementDashboard1.createToolTip();
        java.util.function.Consumer<java.lang.String> strConsumer10 = null;
        ManagementDashboard managementDashboard11 = new ManagementDashboard(strConsumer10);
        managementDashboard11.setRequestFocusEnabled(false);
        java.awt.Event event14 = null;
        boolean boolean16 = managementDashboard11.keyUp(event14, (int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer17 = null;
        ManagementDashboard managementDashboard18 = new ManagementDashboard(strConsumer17);
        managementDashboard18.setRequestFocusEnabled(false);
        java.awt.Event event21 = null;
        boolean boolean23 = managementDashboard18.keyUp(event21, (int) (short) 1);
        managementDashboard18.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        managementDashboard18.removePropertyChangeListener("", propertyChangeListener27);
        java.awt.Dimension dimension29 = managementDashboard18.getPreferredSize();
        managementDashboard11.setSize(dimension29);
        managementDashboard1.setMinimumSize(dimension29);
        java.util.function.Consumer<java.lang.String> strConsumer32 = null;
        ManagementDashboard managementDashboard33 = new ManagementDashboard(strConsumer32);
        managementDashboard33.setRequestFocusEnabled(false);
        java.awt.Event event36 = null;
        boolean boolean38 = managementDashboard33.keyUp(event36, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener39 = null;
        managementDashboard33.addInputMethodListener(inputMethodListener39);
        boolean boolean41 = managementDashboard33.isValidateRoot();
        boolean boolean42 = managementDashboard1.isFocusCycleRoot((java.awt.Container) managementDashboard33);
        boolean boolean43 = managementDashboard1.isForegroundSet();
        managementDashboard1.hide();
        int int47 = managementDashboard1.getBaseline((int) (byte) 10, (int) (short) 0);
        java.util.function.Consumer<java.lang.String> strConsumer48 = null;
        ManagementDashboard managementDashboard49 = new ManagementDashboard(strConsumer48);
        boolean boolean50 = managementDashboard49.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests51 = managementDashboard49.getInputMethodRequests();
        java.util.function.Consumer<java.lang.String> strConsumer52 = null;
        ManagementDashboard managementDashboard53 = new ManagementDashboard(strConsumer52);
        managementDashboard53.setInheritsPopupMenu(true);
        boolean boolean56 = managementDashboard53.isValidateRoot();
        int int57 = managementDashboard49.getComponentZOrder((java.awt.Component) managementDashboard53);
        java.beans.PropertyChangeListener propertyChangeListener59 = null;
        managementDashboard53.addPropertyChangeListener("hi!", propertyChangeListener59);
        boolean boolean61 = managementDashboard1.isFocusCycleRoot((java.awt.Container) managementDashboard53);
        managementDashboard1.setRequestFocusEnabled(true);
        java.util.function.Consumer<java.lang.String> strConsumer64 = null;
        ManagementDashboard managementDashboard65 = new ManagementDashboard(strConsumer64);
        boolean boolean66 = managementDashboard65.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests67 = managementDashboard65.getInputMethodRequests();
        java.util.function.Consumer<java.lang.String> strConsumer68 = null;
        ManagementDashboard managementDashboard69 = new ManagementDashboard(strConsumer68);
        managementDashboard69.setInheritsPopupMenu(true);
        boolean boolean72 = managementDashboard69.isValidateRoot();
        int int73 = managementDashboard65.getComponentZOrder((java.awt.Component) managementDashboard69);
        java.beans.PropertyChangeListener propertyChangeListener75 = null;
        managementDashboard69.addPropertyChangeListener("hi!", propertyChangeListener75);
        java.util.function.Consumer<java.lang.String> strConsumer77 = null;
        ManagementDashboard managementDashboard78 = new ManagementDashboard(strConsumer77);
        boolean boolean79 = managementDashboard78.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests80 = managementDashboard78.getInputMethodRequests();
        java.awt.Container container81 = managementDashboard78.getTopLevelAncestor();
        java.awt.Color color82 = null;
        managementDashboard78.setForeground(color82);
        java.awt.Container container84 = managementDashboard78.getFocusCycleRootAncestor();
        java.awt.Component component85 = managementDashboard69.add((java.awt.Component) managementDashboard78);
        managementDashboard1.remove((java.awt.Component) managementDashboard69);
        boolean boolean87 = managementDashboard69.isFontSet();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(actionListener8);
        org.junit.Assert.assertNotNull(jToolTip9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dimension29);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(inputMethodRequests51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(inputMethodRequests67);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(inputMethodRequests80);
        org.junit.Assert.assertNull(container81);
        org.junit.Assert.assertNull(container84);
        org.junit.Assert.assertNotNull(component85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy4 = null;
        managementDashboard1.setFocusTraversalPolicy(focusTraversalPolicy4);
        javax.swing.JToolTip jToolTip6 = managementDashboard1.createToolTip();
        java.util.function.Consumer<java.lang.String> strConsumer7 = null;
        ManagementDashboard managementDashboard8 = new ManagementDashboard(strConsumer7);
        managementDashboard8.setRequestFocusEnabled(false);
        managementDashboard8.enable();
        boolean boolean12 = managementDashboard8.hasFocus();
        java.awt.Component component14 = managementDashboard1.add((java.awt.Component) managementDashboard8, (-1));
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener15 = null;
        managementDashboard8.removeHierarchyBoundsListener(hierarchyBoundsListener15);
        org.junit.Assert.assertNotNull(jToolTip6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(component14);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.lang.String str5 = managementDashboard1.getToolTipText();
        java.awt.event.ComponentListener componentListener6 = null;
        managementDashboard1.removeComponentListener(componentListener6);
        java.awt.event.MouseWheelListener mouseWheelListener8 = null;
        managementDashboard1.removeMouseWheelListener(mouseWheelListener8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        boolean boolean4 = managementDashboard1.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget5 = null;
        managementDashboard1.setDropTarget(dropTarget5);
        java.awt.Dimension dimension7 = null;
        managementDashboard1.setPreferredSize(dimension7);
        java.awt.Event event9 = null;
        boolean boolean12 = managementDashboard1.mouseExit(event9, (int) 'a', (int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        boolean boolean15 = managementDashboard14.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests16 = managementDashboard14.getInputMethodRequests();
        java.awt.Container container17 = managementDashboard14.getTopLevelAncestor();
        java.awt.Color color18 = null;
        managementDashboard14.setForeground(color18);
        javax.swing.KeyStroke keyStroke20 = null;
        java.awt.event.ActionListener actionListener21 = managementDashboard14.getActionForKeyStroke(keyStroke20);
        javax.swing.JToolTip jToolTip22 = managementDashboard14.createToolTip();
        java.awt.Event event23 = null;
        java.util.function.Consumer<java.lang.String> strConsumer24 = null;
        ManagementDashboard managementDashboard25 = new ManagementDashboard(strConsumer24);
        managementDashboard25.setInheritsPopupMenu(true);
        boolean boolean28 = managementDashboard25.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget29 = null;
        managementDashboard25.setDropTarget(dropTarget29);
        java.awt.Dimension dimension31 = null;
        managementDashboard25.setPreferredSize(dimension31);
        javax.swing.event.AncestorListener ancestorListener33 = null;
        managementDashboard25.removeAncestorListener(ancestorListener33);
        java.awt.Dimension dimension35 = managementDashboard25.getPreferredSize();
        java.awt.Dimension dimension36 = managementDashboard25.getPreferredSize();
        managementDashboard25.setDebugGraphicsOptions(10);
        boolean boolean39 = jToolTip22.lostFocus(event23, (java.lang.Object) managementDashboard25);
        java.awt.Rectangle rectangle40 = jToolTip22.bounds();
        managementDashboard1.computeVisibleRect(rectangle40);
        boolean boolean42 = managementDashboard1.isRequestFocusEnabled();
        java.awt.event.ActionListener actionListener43 = null;
        javax.swing.KeyStroke keyStroke44 = null;
        managementDashboard1.registerKeyboardAction(actionListener43, keyStroke44, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputMethodRequests16);
        org.junit.Assert.assertNull(container17);
        org.junit.Assert.assertNull(actionListener21);
        org.junit.Assert.assertNotNull(jToolTip22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dimension35);
        org.junit.Assert.assertNotNull(dimension36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(rectangle40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        javax.swing.KeyStroke keyStroke7 = null;
        java.awt.event.ActionListener actionListener8 = managementDashboard1.getActionForKeyStroke(keyStroke7);
        javax.swing.JToolTip jToolTip9 = managementDashboard1.createToolTip();
        java.awt.Event event10 = null;
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        ManagementDashboard managementDashboard12 = new ManagementDashboard(strConsumer11);
        managementDashboard12.setInheritsPopupMenu(true);
        boolean boolean15 = managementDashboard12.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget16 = null;
        managementDashboard12.setDropTarget(dropTarget16);
        java.awt.Dimension dimension18 = null;
        managementDashboard12.setPreferredSize(dimension18);
        javax.swing.event.AncestorListener ancestorListener20 = null;
        managementDashboard12.removeAncestorListener(ancestorListener20);
        java.awt.Dimension dimension22 = managementDashboard12.getPreferredSize();
        java.awt.Dimension dimension23 = managementDashboard12.getPreferredSize();
        managementDashboard12.setDebugGraphicsOptions(10);
        boolean boolean26 = jToolTip9.lostFocus(event10, (java.lang.Object) managementDashboard12);
        java.awt.event.MouseEvent mouseEvent27 = null;
        java.lang.String str28 = jToolTip9.getToolTipText(mouseEvent27);
        jToolTip9.transferFocusDownCycle();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(actionListener8);
        org.junit.Assert.assertNotNull(jToolTip9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dimension22);
        org.junit.Assert.assertNotNull(dimension23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        managementDashboard1.setName("");
        boolean boolean6 = managementDashboard1.isPaintingForPrint();
        boolean boolean9 = managementDashboard1.inside((int) (short) -1, 32);
        boolean boolean10 = managementDashboard1.getAutoscrolls();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        managementDashboard1.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        managementDashboard1.removePropertyChangeListener("", propertyChangeListener10);
        managementDashboard1.doLayout();
        javax.swing.JPopupMenu jPopupMenu13 = managementDashboard1.getComponentPopupMenu();
        java.awt.event.HierarchyListener hierarchyListener14 = null;
        managementDashboard1.removeHierarchyListener(hierarchyListener14);
        managementDashboard1.nextFocus();
        boolean boolean17 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) managementDashboard1);
        boolean boolean18 = managementDashboard1.isMaximumSizeSet();
        managementDashboard1.firePropertyChange("hi!", (long) ' ', (long) (byte) 0);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray23 = managementDashboard1.getPropertyChangeListeners();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jPopupMenu13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray23);
        org.junit.Assert.assertArrayEquals(propertyChangeListenerArray23, new java.beans.PropertyChangeListener[] {});
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        managementDashboard1.repaint(10, 100, 0, (int) (short) 1);
        boolean boolean12 = managementDashboard1.requestFocusInWindow();
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        managementDashboard14.setRequestFocusEnabled(false);
        java.awt.Event event17 = null;
        boolean boolean19 = managementDashboard14.keyUp(event17, (int) (short) 1);
        managementDashboard14.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        managementDashboard14.removePropertyChangeListener("", propertyChangeListener23);
        managementDashboard14.doLayout();
        javax.swing.JPopupMenu jPopupMenu26 = managementDashboard14.getComponentPopupMenu();
        java.awt.Component component28 = managementDashboard1.add((java.awt.Component) managementDashboard14, 1);
        java.util.function.Consumer<java.lang.String> strConsumer29 = null;
        ManagementDashboard managementDashboard30 = new ManagementDashboard(strConsumer29);
        managementDashboard30.setRequestFocusEnabled(false);
        java.awt.Event event33 = null;
        boolean boolean35 = managementDashboard30.keyUp(event33, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener36 = null;
        managementDashboard30.addInputMethodListener(inputMethodListener36);
        java.awt.Dimension dimension38 = managementDashboard30.getMaximumSize();
        managementDashboard14.setPreferredSize(dimension38);
        managementDashboard14.firePropertyChange("data/managerData.csv", ' ', ' ');
        java.util.function.Consumer<java.lang.String> strConsumer44 = null;
        ManagementDashboard managementDashboard45 = new ManagementDashboard(strConsumer44);
        managementDashboard45.setRequestFocusEnabled(false);
        java.awt.Event event48 = null;
        boolean boolean50 = managementDashboard45.keyUp(event48, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener51 = null;
        managementDashboard45.addInputMethodListener(inputMethodListener51);
        java.awt.image.VolatileImage volatileImage55 = managementDashboard45.createVolatileImage((int) (short) 0, 1);
        boolean boolean56 = managementDashboard45.isOptimizedDrawingEnabled();
        javax.swing.ActionMap actionMap57 = managementDashboard45.getActionMap();
        managementDashboard14.setActionMap(actionMap57);
        javax.swing.ActionMap actionMap59 = managementDashboard14.getActionMap();
        int int62 = managementDashboard14.getBaseline(2, (int) (byte) 100);
        java.beans.PropertyChangeListener propertyChangeListener63 = null;
        managementDashboard14.addPropertyChangeListener(propertyChangeListener63);
        managementDashboard14.removeNotify();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(jPopupMenu26);
        org.junit.Assert.assertNotNull(component28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dimension38);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(volatileImage55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(actionMap57);
        org.junit.Assert.assertNotNull(actionMap59);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        managementDashboard1.move((int) (byte) 1, (int) '#');
        boolean boolean7 = managementDashboard1.isFocusTraversable();
        java.awt.event.FocusListener focusListener8 = null;
        managementDashboard1.removeFocusListener(focusListener8);
        java.awt.event.KeyListener[] keyListenerArray10 = managementDashboard1.getKeyListeners();
        managementDashboard1.requestFocus();
        java.awt.ImageCapabilities imageCapabilities14 = null;
        java.awt.image.VolatileImage volatileImage15 = managementDashboard1.createVolatileImage(32, (int) (byte) 10, imageCapabilities14);
        java.awt.Component component18 = managementDashboard1.findComponentAt((int) '4', 16);
        java.util.function.Consumer<java.lang.String> strConsumer19 = null;
        ManagementDashboard managementDashboard20 = new ManagementDashboard(strConsumer19);
        boolean boolean21 = managementDashboard20.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests22 = managementDashboard20.getInputMethodRequests();
        java.awt.Container container23 = managementDashboard20.getTopLevelAncestor();
        java.awt.Color color24 = null;
        managementDashboard20.setForeground(color24);
        managementDashboard20.repaint(10, 100, 0, (int) (short) 1);
        boolean boolean31 = managementDashboard20.requestFocusInWindow();
        java.util.function.Consumer<java.lang.String> strConsumer32 = null;
        ManagementDashboard managementDashboard33 = new ManagementDashboard(strConsumer32);
        managementDashboard33.setRequestFocusEnabled(false);
        java.awt.Event event36 = null;
        boolean boolean38 = managementDashboard33.keyUp(event36, (int) (short) 1);
        managementDashboard33.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        managementDashboard33.removePropertyChangeListener("", propertyChangeListener42);
        managementDashboard33.doLayout();
        javax.swing.JPopupMenu jPopupMenu45 = managementDashboard33.getComponentPopupMenu();
        java.awt.Component component47 = managementDashboard20.add((java.awt.Component) managementDashboard33, 1);
        java.awt.Rectangle rectangle48 = managementDashboard20.getBounds();
        java.util.function.Consumer<java.lang.String> strConsumer49 = null;
        ManagementDashboard managementDashboard50 = new ManagementDashboard(strConsumer49);
        boolean boolean51 = managementDashboard50.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests52 = managementDashboard50.getInputMethodRequests();
        java.awt.Container container53 = managementDashboard50.getTopLevelAncestor();
        java.awt.Color color54 = null;
        managementDashboard50.setForeground(color54);
        managementDashboard50.repaint(10, 100, 0, (int) (short) 1);
        boolean boolean61 = managementDashboard50.requestFocusInWindow();
        java.util.function.Consumer<java.lang.String> strConsumer62 = null;
        ManagementDashboard managementDashboard63 = new ManagementDashboard(strConsumer62);
        managementDashboard63.setRequestFocusEnabled(false);
        java.awt.Event event66 = null;
        boolean boolean68 = managementDashboard63.keyUp(event66, (int) (short) 1);
        managementDashboard63.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener72 = null;
        managementDashboard63.removePropertyChangeListener("", propertyChangeListener72);
        managementDashboard63.doLayout();
        javax.swing.JPopupMenu jPopupMenu75 = managementDashboard63.getComponentPopupMenu();
        java.awt.Component component77 = managementDashboard50.add((java.awt.Component) managementDashboard63, 1);
        java.awt.Rectangle rectangle78 = managementDashboard50.getBounds();
        java.lang.Object obj79 = managementDashboard20.getClientProperty((java.lang.Object) rectangle78);
        managementDashboard1.repaint(rectangle78);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(keyListenerArray10);
        org.junit.Assert.assertArrayEquals(keyListenerArray10, new java.awt.event.KeyListener[] {});
        org.junit.Assert.assertNull(volatileImage15);
        org.junit.Assert.assertNull(component18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(inputMethodRequests22);
        org.junit.Assert.assertNull(container23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(jPopupMenu45);
        org.junit.Assert.assertNotNull(component47);
        org.junit.Assert.assertNotNull(rectangle48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(inputMethodRequests52);
        org.junit.Assert.assertNull(container53);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(jPopupMenu75);
        org.junit.Assert.assertNotNull(component77);
        org.junit.Assert.assertNotNull(rectangle78);
        org.junit.Assert.assertNull(obj79);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.event.ContainerListener containerListener5 = null;
        managementDashboard1.removeContainerListener(containerListener5);
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = managementDashboard1.getFocusTraversalPolicy();
        managementDashboard1.remove(1);
        managementDashboard1.setVisible(true);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener12 = null;
        managementDashboard1.removeHierarchyBoundsListener(hierarchyBoundsListener12);
        javax.swing.JToolTip jToolTip14 = managementDashboard1.createToolTip();
        boolean boolean16 = managementDashboard1.requestFocus(false);
        managementDashboard1.setOpaque(true);
        boolean boolean19 = managementDashboard1.isShowing();
        java.util.function.Consumer<java.lang.String> strConsumer20 = null;
        ManagementDashboard managementDashboard21 = new ManagementDashboard(strConsumer20);
        boolean boolean22 = managementDashboard21.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests23 = managementDashboard21.getInputMethodRequests();
        java.awt.Container container24 = managementDashboard21.getTopLevelAncestor();
        java.awt.event.ContainerListener containerListener25 = null;
        managementDashboard21.removeContainerListener(containerListener25);
        javax.swing.JPopupMenu jPopupMenu27 = null;
        managementDashboard21.setComponentPopupMenu(jPopupMenu27);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener29 = null;
        managementDashboard21.addHierarchyBoundsListener(hierarchyBoundsListener29);
        java.awt.event.KeyListener[] keyListenerArray31 = managementDashboard21.getKeyListeners();
        java.awt.LayoutManager layoutManager32 = managementDashboard21.getLayout();
        java.util.function.Consumer<java.lang.String> strConsumer33 = null;
        ManagementDashboard managementDashboard34 = new ManagementDashboard(strConsumer33);
        managementDashboard34.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy37 = null;
        managementDashboard34.setFocusTraversalPolicy(focusTraversalPolicy37);
        java.awt.Event event39 = null;
        boolean boolean42 = managementDashboard34.mouseDrag(event39, (int) (short) 10, 4);
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        managementDashboard34.removePropertyChangeListener("hi!", propertyChangeListener44);
        boolean boolean46 = managementDashboard34.isMaximumSizeSet();
        java.awt.Font font47 = managementDashboard34.getFont();
        managementDashboard21.setFont(font47);
        java.awt.FontMetrics fontMetrics49 = managementDashboard1.getFontMetrics(font47);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(focusTraversalPolicy7);
        org.junit.Assert.assertNotNull(jToolTip14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(inputMethodRequests23);
        org.junit.Assert.assertNull(container24);
        org.junit.Assert.assertNotNull(keyListenerArray31);
        org.junit.Assert.assertArrayEquals(keyListenerArray31, new java.awt.event.KeyListener[] {});
        org.junit.Assert.assertNotNull(layoutManager32);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(font47);
        org.junit.Assert.assertNotNull(fontMetrics49);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        managementDashboard1.setAutoscrolls(true);
        managementDashboard1.layout();
        java.beans.VetoableChangeListener[] vetoableChangeListenerArray10 = managementDashboard1.getVetoableChangeListeners();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(vetoableChangeListenerArray10);
        org.junit.Assert.assertArrayEquals(vetoableChangeListenerArray10, new java.beans.VetoableChangeListener[] {});
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        boolean boolean4 = managementDashboard1.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget5 = null;
        managementDashboard1.setDropTarget(dropTarget5);
        int int7 = managementDashboard1.countComponents();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        javax.swing.KeyStroke keyStroke7 = null;
        java.awt.event.ActionListener actionListener8 = managementDashboard1.getActionForKeyStroke(keyStroke7);
        javax.swing.JToolTip jToolTip9 = managementDashboard1.createToolTip();
        java.awt.Event event10 = null;
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        ManagementDashboard managementDashboard12 = new ManagementDashboard(strConsumer11);
        managementDashboard12.setInheritsPopupMenu(true);
        boolean boolean15 = managementDashboard12.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget16 = null;
        managementDashboard12.setDropTarget(dropTarget16);
        java.awt.Dimension dimension18 = null;
        managementDashboard12.setPreferredSize(dimension18);
        javax.swing.event.AncestorListener ancestorListener20 = null;
        managementDashboard12.removeAncestorListener(ancestorListener20);
        java.awt.Dimension dimension22 = managementDashboard12.getPreferredSize();
        java.awt.Dimension dimension23 = managementDashboard12.getPreferredSize();
        managementDashboard12.setDebugGraphicsOptions(10);
        boolean boolean26 = jToolTip9.lostFocus(event10, (java.lang.Object) managementDashboard12);
        javax.swing.JPopupMenu jPopupMenu27 = null;
        managementDashboard12.setComponentPopupMenu(jPopupMenu27);
        java.awt.Insets insets29 = managementDashboard12.insets();
        java.util.function.Consumer<java.lang.String> strConsumer30 = null;
        ManagementDashboard managementDashboard31 = new ManagementDashboard(strConsumer30);
        boolean boolean32 = managementDashboard31.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests33 = managementDashboard31.getInputMethodRequests();
        java.awt.Container container34 = managementDashboard31.getTopLevelAncestor();
        java.awt.Color color35 = null;
        managementDashboard31.setForeground(color35);
        managementDashboard31.repaint(10, 100, 0, (int) (short) 1);
        boolean boolean42 = managementDashboard31.requestFocusInWindow();
        java.util.function.Consumer<java.lang.String> strConsumer43 = null;
        ManagementDashboard managementDashboard44 = new ManagementDashboard(strConsumer43);
        managementDashboard44.setRequestFocusEnabled(false);
        java.awt.Event event47 = null;
        boolean boolean49 = managementDashboard44.keyUp(event47, (int) (short) 1);
        managementDashboard44.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener53 = null;
        managementDashboard44.removePropertyChangeListener("", propertyChangeListener53);
        managementDashboard44.doLayout();
        javax.swing.JPopupMenu jPopupMenu56 = managementDashboard44.getComponentPopupMenu();
        java.awt.Component component58 = managementDashboard31.add((java.awt.Component) managementDashboard44, 1);
        java.util.function.Consumer<java.lang.String> strConsumer59 = null;
        ManagementDashboard managementDashboard60 = new ManagementDashboard(strConsumer59);
        managementDashboard60.setRequestFocusEnabled(false);
        java.awt.Event event63 = null;
        boolean boolean65 = managementDashboard60.keyUp(event63, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener66 = null;
        managementDashboard60.addInputMethodListener(inputMethodListener66);
        java.awt.Dimension dimension68 = managementDashboard60.getMaximumSize();
        managementDashboard44.setPreferredSize(dimension68);
        managementDashboard44.firePropertyChange("data/managerData.csv", ' ', ' ');
        java.util.function.Consumer<java.lang.String> strConsumer74 = null;
        ManagementDashboard managementDashboard75 = new ManagementDashboard(strConsumer74);
        managementDashboard75.setRequestFocusEnabled(false);
        java.awt.Event event78 = null;
        boolean boolean80 = managementDashboard75.keyUp(event78, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener81 = null;
        managementDashboard75.addInputMethodListener(inputMethodListener81);
        java.awt.image.VolatileImage volatileImage85 = managementDashboard75.createVolatileImage((int) (short) 0, 1);
        boolean boolean86 = managementDashboard75.isOptimizedDrawingEnabled();
        javax.swing.ActionMap actionMap87 = managementDashboard75.getActionMap();
        managementDashboard44.setActionMap(actionMap87);
        managementDashboard12.remove((java.awt.Component) managementDashboard44);
        java.util.Locale locale90 = managementDashboard12.getLocale();
        javax.swing.JComponent.setDefaultLocale(locale90);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(actionListener8);
        org.junit.Assert.assertNotNull(jToolTip9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dimension22);
        org.junit.Assert.assertNotNull(dimension23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(insets29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(inputMethodRequests33);
        org.junit.Assert.assertNull(container34);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(jPopupMenu56);
        org.junit.Assert.assertNotNull(component58);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(dimension68);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(volatileImage85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(actionMap87);
        org.junit.Assert.assertNotNull(locale90);
        org.junit.Assert.assertEquals(locale90.toString(), "en_CA");
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener7 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener7);
        managementDashboard1.move((int) (byte) 0, 8);
        java.awt.Event event12 = null;
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        boolean boolean15 = managementDashboard14.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests16 = managementDashboard14.getInputMethodRequests();
        java.awt.Container container17 = managementDashboard14.getTopLevelAncestor();
        boolean boolean18 = managementDashboard1.gotFocus(event12, (java.lang.Object) container17);
        managementDashboard1.requestFocus();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputMethodRequests16);
        org.junit.Assert.assertNull(container17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        javax.swing.KeyStroke keyStroke7 = null;
        java.awt.event.ActionListener actionListener8 = managementDashboard1.getActionForKeyStroke(keyStroke7);
        javax.swing.JToolTip jToolTip9 = managementDashboard1.createToolTip();
        java.util.function.Consumer<java.lang.String> strConsumer10 = null;
        ManagementDashboard managementDashboard11 = new ManagementDashboard(strConsumer10);
        managementDashboard11.setRequestFocusEnabled(false);
        java.awt.Event event14 = null;
        boolean boolean16 = managementDashboard11.keyUp(event14, (int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer17 = null;
        ManagementDashboard managementDashboard18 = new ManagementDashboard(strConsumer17);
        managementDashboard18.setRequestFocusEnabled(false);
        java.awt.Event event21 = null;
        boolean boolean23 = managementDashboard18.keyUp(event21, (int) (short) 1);
        managementDashboard18.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        managementDashboard18.removePropertyChangeListener("", propertyChangeListener27);
        java.awt.Dimension dimension29 = managementDashboard18.getPreferredSize();
        managementDashboard11.setSize(dimension29);
        managementDashboard1.setMinimumSize(dimension29);
        java.util.function.Consumer<java.lang.String> strConsumer32 = null;
        ManagementDashboard managementDashboard33 = new ManagementDashboard(strConsumer32);
        managementDashboard33.setInheritsPopupMenu(true);
        managementDashboard33.setName("");
        managementDashboard33.doLayout();
        java.awt.event.KeyListener keyListener39 = null;
        managementDashboard33.addKeyListener(keyListener39);
        java.util.function.Consumer<java.lang.String> strConsumer41 = null;
        ManagementDashboard managementDashboard42 = new ManagementDashboard(strConsumer41);
        managementDashboard42.setInheritsPopupMenu(true);
        boolean boolean45 = managementDashboard42.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget46 = null;
        managementDashboard42.setDropTarget(dropTarget46);
        boolean boolean48 = managementDashboard42.getAutoscrolls();
        java.util.function.Consumer<java.lang.String> strConsumer49 = null;
        ManagementDashboard managementDashboard50 = new ManagementDashboard(strConsumer49);
        managementDashboard50.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy53 = null;
        managementDashboard50.setFocusTraversalPolicy(focusTraversalPolicy53);
        java.lang.Object obj55 = managementDashboard42.getClientProperty((java.lang.Object) managementDashboard50);
        java.util.function.Consumer<java.lang.String> strConsumer56 = null;
        ManagementDashboard managementDashboard57 = new ManagementDashboard(strConsumer56);
        managementDashboard57.setRequestFocusEnabled(false);
        java.awt.Event event60 = null;
        boolean boolean62 = managementDashboard57.keyUp(event60, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener63 = null;
        managementDashboard57.addInputMethodListener(inputMethodListener63);
        java.awt.Dimension dimension65 = managementDashboard57.getMaximumSize();
        int int66 = managementDashboard42.getComponentZOrder((java.awt.Component) managementDashboard57);
        javax.swing.KeyStroke keyStroke67 = null;
        int int68 = managementDashboard42.getConditionForKeyStroke(keyStroke67);
        managementDashboard42.transferFocusUpCycle();
        java.awt.image.ImageProducer imageProducer70 = null;
        java.awt.Image image71 = managementDashboard42.createImage(imageProducer70);
        java.util.function.Consumer<java.lang.String> strConsumer72 = null;
        ManagementDashboard managementDashboard73 = new ManagementDashboard(strConsumer72);
        managementDashboard73.setRequestFocusEnabled(false);
        java.awt.Event event76 = null;
        boolean boolean78 = managementDashboard73.keyUp(event76, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener79 = null;
        managementDashboard73.addInputMethodListener(inputMethodListener79);
        java.awt.image.VolatileImage volatileImage83 = managementDashboard73.createVolatileImage((int) (short) 0, 1);
        boolean boolean84 = managementDashboard73.isOptimizedDrawingEnabled();
        javax.swing.ActionMap actionMap85 = managementDashboard73.getActionMap();
        int int86 = managementDashboard33.checkImage(image71, (java.awt.image.ImageObserver) managementDashboard73);
        java.awt.Graphics graphics87 = null;
        managementDashboard33.print(graphics87);
        managementDashboard1.setComponentZOrder((java.awt.Component) managementDashboard33, 0);
        boolean boolean93 = managementDashboard33.contains(4, (int) (short) 1);
        java.awt.event.MouseWheelListener mouseWheelListener94 = null;
        managementDashboard33.removeMouseWheelListener(mouseWheelListener94);
        java.awt.Color color96 = managementDashboard33.getForeground();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(actionListener8);
        org.junit.Assert.assertNotNull(jToolTip9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dimension29);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(dimension65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(image71);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(volatileImage83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(actionMap85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(color96);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        managementDashboard1.repaint(10, 100, 0, (int) (short) 1);
        boolean boolean12 = managementDashboard1.requestFocusInWindow();
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        managementDashboard14.setRequestFocusEnabled(false);
        java.awt.Event event17 = null;
        boolean boolean19 = managementDashboard14.keyUp(event17, (int) (short) 1);
        managementDashboard14.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        managementDashboard14.removePropertyChangeListener("", propertyChangeListener23);
        managementDashboard14.doLayout();
        javax.swing.JPopupMenu jPopupMenu26 = managementDashboard14.getComponentPopupMenu();
        java.awt.Component component28 = managementDashboard1.add((java.awt.Component) managementDashboard14, 1);
        java.util.function.Consumer<java.lang.String> strConsumer29 = null;
        ManagementDashboard managementDashboard30 = new ManagementDashboard(strConsumer29);
        managementDashboard30.setRequestFocusEnabled(false);
        java.awt.Event event33 = null;
        boolean boolean35 = managementDashboard30.keyUp(event33, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener36 = null;
        managementDashboard30.addInputMethodListener(inputMethodListener36);
        java.awt.Dimension dimension38 = managementDashboard30.getMaximumSize();
        managementDashboard14.setPreferredSize(dimension38);
        java.util.function.Consumer<java.lang.String> strConsumer40 = null;
        ManagementDashboard managementDashboard41 = new ManagementDashboard(strConsumer40);
        managementDashboard41.setInheritsPopupMenu(true);
        boolean boolean44 = managementDashboard41.isValidateRoot();
        java.awt.Color color45 = managementDashboard41.getBackground();
        managementDashboard14.setBackground(color45);
        java.awt.event.FocusListener focusListener47 = null;
        managementDashboard14.addFocusListener(focusListener47);
        java.awt.event.KeyListener keyListener49 = null;
        managementDashboard14.addKeyListener(keyListener49);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(jPopupMenu26);
        org.junit.Assert.assertNotNull(component28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dimension38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(color45);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        javax.swing.KeyStroke keyStroke7 = null;
        java.awt.event.ActionListener actionListener8 = managementDashboard1.getActionForKeyStroke(keyStroke7);
        javax.swing.JToolTip jToolTip9 = managementDashboard1.createToolTip();
        java.awt.Event event10 = null;
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        ManagementDashboard managementDashboard12 = new ManagementDashboard(strConsumer11);
        managementDashboard12.setInheritsPopupMenu(true);
        boolean boolean15 = managementDashboard12.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget16 = null;
        managementDashboard12.setDropTarget(dropTarget16);
        java.awt.Dimension dimension18 = null;
        managementDashboard12.setPreferredSize(dimension18);
        javax.swing.event.AncestorListener ancestorListener20 = null;
        managementDashboard12.removeAncestorListener(ancestorListener20);
        java.awt.Dimension dimension22 = managementDashboard12.getPreferredSize();
        java.awt.Dimension dimension23 = managementDashboard12.getPreferredSize();
        managementDashboard12.setDebugGraphicsOptions(10);
        boolean boolean26 = jToolTip9.lostFocus(event10, (java.lang.Object) managementDashboard12);
        boolean boolean27 = managementDashboard12.isOpaque();
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        managementDashboard12.addPropertyChangeListener("ToolTipText", propertyChangeListener29);
        java.awt.Component[] componentArray31 = managementDashboard12.getComponents();
        java.awt.Font font32 = null;
        managementDashboard12.setFont(font32);
        managementDashboard12.setVisible(true);
        java.lang.Object obj36 = managementDashboard12.getTreeLock();
        java.awt.Font font37 = managementDashboard12.getFont();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(actionListener8);
        org.junit.Assert.assertNotNull(jToolTip9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dimension22);
        org.junit.Assert.assertNotNull(dimension23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(componentArray31);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNull(font37);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        javax.swing.KeyStroke keyStroke7 = null;
        java.awt.event.ActionListener actionListener8 = managementDashboard1.getActionForKeyStroke(keyStroke7);
        javax.swing.JToolTip jToolTip9 = managementDashboard1.createToolTip();
        java.util.function.Consumer<java.lang.String> strConsumer10 = null;
        ManagementDashboard managementDashboard11 = new ManagementDashboard(strConsumer10);
        boolean boolean12 = managementDashboard11.isCursorSet();
        java.awt.Event event13 = null;
        boolean boolean15 = managementDashboard11.lostFocus(event13, (java.lang.Object) "");
        java.util.function.Consumer<java.lang.String> strConsumer16 = null;
        ManagementDashboard managementDashboard17 = new ManagementDashboard(strConsumer16);
        managementDashboard17.setRequestFocusEnabled(false);
        java.awt.Event event20 = null;
        boolean boolean22 = managementDashboard17.keyUp(event20, (int) (short) 1);
        managementDashboard17.setAutoscrolls(true);
        java.awt.event.HierarchyListener[] hierarchyListenerArray25 = managementDashboard17.getHierarchyListeners();
        jToolTip9.add((java.awt.Component) managementDashboard11, (java.lang.Object) hierarchyListenerArray25);
        boolean boolean27 = managementDashboard11.isManagingFocus();
        java.util.function.Consumer<java.lang.String> strConsumer28 = null;
        ManagementDashboard managementDashboard29 = new ManagementDashboard(strConsumer28);
        managementDashboard29.setRequestFocusEnabled(false);
        java.awt.Event event32 = null;
        boolean boolean34 = managementDashboard29.keyUp(event32, (int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer35 = null;
        ManagementDashboard managementDashboard36 = new ManagementDashboard(strConsumer35);
        managementDashboard36.setRequestFocusEnabled(false);
        java.awt.Event event39 = null;
        boolean boolean41 = managementDashboard36.keyUp(event39, (int) (short) 1);
        managementDashboard36.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        managementDashboard36.removePropertyChangeListener("", propertyChangeListener45);
        java.awt.Dimension dimension47 = managementDashboard36.getPreferredSize();
        managementDashboard29.setSize(dimension47);
        managementDashboard29.setRequestFocusEnabled(true);
        managementDashboard29.addNotify();
        int int52 = managementDashboard29.getX();
        boolean boolean53 = managementDashboard29.isLightweight();
        java.util.function.Consumer<java.lang.String> strConsumer54 = null;
        ManagementDashboard managementDashboard55 = new ManagementDashboard(strConsumer54);
        managementDashboard55.setInheritsPopupMenu(true);
        boolean boolean58 = managementDashboard55.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget59 = null;
        managementDashboard55.setDropTarget(dropTarget59);
        java.awt.Dimension dimension61 = null;
        managementDashboard55.setPreferredSize(dimension61);
        javax.swing.event.AncestorListener ancestorListener63 = null;
        managementDashboard55.removeAncestorListener(ancestorListener63);
        java.awt.Dimension dimension65 = managementDashboard55.getPreferredSize();
        java.awt.Dimension dimension66 = managementDashboard55.getPreferredSize();
        java.awt.Point point68 = managementDashboard55.getMousePosition(true);
        java.awt.Color color69 = managementDashboard55.getForeground();
        java.awt.ComponentOrientation componentOrientation70 = managementDashboard55.getComponentOrientation();
        managementDashboard29.applyComponentOrientation(componentOrientation70);
        java.awt.Component component73 = managementDashboard11.add((java.awt.Component) managementDashboard29, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(actionListener8);
        org.junit.Assert.assertNotNull(jToolTip9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(hierarchyListenerArray25);
        org.junit.Assert.assertArrayEquals(hierarchyListenerArray25, new java.awt.event.HierarchyListener[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(dimension47);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(dimension65);
        org.junit.Assert.assertNotNull(dimension66);
        org.junit.Assert.assertNull(point68);
        org.junit.Assert.assertNotNull(color69);
        org.junit.Assert.assertNotNull(componentOrientation70);
        org.junit.Assert.assertNotNull(component73);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        boolean boolean4 = managementDashboard1.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget5 = null;
        managementDashboard1.setDropTarget(dropTarget5);
        java.awt.Dimension dimension7 = null;
        managementDashboard1.setPreferredSize(dimension7);
        javax.swing.event.AncestorListener ancestorListener9 = null;
        managementDashboard1.removeAncestorListener(ancestorListener9);
        java.awt.Dimension dimension11 = managementDashboard1.getPreferredSize();
        boolean boolean12 = managementDashboard1.isPreferredSizeSet();
        managementDashboard1.firePropertyChange("ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=8388617,maximumSize=,minimumSize=,preferredSize=]", '4', 'a');
        managementDashboard1.firePropertyChange("ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=8388617,maximumSize=,minimumSize=,preferredSize=]", 100, 35);
        java.util.function.Consumer<java.lang.String> strConsumer21 = null;
        ManagementDashboard managementDashboard22 = new ManagementDashboard(strConsumer21);
        boolean boolean23 = managementDashboard22.isCursorSet();
        java.awt.Event event24 = null;
        boolean boolean26 = managementDashboard22.lostFocus(event24, (java.lang.Object) "");
        managementDashboard22.setAutoscrolls(false);
        java.awt.Graphics graphics29 = null;
        managementDashboard22.update(graphics29);
        managementDashboard22.setFocusCycleRoot(false);
        managementDashboard22.repaint((long) (byte) 0);
        boolean boolean35 = managementDashboard22.getAutoscrolls();
        boolean boolean36 = managementDashboard1.isAncestorOf((java.awt.Component) managementDashboard22);
        java.awt.Graphics graphics37 = null;
        managementDashboard22.update(graphics37);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.util.function.Consumer<java.lang.String> strConsumer4 = null;
        ManagementDashboard managementDashboard5 = new ManagementDashboard(strConsumer4);
        managementDashboard5.setInheritsPopupMenu(true);
        boolean boolean8 = managementDashboard5.isValidateRoot();
        int int9 = managementDashboard1.getComponentZOrder((java.awt.Component) managementDashboard5);
        java.awt.event.ContainerListener containerListener10 = null;
        managementDashboard5.addContainerListener(containerListener10);
        managementDashboard5.transferFocusBackward();
        managementDashboard5.setName("data/managerData.csv");
        java.awt.Event event15 = null;
        boolean boolean18 = managementDashboard5.mouseUp(event15, (int) ' ', (int) ' ');
        boolean boolean19 = managementDashboard5.isPaintingTile();
        int int20 = managementDashboard5.getWidth();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.event.ComponentListener componentListener4 = null;
        managementDashboard1.removeComponentListener(componentListener4);
        javax.swing.InputMap inputMap6 = managementDashboard1.getInputMap();
        java.awt.Component component9 = managementDashboard1.getComponentAt((int) (short) 1, (int) 'a');
        boolean boolean10 = managementDashboard1.isFocusCycleRoot();
        org.junit.Assert.assertNotNull(inputMap6);
        org.junit.Assert.assertNull(component9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener7 = null;
        managementDashboard1.addInputMethodListener(inputMethodListener7);
        managementDashboard1.move((int) (byte) 0, 8);
        java.awt.Event event12 = null;
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        boolean boolean15 = managementDashboard14.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests16 = managementDashboard14.getInputMethodRequests();
        java.awt.Container container17 = managementDashboard14.getTopLevelAncestor();
        boolean boolean18 = managementDashboard1.gotFocus(event12, (java.lang.Object) container17);
        managementDashboard1.hide();
        boolean boolean20 = managementDashboard1.isFocusTraversable();
        managementDashboard1.firePropertyChange("PanelUI", false, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputMethodRequests16);
        org.junit.Assert.assertNull(container17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        boolean boolean7 = managementDashboard1.isCursorSet();
        javax.swing.KeyStroke keyStroke8 = null;
        managementDashboard1.unregisterKeyboardAction(keyStroke8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy4 = null;
        managementDashboard1.setFocusTraversalPolicy(focusTraversalPolicy4);
        javax.swing.JToolTip jToolTip6 = managementDashboard1.createToolTip();
        java.awt.MenuComponent menuComponent7 = null;
        managementDashboard1.remove(menuComponent7);
        int int11 = managementDashboard1.getBaseline((int) 'a', (int) (byte) 10);
        managementDashboard1.firePropertyChange("ToolTipText", (short) (byte) 0, (short) (byte) -1);
        org.junit.Assert.assertNotNull(jToolTip6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.event.HierarchyListener[] hierarchyListenerArray4 = managementDashboard1.getHierarchyListeners();
        int int7 = managementDashboard1.getBaseline(32, 32);
        java.awt.event.MouseEvent mouseEvent8 = null;
        java.lang.String str9 = managementDashboard1.getToolTipText(mouseEvent8);
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray10 = managementDashboard1.getHierarchyBoundsListeners();
        org.junit.Assert.assertNotNull(hierarchyListenerArray4);
        org.junit.Assert.assertArrayEquals(hierarchyListenerArray4, new java.awt.event.HierarchyListener[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray10);
        org.junit.Assert.assertArrayEquals(hierarchyBoundsListenerArray10, new java.awt.event.HierarchyBoundsListener[] {});
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        javax.swing.KeyStroke keyStroke7 = null;
        java.awt.event.ActionListener actionListener8 = managementDashboard1.getActionForKeyStroke(keyStroke7);
        java.util.function.Consumer<java.lang.String> strConsumer9 = null;
        ManagementDashboard managementDashboard10 = new ManagementDashboard(strConsumer9);
        boolean boolean11 = managementDashboard10.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests12 = managementDashboard10.getInputMethodRequests();
        java.awt.Container container13 = managementDashboard10.getTopLevelAncestor();
        java.awt.event.ContainerListener containerListener14 = null;
        managementDashboard10.removeContainerListener(containerListener14);
        int int16 = managementDashboard1.getComponentZOrder((java.awt.Component) managementDashboard10);
        float float17 = managementDashboard10.getAlignmentY();
        java.awt.Point point18 = managementDashboard10.getLocation();
        boolean boolean19 = managementDashboard10.getIgnoreRepaint();
        managementDashboard10.setInheritsPopupMenu(false);
        java.awt.event.FocusListener focusListener22 = null;
        managementDashboard10.addFocusListener(focusListener22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(actionListener8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(inputMethodRequests12);
        org.junit.Assert.assertNull(container13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.5f + "'", float17 == 0.5f);
        org.junit.Assert.assertNotNull(point18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        managementDashboard1.setAutoscrolls(true);
        int int9 = managementDashboard1.getDebugGraphicsOptions();
        java.beans.VetoableChangeListener[] vetoableChangeListenerArray10 = managementDashboard1.getVetoableChangeListeners();
        java.awt.event.InputMethodListener inputMethodListener11 = null;
        managementDashboard1.removeInputMethodListener(inputMethodListener11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(vetoableChangeListenerArray10);
        org.junit.Assert.assertArrayEquals(vetoableChangeListenerArray10, new java.beans.VetoableChangeListener[] {});
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy4 = null;
        managementDashboard1.setFocusTraversalPolicy(focusTraversalPolicy4);
        java.awt.Event event6 = null;
        boolean boolean9 = managementDashboard1.mouseDrag(event6, (int) (short) 10, 4);
        managementDashboard1.setEnabled(true);
        boolean boolean12 = managementDashboard1.isBackgroundSet();
        managementDashboard1.resize((int) (short) 100, 64);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        boolean boolean4 = managementDashboard1.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget5 = null;
        managementDashboard1.setDropTarget(dropTarget5);
        boolean boolean7 = managementDashboard1.getAutoscrolls();
        java.awt.event.KeyListener[] keyListenerArray8 = managementDashboard1.getKeyListeners();
        boolean boolean9 = managementDashboard1.requestDefaultFocus();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(keyListenerArray8);
        org.junit.Assert.assertArrayEquals(keyListenerArray8, new java.awt.event.KeyListener[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setInheritsPopupMenu(true);
        boolean boolean4 = managementDashboard1.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget5 = null;
        managementDashboard1.setDropTarget(dropTarget5);
        boolean boolean7 = managementDashboard1.getAutoscrolls();
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        ManagementDashboard managementDashboard9 = new ManagementDashboard(strConsumer8);
        managementDashboard9.setInheritsPopupMenu(true);
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        managementDashboard9.setFocusTraversalPolicy(focusTraversalPolicy12);
        java.lang.Object obj14 = managementDashboard1.getClientProperty((java.lang.Object) managementDashboard9);
        java.util.function.Consumer<java.lang.String> strConsumer15 = null;
        ManagementDashboard managementDashboard16 = new ManagementDashboard(strConsumer15);
        managementDashboard16.setRequestFocusEnabled(false);
        java.awt.Event event19 = null;
        boolean boolean21 = managementDashboard16.keyUp(event19, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener22 = null;
        managementDashboard16.addInputMethodListener(inputMethodListener22);
        java.awt.Dimension dimension24 = managementDashboard16.getMaximumSize();
        int int25 = managementDashboard1.getComponentZOrder((java.awt.Component) managementDashboard16);
        java.awt.Component component27 = managementDashboard1.getComponent(1);
        java.awt.Point point28 = managementDashboard1.location();
        boolean boolean29 = managementDashboard1.isPreferredSizeSet();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dimension24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(component27);
        org.junit.Assert.assertNotNull(point28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        managementDashboard1.repaint(10, 100, 0, (int) (short) 1);
        boolean boolean12 = managementDashboard1.requestFocusInWindow();
        java.util.function.Consumer<java.lang.String> strConsumer13 = null;
        ManagementDashboard managementDashboard14 = new ManagementDashboard(strConsumer13);
        managementDashboard14.setRequestFocusEnabled(false);
        java.awt.Event event17 = null;
        boolean boolean19 = managementDashboard14.keyUp(event17, (int) (short) 1);
        managementDashboard14.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        managementDashboard14.removePropertyChangeListener("", propertyChangeListener23);
        managementDashboard14.doLayout();
        javax.swing.JPopupMenu jPopupMenu26 = managementDashboard14.getComponentPopupMenu();
        java.awt.Component component28 = managementDashboard1.add((java.awt.Component) managementDashboard14, 1);
        java.util.function.Consumer<java.lang.String> strConsumer29 = null;
        ManagementDashboard managementDashboard30 = new ManagementDashboard(strConsumer29);
        managementDashboard30.setRequestFocusEnabled(false);
        java.awt.Event event33 = null;
        boolean boolean35 = managementDashboard30.keyUp(event33, (int) (short) 1);
        java.awt.event.InputMethodListener inputMethodListener36 = null;
        managementDashboard30.addInputMethodListener(inputMethodListener36);
        java.awt.Dimension dimension38 = managementDashboard30.getMaximumSize();
        managementDashboard14.setPreferredSize(dimension38);
        managementDashboard14.firePropertyChange("data/managerData.csv", ' ', ' ');
        managementDashboard14.reshape((int) (short) 0, 0, 0, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(jPopupMenu26);
        org.junit.Assert.assertNotNull(component28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dimension38);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        boolean boolean2 = managementDashboard1.isCursorSet();
        java.awt.im.InputMethodRequests inputMethodRequests3 = managementDashboard1.getInputMethodRequests();
        java.awt.Container container4 = managementDashboard1.getTopLevelAncestor();
        java.awt.Color color5 = null;
        managementDashboard1.setForeground(color5);
        javax.swing.KeyStroke keyStroke7 = null;
        java.awt.event.ActionListener actionListener8 = managementDashboard1.getActionForKeyStroke(keyStroke7);
        javax.swing.JToolTip jToolTip9 = managementDashboard1.createToolTip();
        java.awt.Event event10 = null;
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        ManagementDashboard managementDashboard12 = new ManagementDashboard(strConsumer11);
        managementDashboard12.setInheritsPopupMenu(true);
        boolean boolean15 = managementDashboard12.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget16 = null;
        managementDashboard12.setDropTarget(dropTarget16);
        java.awt.Dimension dimension18 = null;
        managementDashboard12.setPreferredSize(dimension18);
        javax.swing.event.AncestorListener ancestorListener20 = null;
        managementDashboard12.removeAncestorListener(ancestorListener20);
        java.awt.Dimension dimension22 = managementDashboard12.getPreferredSize();
        java.awt.Dimension dimension23 = managementDashboard12.getPreferredSize();
        managementDashboard12.setDebugGraphicsOptions(10);
        boolean boolean26 = jToolTip9.lostFocus(event10, (java.lang.Object) managementDashboard12);
        jToolTip9.setFocusTraversalPolicyProvider(true);
        java.lang.Object obj29 = jToolTip9.getTreeLock();
        boolean boolean30 = jToolTip9.isFocusCycleRoot();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(inputMethodRequests3);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNull(actionListener8);
        org.junit.Assert.assertNotNull(jToolTip9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dimension22);
        org.junit.Assert.assertNotNull(dimension23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        java.util.function.Consumer<java.lang.String> strConsumer0 = null;
        ManagementDashboard managementDashboard1 = new ManagementDashboard(strConsumer0);
        managementDashboard1.setRequestFocusEnabled(false);
        java.awt.Event event4 = null;
        boolean boolean6 = managementDashboard1.keyUp(event4, (int) (short) 1);
        java.util.function.Consumer<java.lang.String> strConsumer7 = null;
        ManagementDashboard managementDashboard8 = new ManagementDashboard(strConsumer7);
        managementDashboard8.setRequestFocusEnabled(false);
        java.awt.Event event11 = null;
        boolean boolean13 = managementDashboard8.keyUp(event11, (int) (short) 1);
        managementDashboard8.setAutoscrolls(true);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        managementDashboard8.removePropertyChangeListener("", propertyChangeListener17);
        java.awt.Dimension dimension19 = managementDashboard8.getPreferredSize();
        managementDashboard1.setSize(dimension19);
        java.util.function.Consumer<java.lang.String> strConsumer21 = null;
        ManagementDashboard managementDashboard22 = new ManagementDashboard(strConsumer21);
        managementDashboard22.setInheritsPopupMenu(true);
        boolean boolean25 = managementDashboard22.isValidateRoot();
        java.awt.dnd.DropTarget dropTarget26 = null;
        managementDashboard22.setDropTarget(dropTarget26);
        boolean boolean28 = managementDashboard22.getAutoscrolls();
        java.awt.event.KeyListener[] keyListenerArray29 = managementDashboard22.getKeyListeners();
        managementDashboard22.firePropertyChange("ManagementDashboard[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=4194313,maximumSize=,minimumSize=,preferredSize=]", (byte) 0, (byte) -1);
        javax.swing.plaf.PanelUI panelUI34 = managementDashboard22.getUI();
        managementDashboard1.setUI(panelUI34);
        managementDashboard1.nextFocus();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dimension19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(keyListenerArray29);
        org.junit.Assert.assertArrayEquals(keyListenerArray29, new java.awt.event.KeyListener[] {});
        org.junit.Assert.assertNotNull(panelUI34);
    }
}

