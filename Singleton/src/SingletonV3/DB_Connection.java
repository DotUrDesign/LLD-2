package SingletonV3;

public class DB_Connection {
    private DB_Connection() {

    }
    static DB_Connection getInstance() {
        return new DB_Connection();
    }
}
