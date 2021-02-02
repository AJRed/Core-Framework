package com.loader.openrsc.frame;

import com.loader.openrsc.Constants;
import com.loader.openrsc.Settings;
import com.loader.openrsc.frame.elements.*;
import com.loader.openrsc.frame.listeners.PositionListener;
import com.loader.openrsc.util.Utils;

import javax.swing.*;
import java.awt.*;

public class AppFrame extends JFrame {
	private static AppFrame instance;
	private JLabel bg;
	private JLabel logo;
	private JProgressBar progress;

	private CheckCombo comboBox;
	private LaunchButton launch1;
	private LaunchButton launch2;
	private LaunchButton launch3;
	private LaunchButton launch4;
	private LaunchButton launch5;

	private final int launch_button_y = 218;
	private final int link_button_y = 359;

	public AppFrame() {
		this.setPreferredSize(new Dimension(795, 555));
		this.setUndecorated(true);
		this.setTitle(Constants.Title);
		this.setIconImage(Utils.getImage("icon.png").getImage());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AppFrame.instance = this;
	}

	public static AppFrame get() {
		return AppFrame.instance;
	}

	public void build() {
		(this.bg = new JLabel(Utils.getImage("background.png"))).setBounds(0, 0, 800, 560);
		this.add(this.bg);
		(this.logo = new JLabel(Utils.getImage("openrsc_sword_logo.png"))).setBounds(265, 86, 277, 100);
		this.bg.add(this.logo);
		this.addGameSelection();
		this.addButtons();
		this.addMouseListener(new PositionListener(this));
		this.addMouseMotionListener(new PositionListener(this));
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	public void setDownloadProgress(String f, float percent) {
		if (percent >= 90) this.progress.setForeground(new Color(0, 153, 0));
		else if (percent >= 80 && percent < 90) this.progress.setForeground(new Color(91, 153, 0));
		else if (percent >= 70 && percent < 80) this.progress.setForeground(new Color(130, 153, 0));
		else if (percent >= 60 && percent < 70) this.progress.setForeground(new Color(153, 147, 0));
		else if (percent >= 50 && percent < 60) this.progress.setForeground(new Color(153, 122, 0));
		else if (percent >= 40 && percent < 50) this.progress.setForeground(new Color(153, 102, 0));
		else if (percent >= 30 && percent < 40) this.progress.setForeground(new Color(153, 63, 0));
		else if (percent >= 20 && percent < 30) this.progress.setForeground(new Color(153, 43, 0));
		else this.progress.setForeground(new Color(153, 0, 0));
		this.progress.setValue((int) percent);
		this.progress.setString(f + " - " + (int) percent + "%");
		this.progress.repaint();
	}

	public void addButtons() {
		// Link button size
		int link_button_width = 130;
		int link_button_height = 74;

		// Link buttons
		final String BUTTON1 = "Discord";
		this.bg.add(new LinkButton(BUTTON1, new Rectangle(101, link_button_y, link_button_width, link_button_height)));

		final String BUTTON2 = "Bug Reports";
		this.bg.add(new LinkButton(BUTTON2, new Rectangle(256, link_button_y, link_button_width, link_button_height)));

		final String BUTTON3 = "Our Wiki";
		this.bg.add(new LinkButton(BUTTON3, new Rectangle(414, link_button_y, link_button_width, link_button_height)));

		final String BUTTON4 = "RSC Wiki";
		this.bg.add(new LinkButton(BUTTON4, new Rectangle(567, link_button_y, link_button_width, link_button_height)));

		// Launch Server's Client buttons
		addServerButtons();

		// Control button size
		int control_button_width = 10;
		int control_button_height = 11;

		// Control buttons
		this.bg.add(new ControlButton(1, 695, 60, control_button_width, control_button_height)); // Minimize button
		this.bg.add(new ControlButton(2, 715, 60, control_button_width, control_button_height)); // Exit button
		this.bg.add(new ControlButton(3, 670, 488, 15, 15)); // Delete cache button

		int robotCheckboxX = 690;
		int robotCheckboxY = 438;
		CheckboxButton robotCheckbox = new CheckboxButton("", new Rectangle(robotCheckboxX,robotCheckboxY, 50,25));
		robotCheckbox.setSelected(Settings.showBotButtons);
		this.bg.add(robotCheckbox);
		(this.logo = new JLabel(Utils.getImage("robot.png"))).setBounds(robotCheckboxX + 20, robotCheckboxY, 25, 25);
		this.bg.add(this.logo);

	}

	private void addGameSelection() {
		// Version text
		/*JLabel subText; // Disabled unless needed for debugging purposes
		(subText = new JLabel("Version " + String.format("%8.6f", Constants.VERSION_NUMBER))).setBounds(630, 39, 170, 15);
		subText.setForeground(new Color(255, 255, 255, 220));
		subText.setFont(Utils.getFont("Helvetica.otf", 1, 10.0f));
		this.bg.add(subText);*/

		comboBox = new CheckCombo();
		//comboBox.combo.setBounds(585, 132, 150, 30);

		this.bg.add(comboBox.combo);
		(this.progress = new JProgressBar(0, 100)).setBounds(125, 488, 540, 18);
		this.progress.setBackground(new Color(45, 46, 42));
		this.progress.setOpaque(true);
		this.progress.setStringPainted(true);
		this.progress.setBorderPainted(false);
		this.bg.add(this.progress);
	}

	public void toggleBotServers() {
		if (Settings.showBotButtons) {
			this.bg.remove(this.launch1);
			this.bg.remove(this.launch2);
		} else {
			this.bg.remove(this.launch1);
			this.bg.remove(this.launch2);
			this.bg.remove(this.launch4);
			this.bg.remove(this.launch5);
		}
		addServerButtons();
		Settings.saveSettings();
	}

	private void addServerButtons() {
		int openrsc_x = 0;
		int cabbage_x = 0;
		int uranium_x = 0;
		int coleslaw_x = 0;

		// Launch button size
		int launch_button_width = 100;
		int launch_button_height = 100;

		// Launch buttons
		String preservation = "preservation";
		//(this.launch4 = new LaunchButton(openpk)).setBounds(preservation_x, 209, launch_button_width, launch_button_height);
		//this.bg.add(this.launch4);

		if (Settings.showBotButtons) {
			openrsc_x = 165;
			cabbage_x = 295;
			uranium_x = 420;
			coleslaw_x = 535;
		} else {
			openrsc_x = 230;
			cabbage_x = 477;
		}

		String openrsc = "openrsc";
		(this.launch1 = new LaunchButton(openrsc)).setBounds(openrsc_x, launch_button_y, launch_button_width, launch_button_height);
		this.bg.add(this.launch1);

		String cabbage = "cabbage";
		(this.launch2 = new LaunchButton(cabbage)).setBounds(cabbage_x, launch_button_y - 3, launch_button_width, launch_button_height);
		this.bg.add(this.launch2);

		if (Settings.showBotButtons) {
			String uranium = "uranium";
			(this.launch4 = new LaunchButton(uranium)).setBounds(uranium_x, launch_button_y, launch_button_width, launch_button_height);
			this.bg.add(this.launch4);

			String coleslaw = "coleslaw";
			(this.launch5 = new LaunchButton(coleslaw)).setBounds(coleslaw_x, launch_button_y, launch_button_width, launch_button_height);
			this.bg.add(this.launch5);
		}
		this.bg.repaint();
	}

	public JProgressBar getProgress() {
		return this.progress;
	}

	public LaunchButton getLaunchopenrsc() {
		return this.launch1;
	}

	public LaunchButton getLaunchcabbage() {
		return this.launch2;
	}

	public LaunchButton getLaunchuranium() {
		return this.launch4;
	}

	public LaunchButton getLaunchcoleslaw() {
		return this.launch5;
	}

	// Spritepack combobox
	public CheckCombo getSpriteCombo() {
		return this.comboBox;
	}

	public CheckCombo.store[] getComboBoxState() {
		int entryCount = comboBox.combo.getItemCount();
		CheckCombo.store[] items = new CheckCombo.store[entryCount];
		JComboBox entry = comboBox.combo;
		for (int p = 0; p < entryCount; p++) {
			items[p] = (CheckCombo.store) entry.getItemAt(p);
		}

		return items;
	}
}
