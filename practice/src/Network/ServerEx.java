package Network;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ServerEx {

	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket = null;

		Scanner sc = new Scanner(System.in);
		try {
			listener = new ServerSocket(9999); // 서버 소켓 생성
			System.out.println("연결을 기다리고 있습니다....");
			socket = listener.accept();
			// 클라이언트로부터 연결 요청 대기
			// 서버를 열어놓고 대기중 - 클라이언트가 접속이되면 아래 명령문 실행
			// 클라이언트 접속시 서버에 소켓 생성후 socket에 변수대입.
			System.out.println("연결되었습니다.");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			// 서버의 입력과 출력을 위해서 BufferReader, BufferWriter의 객체를 생성.
			// X(크로스)로 연결.
			while (true) {
				String inputMessage = in.readLine();
				if (inputMessage.equalsIgnoreCase("bye")) {
					System.out.println("클라이언트에서 bye로 연결을 종료하였음.");
					break;
				}
				System.out.println("클라이언트: " + inputMessage);
				System.out.print("보내기>>");
				String outputMessage = sc.nextLine();
				// 다음 입력 데이터를 문자열로 저장
				out.write(outputMessage + "\n");
				// Writer
				out.flush();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				sc.close();
				socket.close();
				listener.close();
			} catch (IOException e) {
				System.out.println("클라이언트와 채팅 중 오류가 발생했습니다.");
			}
		}
	}
}