package com.jdc.except;

public class AppService {
	
	public static void main(String[] args) {
		
		assert('a' == 'b');
		
		Student stu = new Student();
		stu.setName("Isabela Yolander Merced");
//		stu.setAge(16);
//		stu.setGender("Female");
		
		try {
			new AppService().save(stu);
		} catch (Exception e) {
			e.printStackTrace();
//			System.out.println(e.getMessage());
//			throw new JdcAppException(e.getMessage());
		}
		
	}

	public void save(Student stu) {
		if(null == stu) {
			throw new JdcAppException("Student can't be null!");
		}
		
		if(isEmpty(stu.getName())) {
			throw new JdcAppException("Please enter student name!");
		}
		
		if(stu.getAge() <= 5) {
			throw new JdcAppException("Please enter correct age!");
		}
		
		if(isEmpty(stu.getGender())) {
			throw new JdcAppException("Please enter student gender!", new IllegalArgumentException("Gender can't be empty!"));
		}
		
		System.out.println("Student save successfully...");
	}
	
	private boolean isEmpty(String data) {
		return null == data || data.isEmpty() || data.isBlank();
	}

}

class Student {
	
	private String name;
	private int age;
	private String phone;
	private String gender;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
