package school.mjc.stage0.conditions.task1;

public class PositiveNumberDeterminer {
    public void isPositive(int numberToBeDetermined) {
        if(numberToBeDetermined>0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }

    public static void main(String[] args) {
        PositiveNumberDeterminer pnd = new PositiveNumberDeterminer();
        pnd.isPositive(5);
    }

}
