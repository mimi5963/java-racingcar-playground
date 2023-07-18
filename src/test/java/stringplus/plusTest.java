package stringplus;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
public class plusTest {
    Strcal Strcal;

    @BeforeEach
    void setup(){
        Strcal =new Strcal();
    }

    @Test
    void emptyTest(){

        int i = Strcal.getSum("");
        int i2 = Strcal.getSum(null);
        assertThat(i).isEqualTo(0);
        assertThat(i2).isEqualTo(0);
    }
    @Test
    void onenumberTest(){

        int i = Strcal.getSum("1");
        assertThat(i).isEqualTo(1);
    }

    @Test
    void commaTest(){
        int i = Strcal.getSum("1,2,3");
        assertThat(i).isEqualTo(6);
    }

    @Test
    void other(){
        int i = Strcal.getSum("1:2:3");
        assertThat(i).isEqualTo(6);
    }

    @Test
    void mixTest(){
        int i = Strcal.getSum("1:2,3,5,10");
        assertThat(i).isEqualTo(21);
    }
    @Test
    void customregex(){
        int i = Strcal.getSum("//%\n1%2%3%10");
        assertThat(i).isEqualTo(16);
    }
    @Test
    void ValidationCheck(){
        String[] strarr = "-1:2:3".split(":");

        assertThatThrownBy(()->{
            StringValidation.numberCheck(strarr);
        }).isInstanceOf(RuntimeException.class);
    }
    @Test
    void ValidationCheck2(){
        String[] strarr = "1:gk:3".split(":");

        assertThatThrownBy(()->{
            StringValidation.numberCheck(strarr);
        }).isInstanceOf(RuntimeException.class);
    }
}
