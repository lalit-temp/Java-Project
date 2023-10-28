public class Phone
{
    private String model;
    private double price;
    private int ram;
    private int storage;
    private boolean isAndroid;

    //Alternate Constructor
    public Phone(String model, double price, int ram, int storage, boolean isAndroid)
    {
        setModel(model);
        setPrice(price);
        setRam(ram);
        setStorage(storage);
        setIsAndroid(isAndroid);
    }

    public String getModel()
    {
        return model;
    }

    public double getPrice()
    {
        return price;
    }

    public int getRam()
    {
        return ram;
    }

    public int getStorage()
    {
        return storage;
    }

    public boolean isAndroid()
    {
        return isAndroid;
    }

    //Mutators
    public void setModel(String model)
    {
        this.model = model;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setRam(int ram)
    {
        this.ram = ram;
    }

    public void setStorage(int storage)
    {
        this.storage = storage;
    }

    public void setIsAndroid(boolean isAndroid)
    {
        this.isAndroid = isAndroid;
    }

    //Check if this phone matches requirements.
    public boolean check(Parent parent)
    {
        if (!(parent.getPrefersAndroid() && !isAndroid))
        {
            if (storage >= parent.getStorageWanted())
            {
                System.out.println( model + " meets all requirements");
                return true;
            }
            else
            {
                System.out.println(model + " is not suitable since it does not have enough storage"); 
                return false;
            }
        }
        else
        {
            System.out.println(model + " does not have the required OS");
            return false;
        }
    }

    public void printString()
    {
        System.out.println(toString());
    }

    //To String
    public String toString()
    {
        String text = "The " + model + " costs " + price + ", has a storage of " + storage + "GB and RAM of " + ram + "." ;
        if (isAndroid)
        {
            text += "It is an android phone";
        }
        else
        {
            text += "It is not an android phone";
        }
        return text;
    }

}