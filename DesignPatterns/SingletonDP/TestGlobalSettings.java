package SingletonDP;

import java.util.ArrayList;

public class TestGlobalSettings {
	private static ArrayList<Thread> arrThreads = new ArrayList<Thread>();
	public static void main(String[] args) {

		 
		// random wait for a time
		Agent[] agents = new Agent[10];
		for (int i = 0; i < 9; i++) {
			agents[i] = new Agent(i);
			 arrThreads.add(agents[i]);
		}

		for (int i = 0; i < 9; i++) {
			agents[i].start();
		}
		
		for (int i = 0; i < arrThreads.size(); i++){
         	   try {
				arrThreads.get(i).join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // end of try
       		 } // end of for 
		
		SingletonGlobalSettings gs = SingletonGlobalSettings.getInstance();
		SingletonGlobalSettings gs2 = gs.clone();
		System.out.println("The cloned SingletonGlobalSettings is " + gs2);
		

	}
}
