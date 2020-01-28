/**
 * This version of dice demonstrates the game with the 
 * 6 dice images imported into a folder in the project
 * and then using getResource to display the dice images.
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class DiceGame extends JFrame
{
	private JPanel contentPane;
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					DiceGame frame = new DiceGame();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	public DiceGame()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 266, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label, BorderLayout.CENTER);
		JButton btnRoll = new JButton("Roll");
		contentPane.add(btnRoll, BorderLayout.SOUTH);
		rollDice(label, btnRoll);
	}

	private void rollDice(JLabel label, JButton btnRoll)
	{
		btnRoll.addActionListener(
		new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
				{
					Random rnd = new Random();
					int rand1 = 0;
					rand1 = rnd.nextInt(20) + 1; //adapted for 20 sided die
					label.setIcon(new ImageIcon(DiceGame.class.getResource("/images/die-" + rand1 + ".png")));
				}
			}
		);
	}
}
