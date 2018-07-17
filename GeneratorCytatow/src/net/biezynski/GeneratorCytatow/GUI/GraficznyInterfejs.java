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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.plaf.OptionPaneUI;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class GraficznyInterfejs extends JFrame implements ActionListener {

	private JPanel panel;
	private JLabel tekst;
	private JButton przycisk;
	private JTextPane textpane;

	List<String> listaCytatow = new ArrayList<String>();

	public GraficznyInterfejs() {

		listaCytatow.add("Tylko ten nie pope�nia b��d�w, kto nic nie robi- Napoleon Bonaparte");
		listaCytatow.add(
				"S� dwa sposoby na tworzenie projektu oprogramowania. Jednym jest stworzenie go tak prostym, �eby nie by�o w nim �adnych oczywistych brak�w. Drugim stworzenie go tak skomplikowanym, �eby nie by�o w nim �adnych oczywistych brak�w- Hoare");
		listaCytatow.add(
				"Wi�kszo�� z was zna ju� cnoty programist�w. S� to oczywi�cie: lenistwo, niecierpliwo�� i pycha- Larry Wall");
		listaCytatow.add(
				"Nie obchodzi mnie to, �e to nie dzia�a na twoim komputerze! Nie produkujemy twoich komputer�w- Vidiu Platon");
		listaCytatow.add(
				"Programowanie w C jest jak szybki taniec na �wie�o pastowanej pod�odze w�r�d ludzi trzymaj�cych �yletki- Waldi Ravens");
		listaCytatow.add(
				"Zawsze pisz kod tak, jakby go��, kt�ry ma si� nim zajmowa� by� agresywnym psychopat�, kt�ry wie, gdzie mieszkasz- Martin Golding");
		listaCytatow.add(
				"Komputer zas�u�y na miano inteligentnego, je�eli spowoduje u cz�owieka przekonanie, �e jest cz�owiekiem.- Alan Turing");

		Collections.shuffle(listaCytatow);

		// System.out.println(listaCytatow);

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

		textpane = new JTextPane();
		textpane.setFont(new Font("Roman", Font.BOLD, 25));
		textpane.setBounds(50, 110, 700, 600);
		textpane.setBackground(new Color(143, 188, 143));

		// te 4 linijki ponizej maja wysrodkowowac tekst
		StyledDocument doc = textpane.getStyledDocument();
		SimpleAttributeSet center = new SimpleAttributeSet();
		StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
		doc.setParagraphAttributes(0, doc.getLength(), center, false);

		add(panel);

		panel.add(tekst);
		panel.add(przycisk);

	}

	public static void stworzOkienkoKoncowe() {
		// JOptionPane.showMessageDialog(null, "Skonczyly sie cytaty!!!", "Ostrze�enie",
		// JOptionPane.INFORMATION_MESSAGE);

		int wynik = JOptionPane.showConfirmDialog(null, "Sko�czy�y si� cytaty czy chcesz zrestartowac program?",
				"Trudny wyb�r", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
		// 0- na tak 1- na nie
		// System.out.println(wynik);

		if (wynik == 1) {
			// System.out.println("wcisnieto nie");
			// Wylacz program po wcisnieciu nie
			Runtime.getRuntime().exit(HIDE_ON_CLOSE);
		} else if (wynik == 0) {

			// nie wiem do konca dlaczego ale dzia�a :)
			// System.out.println("wcisnieto tak");
			GraficznyInterfejs graficznyInterfejs = new GraficznyInterfejs();
			new GraficznyInterfejs().setVisible(true);

		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// System.out.println("Breakpoint po ActionEvent");
		panel.add(textpane);

		// System.out.println("listaCytatow.size() " + listaCytatow.size());
		if (e.getSource() == przycisk) {

			textpane.setText(listaCytatow.get(0));
			listaCytatow.remove(0);

			if (listaCytatow.size() == 0) {
				// System.out.println("Breakpoint po wyjsciu z petli");
				stworzOkienkoKoncowe();

			}

		}

	}
}

// ponizej kod zostawiony na pamiatke mojej gehenny :)
/*
 * int listacytatowsize = listaCytatow.size(); for (int i = 0; i <
 * listacytatowsize; i++) {
 * 
 * System.out.println("Obrot petli nr "+i);
 * textpane.setText(listaCytatow.get(0)); listaCytatow.remove(0);
 * System.out.println("tyle zostalo cytatow po usunieciu "+listaCytatow.size());
 * }
 */

// int Losowaliczba = (int) (Math.random() * KlasaListaCytatow.size());
// String losCytat = KlasaListaCytatow.get(Losowaliczba);

// panel.add(textpane);
// textpane.setText(losCytat);

// }
