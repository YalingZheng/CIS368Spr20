package SingletonDP;

public class GlobalSettings {
	private static String serverip;
	private static String defaultIP = "172.168.1.1";
	private static String defaultPrefixIP = "172.168.1.";
	
	GlobalSettings(){
		GlobalSettings.serverip = defaultIP;
	}
	
	GlobalSettings(String ip){
		serverip = ip;
	}
	
	public static String getServerIP() {
		return serverip;
	}

	public synchronized static void setServerIP(String ip) {
		serverip = ip;
	}
	
	public static String getDefaultPrefixIP() {
		return defaultPrefixIP;
	}
}
