package com.kh.practice.list.music.model.compare;

import java.util.Comparator;

import com.kh.practice.list.music.model.vo.Music;

public class AscSinger implements Comparator<Music> {

	@Override
	public int compare(Music ����1, Music ����2) {
		
		return ����1.getSinger().compareTo(����2.getSinger());
	}

}
