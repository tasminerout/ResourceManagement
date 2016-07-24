package resourceManager.dto;

import java.util.List;

public class Person {
	private String name;
	private String sex;
	private String age;
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	private List<String> skills;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	
	public String toString() {
		return "Person [name=" + name + ", sex=" + sex + ", skills=" + skills + "]";
	}
}
