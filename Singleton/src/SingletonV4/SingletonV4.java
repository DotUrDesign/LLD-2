package SingletonV4;
/*
    Issues -
    Is this approach thread-safe ?
 */
public class SingletonV4 {
    public static void main(String[] args) {
        DB_Connection dbConn1 = DB_Connection.getInstance();
        System.out.println(dbConn1);
        DB_Connection dbConn2 = DB_Connection.getInstance();
        System.out.println(dbConn2);
    }
}
