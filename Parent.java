public class Parent
{
    private String name;
    private boolean prefersAndroid;
    private final double BUDGET = 100000;
    private int storageWanted;
    private double newPhonePrice = 0.00; 
    private String newPhoneName = "";

    //Alternate Constructor
    public Parent(String name, boolean prefersAndroid, int storageWanted)
    {
        setName(name);
        setPrefersAndroid(prefersAndroid);
        setStorageWanted(storageWanted);
    }

    //Accessors
    public String getName()
    {
        return name;
    }

    public boolean getPrefersAndroid()
    {
        return prefersAndroid;
    }

    public double getBudget()
    {
        return BUDGET;
    }

    public int getStorageWanted()
    {
        return storageWanted;
    }

    public double getNewPhonePrice()
    {
        return newPhonePrice;
    }

    public String getNewPhoneName()
    {
        return newPhoneName;
    }

    //Mutators
    public void setName(String name)
    {
        this.name = name;
    }

    public void setPrefersAndroid(boolean prefersAndroid)
    {
        this.prefersAndroid = prefersAndroid;
    }

    public void setStorageWanted(int storageWanted)
    {
        this.storageWanted = storageWanted;
    }

    public void setNewPhonePrice(double newPhonePrice)
    {
        this.newPhonePrice = newPhonePrice;
    }

    public void setNewPhoneName(String newPhoneName)
    {
        this.newPhoneName = newPhoneName;
    }

    public void printString()
    {
        System.out.println(toString());
    }
    //To String
    public String toString()
    {
        if (prefersAndroid)
        {
            return name + " wants an android phone with a minimum storage of " + storageWanted;
        }
        else
        {
            return name + " wants a phone with a minimum storage of " + storageWanted;
        }
    }

}