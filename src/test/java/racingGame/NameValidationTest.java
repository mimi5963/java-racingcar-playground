package racingGame;

import org.junit.jupiter.api.Test;

import javax.print.attribute.standard.MediaSize;

import static org.assertj.core.api.Assertions.*;
public class NameValidationTest {

    @Test
    void lengthOver(){
        boolean result = NameValidation.lengthcheck("asdfg");
        assertThat(result).isEqualTo(true);
        assertThat(NameValidation.lengthcheck("asd")).isTrue();
        assertThat(NameValidation.lengthcheck("asddsdsds")).isFalse();
    }
    @Test
    void splitNameTest(){
        boolean result = NameValidation.namesCheck("asdf,sdd,asf".split(","));
        assertThat(result).isTrue();
        assertThat(NameValidation.namesCheck("assssss,ass,sss".split(","))).isFalse();
    }

}
