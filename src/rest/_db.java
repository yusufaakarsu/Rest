package rest;
        
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import net.proteanit.sql.DbUtils;
import javax.swing.JTable;

public class _db {
    
    static Connection connection = null;
    private static Statement statement;
    static PreparedStatement pStatement;
    private static ResultSet resultSet;
    
    public static void dbCon(){
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/rest","postgres", "2577");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getClass().getName()+": "+e.getMessage());
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
    
    public static void comboBoxFill(JComboBox cBox, String sql, String column) throws SQLException{
        dbCon();
        statement = connection.createStatement();
        resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            String name = resultSet.getString(column);
            cBox.addItem(name);
        }
    }
    
    public static void comboBoxFillNameSurname(JComboBox cBox, String sql, String name, String surname) throws SQLException{
        dbCon();
        statement = connection.createStatement();
        resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            String str = resultSet.getString(name);
            String str1 = resultSet.getString(surname);
            String str2 = str +" "+str1;
            cBox.addItem(str2);
        }
    }
    
    public static void insertWithfunc(String sql) throws SQLException{
        dbCon();
        statement.executeQuery(sql);
    }
    
    public static void insert(String sql) throws SQLException{
        dbCon();
        statement.executeUpdate(sql);
    }
    
    public static void update(String sql) throws SQLException{
        dbCon();
        statement.executeUpdate(sql);
    }
    public static void delete(String sql) throws SQLException{
        dbCon();
        statement.executeUpdate(sql);
    }
}