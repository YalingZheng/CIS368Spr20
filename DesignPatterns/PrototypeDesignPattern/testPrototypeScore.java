package PrototypeDesignPattern;

public class testPrototypeScore {
	public static void main(String[] args) {
		PrototypeScore ps = new PrototypeScore();
		ps.loadData();
		
		try {
			PrototypeScore psclone1 = (PrototypeScore) ps.clone();
			PrototypeScore psclone2 = (PrototypeScore) ps.clone();			
			
			System.out.println("Originalscore average " + ps.getAverage());
			
			psclone1.removeLowestScore(100);
			System.out.println("After removing lowest 100 scores,  average " + psclone1.getAverage());
			
			psclone2.removeHighestScore(100);
			System.out.println("After removing Highest 100 scores, average " + psclone2.getAverage());
			
		} catch (CloneNotSupportedException e) {			
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
