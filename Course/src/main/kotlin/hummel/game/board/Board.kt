package hummel.game.board

import hummel.game.Data
import hummel.game.Player
import hummel.game.piece.Coordinate
import hummel.game.piece.PieceNull
import hummel.game.piece.PieceTeams
import hummel.game.piece.PieceTypes
import hummel.game.util.UtilBoard.createStandardBoardTiles
import java.io.Serializable


class Board : Serializable {
	private val tiles = createStandardBoardTiles()
	private val whitePlayer = Player(PieceTeams.WHITE)
	private val blackPlayer = Player(PieceTeams.BLACK)
	var currentPlayer: Player = whitePlayer
	var chosenTile: Tile = TileNull()

	fun setChosenTile2(chosenTile: Tile) {
		if (!chosenTile.hasPiece()) {
			this.chosenTile = TileNull()
		} else {
			this.chosenTile = chosenTile
		}
	}

	fun hasChosenTile(): Boolean {
		return if (chosenTile == TileNull()) {
			false
		} else {
			chosenTile.piece !is PieceNull
		}
	}

	fun getTile(coordinate: Coordinate): Tile = getTile(coordinate.x, coordinate.y)

	fun getTile(x: Int, y: Int): Tile {
		if (x < 0 || x > 7 || y < 0 || y > 7) {
			println("Get Tile Index Bound Of Array")
			return TileNull()
		}
		return tiles[x][y]
	}

	fun getCoordOfGivenTeamPiece(team: PieceTeams, pieceType: PieceTypes): Coordinate? {
		for (i in 0 until Data.ROW_COUNT) {
			for (j in 0 until Data.ROW_TILE_COUNT) {
				if (!tiles[i][j].hasPiece()) {
					continue
				}
				if (tiles[i][j].piece.team == team && tiles[i][j].piece.type == pieceType) {
					return tiles[i][j].coordinate
				}
			}
		}
		return null
	}

	fun changeCurrentPlayer() {
		currentPlayer = if (currentPlayer == whitePlayer) blackPlayer else whitePlayer
	}
}