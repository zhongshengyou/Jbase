import java.util.Arrays;

public class Array{
    public static void main(String[] args){
        
        int[] a = {1, 2, 3, 4};
	
	// for循环遍历
	for (int i = 0; i < a.length; i++)
		System.out.println(a[i]);

        //for each遍历
	for (int n : a){    // n直接拿到数组a的元素，不是索引，所以用for each不能拿到数组索引
	    
            System.out.println(n + ", ");
		
	}

	System.out.println(Arrays.toString(a));    // 快速打印数组内容

	for (String arg : args) {
	    if ("-version".equals(arg)) {
	        System.out.println("version: V1.2");
	    }	
	}
    }
}
