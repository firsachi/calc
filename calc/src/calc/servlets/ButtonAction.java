package calc.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ButtonAction
 */
@WebServlet("/ButtonAction")
public class ButtonAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ButtonAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
		if("" == request.getParameter("ab")){
			request.getSession().setAttribute("action", "+");
		}else{
			request.getSession().setAttribute("action", request.getParameter("ab"));
		}
		StringBuilder sb = new StringBuilder();
		if(null!= request.getSession().getAttribute("counter")){
			sb.append(request.getSession().getAttribute("counter"));
		}else {
			sb.append(0);
		}
		//sb.append(" ");
		request.getSession().setAttribute("masterValue", sb.toString());
		request.getSession().removeAttribute("counter");
		response.sendRedirect("/calc");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
