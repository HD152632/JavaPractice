/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 * └cuizz
 *
 * 1.what:
 * 2.date: 2017. 6. 13.
 * </pre>
 * @author: cuizz
 * @versio: 1.0
 */
public class MelonGenreChart {
	public static void main(String args[]){
		Map<String,List<Music>> map=new HashMap<>();
		
		List<Music> m1=new ArrayList<>();
		List<Music> m2=new ArrayList<>();
		
		m1.add(new Music("팔레트","아이유"));
		map.put("발라드", m1);
		
		m2.add(new Music("I LUV IT","PSY"));
		m2.add(new Music("맞지?","언니쓰"));
		map.put("댄스", m2);
		
		System.out.println("-- << 멜론 장르별 챠트 >> --");
		printMap(map);
		
		m2.remove(1);
		m2.add(new Music("SIGNAL", "트와이스"));
		System.out.println("-- << 댄스 2위 곡 변경 >> --");
		printMap(map);
		
		m2.remove(0);
		System.out.println("-- << 댄스 1위 곡 삭제 >> --");
		printMap(map);
		
		map.clear();
		System.out.println("-- << 전체 리스트 삭제 >> --");
	}
	
	public static void printMap(Map<String,List<Music>> map){
		for(String key:map.keySet()){
			System.out.println("["+key+"]");
			List<Music> list=map.get(key);
			
			for(int i=0;i<list.size();i++){
				System.out.println((i+1)+". "+list.get(i).toString());
			}
		}
		System.out.println();
	}
}
