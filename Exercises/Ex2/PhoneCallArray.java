/**
 * Created by Ashlee on 28/09/2016.
 */
public class PhoneCallArray
{
    public static void main(String[] args)
    {
        PhoneCall calls[] = new PhoneCall[10];
        int i;
        calls[0] = new IncomingPhoneCall("0455 678 890");
        calls[1] = new OutgoingPhoneCall("4778 9032", 7);
        calls[2] = new IncomingPhoneCall("4778 9872");
        calls[3] = new OutgoingPhoneCall("0467 234 167", 19);
        calls[4] = new IncomingPhoneCall("0456 890 345");
        calls[5] = new OutgoingPhoneCall("0467 890 123", 3);
        calls[6] = new IncomingPhoneCall("4723 9012");
        calls[7] = new OutgoingPhoneCall("0490 326 781", 39);
        calls[8] = new IncomingPhoneCall("0489 172 564");
        calls[9] = new OutgoingPhoneCall("0423 890 765", 50);
        for(i = 0; i < calls.length; ++i)
            calls[i].getInfo();
    }
}