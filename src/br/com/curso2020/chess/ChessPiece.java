package br.com.curso2020.chess;

import br.com.curso2020.boardgame.Board;
import br.com.curso2020.boardgame.Piece;

public class ChessPiece extends Piece{

	private Color color;


	public ChessPiece(Board board, Color color) {
		super(board);
		this.color =  color;
	}


	public Color getColor() {
		return color;
	}
}
