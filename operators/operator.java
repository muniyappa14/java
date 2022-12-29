//unary operator:incrementing and decrementing  the single value
class unaryop {
	public static void main(String[] args){
		int a=10;
		
		System.out.println(a++);
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(--a);
		
	}
}


//arthmatic operator:these are used to perrform addition,substraction,multiplicatio ,division

class arthop{
	public static void main(String[] args){
		int a=10;
		int b=25;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
	}
}


//logical operator:AND:doesnt check the second condition is false.it checks the second condition only if the first one is true
//OR :|| if one condition true out will be true
//NOT: (!)
class andop{
	public static void main (String[] args){
		int a=10;
		int b=5;
		int c=25;
		System.out.println(a<b&&b<c);
		System.out.println(a<b||b<c);
	
	}
}


//equality operator:comparing the both values if it is equal output will be true
class eqop{
	public static void main(String[] args){
		int a=15;
		int b=15;
		System.out.println(a==b);
	}
}

//relational operator:the java relational operators compare b/w operands and determine the relationship bw them
//comparision
//six types of relational operator
class relop{
	public static void main(String[] args){
		int a=12;
		int b=20;
		int c=25;
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<=b);
	}
}


//turnery operator:if else alternative kmown as turnery operator
class turnop{
	public static void main(String[] args){
		String result= 5>4?  "true block" :  "false block";
		System.out.println(result);
	}
}

//assignment operator:most commonly used to assign the value on its right to the operand on its left
class assign{
	public static void main(String[] args){
		int a=10;
		int b=20;
		  a=a+4;
		  b+=5;
		System.out.println(a);
		System.out.println(b);
	}
}