import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class Tela extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton Botao = new JButton();
	JButton Botao2 = new JButton();
	
	
	Tela(){
		//tela
        this.setVisible(true);
        this.setSize(1000,1500);
        this.setTitle("Inicio");
        
        ImageIcon icone = new ImageIcon("download.png");
        this.setIconImage(icone.getImage());
        
        Color cor = new Color(240,248,255);
        this.getContentPane().setBackground(cor);
        
        this.setLayout(null);
        
        
        //botao
        this.add(Botao);
        Botao.setSize(100,50);
        Botao.setText("Azul");
        Botao.addActionListener(this);
        Botao.setLocation(200,0);
        
        
        
    	
    	
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		Color cor = new Color(176,224,230);
        this.getContentPane().setBackground(cor);
	}
}
