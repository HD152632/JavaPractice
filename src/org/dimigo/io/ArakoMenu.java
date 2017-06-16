/**
 * 
 */
package org.dimigo.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

/**
 * <pre>
 * org.dimigo.io
 * └cuizz
 *
 * 1.what:
 * 2.date: 2017. 6. 15.
 * </pre>
 * @author: cuizz
 * @versio: 1.0
 */
public class ArakoMenu {
	public static void main(String args[]){
		try{
			BufferedReader breader = new BufferedReader( new InputStreamReader(System.in));
			BufferedWriter writer = new BufferedWriter(new FileWriter("files/menu.txt"));
			BufferedReader breader2 = new BufferedReader( new FileReader("files/menu.txt"));
			
			String data;
			
			while((data=breader.readLine())!=null) 
				writer.write(data+"\n");
				writer.flush();
				
			System.out.println("<<메뉴 출력>>");
			while((data=breader2.readLine())!=null) 
				System.out.println(data);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
