/**
 * 
 */
package org.dimigo.collection;

/**
 * <pre>
 * org.dimigo.collection
 *    ㅣ_Music
 *
 * 1. 개요:
 * 2. 작성일 : 2015. 9. 23.
 * </pre>
 * 
 * @author		: 김진욱
 * @version		: 1.0
 */
public class Music {
	private String title;
	private String singer;
	
	Music(String title, String singer){
		this.title = title;
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}
	
	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	
}
