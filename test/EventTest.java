package test;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class EventTest extends JFrame{
	JButton bt;
	JTextArea area;
	
	public EventTest() {
		bt = new JButton("나버튼");
		area = new JTextArea();
		area.setPreferredSize(new Dimension(280,360));
		
		setLayout(new FlowLayout());
		
		add(bt);
		add(area);
		
		setSize(300,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// 버튼과 리스너 열결
		//내부익명 클래스 (굳이 물리적으로 .java 원본소스까지 만들필요가 없는 로직의 경우 코드량을 줄여준다)
		//또한 익명클래스는 자신을 감싸는 외부 클래스의 모든 멤버변수를 접근할 수 있으므로 사용이 편리하다.
		//단점) .java로 정의해 놓지 않았기 때문에 로직으 재사용은 불가하다.
		bt.addActionListener(new ActionListener(){

			
			public void actionPerformed(ActionEvent e) {
				//area의 텍스트 추가
				area.append("눌렀어?\n");
			}
		});
	}
	
	public static void main(String[] args) {
		new EventTest();
	}
}
