package by.javatr.util;

import by.javatr.entity.Plane;

public interface AbstractCheckByTagForSearch {

    public boolean ifContainsTag(Plane plane, Object tag);
    public boolean ifContainsTag(Plane plane, Object tag1, Object tag2);

}
