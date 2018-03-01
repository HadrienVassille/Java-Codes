
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MaFenetre extends JFrame implements ActionListener {
	public static Color[] couleurs = {Color.yellow, Color.red, Color.blue, Color.green, Color.black, Color.cyan} ;
	private Panneau pan ;
	private JButton boutNouv, boutEff, boutCoul ;
	private int numCoul = 0 ;
	
	public MaFenetre(){
	
	setTitle ("Ardoise Magique");
	setSize ( 400,180);
	Container contenu = getContentPane();
	
	pan = new Panneau ();
	pan.addMouseListener (pan);
	contenu.add(pan);
	
	boutNouv = new JButton ("Nouvelle ligne") ;
	contenu.add(boutNouv, "North") ;
	boutNouv.addActionListener (this) ;
	
	boutEff = new JButton ("Effacer") ;
	contenu.add(boutEff, "South") ;
	boutEff.addActionListener (this) ;
	
	boutCoul = new JButton ("") ;
	contenu.add(boutCoul, "West") ;
	boutCoul.addActionListener (this) ;
	boutCoul.setBackground (couleurs[numCoul]) ;
	pan.setCoul (couleurs[numCoul]) ;
	}
	
	public void actionPerformed (ActionEvent e){
		if(e.getSource()== boutCoul){
			numCoul++;
			if (numCoul >= couleurs.length) numCoul = 0 ;
			boutCoul.setBackground (couleurs[numCoul]) ;
			pan.setCoul (couleurs[numCoul]) ;
		}
		if(e.getSource()== boutNouv){
			pan.nouvelleLigne();
		}
		if(e.getSource()== boutEff){
			pan.efface();
		}
		
		
		
		}
	}


