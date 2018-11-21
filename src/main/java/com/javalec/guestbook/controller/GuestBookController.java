package com.javalec.guestbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.javalec.common.Log4Advice;
import com.javalec.common.LogAdvice;
import com.javalec.guestbook.dao.GuestBookDAO;
import com.javalec.guestbook.vo.GuestBookVO;

import ch.qos.logback.classic.boolex.GEventEvaluator;
@Component("guestbook")
public class GuestBookController {
	@Autowired
	private GuestBookDAO guestbookDao ;

	
	public GuestBookController() {
	}
	
	
	public void setGuestbookDao(GuestBookDAO guestbookDao) {
	}

	public List<GuestBookVO> getList(){
		System.out.println("리스트 조회 비즈니스 메소드");
		List<GuestBookVO> list = guestbookDao.getList();
		return list ;
	}
	
	public void delete(GuestBookVO vo) {
		guestbookDao.delete(vo);
	}
	
	public void add(GuestBookVO vo) {
		guestbookDao.insert(vo);
	}
}
