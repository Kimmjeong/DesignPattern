package pattern.behavioral.observer.concrete;

import java.util.List;

import pattern.behavioral.observer.Observer;
import pattern.behavioral.observer.subject.ScoreRecored;

public class DataSheetView implements Observer {
	private ScoreRecored scoreRecord;
	private int viewCount;
	
	public DataSheetView(ScoreRecored scoreRecord, int viewCount) {
		this.scoreRecord=scoreRecord;
		this.viewCount=viewCount;
	}
	
	@Override
	public void update() {
		List<Integer> record=scoreRecord.getScoreRecord();
		displayScores(record, viewCount);
	}
	
	private void displayScores(List<Integer> record, int viewCount){
		System.out.println("List of "+viewCount+" entries: ");
		for(int i=0;i<viewCount && i<record.size();i++){
			System.out.println(record.get(i)+" ");
		}
		System.out.println();
	}

}
