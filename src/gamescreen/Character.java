package gamescreen;

public class Character {
	private int GLOBAL_WIDTH;
	private MainBoard mainBoard;
	
	public Character() {
		this.GLOBAL_WIDTH = mainBoard.getWidth();
	}
	
	
	public int[] relativeOneToTwo(int order){
		int i = order/this.GLOBAL_WIDTH;
		int r = order%this.GLOBAL_WIDTH;
		int j = this.GLOBAL_WIDTH * i + r;
		int array[] = new int[2];
		array[0] = i; array[1] = j;
		return array;
	}
	
}
