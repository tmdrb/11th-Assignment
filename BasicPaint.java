import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BasicPaint {
	    public static void main(String[] args) {
		JFrame f = new JFrame("그래픽 기초 프로그램");
		
		f.add(new MyPanel());
		f.setSize(1200, 600);
		f.setVisible(true);
	}

	
}
  
class MyPanel extends JPanel {
	    public MyPanel() {
		setBorder(BorderFactory.createLineBorder(Color.black));
		
	
	    }
  
	    protected void paintComponent(Graphics g) {
	    	String[] labels = {"drawLine","drawRect","draw3DRect","drawRoundRect","drawOval","drawArc","drawPolygon",
			           "drawPolyline","fillRect","fill3DRect","fillRoundrect","fillOval","fillArc","fillPolygon"};
	    	super.paintComponent(g);
	    	for(int i=0;i<7;i++)
	    		g.drawString(labels[i],i*150,230);
	    	for(int i=7;i<14;i++)
	    		g.drawString(labels[i], (i-7)*150, 450);
		
	g.drawLine(0, 50, 100, 150);
	g.drawRect(150, 50, 100, 100);
	g.draw3DRect(300, 50, 100, 100, true);
	g.drawRoundRect(450, 50, 100, 100, 20, 20);
	g.drawOval(600, 50, 100, 100);
	g.drawArc(750, 50, 100, 100, 20,150);
	int[] xpoints = {900,1000,900,1000};
	int[] ypoints = {50,50,150,150};
	int[] xpoints2 = {0,100,0,100};
	int[] ypoints2 = {300,400,400,300};
	int[] xpoints1 = {900,1000,900,1000};
	int[] ypoints1 = {300,300,400,400};
	g.drawPolygon(xpoints ,ypoints , 4);
	g.drawPolyline(xpoints2, ypoints2, 4);
	g.fillRect(150, 300, 100, 100);
	g.fill3DRect(300, 300, 100, 100, true);
	g.fillRoundRect(450, 300, 100,100,20,20);
	g.fillOval(600, 300, 100, 100);
	g.fillArc(750, 300, 100, 100 ,20,150);	
	g.fillPolygon(xpoints1,ypoints1,4);
	}
}
