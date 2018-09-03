package Data;

import java.util.Date;

public class Person {
	Integer id;
	String 	name,
	 		surname,
	 		username;
	Boolean sex;
	String 	password;
	String 	telephone,
			email;
	Date 	birth;
	Integer age;
	String 	city, 
			country;
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Boolean getSex() {
		return sex;
	}

	public void setSex(Boolean sex) {
		this.sex = sex;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	Person(){
		id = 0;
		name = "";
		surname = "";
		username = "";
		sex = false;
		password = "";
		telephone = "";
		email = "";
		Date d = new Date();
		birth = d;
		age = 0;
		city = "";
		country = "";
	}
	
	public Person(Integer userid,String uname,String nname,String sname,Boolean gen,String
			pass,String tel,String eml,Date date,Integer ag,String ci,String co){
		id = userid;
		name = nname;
		surname = sname;
		username = uname;
		sex = gen;
		password = pass;
		telephone = tel;
		email = eml;
		birth = date;
		age = ag;
		city = ci;
		country = co;
	}
	
	public void copy(Person q) {
		this.setId(q.getId());
		this.setName(q.getName());
		this.setSurname(q.getSurname());
		this.setUsername(q.getUsername());
		this.setSex(q.getSex());
		this.setPassword(q.getPassword());
		this.setTelephone(q.getTelephone());
		this.setEmail(q.getEmail());
		this.setBirth(q.getBirth());
		this.setAge(q.getAge());
		this.setCity(q.getCity());;
		this.setCountry(q.getCountry());
	}
}
