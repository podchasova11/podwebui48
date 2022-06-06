package lesson4;

public class Box {
    private Integer ballsCounter;

    public Box() {
        this.ballsCounter = 0;
    }


    public void addBall() {
        ballsCounter++;
    }

    public void removeBall() {
        if (ballsCounter == 0) {
            throw new  NullPointerException("Мячей уже ноль!");
        }

        ballsCounter --;

    }



    //public void deleteBall() throws BoxIsAlreadyEmptyException {
    //if (ballsCount == 0) {
    //throw new BoxIsAlreadyEmptyException();
    //}
    //ballsCounter--;
    //}

    public void shuffleBalls() throws ZeroBallsCountException{
        if (ballsCounter == 0) {
            throw  new ZeroBallsCountException();
        }
        System.out.println("Помешали мячи");
    }

    public Integer getBallsCount() {
        return ballsCounter;
    }

}

