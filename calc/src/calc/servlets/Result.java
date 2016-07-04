package calc.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import calc.messages.Message;

/**
 * Servlet implementation class Result
 */
@WebServlet("/Result")
public class Result extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Result() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int firstValue = new Integer(((String) request.getSession().getAttribute("masterValue")).trim()) ;
		int secondValue = new Integer(((String) request.getSession().getAttribute("counter")).trim());
		String result = null;
		switch ((String) request.getSession().getAttribute("action")) {
			case "/":
				if (0==secondValue){
					result = Message.ERROR_DIVIDE_ZERO;
					break;
				}
				result = Integer.toString(firstValue / secondValue);
			break;
			case "-":
				result = Integer.toString(firstValue - secondValue);
			break;
			case "*":
				result = Integer.toString(firstValue * secondValue);
			break;
			case "+":
				result = Integer.toString(firstValue + secondValue);
			break;
		}
		
		request.getSession().removeAttribute("masterValue");
		request.getSession().removeAttribute("action");
		request.getSession().setAttribute("counter", result);
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
