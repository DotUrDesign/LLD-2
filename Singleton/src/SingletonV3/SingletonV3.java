package SingletonV3;
/*
    Merits -
    This time the contructor is private, and still the user is able to create instances.

    Issues -
    Again the same problem persists, user is able to create multiple instances of dbInstances.
 */
public class SingletonV3 {
    public static void main(String[] args) {
        DB_Connection dbConn1 = DB_Connection.getInstance();
        System.out.println(dbConn1);
        DB_Connection dbConn2 = DB_Connection.getInstance();
        System.out.println(dbConn2);

    }
}
