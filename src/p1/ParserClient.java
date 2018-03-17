package p1;

import java.io.UnsupportedEncodingException;
import java.rmi.RemoteException;
import java.util.Base64;

public class ParserClient {

	public static String stringtoBase64(String stringtobase64string) throws RemoteException, UnsupportedEncodingException
	{
		if(stringtobase64string != null)
		{
			String asB64 = Base64.getEncoder().encodeToString(stringtobase64string.getBytes("utf-8"));
			return asB64;
		}
		return null;
	}
	public static String Base64toString(String stringformatbase64toString) throws RemoteException
	{
		if(stringformatbase64toString != null)
		{
		byte[] asBytes = Base64.getDecoder().decode(stringformatbase64toString);   
		String string = asBytes.toString();
		return string;
		}
		return null;
	}
}
