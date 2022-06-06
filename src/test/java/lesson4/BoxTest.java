package lesson4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class BoxTest {
    Box box;

    @Nested
    class WhenEmpty {
        @BeforeEach
        void initBox() {
            box = new Box();
        }

        @Test
        void exceptionWhenTryShuffleEmptyBox() {
            Assertions.assertThrows(ZeroBallsCountException.class, () ->box.shuffleBalls());
        }

        @Nested
        class WhenOneBall {
            @BeforeEach
            void addBall() {
                box.addBall();
            }

            @Test
            void deleteBallTest() {
                box.removeBall();
                Assertions.assertEquals(box.getBallsCount(), 0);
            }

            /**@Test
            void assertJExamplesTest() {
            List<String> strings = new ArrayList<>(Arrays.asList("test1", "test2", "test4"));

            assertThat(strings).containsAnyOf("test2",
            "test5").doesNotHaveDuplicates();
            assertThat(5)isLessThen(10).isGreaterThan(2)
            }**/
        }
    }
}

