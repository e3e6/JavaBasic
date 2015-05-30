package com.sourceit.java.basic.lesson16;

import javax.swing.JFrame;

public class ThreadsGuiExample extends JFrame {

	public ThreadsGuiExample() {
		super("Threads Gui Example");
		setSize(200, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new ThreadsGuiExample().setVisible(true);
	}

}
