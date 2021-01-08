/**
*** class 命名规范 ***
***
*** 类名习惯以大写字母开头，如: Hello ***

*** 类里面可以有若干个方法(方法名一般小写) 如: main() ***


*/
public class Hello{
    public static void main(String[] args){
        System.out.println("hello word!!!");    //向屏幕输出字符
	
	int x = 100;    //基本变量操作, java只定义了带符号的整形，一个byte: -128~127
	float d = 1.34f;    //float类型需要加f
	boolean s = 1 > 3;    //两个关系运算的结果，boolean类型只有ture和false
	System.out.println("int x = " + x + " float d = " + d + " boolean s = " + s);

	char ch = 'A';
	char ch1 = '钟';    //char 不仅可以表示ASCII， 还可以表示Unicode字符编码
	System.out.println("ch = " + ch + " ch1 = " + ch1);

	String str = "zsy";    //String 为引用类型
	System.out.println("str = " + str);

        final double PI = 1.34156;    //final修饰后，变量PI变常量，一般常量用大写
       
        //var关键字,有些时候，类型的名字太长，写起来比较麻烦，这时候可以用var定义变量
	StringBuilder nnb = new StringBuilder();
//	var nb = new StringBuilder();    //用var代替StringBuilder
	System.out.println("nnb = " + nnb);


	int a = 72;
	int b = 105;
	int c = 65281;
	double f1 = 1.34;
	// FIXME:
        
	String s1 = Integer.toString(a) + Integer.toString(b) + Integer.toString(c) + String.valueOf(f1);    //Integer.toString(a)把a转为string输出，String.valueOf(a)也行
	String s2 = String.valueOf(a) + String.valueOf(b) + String.valueOf(c) + String.valueOf(f1);    //Integer.toString(a)把a转为string输出，String.valueOf(a)也行
	System.out.println(s1);
	System.out.println(s2);

	//定义数组
	int[] n1 = new int[5];    //想想和c的区别
        System.out.println("n1 length = " + n1.length);    //变量名.length获取数组大小
        
	double[] db = new double[5];
        System.out.println("db length = " + db.length);    //变量名.length获取数组大小,两个类型输出都是5,说明length获取的是元素个数，不是表示多少个字节
	for(int i = 0; i < 5; i++)
	{
	    n1[i] = i;	
	}
	System.out.println("n1[1] = " + n1[1]);

	int[] n2 = new int[] {5, 4, 3, 2};    //定义并初始化一个数组
	System.out.println("n2[1] = " + n2[1]);

	int[] n3 = {9, 8, 7};    //定义并初始化一个数组
	System.out.println("n3[1] = " + n3[1]);
        

	//字符串数组
	String[] str1 = {"zsy", "Zsy", "ZSY"};
	System.out.println("str1[1] = " + str1[1]);
        
	str1[1] = "zhong";    //赋值并没有把Zsy替换成zhong,只是把str1[1]的指向了zhong,Zsy还是在原来的位置不变
        System.out.println("str1[1] = " + str1[1]);





    }	
}
