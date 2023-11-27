import java.net.*; class UDPServer{
public static void	main(String[] args) throws Exception{ byte buﬀ[]=new byte[1024];
DatagramSocket ds =new DatagramSocket(8088); DatagramPacket p=new DatagramPacket(buﬀ,buﬀ.length);
System.out.println("Server ready :"); ds.receive(p);
String msg = new String( p.getData(),0,p.getLength()).trim();
String str = "Hello "+new String(buﬀ); buﬀ = str.getBytes();
ds.send(new DatagramPacket(buﬀ,buﬀ.length,InetAddress.getLocalHost(),8089));
System.out.println("Msg received "+msg);
}
}
