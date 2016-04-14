package navobjectpermissionsreportwebapp.database;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;

public class Data {
    // Local
    private static final String URL = "jdbc:mysql://localhost:3306/navobjectpermissionsreportdb?useSSL=false";
    private static final String USERNAME = "finn777";
    private static final String PASSWORD = "mysql";

    // Remote
    //private static final String URL = "jdbc:mysql://eu-cdbr-azure-west-d.cloudapp.net:3306/as_3c46f80963eb451?useSSL=false";
    //private static final String USERNAME = "b2db65b318d4e7";
    //private static final String PASSWORD = "a2879805";

    public static String getConnectionURL() {
        return URL;
    }

    public static String getRowsCount() {
        String s = "empty";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;


        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            preparedStatement = connection.prepareStatement("select count(*) RowsCount FROM data;");
            //preparedStatement.setInt(1,1);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                s = resultSet.getString("RowsCount");
            }
        }
        catch(SQLException e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null)
            try {
                if (resultSet != null) resultSet.close();
                if (resultSet != null) preparedStatement.close();
                if (resultSet != null) connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                System.err.println("Error: " + ex.getMessage());
            }
        }

        return s;
    }

    public ArrayList<Row> getRows(String objectype, int objectid) {


        String s = "empty";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        ArrayList<Row> Rows = new ArrayList<Row>();


        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            preparedStatement = connection.prepareStatement
            (
             "SELECT * FROM " +
             "(SELECT DISTINCT `ObjectType`,`ModuleName`,`VersionName`,`Read`,`Insert`,`Modify`,`Delete`,`Execute`,`ProductLine` FROM data " +
             "WHERE `ObjectType` = ? AND ((? >= `RangeFrom`) AND (? <= `RangeTo`)) ORDER BY DataID) t " +
             "ORDER BY t.`ModuleName`,t.`ProductLine`;"
            );
            preparedStatement.setString(1,objectype);
            preparedStatement.setInt(2,objectid);
            preparedStatement.setInt(3,objectid);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Row row = new Row(resultSet);
                Rows.add(row);
            }
        }
        catch(SQLException e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null)
                try {
                    if (resultSet != null) resultSet.close();
                    if (resultSet != null) preparedStatement.close();
                    if (resultSet != null) connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    System.err.println("Error: " + ex.getMessage());
                }
        }

        return Rows;
    }

}


