package com.ucaizhi.nio;

public class TimeServer {
	public static void main(String[] args) {
		int port = 8080;
		if (args != null && args.length > 0) {
			try {
				port = Integer.valueOf(args[0]);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}
		MultipleexerTimeServer timeServer = new MultipleexerTimeServer(port);
		new Thread(timeServer, "NIO-MultplexerTimeServer-001").start();
	}
}
