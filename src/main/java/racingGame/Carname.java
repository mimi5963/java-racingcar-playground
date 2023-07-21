package racingGame;

class Carname {
    private String name;

    Carname(String name){
        if(!NameValidation.lengthcheck(name))
            throw new RuntimeException("excess length");
        this.name =name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
