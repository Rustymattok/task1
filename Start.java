package v.makarov.task1;

import java.io.IOException;

/**
 * Created by Rustymattok on 24.01.2016.
 */
public class Start {

    public static void main(String[] args) throws IOException {
        BackEnd startTask = SingletonTime.getInstanse();
        startTask.setTime(startTask.putTime());
        startTask.start(startTask.comparedRezult());
    }
}
