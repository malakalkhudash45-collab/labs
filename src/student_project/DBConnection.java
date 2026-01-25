package student_project;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection getConnection() {
        try {
            //ملاحظة: تأكد من أن قاعدة البيانات student_db موجودة في MySQL
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/student_db",
                    "root",
                    "" // كلمة المرور الافتراضية في XAMPP/WAMP غالباً فارغة
            );
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
