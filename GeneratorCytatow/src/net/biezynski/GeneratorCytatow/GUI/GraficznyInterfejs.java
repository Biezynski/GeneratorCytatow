package net.biezynski.GeneratorCytatow.GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.text.StyledEditorKit.FontSizeAction;

public class GraficznyInterfejs extends JFrame implements ActionListener {

	private JPanel panel;
	private JLabel tekst;
//!!!!!!!!!	private JTextArea poleTekstowe;
	private JButton przycisk;
	private JButton przycisk2;
	private JLabel losowyCytat;

	public GraficznyInterfejs() {

		int fontsize = 20;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		setTitle("Generator Cytatow");
		setAlwaysOnTop(isAlwaysOnTop());

		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(143, 188, 143));

		tekst = new JLabel("Witaj w Generatorze Cytatow, nacisnij przycisk aby wygenerowaæ losowy Cytat");
		tekst.setFont(new Font("TimesRoman", Font.PLAIN, fontsize));
		tekst.setBounds(10, 10, 800, 25);

	//!!!!!	poleTekstowe = new JTextArea();
	//!!!!!	poleTekstowe.setBounds(10, 60, 200, 25);

		przycisk = new JButton("Generuj");
		przycisk.setBounds(10, 120, 100, 30);
		przycisk.addActionListener(this);

		losowyCytat = new JLabel("Tutaj bedzie sie pojawial tekst z losowym cytatem");
		losowyCytat.setFont(new Font("NowyRoman", Font.ITALIC, fontsize));
		losowyCytat.setBounds(10, 10, 800, 400);

		add(panel);
	//!!!!!	panel.add(poleTekstowe);
		panel.add(tekst);
		panel.add(przycisk);
	//	panel.add(losowyCytat);
		
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {

	
		if (e.getSource() == przycisk) {
			
					
			
			panel.add(losowyCytat);
			
			
			losowyCytat.setText("Tutaj bedzie pojawial sie losowy Cytat");
			
		}

	}

}