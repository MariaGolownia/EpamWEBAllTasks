package by.javatr.rep;
import by.javatr.entity.Plane;
import by.javatr.exc.ValidationException;
import java.io.IOException;
import java.util.List;

public interface AbstractRepository {
    public List<Plane> read  (String nameOfRepository) throws ValidationException, IOException;
}
