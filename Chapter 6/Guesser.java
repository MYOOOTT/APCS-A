
public class Guesser {
	private int guessedNum;
	private long startTime = 0;
	private long elapsedTime = 0;
	
    public Guesser() {
    	 guessedNum = 0;
     }
    
    public int guess() {
    	int d = (int) (Math.random() * 100);
        guessedNum = (int)(d + 1);
        return guessedNum;
    }
    
    public void startTimer(){
    	startTime = System.currentTimeMillis();
    }
    
    public void stopTimer() {
    	elapsedTime = System.currentTimeMillis() - startTime;
    }
    
    public long getTime() {
    	return elapsedTime;
    }
}
