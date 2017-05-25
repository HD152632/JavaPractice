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
public interface IDBManager{
	public static final String ORACLE_DATABASE="ORACLE";
	public static final String SYBASE_DATABASE="SYBASE";
	
	public abstract void insert();
	public abstract void search();
	public abstract void update();
	public abstract void delete();
	
	public static IDBManager getDBObject(String database){
		if(database.equals(SYBASE_DATABASE)){
			return (IDBManager)new SybaseDB();
		}
		else if(database.equals(ORACLE_DATABASE)){
			return (IDBManager)new OracleDB();
		}
		return null;
	};
}
