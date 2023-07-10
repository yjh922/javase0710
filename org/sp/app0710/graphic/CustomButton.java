package org.sp.app0710.graphic;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * 자바의 모든 GUI 컴포넌트는 사실 스스로를 그려낸다.
 * 
 * 					현실 			Java
 * 	주체:			화가 			컴포넌트
 * 그려질대상: 	컨버스			컴포넌트
 * 그리는행위:		붓				paint()
 * 스타일(색상등) 팔레트			paint(Graphics g)
 * 									현실에서의 팔레트보다 훨씬 다양한 기능 지원
 * 									(예 : 도형,라인,이미지,String)
 * */

//모든 컴포넌트가 보유한 paint() 메서드를 뺏어서 개발자가 주도하여 그림을 그려본다
//repaint() 메서드를 오버라이드하자
public class CustomButton extends JButton{
	public CustomButton(String title) {
		super(title);
		this.setPreferredSize(new Dimension(200,200));
	}
	
	public void paint(Graphics g) {
		//System.out.println("뺏어 그렸지롱");
		//paint 메서드는 Graphics 객체를 사용하기 위한 코드 영역일 뿐
		//사실 대분분의 그림은 Graphics 객체가 담당한다.
		
		//그래픽스 객체의 페인트 통의 색상을 변경
		g.setColor(Color.orange);
		
		//채워진 사각형을 그린다.
		g.fillRect(0, 0, 200, 200);
	}
	
	
}
