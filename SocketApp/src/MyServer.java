import java.io.*;
import java.net.*;

public class MyServer {

	public static void main(String[] args) {
		try {
			
		
		ServerSocket serverConnect = new ServerSocket(8081);
		Socket recieveConnection = serverConnect.accept();
		DataInputStream inputmsg =new DataInputStream(recieveConnection.getInputStream());
		String strin_Inputmsg =(String)inputmsg.readUTF();
		System.out.println("Recieved message: " + strin_Inputmsg);
		serverConnect.close();
	}
		catch(Exception e) {System.out.println(e);}
	}

}
