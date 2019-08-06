package OpenRPG;

import java.util.List;

public interface IInventory {
    List<IItem> getInventory();

    IItem getItemByName(String name);

    IItem getItemByIndex(int index);
}
