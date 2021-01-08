public class Method{
    public static void main(String[] args){
		//Girl gf = new Girl();
		//gf.name = "one cup";

		GirlFriend gf = new GirlFriend();
		gf.name = "Alice";
		//gf.age = 20;
		gf.setAge(18);
		String name = gf.name + "zsy";//args[0];
		
		gf.setNameandAge(name, 26);
		System.out.println("gf.name = " + gf.name + " gf.age = " + gf.getAge());
        
		String[] city = new String[] {"深圳", "赣州"};
		gf.setCity(city);    //可以当做传入的是city指针
		System.out.println("getCity = " + gf.getCity());    //获取的是city指针指向的值
		city[1] = "南京";    //修改city[1]指向的值
		System.out.println("modify getCity = " +  gf.getCity());
    }

}



class GirlFriend {
	public String name;
	private int age;    // private修饰,防止变量暴露在外面,破坏封装性
	private String[] city;

	//对于私有成员,需要通过方法来修改/获取
	public int getAge(){
		
		return this.age;
	}

	public int setAge(int age){
		
		if((age < 0) || (age > 99)) {
			System.out.println("set age err!!!");
			return -1;
		}

		this.age = age;

		ifover18(20);
		return 0;
	}

	// private 方法,对外部不开放,内部方法是可以调用private方法的
	private void ifover18(int age) {
	
	
		if ((age - this.age) > 0) {
			System.out.println("age > 18");	
		}
		else {
			System.out.println("age < 18");	
		}
	}

	public void setNameandAge(String name, int age) {
		
		this.name = name;
		this.age = age;
		
		
		
	}

	public void setCity(String[] city){
		
		this.city = city;
	}
	
	public String getCity(){
	
		return this.city[0] + "  " + this.city[1];
	}
}
