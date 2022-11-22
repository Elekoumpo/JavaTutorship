package solution;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet("/custom")
public class CustomServlet extends HttpServlet {

    String message;
    public void init(){
        message = "Hi there";
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        BufferedReader reader;
        reader = new BufferedReader(new FileReader("C:\\Users\\ejubm\\Desktop\\Java_Week1_Ejub\\src\\main\\java\\solution\\text.txt"));
        String word = request.getParameter("word");
        request.getParameter(word);
        Solution solution = new Solution();
        System.out.println("Testing for word: " + word);
        String line = reader.readLine();

        out.println("The word " + word + " is repeated: \n");
        while (line != null) {
            String text = "In " + line + " " + solution.solution(line, word) + " times. <br>";
            PrintWriter out1 =  response.getWriter();
            out.println(text);
            line = reader.readLine();
        }
        reader.close();
    }

    public void destroy(){

    }
}