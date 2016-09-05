package mytest;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
//父子子承觀念
//interface 自訂名稱
public class java28 extends JFrame implements ActionListener{
	private JButton open , save , exit;
	
		public java28(){
			super("My windown APP");
			setLayout(new FlowLayout());
			
			open = new JButton("Open");
			save = new JButton("Save");
			exit = new JButton("Exit");
			
			add(open);add(save);add(exit);
			open.addActionListener(this);
			open.addActionListener(new MyLinster());
			open.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("DK!!");
					//叫出的命令會先從最底層被提出
				}
			});
			//三者都使用同一個監聽者
			save.addActionListener(this);
			exit.addActionListener(this);
//			save.addActionListener(new MyLinster());
//			exit.addActionListener(new ActionListener() {
//				
//				@Override
//				public void actionPerformed(ActionEvent e) {
//				System.out.println("exit");
//					
//				}
//			});
//			
			setSize(640,480);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	public static void main(String[] args) {
		 new java28();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == open){
		System.out.println("open");
		}else if (e.getSource() == save){
			System.out.println("save");
		}else if (e.getSource() == exit){
			System.out.println("exit");
		}
	}
	class MyLinster implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Save");
			
		}
		
	}
}
