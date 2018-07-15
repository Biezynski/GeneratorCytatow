package net.biezynski.GeneratorCytatow.GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;



public class GraficznyInterfejs extends JFrame implements ActionListener {

	private JPanel panel;
	private JLabel tekst;
	private JButton przycisk;
	private JTextPane textpane;

	public GraficznyInterfejs() {

		int fontsize = 20;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		setTitle("Generator Cytatow");
		setAlwaysOnTop(isAlwaysOnTop());

		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(143, 188, 143));

		tekst = new JLabel("Witaj w Generatorze Cytatow, nacisnij przycisk aby wygenerowa� losowy Cytat");
		tekst.setFont(new Font("TimesRoman", Font.PLAIN, fontsize));
		tekst.setBounds(10, 10, 800, 25);

	

		przycisk = new JButton("Generuj");
		przycisk.setBounds(10, 50, 100, 30);
		przycisk.addActionListener(this);

	
		
		textpane= new JTextPane();
		textpane.setFont(new Font("Roman", Font.BOLD,25));
		textpane.setBounds(50, 110, 700, 600);
		textpane.setBackground(new Color(143, 188, 143));
		
		
		
		//te 4 linijki ponizej maja wysrodkowowac tekst
		StyledDocument doc = textpane.getStyledDocument();
		SimpleAttributeSet center = new SimpleAttributeSet();
		StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
		doc.setParagraphAttributes(0, doc.getLength(), center, false);
		
		
		
		
		

		add(panel);
	
		panel.add(tekst);
		panel.add(przycisk);
		

	}

	@Override
	public void actionPerformed(ActionEvent e) { 

		if (e.getSource() == przycisk) {

			List<String> ListaCytatow = new ArrayList<String>();
			ListaCytatow.add("Tylko ten nie pope�nia b��d�w, kto nic nie robi. -Napoleon Bonaparte");
			ListaCytatow.add(
					"S� dwa sposoby na tworzenie projektu oprogramowania. "
					+ "Jednym jest stworzenie go "
					+ "tak prostym, �eby nie by�o w nim �adnych oczywistych brak�w. Drugim stworzenie go "
					+ "tak skomplikowanym, �eby nie by�o w nim �adnych oczywistych brak�w - Hoare");
			ListaCytatow.add("Wi�kszo�� z was zna ju� cnoty programist�w. S� to oczywi�cie: "
					+ "lenistwo, niecierpliwo�� i pycha- Larry Wall");
			ListaCytatow.add("Nie obchodzi mnie to, �e to nie dzia�a na twoim komputerze! Nie produkujemy"
					+ " twoich komputer�w! - Vidiu Platon");
			ListaCytatow.add("Programowanie w C jest jak szybki taniec na �wie�o pastowanej pod�odze "
					+ "w�r�d ludzi trzymaj�cych �yletki- Waldi Ravens");
			ListaCytatow.add("Zawsze pisz kod tak, jakby go��, kt�ry ma si� nim zajmowa� by� agresywnym "
					+ "psychopat�, kt�ry wie, gdzie mieszkasz- Martin Golding");
			ListaCytatow.add("Komputer zas�u�y na miano inteligentnego, je�eli spowoduje u cz�owieka "
					+ "przekonanie, �e jest cz�owiekiem.- Alan Turing");
			ListaCytatow.add("W matematyce rzeczy si� nie pojmuje, tylko si� do nich przyzwyczaja.- "
					+ "John von Neumann");

			
		
			int Losowaliczba = (int) (Math.random() * ListaCytatow.size());

			String losCytat = ListaCytatow.get(Losowaliczba);

			
			
			
			
//			Collections.shuffle(ListaCytatow);
//			System.out.println(ListaCytatow);
			
//			for (String NowyCytat:ListaCytatow) {
//				System.out.println(NowyCytat);
				
//			}
			
			
					
			
			panel.add(textpane);
			textpane.setText(losCytat);
		
		
			
		}

	}

}