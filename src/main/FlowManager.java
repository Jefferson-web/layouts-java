package main;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowManager extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;

	private JButton button1, button2, button3, button4, button5;
	FlowLayout layout;
	
	public FlowManager() {
		super("FlowLayout");
		setSize(800, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initComponents();
	}
	
	void initComponents() {
		layout = new FlowLayout(FlowLayout.CENTER, 3, 3);
		setLayout(layout);
		
		button1 = new JButton("Botón 1");
		button2 = new JButton("Botón 2");
		button3 = new JButton("Botón 3");
		button4 = new JButton("Botón 4");
		button5 = new JButton("Botón 5");
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new FlowManager().setVisible(true);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		layout.setHgap(layout.getHgap() + 5);
		layout.setVgap(layout.getVgap() + 5);
		setLayout(layout);
		validate();
	}
	
}
