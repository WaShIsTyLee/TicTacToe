package Model;

public class Player {


    private char mark;
    private char clean = '-';
    private String  name = " ";

    public Player(char mark) {
        this.mark = mark;
    }

    public char getMark() {
        return this.mark;
    }

    public void setMark(char mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player(char p1, char p2, char clean) {
        this.clean = clean;
    }

    public char getClean() {
        return clean;
    }

    public void setClean(char clean) {
        this.clean = clean;
    }
}
