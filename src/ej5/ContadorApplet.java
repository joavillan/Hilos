package ej5;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ContadorApplet extends Applet implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	class HiloContador extends Thread{
		
		boolean paro;
		long cont;
		
		HiloContador(long l){
			this.cont = l;
		}
		
		public void run() {
			paro=false;
			while (!paro) {
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				repaint();
				cont++;
			}
		}

		public void setParo(boolean paro) {
			this.paro = paro;
		}

		public long getCont() {
			return cont;
		}
	}
	
	private HiloContador h1=new HiloContador(100);
	private HiloContador h2=new HiloContador(28);
	private Font fuente;
	private Button b1,b2;
	
	public void start() {
		h1.start();
		h2.start();
	};

	public void init() {
		this.setSize(400, 200);
		setBackground(Color.yellow);
		add(b1=new Button("Finalizar hilo 1"));
		b1.addActionListener(this);
		add(b2=new Button("Finalizar hilo 2"));
		b2.addActionListener(this);
		fuente=new Font("Verdana",Font.BOLD,26);
	}


	public void paint(Graphics g) {
		g.clearRect(0, 0,400,400);
		g.setFont(fuente);
		g.drawString("Hilo 1: "+Long.toString((long)h1.getCont()),80,100);
		g.drawString("Hilo 2: "+Long.toString((long)h2.getCont()),80,150);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			b1.setLabel("Hilo 1 Finalizado");
			h1.interrupt();
		}else {
			b2.setLabel("Hilo 2 Finalizado");
			h2.interrupt();;		}
	}
	
	public void stop() {
		h1=null;
		h2=null;
	}

}
