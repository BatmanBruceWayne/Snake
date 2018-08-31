package gamescreen;

public class Character {
	private MainBoard mainBoard;
	
	
	
	public int[] relativeOneToTwo(int order){
		int GLOBAL_WIDTH = mainBoard.getWidth();
		int i = order/GLOBAL_WIDTH;
		int r = order%GLOBAL_WIDTH;
		int j = GLOBAL_WIDTH * i + r;
		int array[] = new int[2];
		array[0] = i; array[1] = j;
		return array;
	}
	
}
