package OOPS.Interface;

class OOPS1 {
    public static void main(String[] args) {
        Queen queen = new Queen();
        queen.moves();
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("Up,down,left,right,diagonal( in all 4 dirns)");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up,down,left,right");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("up,down,left,right,diagonal(in 4 direction");
    }
}
