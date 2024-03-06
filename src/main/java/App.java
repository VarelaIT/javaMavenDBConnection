import JDBC.DBConn;

import java.sql.*;

public class App {

    public static void main(String[] args) throws SQLException{

        //Run the app with this command:
        //java -cp "/home/uriel/.m2/repository/org/postgresql/postgresql/42.7.2/postgresql-42.7.2.jar:target/classes/" App
        DBConn conn = new DBConn();

        String sqlStm = "select ('Welcome to my fake company database') as data";
        Statement fkStatement = conn.conn.createStatement();
        ResultSet stmResult = fkStatement.executeQuery(sqlStm);

        while(stmResult.next() != false){
            System.out.println(stmResult.getString(1));
        }

        conn.conn.close();

    }

}
