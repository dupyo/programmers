package scpc;

public class UserSolution {

	public final static int N = 4;

    public void doUserImplementation(int guess[]) {
        // Implement a user's implementation function
        //
        // The array of guess[] is a return array that
        // is your guess for what digits[] would be.
    	for(int i = 0; i < N; i++) {
    		Solution.Result result = Solution.query(guess);
    		if(result.hit == 4)
    			return;
    	}
    }
}
