import java.io.File;

public interface Fileable<T> {
    void writeInfo(T object);
    T readInfoInto(File file);
}
