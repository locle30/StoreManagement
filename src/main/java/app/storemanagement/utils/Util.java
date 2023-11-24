
package app.storemanagement.utils;

import app.storemanagement.model.Connection.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Hung Pham
 */
public class Util {
    public static String tmpID = "";
    public static int getNextID(String idName, String tableName){
        int nextID = 1;
        try {
            Connection conn = DBConnection.getConnection();
            Statement St1 = conn.createStatement();
            ResultSet Rs1 = St1.executeQuery("SELECT MAX(" + idName + ") FROM " + tableName);
            if (Rs1.next()) {
                nextID = Rs1.getInt(1) + 1;
            }
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return nextID;
    }
    public static boolean checkDate(Date manufactureDate, Date expiryDate,Date entry){
        Date today = new Date();
        if (manufactureDate.after(entry)){
            JOptionPane.showMessageDialog(null, "NSX không được sau ngày nhập");
            return false;
        }
        else if (manufactureDate.after(entry)){
            JOptionPane.showMessageDialog(null, "NSX không được sau HSD");
            return false;
        }
        else if (entry.after(expiryDate)){
            JOptionPane.showMessageDialog(null, "Ngày nhập không được sau HSD");
            return false;
        }
        else if (manufactureDate.after(today)){
            JOptionPane.showMessageDialog(null, "NSX không được sau hôm nay");
            return false;
        }
        else if (entry.after(today)){
            JOptionPane.showMessageDialog(null, "Ngày nhập không được sau hôm nay");
            return false;
        }
        return true;
    }
    
    public static String getCurrentDateTime() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy"));
    }
    
    public static boolean checkEmail(String email) {
        final String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        final Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}