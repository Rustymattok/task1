package v.makarov.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackEnd {

    public final int RED = 0;
    public final int YELLOW = 1;
    public final int GREEN = 2;
    public final int FAIL = 3;

    private int time;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int putTime() throws IOException {

        int rezult;
        textIntro();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        rezult = Integer.parseInt(reader.readLine());
        reader.close();
        return rezult;

    }

    public int comparedRezult() {
        int rezult ;

        if (getTime() >= 1 && getTime() <= 2) {
            rezult = RED;
        }
        else if (getTime() >= 3 && getTime() <= 4) {
            rezult = YELLOW;
        }
        else if (getTime() >= 5 && getTime() <= 6) {
            rezult = GREEN;
        } else {
            rezult = FAIL;
        }
        return rezult;
    }

    public void start(int comparedRezult) {
        Color color;
        switch (comparedRezult) {
            case RED:
                color = new Red();
                color.textColor();
                break;
            case GREEN:
                color = new Green();
                color.textColor();
                break;
            case YELLOW:
                color = new Yellow();
                color.textColor();
                break;
            case FAIL:
                color = new Color();
                color.textColor();
                break;
            default:
                break;
        }

    }
    public void textIntro() {

        System.out.println("Entered 1 - 2 to put Red ");
        System.out.println("Entered 3 - 4 to put Yellow ");
        System.out.println("Entered 5 - 6 to put Green ");
    }

}
