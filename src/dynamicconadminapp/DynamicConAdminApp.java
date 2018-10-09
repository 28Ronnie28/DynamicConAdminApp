/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicconadminapp;

import java.awt.AWTException;
import java.awt.CheckboxMenuItem;
import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Ronnie
 */
public class DynamicConAdminApp {   
    static String CurrentUser = "Suzette";
    static Connection con = null;
    static Statement stmt;
    
    /**
     * @param args the command line arguments
     */
    
public static void main(String[] args) {
    
    try{
            String Path = "D:/Code/DynamicConAdminApp/";
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://"+Path+"/DynamicConstructionDB.accdb");
            con.setAutoCommit(false);
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE,ResultSet.HOLD_CURSORS_OVER_COMMIT);
            System.out.println("Connection Successful");
        }catch(ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(null, "Connection Failed\nDatabase Error\n" + ex);
        }
    Home home = new Home(con);
    Calender calender = new Calender(con);
    Quotations quotations = new Quotations(con);
    LogInDetails logInDetails = new LogInDetails(con);
    Products products = new Products(con);
    
    
    final PopupMenu popup = new PopupMenu();
        final TrayIcon trayIcon = new TrayIcon(Toolkit.getDefaultToolkit().getImage(DynamicConAdminApp.class.getResource("/Resources/Products.png")));
        final SystemTray tray = SystemTray.getSystemTray();
       
        // Create a pop-up menu components
        MenuItem homeItem = new MenuItem("Home");

        Menu displayMenu = new Menu("Display");
        MenuItem calenderItem = new MenuItem("Calender");
        MenuItem quotationsItem = new MenuItem("Quotations");
        MenuItem logInDetalsItem = new MenuItem("LogIns");
        MenuItem productsItem = new MenuItem("Products");
        MenuItem exitItem = new MenuItem("Exit");
        
        homeItem.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            home.setVisible(true);
            calender.setVisible(false);
            quotations.setVisible(false);
            logInDetails.setVisible(false);
            products.setVisible(false);
        }});
        
        calenderItem.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            home.setVisible(false);
            calender.setVisible(true);
            quotations.setVisible(false);
            logInDetails.setVisible(false);
            products.setVisible(false);
        }});
        
        quotationsItem.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            home.setVisible(false);
            calender.setVisible(false);
            quotations.setVisible(true);
            logInDetails.setVisible(false);
            products.setVisible(false);
        }
        });
        
        logInDetalsItem.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            home.setVisible(false);
            calender.setVisible(false);
            quotations.setVisible(false);
            logInDetails.setVisible(true);
            products.setVisible(false);
        }});
        
        productsItem.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            home.setVisible(false);
            calender.setVisible(false);
            quotations.setVisible(false);
            logInDetails.setVisible(false);
            products.setVisible(true);
        }});
        
        exitItem.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            System.exit(0);
        }});
        
        //Add components to pop-up menu
        popup.add(homeItem);
        popup.addSeparator();
        popup.add(displayMenu);
        displayMenu.add(calenderItem);
        displayMenu.add(quotationsItem);
        displayMenu.add(logInDetalsItem);
        popup.addSeparator();
        popup.add(exitItem);
       
        trayIcon.setPopupMenu(popup);
       
        try {
            tray.add(trayIcon);
        } catch (AWTException e) {
            System.out.println("TrayIcon could not be added.");
        }
        
        home.setVisible(true);
        /*List studentList = new ArrayList();
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("C:\\Users\\Ronnie\\Desktop\\testing.xlsx");
            
            // Using XSSF for xlsx format, for xls use HSSF
            Workbook workbook = new XSSFWorkbook(fis);

            int numberOfSheets = workbook.getNumberOfSheets();

            //looping over each workbook sheet
            for (int i = 0; i < numberOfSheets; i++) {
                Sheet sheet = workbook.getSheetAt(i);
                Iterator rowIterator = sheet.iterator();

                //iterating over each row
                while (rowIterator.hasNext()) {
                    Object row = rowIterator.next();
                    Iterator cellIterator = row.cellIterator();

                    //Iterating over each cell (column wise)  in a particular row.
                    while (cellIterator.hasNext()) {
                        Cell cell = cellIterator.next();

                        //The Cell Containing String will is name.
                        if (Cell.CELL_TYPE_STRING == cell.getCellType()) {


                            //The Cell Containing numeric value will contain marks
                        } else if (Cell.CELL_TYPE_NUMERIC == cell.getCellType()) {

    

                }

            }

 

            fis.close();

                }
            }
        } catch (FileNotFoundException e) {

            e.printStackTrace();

    }
*/
}
}

