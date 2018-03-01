
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Panneau extends JPanel implements MouseListener{
	private boolean enCours = false ;
	private int xDeb, yDeb, xFin, yFin ;
	private Color couleur ;
	
	
	public void paintComponent (Graphics g)
	 { super.paintComponent(g) ;
	 enCours = false ;
	 }
	public void setCoul(Color couleur)
	 { this.couleur = couleur ;
	 }
	public void nouvelleLigne()
	 { enCours = false ;
	 }
	public void efface ()
	 { repaint() ;
	 }
	public void mouseClicked (MouseEvent e)
	 { int xFin = e.getX() ; yFin = e.getY() ;
	 if (enCours) { Graphics g = getGraphics() ;
	 g.setColor (couleur) ;
	 g.drawLine (xDeb, yDeb, xFin, yFin) ;
	 g.dispose() ;
	 }
	 xDeb = xFin ; yDeb = yFin ;
	 enCours = true ;
	 }
	public void mousePressed (MouseEvent e) {}
	 public void mouseReleased (MouseEvent e) {}
	 public void mouseEntered (MouseEvent e) {}
	 public void mouseExited (MouseEvent e) {}
}
	 


