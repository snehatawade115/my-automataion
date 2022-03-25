package automation;

public class StringbufferBuildr {
	public static void main(String[] args) {
		String s1=new String("velocity ");
		System.out.println(s1.concat("class"));//velocity clss
		System.out.println(s1);//velocity imutable
		
		StringBuilder value =new StringBuilder("velocity ");
		System.out.println(value.append("katraj"));//velocity katraj
		
		System.out.println(value);//velocity katraj mutable
		
		StringBuffer value1=new StringBuffer("sonna ");
		System.out.println(value1.append("mona"));//sona mona
		System.out.println(value1);//sona mona mutable
		System.out.println(value1.reverse());
		System.out.println(value1);//reverse wali value print krega
		
	}

}
