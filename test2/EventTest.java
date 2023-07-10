package test2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventTest extends JFrame{
	JButton bt1;
	JButton bt2;
	JButton bt3;
	int x;
	
	public EventTest() {
		bt1 = new JButton("버튼1");
		bt2 = new JButton("버튼2");
		bt3 = new JButton("버튼3");
		
		setLayout(new FlowLayout());
		
		add(bt1);
		add(bt2);
		add(bt3);
		
		setSize(300,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//버튼1과 리스너 연결
		//코드의 재사용성이 없는 java class인 경우 내부익명으로 처리하면 코드량을 줄일 수 있다.
		//결국 코드량을 줄이기 위한 기법임(추후 람다로 발전)
		bt1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//이 영역에서는 바깥쪽 클래스의 멤버변수를 내것처럼 접근할 수 있다.
				x++;
				System.out.println(x);
			}
		});
		
		//버튼2과 리스너 연결
		bt2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//이 영역에서는 바깥쪽 클래스의 멤버변수를 내것처럼 접근할 수 있다.
				x++;
				System.out.println("버튼2에서 "+x);
			}
		});

		//버튼3과 리스너 연결
		bt3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//이 영역에서는 바깥쪽 클래스의 멤버변수를 내것처럼 접근할 수 있다.
				x++;
				System.out.println("버튼3에서 "+x);
			}
		});

		
	}
	
	public static void main(String[] args) {
		new EventTest();
	}
}
