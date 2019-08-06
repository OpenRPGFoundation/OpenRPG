package OpenRPG.Items;

public interface StackableItem extends IItem {
    int getItemCount();
    void addItems(int number);
    void removeItems(int number);
}
