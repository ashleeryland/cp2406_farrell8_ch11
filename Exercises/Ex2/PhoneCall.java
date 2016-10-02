/**
 * Created by Ashlee on 28/09/2016.
 */
public abstract class PhoneCall
{
    String phoneNumber;
    double price;
    public PhoneCall(String num)
    {
        phoneNumber = num;
        price = 0.0;
    }
    public void setPrice(double pr)
    {
        price = pr;
    }
    public abstract String getPhoneNumber();
    public abstract double getPrice();
    public abstract void getInfo();
}
