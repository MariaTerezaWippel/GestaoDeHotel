

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import visao.PanelComBackgroundImage;

import javax.swing.JButton;
import javax.swing.JTextField;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());

		setContentPane(contentPane);
		
		
		BufferedImage bg = null;

		try {
		bg = ImageIO.read(new File("src/dog.jpg"));

		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}

		JPanel panel_2 = new PanelComBackgroundImage(bg);
		panel_2.setBackground(new Color(158, 184, 255));
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel_2.setLayout(new MigLayout("", "[][][][][][][][][][][][grow]", "[][][][][][][][]"));
		contentPane.add(panel_2, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("New button");
		panel_2.add(btnNewButton, "cell 5 3");
		
		JButton btnNewButton_1 = new JButton("New button");
		panel_2.add(btnNewButton_1, "cell 5 4 2 1");
		
		textField = new JTextField();
		panel_2.add(textField, "cell 11 7,growx");
		textField.setColumns(10);
		
	}

}
