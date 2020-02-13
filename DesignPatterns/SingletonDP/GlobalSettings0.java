package SingletonDP;

public class GlobalSettings0 {
	
	private String serverip;
	private String defaultIP = "172.168.1.1";
	private String defaultPrefixIP = "172.168.1.";
	
	GlobalSettings0() {
		this.serverip = defaultIP;
	}
	
	GlobalSettings0(String ip){
		this.serverip = ip;
	}
		
	public String getServerIP() {
		return serverip;
	}

	public void setServerIP(String ip) {
		serverip = ip;
	}
	
	public String getDefaultPrefixIP() {
		return defaultPrefixIP;
	}
}
