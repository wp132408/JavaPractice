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
 *    ㅣ_MelonGenreChart
 *
 * 1. 개요:
 * 2. 작성일 : 2015. 9. 24.
 * </pre>
 * 
 * @author		: 김진욱
 * @version		: 1.0
 */
public class MelonGenreChart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Music> balladeList = new ArrayList<>();
		List<Music> danceList = new ArrayList<>();
		Map<String, List<Music>> map = new HashMap<>();
		
		System.out.println("--------<<멜론 장르별 차트>>--------");
		
		balladeList.add(new Music("내 첫사랑", "베리굿"));
		balladeList.add(new Music("또 다시 사랑", "임창정"));
		balladeList.add(new Music("부산에 가면", "박진영"));
		map.put("발라드", balladeList);
		
		danceList.add(new Music("커피", "유재환,김예림"));
		danceList.add(new Music("다 잘될꺼야", "쿨"));
		map.put("댄스", danceList);
		
		printMap(map);
		
		System.out.println();
		
		System.out.println("--------<<발라드 3위곡 변경>>--------");
		balladeList.remove(2);
		balladeList.add(new Music("지우고 지워도", "차수경"));
		map.replace("발라드", balladeList);
		
		printMap(map);
		System.out.println();
		
		System.out.println("--------<<발라드 1위곡 삭제>>--------");
		balladeList.remove(0);
		map.replace("발라드", balladeList);
		
		printMap(map);
		System.out.println();
		
		System.out.println("--------<<전체곡 삭제>>--------");
		map.clear();
		printMap(map);
	}
	
	public static void printMap(Map<String, List<Music>> map)
	{
		for(String key : map.keySet())
		{
			System.out.println("[" + key + "]");
			for(Music m : map.get(key)){
				System.out.println((map.get(key).indexOf(m)+1) + ". " + m);
			}
		}
	}
}
