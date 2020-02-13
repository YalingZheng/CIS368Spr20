package SingletonDP;

public class LazySingletonGlobalSettings {
	
	private static LazySingletonGlobalSettings globalsettings;
	
	private static String serverip = null;
	private String defaultIP = "172.168.1.1";
	private String defaultPrefixIP = "172.168.1.";
	
	private LazySingletonGlobalSettings() {
		if (serverip==null)
			serverip = defaultIP;
	}
	
	LazySingletonGlobalSettings(String ip){
		serverip = ip;
	}
	public synchronized static LazySingletonGlobalSettings getInstance() {
		if (globalsettings==null)
			return new LazySingletonGlobalSettings();
		return globalsettings;
	}
	
	public synchronized static String getServerIP() {
		return serverip;
	}

	public void setServerIP(String ip) {
		serverip = ip;
	}
	
	public String getDefaultPrefixIP() {
		return defaultPrefixIP;
	}
	
	@Override
	public LazySingletonGlobalSettings clone() {
		//throw new CloneNotSupportedException(); 
		System.out.println("SingletonGlobalSettings does not support Clone method");
		return null;
	}
}
