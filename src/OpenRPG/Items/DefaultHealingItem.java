/**
 * @author Matthew Norton
 *
 */
package OpenRPG.Items;

import OpenRPG.Healable;
import OpenRPG.IParameters;


public class DefaultHealingItem implements StackableItem, Consumable {

    private String name;
    private int itemCount;
    private IParameters parameters;

    public DefaultHealingItem(String name, int itemCount, int potency, int value) {
        this.name = name;
        this.itemCount = itemCount;
        this.parameters = new DefaultHealingItemParameters(potency, value);
    }

    public DefaultHealingItem(String name, int itemCount, IParameters parameters) {
        this.name = name;
        this.itemCount = itemCount;
        this.parameters = parameters;
    }

    /**
     *
     * @return
     */
    @Override
    public int getItemCount() {
        return itemCount;
    }

    /**
     *
     * @param number
     */
    @Override
    public void addItems(int number) {
        itemCount += number;
    }

    /**
     *
     * @param number
     */
    @Override
    public void removeItems(int number) {
        itemCount -= number;
    }

    /**
     *
     * @return
     */
    @Override
    public int getValue() {
        return 0;
    }

    /**
     *
     * @return
     */
    @Override
    public int getCost() {
        return 0;
    }

    /**
     *
     * @return
     */
    @Override
    public IParameters getParameters() {
        return parameters;
    }

    /**
     *
     */
    @Override
    public void consumeItem() {

        removeItems(1);
    }

    /**
     *
     * @param target
     */
    public void useItem(Healable target) {
        target.heal(parameters.getParameter("potency"));
        consumeItem();
    }
}
