package web05;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// servlet 맵핑의 표현을 어노테이션을 통해 대신할 수 있다. 이 경우 xml파일에 명시를 해주지 않더라도 호출을 연결해 줄 수 있다.
//@WebServlet("/index")
// name과 urlpatterns도 명시가능
@WebServlet(name = "HomeController", urlPatterns = {"/home", "/", "/index"})
public class HomeController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("사용자의 GET 방식 요청 기록");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
}
