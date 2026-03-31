static class Locker{
    private int lockerId;
    private boolean isLocked;
    private int pinCode;
    private String storedItem;
    Locker(int lockerId,int pinCode)
    {
        this.lockerId=lockerId;
        this.pinCode=pinCode;
        isLocked=true;
    }
    public void storeItem(String item,int pinCode)
    {
        if (this.pinCode==pinCode)
        {
            if(!isLocked)
            {
                storedItem=item;
                System.out.println("Stored Successfully");
            }
            else {
                System.out.println("Locker is Locked");
            }
        }
        else {
            System.out.println("Entered pin is wrong");
        }
    }
    public void retrieveItem(int pinCode)
    {
        if(this.pinCode==pinCode)
        {
            if(!isLocked && storedItem!=null)
            {
                System.out.println("Retrived Item"+storedItem);
                storedItem=null;
            }
            else if(storedItem==null)
            {
                System.out.println("Locker is Empty");
            }
            else
            {
                System.out.println("Locker is Locked");
            }
        }
        else
        {
            System.out.println("Pin is Wrong");
        }
    }
    public void lock(int pinCode)
    {
        if(this.pinCode==pinCode)
        {
            isLocked=false;
            System.out.println("Locker Locked");
        }
        else
        {
            System.out.println("Pin is Wrong");
        }

    }
    public void unlock(int pinCode)
    {
        if(this.pinCode==pinCode)
        {
            isLocked=false;
            System.out.println("Locker Unlock");
        }
        else
        {
            System.out.println("Pin is Wrong");
        }
    }
}
public class LockerSystem {
    public static void main(String[] args) {
        Locker l1=new Locker(1,1234);
        l1.unlock(123456);
        //l1.storeItem("Bag",123456);
        l1.retrieveItem(123456);
        //l1.lock();
        //l1.unlock();
    }
}
void main()
{
    Locker l1=new Locker(1,1234);
    l1.unlock(123456);
    //l1.storeItem("Bag",123456);
    l1.retrieveItem(123456);
}
