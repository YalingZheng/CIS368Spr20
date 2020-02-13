package SingletonDP;

public class SingletonGlobalSettings {
	
	private static SingletonGlobalSettings globalsettings = new SingletonGlobalSettings();
	
	private static String serverip = null;
	private String defaultIP = "172.168.1.1";
	private String defaultPrefixIP = "172.168.1.";
	
	private SingletonGlobalSettings() {
		if (serverip==null)
			serverip = defaultIP;
	}
	
	SingletonGlobalSettings(String ip){
		serverip = ip;
	}
	public synchronized static SingletonGlobalSettings getInstance() {
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
	public SingletonGlobalSettings clone() {
		//throw new CloneNotSupportedException(); 
		System.out.println("SingletonGlobalSettings does not support Clone method");
		return null;
	}
}
