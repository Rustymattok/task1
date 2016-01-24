package v.makarov.task1;

/**
 * Created by Rustymattok on 24.01.2016.
 */
public class SingletonTime {

    private static BackEnd obj;

    private SingletonTime() {
        getInstanse();
    }
    public static BackEnd getInstanse() {
        if (obj == null) {
            obj = new BackEnd();
            return obj;
        }
        return obj;
    }
}
