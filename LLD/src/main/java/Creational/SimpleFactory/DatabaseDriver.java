package Creational.SimpleFactory;

public interface DatabaseDriver {
    public void connect();
    public void query();
    public void close();
}
