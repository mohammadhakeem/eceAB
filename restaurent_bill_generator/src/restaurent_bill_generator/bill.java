package restaurent_bill_generator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bill {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bill window = new bill();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public bill() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBounds(100, 100, 739, 452);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.CYAN);
		lblNewLabel.setBounds(276, 24, 121, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Restro BILL");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setBounds(265, 24, 132, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Menu");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(59, 106, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Qnty");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(59, 155, 46, 26);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox c1 = new JComboBox();
		c1.setFont(new Font("Tahoma", Font.BOLD, 15));
		c1.setModel(new DefaultComboBoxModel(new String[] {"select", "tea-10", "puri-20", "idly-30", "dosa-40", "vada-50"}));
		c1.setBounds(157, 104, 97, 22);
		frame.getContentPane().add(c1);
		
		JButton btnNewButton = new JButton("ok");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String item=(String) c1.getSelectedItem();
				String qnty=t1.getText();
				int q=Integer.parseInt(qnty);
				int bill=0;
				if(item.equals("tea-10"))
				{
					bill=q*10;
					JOptionPane.showMessageDialog(btnNewButton, "hello\n Selected item:"+item+"\n qnty: "+q+"\n your bill:" +bill);
				}
				else if(item.equals("puri-20")) {
					bill=q*20;
					JOptionPane.showMessageDialog(btnNewButton, "hello\n Selected item:"+item+"\n qnty: "+q+"\n your bill:" +bill);
				}
				else if(item.equals("idly-30")) {
					bill=q*30;
					JOptionPane.showMessageDialog(btnNewButton, "hello\n Selected item:"+item+"\n qnty: "+q+"\n your bill:" +bill);
				}
				else if(item.equals("dosa-10")) {
					bill=q*40;
					JOptionPane.showMessageDialog(btnNewButton, "hello\n Selected item:"+item+"\n qnty: "+q+"\n your bill:" +bill);
				}
				else if(item.equals("vada-50")) {
					bill=q*50;
					JOptionPane.showMessageDialog(btnNewButton, "hello\n Selected item:"+item+"\n qnty: "+q+"\n your bill:" +bill);
				}
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.ITALIC, 15));
		btnNewButton.setBounds(215, 242, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		t1 = new JTextField();
		t1.setBounds(157, 160, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
	}
}
