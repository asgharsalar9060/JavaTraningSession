package JavaBasics;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Primitive data types include: - A primitive data type specifies the size and type of variable values, and it has no additional methods.

//		Integer:
		int myFeetSize = 4;
		int myBrotherFeetSize = 9;
		System.out.println(myFeetSize + myBrotherFeetSize);

//		Double:
		double c1 = 4.5;
		double c2 = 12.34;
		System.out.println(c1 + c2);

//		Boolean:
		boolean isJavaFun = true;
		boolean isFishTasty = false;
		System.out.println(isJavaFun); // Outputs true
		System.out.println(isFishTasty); // Outputs false

//		Character - should be written in single quotes 
		char myGrade1 = 'A';
		char myGrade2 = 'B';
		System.out.println(myGrade1);
		System.out.println(myGrade2);

//		String: - is a class, non-primitive data type
		String greeting = "Hello World";
		System.out.println(greeting);

	}

}

//Non-primitive data types are called reference types because they refer to objects.

//Examples of non-primitive types are Strings, Arrays, Classes, Interface, etc. You will learn more about these in a later chapter.

/*
 * The main difference between primitive and non-primitive data types are:
 * 
 * Primitive types are predefined (already defined) in Java. Non-primitive types
 * are created by the programmer and is not defined by Java (except for String).
 * Non-primitive types can be used to call methods to perform certain
 * operations, while primitive types cannot. A primitive type has always a
 * value, while non-primitive types can be null. A primitive type starts with a
 * lowercase letter, while non-primitive types starts with an uppercase letter.
 * The size of a primitive type depends on the data type, while non-primitive
 * types have all the same size.
 */
