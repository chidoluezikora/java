package student.info.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//This class is used to access the database. Currently we are using dummy values,
// which are access by using "dummy" as the database connection URL.
public class DatabaseAccessor {

	private Connection _con = null;

	public DatabaseAccessor(String dbUrl, String username, String password) {

		if (dbUrl.equals("dummy")) {
			// when we use "dummy" Entries without DB connection
		} else {
			// the real deal, connecting to the database
			try {
				_con = DriverManager.getConnection(dbUrl, username, password);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// Task 1.3
	public ArrayList<Student> getAllStudents() throws SQLException {
		// TODO implement SQL Query to get all students and
		// store these Student in the variable result.
		ArrayList<Student> result = new ArrayList<Student>();
		ResultSet rs;
		PreparedStatement students = _con.prepareStatement("SELECT s.firstName, s.lastName, s.studentID, c.name FROM Student s JOIN Course c WHERE c.programID = s.programID;");
		rs = students.executeQuery();
		while (rs.next()) {
			result.add(new Student(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4)));
		}
		rs.close();
		students.close();
		return result;
	}

	// Task 1.4
	public ArrayList<Attempt> getAttemptsForStudent(Student student) throws SQLException {
		// TODO write a Query that gets all the attempts a student has in the database
		// and
		// store these Attempts int the variable result
		ArrayList<Attempt> result = new ArrayList<Attempt>();
		ResultSet rs;
		PreparedStatement attempts = _con.prepareStatement("SELECT a.year, a.term, c.name, a.grade, p.fistName, p.lastName FROM Attempts a JOIN Course c ON c.courseID = a.courseID JOIN Professor p ON p.employeeNumber = a.employeeNumber WHERE studentID = " 
								+ student._studentID + ";");
		rs = attempts.executeQuery();
		while (rs.next()) {
			result.add(new Attempt(rs.getInt("a.year"), rs.getInt("a.term"), rs.getString("c.name"), rs.getInt("a.grade"), rs.getString("p.fistName") + " " + rs.getString("p.lastName")));
		}
		rs.close();
		attempts.close();
		return result;
	}
}
