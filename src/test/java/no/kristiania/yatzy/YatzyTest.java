package no.kristiania.yatzy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatzyTest {

    private YatzyGame yatzyGame = new YatzyGame();

    @Test
    void shouldScoreOnes() {
        assertEquals(4, yatzyGame.score(YatzyCategory.ONES, new int[] { 1, 1, 2, 1, 1}));
        assertEquals(2, yatzyGame.score(YatzyCategory.ONES, new int[] { 6, 5, 2, 1, 1}));
    }

    @Test
    void shouldScoreTwo() {
        assertEquals(4, yatzyGame.score(YatzyCategory.TWOS, new int[] { 1, 1, 2, 2, 1}));
        assertEquals(2, yatzyGame.score(YatzyCategory.TWOS, new int[] { 6, 5, 2, 1, 1}));
    }

    @Test
    void shouldScorePair() {
        assertEquals(10, yatzyGame.score(YatzyCategory.PAIR, new int[] { 1, 3, 5, 5, 2}));
        assertEquals(12, yatzyGame.score(YatzyCategory.PAIR, new int[] { 1, 6, 6, 5, 2}));
        assertEquals(12, yatzyGame.score(YatzyCategory.PAIR, new int[] { 5, 5, 6, 6, 2}));
    }

    @Test
    void shouldScoreThreeOfAKind() {
        assertEquals(12, yatzyGame.score(YatzyCategory.THREE_OF_A_KIND, new int[] { 4, 4, 6, 4, 2}));
        assertEquals(18, yatzyGame.score(YatzyCategory.THREE_OF_A_KIND, new int[] { 4, 6, 6, 4, 6}));
    }


    @Test
    void shouldCalculateForOnes() {
        assertEquals(0, yatzyGame.score(YatzyCategory.ONES, new int[] { 2, 3, 4, 5, 6 }));
        assertEquals(3, yatzyGame.score(YatzyCategory.ONES, new int[] { 2, 1, 4, 1, 1 }));
        assertEquals(5, yatzyGame.score(YatzyCategory.ONES, new int[] { 1, 1, 1, 1, 1 }));
    } }