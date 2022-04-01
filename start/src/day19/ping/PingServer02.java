package day19.ping;

import java.io.*;
import java.net.*;

public class PingServer02 extends Thread {
	private boolean isStart = true;
	private ServerSocket server;
	private Socket socket;
	private InputStream in;
	private OutputStream out;
	
	
	public boolean isStart() {
		return isStart;
	}
	public void setStart(boolean isStart) {
		this.isStart = isStart;
	}
	public ServerSocket getServer() {
		return server;
	}
	public void setServer(ServerSocket server) {
		this.server = server;
	}
	public Socket getSocket() {
		return socket;
	}
	public void setSocket(Socket socket) {
		this.socket = socket;
	}
	
	public void run() {
		try {
			server = new ServerSocket(7777);
			System.out.println("### Server start ###");
			
			while(isStart) {				
				// 클라이언트에게 접속 허용
				Socket socket = server.accept();
				String ip = socket.getInetAddress().getHostAddress();
				System.out.println("### " + ip + " ] 접속 완료");
				
				// 데이터 입출력 준비
				in = socket.getInputStream();
				out = socket.getOutputStream();
				
				// 데이터 받고
				byte[] buff = new byte[10240];
				int len = in.read(buff);
				// 문자열 변환
				String msg = new String(buff, 0, len);
				// 출력
				System.out.println(ip + " : " + msg);
				
				// 응답 메세지
				buff = new String("re ] " + msg).getBytes();
				// out 으로 흘려보냄
				out.write(buff);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				server.close();
				socket.close();
				out.close();
				in.close();
			} catch (Exception e) {}
		}
		
		System.out.println("***** 서버 프로그램 종료 *****");
	}

}
