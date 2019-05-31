package OpenRPG;

public interface Stackable extends IItem {
    int getItemCount();
    void addItems(int number);
    void removeItems(int number);
}
