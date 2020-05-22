package br.com.curso2020.chess.pieces;

import br.com.curso2020.boardgame.Board;
import br.com.curso2020.chess.ChessPiece;
import br.com.curso2020.chess.Color;

public class Rook extends ChessPiece{

	public Rook(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "R";
	}
	
}
