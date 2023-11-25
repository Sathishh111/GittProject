package login;

public class BasicProgram {

	public static void main(String[] args) {
String s = "Welcome to java class";
		
		System.out.println(s);
		
	
		int length=s.length();
		System.out.println(length);
		
		//to check whether the string starts with or not
		boolean startsWith = s.startsWith("Welcome");
		System.out.println(startsWith);
		
		boolean endsWith = s.endsWith("s");
		System.out.println(endsWith);
		
		//to change the string into uppercase
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		
		//to find the index position of particular value
		int indexOf = s.indexOf('e');
		System.out.println(indexOf);
		
		int lastIndexOf = s.lastIndexOf('e');
		System.out.println(lastIndexOf);
		
		//to find the value from index position
		char charAt = s.charAt(10);
		System.out.println(charAt);
		
		boolean empty = s.isEmpty();
		System.out.println(empty);
		
		boolean contains = s.contains("JAVA");
		System.out.println(contains);
		
		//to replace the value of string
		String replace = s.replace('a', '&');
		System.out.println(replace);
		
		String replaceAll = s.replaceAll("java", "selenium");
		System.out.println(replaceAll);
		
		//to get the particular portion from the index
		String substring = s.substring(3);
		System.out.println(substring);
		
		String substring2 = s.substring(3, 18);
		System.out.println(substring2);
}


	}


