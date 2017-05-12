/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * └cuizz
 *
 * 1.what:
 * 2.date: 2017. 5. 12.
 * </pre>
 * @author: cuizz
 * @versio: 1.0
 */
public class PersonTest2 {
	public static void main(String[] args){
		Person persons[]=new Person[4];
		persons[0]=new Person("Tom");
		persons[1]=new Korean("홍길동");
		persons[2]=new Japanese("다나카");
		persons[3]=new Chinese("왕밍");
		
		for(Person p:persons) greeting(p);
	}
	
	private static void greeting(Person p){
		System.out.println(p.toString());
		p.sayHello();
		p.sayBye();
		System.out.println("");
	}
}
