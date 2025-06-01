package SingletonV1;

/*
    Issues -
    1. As the constructor is public, user is able to call the constructor and make multiple dbInstances.
    So, one thing is for sure, that we have to make the constructor private, so that user don't access it via any way.
 */

public class SingletonV1 {
    public static void main(String[] args) {
        DB_Connection dbConn1 = new DB_Connection();
        System.out.println(dbConn1);
        DB_Connection dbConn2 = new DB_Connection();
        System.out.println(dbConn2);
    }
}
