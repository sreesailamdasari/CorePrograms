package com.core.util;

public class Person {
	private int age;
	private long salary;
	private String mailId;

	public Person(int age, long salary, String mailId) {
		this.age = age;
		this.salary = salary;
		this.mailId = mailId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", salary=" + salary + ", mailId=" + mailId + "]";
	}

}
