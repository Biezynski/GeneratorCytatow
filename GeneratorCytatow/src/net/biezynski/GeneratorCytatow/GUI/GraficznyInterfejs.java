package net.biezynski.GeneratorCytatow.GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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

		tekst = new JLabel("Witaj w Generatorze Cytatow, nacisnij przycisk aby wygenerowaæ losowy Cytat");
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
			ListaCytatow.add("Tylko ten nie pope³nia b³êdów, kto nic nie robi. -Napoleon Bonaparte");
			ListaCytatow.add(
					"S¹ dwa sposoby na tworzenie projektu oprogramowania. "
					+ "Jednym jest stworzenie go "
					+ "tak prostym, ¿eby nie by³o w nim ¿adnych oczywistych braków. Drugim stworzenie go "
					+ "tak skomplikowanym, ¿eby nie by³o w nim ¿adnych oczywistych braków - Hoare");
			ListaCytatow.add("Wiêkszoœæ z was zna ju¿ cnoty programistów. S¹ to oczywiœcie: "
					+ "lenistwo, niecierpliwoœæ i pycha- Larry Wall");
			ListaCytatow.add("Nie obchodzi mnie to, ¿e to nie dzia³a na twoim komputerze! Nie produkujemy"
					+ " twoich komputerów! - Vidiu Platon");
			ListaCytatow.add("Programowanie w C jest jak szybki taniec na œwie¿o pastowanej pod³odze "
					+ "wœród ludzi trzymaj¹cych ¿yletki- Waldi Ravens");
			ListaCytatow.add("Zawsze pisz kod tak, jakby goœæ, który ma siê nim zajmowaæ by³ agresywnym "
					+ "psychopat¹, który wie, gdzie mieszkasz- Martin Golding");
			ListaCytatow.add("Komputer zas³u¿y na miano inteligentnego, je¿eli spowoduje u cz³owieka "
					+ "przekonanie, ¿e jest cz³owiekiem.- Alan Turing");
			ListaCytatow.add("W matematyce rzeczy siê nie pojmuje, tylko siê do nich przyzwyczaja.- "
					+ "John von Neumann");

			int Losowaliczba = (int) (Math.random() * ListaCytatow.size());

			String losCytat = ListaCytatow.get(Losowaliczba);

		
			
			
			
			
			
			
			
			
			
			
			panel.add(textpane);
			textpane.setText(losCytat);
		}

	}

}