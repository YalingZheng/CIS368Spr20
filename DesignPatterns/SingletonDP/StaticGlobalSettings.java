package SingletonDP;

public class StaticGlobalSettings {
	private static String serverip;
	private static String defaultIP = "172.168.1.1";
	private static String defaultPrefixIP = "172.168.1.";
	
	StaticGlobalSettings(){
		StaticGlobalSettings.serverip = defaultIP;
	}
	
	StaticGlobalSettings(String ip){
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
