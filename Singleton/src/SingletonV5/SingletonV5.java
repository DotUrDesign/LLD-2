package SingletonV5;

import SingletonV4.DB_Connection;

public class SingletonV5 {
    public static void main(String[] args) {
        DB_Connection dbConn1 = DB_Connection.getInstance();
        System.out.println(dbConn1);
        DB_Connection dbConn2 = DB_Connection.getInstance();
        System.out.println(dbConn2);
    }
}
