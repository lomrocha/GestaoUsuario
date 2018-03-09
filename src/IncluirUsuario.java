
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IncluirUsuario
 */
@WebServlet("/incluirusuario")
public class IncluirUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IncluirUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		int CPF = Integer.parseInt(request.getParameter("cpf"));
		String dataNascimento = request.getParameter("data");
		String email = request.getParameter("email");
		String[] sexo = request.getParameterValues("sexo");
		
		Usuario u = new Usuario(nome, sobrenome, CPF, dataNascimento, email, sexo[0]);
		
		PrintWriter out = response.getWriter();
		out.println("<html>"
				+ 		"<head>"
				+ 			"<title>Usuário Incluido</title>"
				+ 		"</head>"
				+		"<body>"
				+			"<p><h3>Usuário: " + u.getNome() + " " + u.getSobrenome() + "</h3></p>"
				+			"<p><h3>Usuário incluído com sucesso.</h3></p>"
				+			"<p><a href=\"http://localhost:8080/GestaoUsuario\">Retornar.</a></p>"
				+		"</body>"	
				+ 	"</html>");
	}
}
