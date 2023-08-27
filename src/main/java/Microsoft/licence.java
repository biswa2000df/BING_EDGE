package Microsoft;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class licence {

	public static void main(String[] args) throws ParseException, UnknownHostException, SocketException {

		InetAddress localHost = InetAddress.getLocalHost();
		NetworkInterface networkInterface = NetworkInterface.getByInetAddress(localHost);

		byte[] macAddressBytes = networkInterface.getHardwareAddress();

		// Convert MAC address bytes to a human-readable string
		StringBuilder macAddressBuilder = new StringBuilder();
		for (byte b : macAddressBytes) {
			macAddressBuilder.append(String.format("%02X:", b));
		}
		String macAddress = macAddressBuilder.toString();
		if (macAddress.length() > 0) {
			macAddress = macAddress.substring(0, macAddress.length() - 1).replaceAll(":", "");
		}

		System.out.println("MAC Address: " + macAddress);

		Boolean validateMac = validatemacid(macAddress);

		Date dt = new Date();
		System.out.println(dt);
		SimpleDateFormat smdt = new SimpleDateFormat("dd/MM/yyyy");
		String sDate1 = "25/08/2023";
		Date date1 = smdt.parse(sDate1);
		if (dt.before(date1) && validateMac == true) {
			System.out.println("Biswajit Scriptless Automation Tool is a node based License.");
			System.out.println("Your License Validity is till " + sDate1);

		} else {
			JFrame parent = new JFrame();
			JOptionPane.showMessageDialog(parent, "License is not valid,please contact Biswajit");
			System.exit(1);
		}

	}

	public static boolean validatemacid(String SystemMac) {
		
		List<String> al=new ArrayList<String>();
		al.add("112233445566");
		al.add("AABBCCDDEEFF");
		al.add("998877665544");
		al.add("5CBAEF2C3B23");
		
//		String mac = "112233445566,AABBCCDDEEFF,998877665544,5CBAEF2C3B23";
		String macId = SystemMac;
//		String[] check = mac.split(",");
//		for (String s1 : check) {
//			if (s1.equalsIgnoreCase(macId)) {
//				return true;
//			}
//		}
		
		for(int i=0;i<al.size();i++) {
			if(al.get(i).equalsIgnoreCase(macId)) {
				return true;
			}
		}
		JFrame parent = new JFrame();
		JOptionPane.showMessageDialog(parent,
				"You are not licensed for this Framework ! \n please contact Biswajit");
		System.exit(1);
		return false;
	}

}
