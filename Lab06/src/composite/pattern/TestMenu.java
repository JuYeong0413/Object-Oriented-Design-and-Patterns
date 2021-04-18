// 2016111540 이주영

package composite.pattern;
import java.awt.BorderLayout;
import javax.swing.*;

public class TestMenu extends JFrame {
	
	TestMenu() {
		JPanel southPanel = new JPanel();
		southPanel.add(new JLabel("2016111540 이주영"));
		add(southPanel, BorderLayout.SOUTH);
		
		setTitle("JMenu, JMenuItem Example");
		createMenu();
		setSize(400,250);
		setVisible(true);
	}

	void createMenu() {
		JMenuBar menuBar = new JMenuBar(); 
		JMenu firstMenu = new JMenu("Menu 1");
		JMenu secondMenu = new JMenu("Menu 2");
		
		firstMenu.add(new JMenuItem("MenuItem 1"));
		firstMenu.add(new JMenuItem("MenuItem 2"));
		
		JMenu subMenu = new JMenu("SubMenu");
		firstMenu.add(subMenu);
		subMenu.add(new JMenuItem("SubMenu MenuItem 1"));
		subMenu.add(new JMenuItem("SubMenu MenuItem 2"));
		
		secondMenu.add(new JMenuItem("MenuItem 1"));
		secondMenu.add(new JMenuItem("MenuItem 2"));

		menuBar.add(firstMenu);
		menuBar.add(secondMenu);
		setJMenuBar(menuBar);
	}

	public static void main(String[] args) {
		new TestMenu();
	}

}
