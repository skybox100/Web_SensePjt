package egovframework.SenseArmy.main.Dao;

import egovframework.SenseArmy.main.Dto.*;
import egovframework.rte.psl.dataaccess.mapper.Mapper;


//interface(연결고리)
@Mapper("SignupDao")
public interface SignupDao 
{
	public void signup(String id, String name, String phone, String military_serial_number, String password);
	   //mapper에 구현해놓은 signup을 불러와서 사용(signupDao.xml)
}
