import java.sql.*;

public class DbConnection {
    private static String db_host="dbc:mysql://localhost:3306/example";
    private static String user_name="root";
    private static String pass="";
    static final String JDBC_DRIVER="com.mysql.jdbc.Driver";

    public static Connection createConnection(){
        Connection connection=null;
        try{
            Class.forName(JDBC_DRIVER);
            connection= DriverManager.getConnection(db_host,user_name,pass);
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
        return connection;

    }

}
