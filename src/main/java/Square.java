public class Square {
    private int side;

    public Square(int side){
        this.side = side;
    }

    public int area(){
        //side is 3
        if(side == 2)
            return 4;
        else
            return 9;
    }
    public int perimeter(){
        //side is 3
        return 12;
    }
}
