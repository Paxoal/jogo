package application;

import java.io.InputStream;
import java.util.Scanner;

import Boardgame.Board;
import Boardgame.Position;
import Chess.ChessMatch;
import Chess.ChessPiece;
import Chess.ChessPosition;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();

		while (true) {
			UI.printBoard(chessMatch.getpieces());
			System.out.println();
			System.out.print("Surce: ");
			ChessPosition source = UI.readChessPosition(sc);

			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(sc);
			
			ChessPiece capturePiece = chessMatch.performChessMove(source, target);
		}
	}
}
