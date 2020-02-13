package PrototypeDesignPattern;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PrototypeScore implements Cloneable {

		private ArrayList<Integer> scoreList;
		Random r = new Random();
		
		public PrototypeScore(){
			scoreList = new ArrayList<Integer>();
		}
		
		public PrototypeScore(ArrayList<Integer> list){
			this.scoreList=list;
		}
		
		public void loadData(){
			//read all employees from database and put into the list
			for (int i=0; i<100000; i++) {
				scoreList.add(r.nextInt(100));
			}
			Collections.sort(scoreList);
		}
		
		public void removeLowestScore() {
			this.scoreList.remove(0);
		}
		
		public void removeHighestScore() {
			int numscores = scoreList.size();
			this.scoreList.remove(numscores-1);
		}
		
		
		public void removeLowestScore(int num) {
			for (int i=0; i<num;i++)
				this.scoreList.remove(0);
		}
		
		public void removeHighestScore(int num) {
			for (int i=0; i<num;i++) {
				int numscores = scoreList.size();
				this.scoreList.remove(numscores-1);
			}
		}
		
		
		public ArrayList<Integer> getScoreList() {
			return scoreList;
		}

		@Override
		public Object clone() throws CloneNotSupportedException{
				ArrayList<Integer> temp = new ArrayList<Integer>();
				for(Integer s : this.getScoreList()){
					temp.add(s);
				}
				return new PrototypeScore(temp);
		}
		
		public BigDecimal getAverage() {
			BigDecimal bd = new BigDecimal(0);
			bd.setScale(10);
			int numscore = scoreList.size();
			BigDecimal bdnumscore = new BigDecimal(scoreList.size());
			bdnumscore.setScale(2);
			for (int i=0; i<numscore;i++) {
				bd = bd.add(new BigDecimal(scoreList.get(i)));
			}
			BigDecimal result = bd.divide(bdnumscore,2, RoundingMode.HALF_UP);
			return result;
		}
		

}
