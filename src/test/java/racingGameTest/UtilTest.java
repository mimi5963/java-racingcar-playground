package racingGameTest;

import org.junit.jupiter.api.Test;
import racingGame.util.RacingUtil;

import static org.assertj.core.api.Assertions.*;
public class UtilTest {
    @Test
    void 유효이름테스트(){
        assertThat(RacingUtil.nameIsEmpty("")).isTrue();
        assertThat(RacingUtil.vaildLength("123456")).isFalse();
    }
    @Test
    void 이름_나누기_테스트(){
        String names ="pobi,noni,jia";
        String[] namearr = RacingUtil.splitName(names);
        assertThat(namearr).containsExactly("pobi","noni","jia");
    }
}
