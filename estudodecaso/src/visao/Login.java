package visao;

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
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class Login extends JFrame {

	private JPanel contentPane;

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
		setBounds(100, 100, 324, 300);
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());

		setContentPane(contentPane);
		
		
		BufferedImage bg = null;

		try {
		bg = ImageIO.read(new File("src/imagens/Cópia de Boulervard.jpg"));

		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}

		JPanel panel_2 = new PanelComBackgroundImage(bg);
		panel_2.setBackground(new Color(158, 184, 255));
		contentPane.setLayout(new BorderLayout(0, 0));
		panel_2.setLayout(new MigLayout("", "[25px][200px,grow][200px,grow][25px]", "[50px][60px][60px][][][30px]"));

		//panel_2.setLayout(new MigLayout("", "[][][][][]", "[][][][][]"));
		contentPane.add(panel_2, BorderLayout.CENTER);
		
		
		
	

		
		BufferedImage bg2 = null;

		try {
		bg2 = ImageIO.read(new File("src/imagens/Titulohotel.jpg"));

		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}

		JPanel panel_3 = new PanelComBackgroundImage(bg2);
		panel_3.setBackground(new Color(158, 184, 255));
		//contentPane.add(panel_3, BorderLayout.CENTER);
		panel_2.add(panel_3, "cell 1 1 1 2,grow");
		panel_3.setLayout(new FlowLayout());
	}
}
