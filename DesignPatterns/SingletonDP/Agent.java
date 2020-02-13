package SingletonDP;

import java.util.Random;

public class Agent extends Thread {
	public int id;
	
	Agent(){
		this.id = 0;
	}
	Agent(int id){
		this.id = id;
	}

	public void run(){ 
		Random r = new Random();
		try {
			Thread.sleep(r.nextInt(100));
			System.out.println();
			System.out.println("*************************************");
			// change the setting method 0 - NOT a singleton
			GlobalSettings0 gs0 = new GlobalSettings0();
			gs0.setServerIP(gs0.getDefaultPrefixIP() + this.id);
			System.out.println("Regular GlobalSettings CHANGE Server IP to " + gs0.getServerIP());	
			
			// change the setting method 1 - a singleton in which all data fields and methods are static
			GlobalSettings.setServerIP(GlobalSettings.getDefaultPrefixIP() + this.id);
			System.out.println("Static Data Fields and Methods CHANGE Server IP to " + GlobalSettings.getServerIP());
			
			// change the setting method 2 - a singleton in which only single instance is allowed.
			SingletonGlobalSettings gs2 = SingletonGlobalSettings.getInstance();
			gs2.setServerIP(gs2.getDefaultPrefixIP() + this.id);			
			System.out.println("Singleton Design Pattern CHANGE Server IP to " + SingletonGlobalSettings.getServerIP());			
			// change the setting method 2 - a singleton in which only single instance is allowed.
			LazySingletonGlobalSettings lazygs2 = LazySingletonGlobalSettings.getInstance();
			lazygs2.setServerIP(lazygs2.getDefaultPrefixIP() + this.id);			
			System.out.println("Lazy Singleton Design Pattern CHANGE Server IP to " + LazySingletonGlobalSettings.getServerIP());			
				
			
			System.out.println("-----------------------------------");
			
			GlobalSettings0 g0 = new GlobalSettings0();
			System.out.println("Regular GlobalSettings get - Server IP is " + g0.getServerIP());
			System.out.println("Static Data Fields and Methods get - Server IP is " + GlobalSettings.getServerIP());			
			//SingletonGlobalSettings g2 = SingletonGlobalSettings.getInstance();
			System.out.println("Singleton Design Pattern get - Server IP is " + SingletonGlobalSettings.getServerIP());
			System.out.println("*************************************");
			System.out.println();
			
			System.out.println("Lazy Singleton Design Pattern get - Server IP is " + LazySingletonGlobalSettings.getServerIP());
			System.out.println("*************************************");
			System.out.println();
		}
		catch (InterruptedException e) {
			System.out.println("Thread sleep interrupted. " + e.toString());
		}
	} 
}
