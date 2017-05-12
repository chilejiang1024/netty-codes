package chile.netty.nio;

import javax.sound.sampled.Port;

/**
 * Title : chile.netty.nio
 * Description :
 *  - 
 *  -  
 *
 * @author chile
 * @version 1.0
 * @date 2017/4/6 14:17
 */

public class TimeClient {

    public static void main(String[] args) {
        int port = 1090;
        if (args != null && args.length > 0) {
            try {
                port = Integer.valueOf(args[0]);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        new Thread();
    }
}
