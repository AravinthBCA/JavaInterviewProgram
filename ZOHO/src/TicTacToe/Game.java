package TicTacToe;

public class Game {
	char board[][];
	
	public Game() {
		board = new char[3][3];
	}
	
	public void creation() {
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board.length; j++) {
				board[i][j] = '-';
			}
		}
	}
	
	public void print() {
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board.length; j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void insert(String player, int position) {
		
	}
}
