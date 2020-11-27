import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author BukayoDan
 */
@WebServlet(urlPatterns = {"/AppScheduleSevlet"})
public class AppScheduleSevlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out;
        out = response.getWriter();
        
        String id= request.getParameter("Idtxt");
        String dy= request.getParameter("Dytxt");
        String st= request.getParameter("Sttxt");
        String et= request.getParameter("Ettxt");
        String cid= request.getParameter("CIdtxt");
        String eid= request.getParameter("EIdtxt");
        
        try    
            {    
                Class.forName("com.mysql.jdbc.Driver");
               //estaerblish connection
                Connection con = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1/ScheduleSoftdb",
                    "root",
                    "");
                System.out.println("Connected Successfully");
                String sqlQuery = "INSERT into appointment(AId,Date,Start_Time,End_Time,CId,EId) values(?,?,?,?,?,?);";
                PreparedStatement pstmt=con.prepareStatement(sqlQuery);    
                pstmt.setString(1, id);    
                pstmt.setString(2, dy);    
                pstmt.setString(3,st);    
                pstmt.setString(4, et);    
                pstmt.setString(5, cid);    
                pstmt.setString(6,eid);    

                int x=pstmt.executeUpdate();    

                if(x==1)    
                {    
                out.println("Values Inserted Successfully");    
                 //Step #6 - Use RequestDispatcher to forward to CustomerWelcome.jsp
                    RequestDispatcher rd=request.getRequestDispatcher("/newAppResult.jsp");
                    rd.forward(request, response);
                    //System.out.println("Client info page Ending....");
                }
                else
                {
                    System.out.println("Client info page Error");
                //Step #6 - Use RequestDispatcher to forward to CustomerWelcome.jsp
                    RequestDispatcher rd=request.getRequestDispatcher("/ErrorPage.jsp");
                    rd.forward(request, response);
                    //System.out.println("Client info page error Ending....");
                }
            }    
            catch(ClassNotFoundException | SQLException e)    
            {    
                System.out.println(e);
            }    
            out.close();  
    
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
