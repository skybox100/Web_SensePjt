/*
 * package egovframework.SenseArmy.main.controller;
 * 
 * import java.util.ArrayList;
 * 
 * 
 * 
 * import javax.servlet.http.HttpServletRequest; import
 * javax.servlet.http.HttpSession;
 * 
 * import org.apache.ibatis.session.SqlSession; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.ui.Model; import
 * org.springframework.web.bind.annotation.RequestMapping;
 * 
 * import egovframework.SenseArmy.main.Dao.*; import
 * egovframework.SenseArmy.main.Dto.*; import
 * egovframework.SenseArmy.main.Service.*;
 * 
 * 
 * 
 * @Controller public class SignupController {
 * 
 * @Autowired public SqlSession sqlSession;
 * 
 * @RequestMapping(value = "/signup_ok" ,produces="text/plain;charset=UTF-8")
 * //회원가입, form에서 받아들이는 주소 public String signup(Model model, SignupDto signup,
 * HttpSession session, HttpServletRequest request) { SignupDao dao =
 * sqlSession.getMapper(SignupDao.class); String
 * password=request.getParameter("password");
 * Base64EncodeDecodeSample.base64(password);
 * //System.out.println(Base64EncodeDecodeSample.base64(password));
 * 
 * dao.signup(signup.getId(), signup.getName(), // dao.signup에서의 signup은
 * interface에 명시되어있는 signup이다 xml에 적혀있는 쿼리문을 실행 signup.getPhone(), //form에서 받아오는
 * 데이터
 * signup.getMilitary_serial_number(),Base64EncodeDecodeSample.base64(password))
 * ; //비밀번호 칸에 베이스64로 인코딩 된 값을 집어넣기 //Base64EncodeDecodeSample.base64(password)
 * session.setAttribute("name", signup.getName()); //사용자 이름으로 세션 남기기
 * inc(session,model); //세션을 남김으로써 로그인 처리 //session.setAttribute("email",
 * signup.getEmail()); //사용자 이메일으로 세션 남기기
 * 
 * 
 * return "redirect:signup_con"; //signup_con 페이지로 이동 }
 * 
 * @RequestMapping(value="/signup" ,produces="text/plain;charset=UTF-8")//브라우저에
 * 입력된 주소(사용자가 입력하는 주소) public String signup(Model model, HttpSession session) {
 * inc(session,model); return "signup/signup"; //실제 주소(실제로 입력이 되는 주소) }
 * 
 * @RequestMapping(value="/signup_con"
 * ,produces="text/plain;charset=UTF-8")//브라우저에 입력된 주소(사용자가 입력하는 주소) public
 * String signup_con(Model model, HttpSession session) { inc(session,model);
 * return "signup/signup_con"; //실제 주소(실제로 입력이 되는 주소) }
 * 
 * 
 * 
 * public void inc(HttpSession session, Model model) { if
 * (session.getAttribute("name") == null) //로그인이 안되어서 name 세션이 없다면 { String
 * messege="로그인 해주세요"; model.addAttribute("messege", messege); } else //로그인이 되어
 * 있는 상태 { String name=session.getAttribute("name").toString(); String
 * welcome="님 환영합니다!"; // String invitenum=dao.invitednum(email); String
 * messege="그룹초대"; model.addAttribute("welcome", welcome);
 * model.addAttribute("name", name); // iprofileDao
 * dao1=sqlSession.getMapper(iprofileDao.class); // String imgname=
 * dao1.profileimg(email); } }
 * 
 * 
 * }
 */