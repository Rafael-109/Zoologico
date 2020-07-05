package com.recr.Zoologico;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class GUI_Show extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Show frame = new GUI_Show();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI_Show() {
		setTitle("Show Animals");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Return");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUI GUI = new GUI ();
				GUI.setVisible(true);
				dispose();
		}
	});
		panel.add(btnNewButton);
		
		JTextPane txtpnReptileSnakeNew = new JTextPane();
		txtpnReptileSnakeNew.setText("Snake,Name(\"Sass\"), Age(12), Extremities(0),Fangs(2),Eyes (2),Size(\"2 m\"), \r\nHabitat(\"Earth\"),Sex(\"Male\"),Bones(450).\r\n\r\nCocodrile, Name(\"Cookie\"), Age(5), Extremities(4), Fangs(8),Eyes(2),Size(\"3 m\"),\r\nHabitat(\"Earth and Water\"),Sex(\"Female\");Bones(650).");
		txtpnReptileSnakeNew.setToolTipText("");
		contentPane.add(txtpnReptileSnakeNew, BorderLayout.CENTER);
	}

}
