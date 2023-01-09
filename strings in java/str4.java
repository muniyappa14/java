//STRING METHODS:
//charAt:Returns the character at specified index

class test{
	public static void main(String[] args){
		String a= new String("java is strictly typed");
		String b= new String("muniyappa");
	//char	b=a.charAt(3);
	        //.length:to find the length of an array.
		//System.out.println(a.length());
	//	compare:comparing the two values 
	
		//System.out.println(a.compareTo(b));
		
		//concat:adding of two strings
		//System.out.println(a.concat(b));
		
		//Contains:checking the values containing in the strings
			System.out.println(a.contains(b));
			
			//indexOf:it shows the index of character
			System.out.println(a.indexOf("s"));
			
			
			//endswith:checks whether string endswith specified character
			System.out.println(b.endsWith("a"));
			
			//lastIndexOf:find the value of last index
			System.out.println(b.lastIndexOf("p"));
			
			//matches:searches a string for a match against a regular expression and returns matches
			System.out.println(a.matches(b));
			
			//replace:it replace the given character 
			System.out.println(b.replace("muni","pro"));
			
			
			//split:splits a string into character array
			System.out.println(a.split("mandya"));
			
			//startswith:startsWith this method vetifies the starting letter
			System.out.println("pubg".startsWith("p"));
			
			//substring:returns the new string which is the substring of specified string
			System.out.println(b.substring(0,5));
			
			//toCharArray: converts string to character array
			System.out.println(a.toCharArray());
			
			//toLowerCase:converts string to lowercase
			System.out.println(b.toLowerCase());
			
			//toUpperCase:converts string to uppercase
			System.out.println(a.toUpperCase());
			
			//trim:this is used to remove white space bothside of the string
			System.out.println(a.trim());
			
			//valueOf:return the string representation of specified value
			System.out.println(a.valueOf("i am dead"));
	}
}

