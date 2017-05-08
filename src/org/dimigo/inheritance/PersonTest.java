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
 * 2.date: 2017. 5. 8.
 * </pre>
 * @author: cuizz
 * @versio: 1.0
 */
public class PersonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p=new Person("Tom");
		Korean k=new Korean("홍길동");
		Japanese j=new Japanese("다나카");
		Chinese c=new Chinese("왕밍");
		
		System.out.println(p.toString());
		System.out.println(k.toString());
		System.out.println(j.toString());
		System.out.println(c.toString());
		System.out.println("");
		
		p.sayHello();
		k.sayHello();
		j.sayHello();
		c.sayHello();
		System.out.println("");
		
		p.sayBye();
		k.sayBye();
		j.sayBye();
		c.sayBye();
		System.out.println("");
	}

}
