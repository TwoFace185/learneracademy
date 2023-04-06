

import java.io.IOException;
import java.sql.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.learner.connection.DbConnection;

/**
 * Servlet implementation class addteacher
 */
@WebServlet("/addteacher")
public class addteacher extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public addteacher() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Connection con=null;
		// TODO Auto-generated method stub
		try { con = DbConnection.GetConnection();
		
		
		   
		   
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
