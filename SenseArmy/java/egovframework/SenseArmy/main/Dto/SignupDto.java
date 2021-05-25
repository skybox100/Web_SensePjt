package egovframework.SenseArmy.main.Dto;

public class SignupDto {
	
	private String id;
	private String name;
	private String phone;
	//private String birth;
	private String military_serial_number;
	//private String military_rank;
	//private String email;
	private String password;
	//private String temp3;
	
	
	
	public SignupDto(String id, String name, String phone, String birth, String military_serial_number, String password)
	{
	super();
	this.id = id;
	this.name = name;
	this.phone = phone;
	//this.birth = birth;
	this.military_serial_number = military_serial_number;
	//this.military_rank = military_rank;
	//this.email = email;
	this.password = password;
	//this.temp3 = temp3;		
	}
	
	public SignupDto() {} //빈 생성자 생성
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/*
	 * public String getBirth() { return birth; } public void setBirth(String birth)
	 * { this.birth = birth; }
	 */
	public String getMilitary_serial_number() {
		return military_serial_number;
	}
	public void setMilitary_serial_number(String military_serial_number) {
		this.military_serial_number = military_serial_number;
	}

	/*
	 * public String getMilitary_rank() { return military_rank; } public void
	 * setMilitary_rank(String military_rank) { this.military_rank = military_rank;
	 * } public String getEmail() { return email; } public void setEmail(String
	 * email) { this.email = email; }
	 */
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	/*
	 * public String getTemp3() { return temp3; } public void setTemp3(String temp3)
	 * { this.temp3 = temp3; }
	 */
	

}
