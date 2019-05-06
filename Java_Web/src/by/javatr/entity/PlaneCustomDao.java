package by.javatr.entity;

public class PlaneCustomDao {

    private final PlaneDao connection;

    public PlaneCustomDao (PlaneDao connection) {
        this.connection = connection;
    }

    public PlaneDao getConnection() {
        return connection;
    }
}
