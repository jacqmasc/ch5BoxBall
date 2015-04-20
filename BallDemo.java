import java.awt.Color;

/**
 * Class BallDemo - a short demonstration showing animation with the 
 * Canvas class. 
 *
 * @author Jacqueline Mascenik
 * @version 4/20/15
 */

public class BallDemo   
{
    private Canvas myCanvas;

    /**
     * Create a BallDemo object. Creates a fresh canvas and makes it visible.
     */
    public BallDemo()
    {
        myCanvas = new Canvas("Ball Demo", 600, 500);
    }
         public void boxBounce(){
    BoxBall ball = new BoxBall(50,50,16, Color.BLUE, myCanvas);
     ball.draw();
    BoxBall ball2 = new BoxBall(40,40,10, Color.RED, myCanvas);
    ball2.draw();
    BoxBall ball3 = new BoxBall(600,0,16, Color.RED, myCanvas);
     ball3.draw();
    BoxBall ball4 = new BoxBall(375,500,16, Color.BLUE, myCanvas);
     ball4.draw();
     BoxBall ball5 = new BoxBall(375,200,16, Color.YELLOW, myCanvas);
     ball5.draw();
     BoxBall ball6 = new BoxBall(360,175,14, Color.GREEN, myCanvas);
     ball6.draw();
     BoxBall ball7 = new BoxBall(350,175,14, Color.GREEN, myCanvas);
     ball7.draw();
     BoxBall ball8 = new BoxBall(340,175,14, Color.GREEN, myCanvas);
     ball8.draw();
     BoxBall ball9 = new BoxBall(330,200,16, Color.YELLOW, myCanvas);
     ball9.draw();
        while(true) {
            myCanvas.wait(50);
            ball.move();
            ball2.move();
            ball3.move();
            ball4.move();
            ball5.move();
            ball6.move();
            ball7.move();
            ball8.move();
            ball9.move();
        }
    }
    
    /**
     * Simulate two bouncing balls
     */
    public void bounce()
    {
        int ground = 400;   // position of the ground line

        myCanvas.setVisible(true);

        // draw the ground
        myCanvas.drawLine(50, ground, 550, ground);

        // crate and show the balls
        BouncingBall ball = new BouncingBall(50, 50, 16, Color.BLUE, ground, myCanvas);
        ball.draw();
        BouncingBall ball2 = new BouncingBall(70, 80, 20, Color.RED, ground, myCanvas);
        ball2.draw();

        // make them bounce
        boolean finished =  false;
        while(!finished) {
            myCanvas.wait(50);           // small delay
            ball.move();
            ball2.move();
            // stop once ball has travelled a certain distance on x axis
            if(ball.getXPosition() >= 550 || ball2.getXPosition() >= 550) {
                finished = true;
            }
        }
    }
}
