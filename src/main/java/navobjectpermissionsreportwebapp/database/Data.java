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

    public static String GetConnectionURL() {
        return URL;
    }

    public static String GetRowsCount() {
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

    public Collection getStudentsFromGroup() throws SQLException {


        String s = "empty";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Collection Rows = new ArrayList();


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

        return Rows;



        Collection students = new ArrayList();
        PreparedStatement stmt = con.prepareStatement("SELECT student_id, firstName, patronymic, surName, "
                + "sex, dateOfBirth, group_id, educationYear FROM students "
                + "WHERE group_id =  ? AND  educationYear =  ? "
                + "ORDER BY surName, firstName, patronymic");
        stmt.setInt(1, group.getGroupId());
        stmt.setInt(2, year);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Student st = new Student(rs);
            students.add(st);
        }
        rs.close();
        stmt.close();
        return students;
    }

}

//Statement statement = connection.createStatement();
//statement.execute();
//statement.executeUpdate();
//ResultSet res = statement.executeQuery("select * FROM data LIMIT 20;");
//statement.addBatch();
//statement.executeBatch();
//statement.clearBatch();
//statement.isClosed();
//statement.getConnection();
//statement.close();
//connection.close();
//System.out.println(statement.isClosed());
            /*
            ResultSet res = statement.executeQuery("select * FROM data LIMIT 20;");
            while (res.next()) {
                System.out.print(
                        res.getInt("DataID")+";"+
                                res.getString("ModuleName")+";"+
                                res.getString("ObjectType")+";"+
                                res.getString("Description")+";"+
                                res.getString("ObjectType")+";"+
                                res.getInt("RangeFrom")+";"+
                                res.getInt("RangeTo")+";"+
                                res.getString("Read")+";"+
                                res.getString("Insert")+";"+
                                res.getString("Modify")+";"+
                                res.getString("Delete")+";"+
                                res.getString("Execute")+";"+
                                res.getString("ProductLine")+";"+
                                res.getInt("ModuleID")+";"+
                                res.getString("VersionName")+";"+
                                res.getInt("ModuleID2")+";"
                );
                System.out.println();
            }
            */

