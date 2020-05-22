package br.com.curso2020.chess.pieces;

import br.com.curso2020.boardgame.Board;
import br.com.curso2020.chess.ChessPiece;
import br.com.curso2020.chess.Color;

public class King extends ChessPiece{

	public King(Board board, Color color) {
		super(board, color);
		
	}

	@Override
	public String toString() {
		return "K";
	}
}
