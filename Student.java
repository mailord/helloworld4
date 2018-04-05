package cn.itcast.system;

public class Student {
	//1.属性 name age gender 方法introduce
	 private String name;
	 private int age;
	 private String gender;
	public Student(String name,int age,String gender){
	
	}
	public void introduce(){
		System.out.println("我叫"+name+",今年"+ age +"岁了,"+ gender);
		System.out.println("this:"+this);
	}
	//2.实现类的封装private,set进行拦截,get进行获取;
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
		if(gender == "男"|| gender == "女"){
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
