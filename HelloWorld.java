import javax.servlet.http.*;
import java.io.*;
public class HelloWorld extends HttpServlet{

public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
response.setContentType("text/html");
PrintWriter out = response.getWriter();
String nombre = request.getParameter("nombre");		      	  	    
out.println("Hola manta " + nombre);
}

}
