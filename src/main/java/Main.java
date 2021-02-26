import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        try {
            String query = "select * from student";
            Connection connection = DbConnection.createConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            List studentsList = new ArrayList();
            while (resultSet.next()) {
                Student stdObject = new Student();
                stdObject.setId(Integer.valueOf(resultSet.getString("id")));
                stdObject.setName(resultSet.getString("name"));
                stdObject.setAddress(resultSet.getString("Address"));
                studentsList.add(stdObject);
            }
            System.out.println(studentsList);

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();

        }


    }
}


