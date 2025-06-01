package SingletonV5;

import java.util.concurrent.locks.Lock;

public class DB_Connection {
    private static DB_Connection dbInstance = null;
    private static Lock lock;
    private DB_Connection() {

    }
    public static DB_Connection getInstance() {
        if(dbInstance == null) {
            lock.lock();
            if(dbInstance == null) {
                dbInstance = new DB_Connection();
            }
            lock.unlock();
        }
        return dbInstance;
    }
}
