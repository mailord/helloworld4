package cn.itcast.system;

public class Student {
	//1.���� name age gender ����introduce
	 private String name;
	 private int age;
	 private String gender;
	public Student(String name,int age,String gender){
	
	}
	public void introduce(){
		System.out.println("�ҽ�"+name+",����"+ age +"����,"+ gender);
		System.out.println("this:"+this);
	}
	//2.ʵ����ķ�װprivate,set��������,get���л�ȡ;
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		if(age>10&&age <120){
			this.age = age;
		}else{
			this.age = 0;
		}
	}
	public void setGender(String gender){
		if(gender == "��"|| gender == "Ů"){
			this.gender = gender;
		}else{
			this.gender=" ";
		}
			
		
	}
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	public String getGender(){
		return this.gender;
	}
	
}
