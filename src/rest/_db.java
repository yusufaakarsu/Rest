package rest;
        
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;
import javax.swing.JTable;

public class _db {
    
    private static Connection connection = null;
    private static Statement statement;
    private static ResultSet resultSet;
    
    public static void dbCon(){
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/rest","postgres", "2577");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getClass().getName()+": "+e.getMessage());
        }
    }
    
    public static void dbConClose(){
        try {
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(_db.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void tableFill(JTable table, String sql){
        try {
            dbCon();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (SQLException e) {
        }
    }
    
}