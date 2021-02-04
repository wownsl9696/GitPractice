package Network;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClientEx {

	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		Socket socket = null;

		Scanner sc = new Scanner(System.in);
		try {
			socket = new Socket("localhost", 9999);
			// 클라이언트 소켓을 생성을 함 "loaclhost" 내 IP 주소
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while (true) {
				System.out.print("보내기>>");
				String outputMessage = sc.nextLine();
				if (outputMessage.equalsIgnoreCase("bye")) {
					out.write(outputMessage + "\n");
					out.flush();
					System.out.println("클라이언트에서 bye로 연결을 종료하였음.");
					break;
				}
				out.write(outputMessage + "\n");
				out.flush();
				String inputMessage = in.readLine();
				// in.readLine() 클라이언트에서  텍스트를 보내면 inputMessage에 저장.
				// readLine() 텍스트 한줄 받아오고,
				// inputMessage => 클라이언트가 보낸 메시지가 저장되어있음.
				System.out.println("서버: " + inputMessage);
				// 서버에서 받은 데이터를 한줄을 읽어서 콘솔창에 출력
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				sc.close();
				if (socket != null)
					socket.close();
			} catch (IOException e) {
				System.out.println("서버와 채팅 중 오류가 발생했습니다.");
			}
		}
	}
}