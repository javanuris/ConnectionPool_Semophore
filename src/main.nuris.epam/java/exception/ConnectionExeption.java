package exception;

import java.util.concurrent.ExecutorService;

/**
 * Created by User on 09.03.2017.
 */
public class ConnectionExeption extends Exception{

    public ConnectionExeption(String message , Throwable cause){
        super(message , cause);
    }

}
