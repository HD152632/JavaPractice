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
public class Korean extends Person {
	public Korean(String name){
		super(name);
	}
	
	@Override
	public void sayHello(){
		System.out.println("안녕하세요");
	}
	
	@Override
	public void sayBye(){
		System.out.println("안녕히 계세요");
	}
	
	@Override
	public String toString(){
		return "저는 한국사람 "+super.getName()+"입니다.";
	}
}
