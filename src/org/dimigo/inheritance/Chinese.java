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
public class Chinese extends Person{
	public Chinese(String name){
		super(name);
	}
	
	@Override
	public void sayHello(){
		System.out.println("니하오");
	}
	
	@Override
	public void sayBye(){
		System.out.println("쨔이찌엔");
	}
	
	@Override
	public String toString(){
		return "저는 중국사람 "+super.getName()+"입니다.";
	}
}
