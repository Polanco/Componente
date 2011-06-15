package Login;
import javax.swing.JLabel;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;
import javax.swing.JOptionPane;

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
public class Welcome extends javax.swing.JFrame {
	private JLabel MensajeError;

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}


	
	public Welcome() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			pack();
			setSize(400, 300);
			setTitle("Bienvenido al Sistema");
			getContentPane().add(getMensajeError());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private JLabel getMensajeError() {
		if(MensajeError == null) {
			MensajeError = new JLabel();
			MensajeError.setText("Mensaje de Error:");
			MensajeError.setBounds(10, 32, 86, 14);
		}
		return MensajeError;
	}
	


	public boolean validar(Object DB,String user,String password) {
	// TODO Auto-generated method stub
	return false;
	}



	
}
