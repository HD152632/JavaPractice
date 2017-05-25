/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 * └cuizz
 *
 * 1.what:
 * 2.date: 2017. 5. 25.
 * </pre>
 * @author: cuizz
 * @versio: 1.0
 */
public class DBTest {
	public static void main(String args[]){
		
		for(int i=0;i<2;i++){
			IDBManager db=IDBManager.getDBObject(args[i]);
			crud(db);
			System.out.println("");
		}
	}
	
	private static void crud(IDBManager db){
		if(db instanceof OracleDB){
			System.out.println("<<변경 후>>");
		}
		else{
			System.out.println("<<변경 전>>");
		}
		
		db.insert();
		db.search();
		db.update();
		db.delete();
		
	}
}
