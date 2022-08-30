public class PhraseOmetic {
	public static void main (String[] args){
		// make three sets of words to choose from. Add your own!
		String[] wordlistOne = {"24/7","multi-"};
		String[] wordlistTwo = {"24/3","mult3-","hh1"};
		String[] wordlistThree = {"24/4","mul2i-","hhh2"};
		
		//find how many words are in each list
		int OneLength = wordlistOne.length;
		int TwoLength = wordlistTwo.length;
		int ThreeLength = wordlistThree.length;
		
		//generate three random number
		int rand1 = (int) (Math.random()*OneLength);
		int rand2 = (int) (Math.random()*TwoLength);
		int rand3 = (int) (Math.random()*ThreeLength);
		//now build a phrase
		String phrase = wordlistOne[rand1]+" "+wordlistTwo[rand2]+" "+wordlistThree[rand3];
		//print out the phrase
		System.out.println("what we need is a" + phrase);
	}
}
//sometimes,many errors dont mean you need to change a lot , a single error can cause a lot error,all you need to do is correct a error,then other errors will go.
