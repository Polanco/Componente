package Login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;




/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class LoginVentana extends javax.swing.JFrame {
	private JLabel UserName;
	private JTextField CampoUsuario;
	private JPasswordField CampoPassword;
	private JLabel JValidacion;
	private JButton jButtonPersonalizar;
	private JButton jButtonIniciar;
	private JLabel UserPassword;
	private LoginVentana DriverM;

	{
		try {
			javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				LoginVentana inst = new LoginVentana();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
				inst.setTitle("Login Service");
				
			}
		});
	}
	
	public LoginVentana() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setEnabled(false);
			getContentPane().add(getUserName());
			getContentPane().add(getUserPassword());
			getContentPane().add(getCampoUsuario());
			getContentPane().add(getCampoPassword());
			getContentPane().add(getJButtonIniciar());
			getContentPane().add(getJButtonPersonalizar());
			getContentPane().add(getJValidacion());
			pack();
			this.setSize(276, 209);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private JLabel getUserName() {
		if(UserName == null) {
			UserName = new JLabel();
			UserName.setText("Usuario:");
			UserName.setBounds(23, 51, 40, 14);
		}
		return UserName;
	}
	
	private JLabel getUserPassword() {
		if(UserPassword == null) {
			UserPassword = new JLabel();
			UserPassword.setText("Password:");
			UserPassword.setBounds(23, 85, 50, 14);
		}
		return UserPassword;
	}
	
	private JTextField getCampoUsuario() {
		if(CampoUsuario == null) {
			CampoUsuario = new JTextField();
			CampoUsuario.setBounds(85, 48, 112, 23);
		}
		return CampoUsuario;
	}
	
	private JPasswordField getCampoPassword() {
		if(CampoPassword == null) {
			CampoPassword = new JPasswordField();
			CampoPassword.setBounds(85, 82, 112, 22);
		}
		return CampoPassword;
	}
	
	private JButton getJButtonIniciar() {
		if(jButtonIniciar == null) {
			jButtonIniciar = new JButton();
			jButtonIniciar.setText("Iniciar");
			jButtonIniciar.setBounds(33, 123, 61, 23);
			jButtonIniciar.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent rp){
					if(getCampoUsuario().getText().isEmpty()){ 
						JOptionPane.showMessageDialog(null, "Usuario o Contraseña Invalida");
						
					}
					else{
						{
							
							Welcome wel = new Welcome();
							wel.setVisible(true);
							dispose();
						}
					
					}

					
					}	});
		}
		return jButtonIniciar;
	}


	
	private JButton getJButtonPersonalizar() {
		if(jButtonPersonalizar == null) {
			jButtonPersonalizar = new JButton();
			jButtonPersonalizar.setText("Personalizar");
			jButtonPersonalizar.setBounds(109, 123, 91, 23);
		}
		return jButtonPersonalizar;
	}
	
	private JLabel getJValidacion() {
		if(JValidacion == null) {
			JValidacion = new JLabel();
			JValidacion.setText("Bienvenido");
			JValidacion.setBounds(0, 0, 260, 23);
			JValidacion.setBorder(BorderFactory.createTitledBorder(""));
			JValidacion.setHorizontalTextPosition(SwingConstants.CENTER);
			JValidacion.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return JValidacion;
	}

}
