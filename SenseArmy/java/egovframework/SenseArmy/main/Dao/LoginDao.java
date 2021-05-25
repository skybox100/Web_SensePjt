package egovframework.SenseArmy.main.Dao;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("LoginDao")
public interface LoginDao 
{
	public void login(String military_serial_number, String password);
}
