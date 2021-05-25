package egovframework.SenseArmy.main.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	/*
	 * @Autowired
	 * public SqlSession sqlSession;
	 */
	//@Autowired가 문제가 되는 것인가 SQL세션이 문제가 되는것인가
	/*
	 * @RequestMapping(value="/login_ok"
	 * ,produces="text/plain;charset=UTF-8")//브라우저에 입력된 주소(사용자가 입력하는 주소) public
	 * String login(Model model, HttpSession session, LoginDto
	 * login,HttpServletRequest request) { LoginDao dao =
	 * sqlSession.getMapper(LoginDao.class); ArrayList<LoginDto>
	 * whologin=dao.login(military_serial_number, password);;
	 * //session.setAttribute("name", login.getName()); inc(session,model);
	 * 
	 * return "home"; //실제 주소(실제로 입력이 되는 주소) }
	 */
	@RequestMapping("/login.do")//브라우저에 입력된 주소(사용자가 입력하는 주소)
	public String login(Model model,HttpServletRequest request)
	{
		
		
		return "login/login"; //실제 주소(실제로 입력이 되는 주소)
	}
	
	@RequestMapping("/logout")//브라우저에 입력된 주소(사용자가 입력하는 주소)
	public String logout(Model model,HttpServletRequest request)
	{
		HttpSession session=request.getSession();
		session.invalidate();
		return "redirect:/"; //실제 주소(실제로 입력이 되는 주소)
	}
}
