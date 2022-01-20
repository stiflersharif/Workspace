package Creational.Singleton;

public class ConnectionPool {
    private static ConnectionPool Instance = null;
    private ConnectionPool(){

    }

    public  static ConnectionPool getInstance(){
        if(Instance==null){
            synchronized (ConnectionPool.class) {
                if (Instance == null) {
                    Instance = new ConnectionPool();
                }
            }
        }
        return Instance;
    }
}
