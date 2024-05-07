package com.kh.practice.list.music.model.vo;

public class Music implements Comparable<Music> {
	private String title;
	private String singer;
// 메서드
	// Setter
	public void setTitle(String title) {
		this.title = title;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	// Getter
	public String getTitle() {
		return title;
	}
	public String getSinger() {
		return singer;
	}
	
	// 생성자 : 기본
	public Music() {
	}
	// 생성자 : 필수
	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}

	@Override
	public String toString() {
		return "곡 제목 : " + title + ", 가수 : " + singer;
	}
	
	// sort compareTo 비교의 기준을 만들어주자
	@Override
	public int compareTo(Music o) {
		return this.title.compareTo(o.title);
	}
	
}
