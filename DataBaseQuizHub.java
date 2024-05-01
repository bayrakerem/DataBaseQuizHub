import java.sql.connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBaseQuizHub
{
    public static void main(String[] args) {
        String url = ""; //url connection
        String uname = "root"; //username
        String pass = ""; //password
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement stmt = con.createStatement();
        String query = "select * from percentage"; //table inside the database
        ResultSet rs = st.executeQuery(query);

        //code here;

        st.close();
        con.close();
    }
}