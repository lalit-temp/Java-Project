import java.util.Scanner;
public class FindPhone
{
    private Parent parents[] = new Parent[2];
    private Phone phones[] = new Phone[5];
    private Scanner in = new Scanner(System.in);

    FindPhone()
    {
        parents[0] = new Parent("Neelam", false, 256);
        parents[1] = new Parent("Karan", true, 128);
        
        phones[0] = new Phone("iPhone 14",70000.00,6,128,false);
        phones[1] = new Phone("iPhone 14 Pro",120000.00,12,256,false);
        phones[2] = new Phone("Pixel 7", 50000.00, 8, 256,true);
        phones[3] = new Phone("Samsung A54", 35000.00, 8, 128,true);
        phones[4] = new Phone("Samsung S23", 150000.00, 12, 512, true);
        
        for (int i = 0; i < parents.length; i++)
        {
            menu(parents[i]); 
        }
    }

    private void menu(Parent thisParent)
    {
        char action = readUpperChar(); 
        while (action != 'X')   
        {
            switch (action)
            {
                case 'P': thisParent.printString(); 
                    break;
                case 'D' : displayAllPhones();
                    break;
                case 'C' : checkAllPhones(thisParent);
                    break;
                case 'H' : displayHelp(); 
                    break;
                default : displayError();
            }
            action = readUpperChar(); 
        }
        displayResult(thisParent);
    }
    private void displayError()
    {
        System.out.println("Error! Please input a valid option.");
    }
    private void displayHelp()
    {
        System.out.println("Enter P to print preferences of the current user");
        System.out.println("Enter D to display information about all the available phones");
        System.out.println("Enter C to start the comparisons");
        System.out.println("Enter H to view the help menu");
        System.out.println("Enter X to end the program and display the result");
    }
    private char readUpperChar()
    {
        System.out.println("Please enter your choice (P,D,C,X), Press H for Help: ");
        return in.next().toUpperCase().charAt(0);
    }

    private void displayAllPhones()
    {
        int x = 0;
        while (x < phones.length)
        {
            System.out.println(phones[x].toString());
            x++;
        }
    }

    private void checkAllPhones(Parent thisParent)
    {
        int i = 0;
        do
        {
            if (phones[i].check(thisParent)){
                comparePrice(phones[i],thisParent);
            }
            i++;
        }
        while (i < phones.length);
    }

    private void comparePrice(Phone thisPhone, Parent thisParent)
    {
        if ((thisParent.getNewPhonePrice() == 0) || (thisPhone.getPrice() < thisParent.getNewPhonePrice()))
        {
            updatePhone(thisParent,thisPhone);           
        }
    }

    public void updatePhone(Parent thisParent, Phone thisPhone)
    {
        thisParent.setNewPhonePrice(thisPhone.getPrice());
        thisParent.setNewPhoneName(thisPhone.getModel());
    }

    public void displayResult(Parent thisParent)
    {
        if (!(thisParent.getNewPhonePrice() == 0))
        {
            System.out.println("Congratulations. The best phone for you is the " + thisParent.getNewPhoneName());
        }
        else
        {
            System.out.println("Sorry no phone found");  
        }
    }

}