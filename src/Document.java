public interface Document extends Cloneable {
    Document clone(); // Cloneable
    void open();
    String getType();
}
