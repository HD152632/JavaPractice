/**
 * 
 */
package org.dimigo.collection;

/**
 * <pre>
 * org.dimigo.collection
 * └cuizz
 *
 * 1.what:
 * 2.date: 2017. 6. 12.
 * </pre>
 * @author: cuizz
 * @versio: 1.0
 */
public class Music {
	private String title,singer;
	
	public Music(String title,String singer){
		this.title=title;
		this.singer=singer;
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

	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	public String toString(){
		return title+" ("+singer+")";
	}
}
