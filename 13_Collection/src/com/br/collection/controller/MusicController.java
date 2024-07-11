package com.br.collection.controller;

import java.util.ArrayList;
import java.util.List;

import com.br.collection.model.vo.Music;

// 사용자의 특정 요청을 처리해주는 클래스
public class MusicController {
	
	private List<Music> list = new ArrayList<>();
	{ // 초기화 블럭 (샘플데이터 작성담을때)
		list.add(new Music("Good Bye", "박효신"));
		list.add(new Music("술이 달다", "에픽하이"));
		list.add(new Music("밥이 달다", "강보람"));
		list.add(new Music("우산", "에픽하이"));
		
	}
	
	// 각 요청별 메소드
	
	public void insertMusic(String title, String artist) {
		
		list.add(new Music(title, artist));
		
	}
	
	public List<Music> selectMusicList() {
		
		return list;
		
	}
	
	public int deleteMusic(String title) {
		
		int result = 0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.remove(i);
				result++;
				break;
			}
		}
		return result;
	}
	
	public int updateMusic(String title, String upTitle, String upArtist) {
		
		int result = 0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.get(i).setTitle(upTitle);
				list.get(i).setArtist(upArtist);
				result++;
				break;
			}
		}
		
		return result;
		// result = 0 | 1
		
	}
	
	public List<Music> selectMusicByKeyword(String keyword) {
		
		List<Music> searchList = new ArrayList<>();
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().contains(keyword)) {
				searchList.add(list.get(i));
			}
		}
		
		return searchList;
		
	}
	
	public List<String> searchSinger(String artist) {
		
		List<String> searchResult = new ArrayList<>();
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getArtist().equals(artist)) {
				searchResult.add(list.get(i).getTitle());
			}
		}
		return searchResult;
	}
	
	/*
	 * 곡명을 전달받아
	 * 해당 곡명(키워드)이 포함되어있는게 총 몇개인지 반환
	 */
	
	public int searchTitleNumber(String title) {
		
		int num = 0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().replace(" ","").contains(title.replace(" ", ""))) {
				num++;
			}
		}
		return num;
	}

	
	
}
