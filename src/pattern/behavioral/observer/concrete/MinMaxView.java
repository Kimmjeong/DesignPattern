package pattern.behavioral.observer.concrete;

import java.util.Collections;
import java.util.List;

import pattern.behavioral.observer.Observer;
import pattern.behavioral.observer.subject.ScoreRecored;

public class MinMaxView implements Observer {

	private ScoreRecored scoreRecord;
	
	public MinMaxView(ScoreRecored scoreRecord){
		this.scoreRecord=scoreRecord;
	}
	
	@Override
	public void update() {
		List<Integer> record = scoreRecord.getScoreRecord();
		displayMinMax(record);
	}

	private void displayMinMax(List<Integer> record) {
		int min=Collections.min(record, null);
		int max=Collections.max(record, null);
		System.out.println("Min: "+min+" Max: "+max);
	}

}
