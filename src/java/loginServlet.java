import Business.*;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Femi
 */
@WebServlet(urlPatterns = {"/loginServlet"})
public class loginServlet extends HttpServlet {

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
        String id;
        String gpw;

        id = request.getParameter("idtxt");

        gpw = request.getParameter("gpwtxt");
        System.out.println("GID =" + id + "\n Gpass = "+ gpw);


        try (PrintWriter out = response.getWriter())
        {
            Client p1 = new Client();
            p1.SelectDB(id);
            p1.display();

            HttpSession session;
            session=request.getSession();
            session.setAttribute("p1",p1);

            if( gpw.equals(p1.getPassword()))
            {
                System.out.println("login");
                System.out.println("ID = " + id);
                System.out.println("Password =" + gpw+"////");
                System.out.println("dbID = " + p1.getId());
                System.out.println("dbpw = " + p1.getPassword()+"////");
                //Step #6 - Use RequestDispatcher to forward to CustomerWelcome.jsp
                RequestDispatcher rd=request.getRequestDispatcher("/clientPage.jsp");
                rd.forward(request, response);

                System.out.println("LoginServlet Ending....");
            }
            else
            {
                System.out.println("Error");
                //Step #6 - Use RequestDispatcher to forward to Error page
                RequestDispatcher rd=request.getRequestDispatcher("/ErrorPage.jsp");
                rd.forward(request, response);
                System.out.println("LoginServlet error Ending....");
            }
            //Step #5 - Put Customer Object in Session using HttpSession.


            System.out.println("///////Business.Client added to session/scheduling Welcome Business.Client page");

            out.close();
        }
        catch(IOException | NumberFormatException | ServletException e)
        {
            System.out.println("Error in finding EJB" + e);
        }
        finally
        {
            System.out.println("loginServlet Ending...****");
            out.close();
        }
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
