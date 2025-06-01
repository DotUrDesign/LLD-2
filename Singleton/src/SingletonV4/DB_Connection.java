package SingletonV4;

public class DB_Connection {
    private static DB_Connection dbInstance = null;
    private DB_Connection() {

    }
    public static DB_Connection getInstance() {
        if(dbInstance == null) {
            dbInstance = new DB_Connection();
            return dbInstance;
        }
        return dbInstance;
    }
}
