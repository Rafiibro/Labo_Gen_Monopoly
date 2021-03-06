import board.Board;
import org.junit.jupiter.api.Test;
import player.Player;
import player.piece.TypePiece;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MonopolyTest {

    @Test
    void testPlayGame() {
        Board board = new Board();

        List<Player> listPlayer = new ArrayList<>();
        EnumSet<TypePiece> all = EnumSet.allOf(TypePiece.class);
        List<TypePiece> list = new ArrayList<>(all);
        for (int i = 0; i < 2; ++i) {
            listPlayer.add(new Player("Player " + i, list.get(i), board.getAllSquares().get(0), board));
            assertEquals("Player " + i + " " + list.get(i) + " Case 1 Cash : 1500.0", listPlayer.get(i).toString());
        }
        int MockDeFaceValue = 1;
        for (int i = 0; i < 2; ++i) {
            MockDeFaceValue += 5;
            for (int j = 0; j < 2; ++j) {
                listPlayer.get(j).takeTurn(5);
                assertEquals("Player " + j + " " + list.get(j) + " Case" + " " + MockDeFaceValue + " Cash : 1500.0", listPlayer.get(j).toString());
            }
        }
    }
}