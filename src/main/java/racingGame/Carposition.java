package racingGame;

class Carposition {
   private int ps;
    Carposition(int ps){
        this.ps = ps;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public void goforward(){
        this.ps++;
    }
}
