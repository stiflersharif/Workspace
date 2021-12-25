import java.io.*;
import java.net.*;
public class Client {

	public static void main(String[] args) {
		try {
			Socket client_Msg = new Socket("localhost",8081);
			DataOutputStream msg_Send = new DataOutputStream(client_Msg.getOutputStream());
			msg_Send.writeUTF(" this is sharif");
			msg_Send.flush();
			msg_Send.close();
			client_Msg.close();
		}catch (Exception e) {System.out.println(e);}

	}

}
