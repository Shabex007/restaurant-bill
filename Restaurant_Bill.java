import java.util.*;
class Restaurant_Bill
{
    public static void main(String args[])
    {
        cls();
        Scanner br= new Scanner(System.in);
        int vstr,tvstr=0,vfd,tvfd=0,nvstr,tnvstr=0,nvfd,tnvfd=0,fd,tfd=0,amt=0,tamt=0,tamt1=0,tamt2=0,td,damt=0,d,ch;
        double gst=0,tot,gtotal;
        String str="",choise,choise1="M";
        System.out.println("Welcome to Multi Cuisine Restaurant!!!");
        System.out.println("1:Starter Menu");
        System.out.println("2:Main Course");
        System.out.println("3:Desserts");
        System.out.println("");
        while(choise1.equalsIgnoreCase("M"))
        {
            System.out.println("Enter '1' for Starter");
            System.out.println("Enter '2' for Main Course");
            System.out.println("Enter '3' for Desserts");
            System.out.println();
            System.out.println("Enter your choise");
            ch=br.nextInt();
            switch(ch)
            {
                case 1:
                System.out.println("Welcome to Starter Menu!!!:");
                System.out.println("Enter 'VS' for Veg Starter and 'NVS' for Non Veg Starter");
                str=br.next();
                System.out.println();
                if(str.equalsIgnoreCase("VS"))
                {
                    System.out.println("Welcome to Veg Starters");
                    System.out.println();
                    System.out.println("Veg Starters\t\t\t   Price in Rs.");
                    System.out.println("01.Paneer Tikka\t\t\t\t110");
                    System.out.println("02.Veg Seekh Kabab\t\t\t110");
                    System.out.println("03.Hara Bhara Kabab\t\t\t110");
                    System.out.println("04.Shanghai Spring Roll\t\t\t150");
                    System.out.println("05.American Corn Ball\t\t\t150");
                    System.out.println("06.Crispy American Corn\t\t\t140");
                    System.out.println("07.Crispy Baby Corn\t\t\t140");
                    System.out.println("08.Crispy Mushroom\t\t\t120");
                    System.out.println("09.Crispy Chilli Potato\t\t\t120");
                    System.out.println("10.Crispy Chilly Chana\t\t\t150");
                    System.out.println();
                    choise="Y";
                    while(choise.equalsIgnoreCase("Y"))
                    {
                        System.out.println();
                        System.out.println("Choose your order by entering number:");
                        vstr=br.nextInt();
                        System.out.println("Enter the quantity:");
                        tvstr=br.nextInt();
                        if(vstr>=1&&vstr<=3)
                        amt=tvstr*110;
                        if(vstr==4||vstr==5||vstr==10)
                        amt=tvstr*150;
                        if(vstr==6||vstr==7)
                        amt=tvstr*140;
                        if(vstr==8||vstr==9)
                        amt=tvstr*120;
                        tamt=tamt+amt;
                        System.out.println("Do you want to place more order? Enter Y/N");
                        choise=br.next();
                    }
                }
                if(str.equalsIgnoreCase("NVS"))
                {
                    System.out.println("Welcome to Non Veg Starters");
                    System.out.println();
                    System.out.println("Non Veg Starters\t\t\t   Price in Rs.");
                    System.out.println("01.Chicken Tikka\t\t\t\t170");
                    System.out.println("02.Murg Reshmi Kabab\t\t\t\t170");
                    System.out.println("03.Murg Chilli Kabab\t\t\t\t160");
                    System.out.println("04.Chicken Seekh Kabab\t\t\t\t180");
                    System.out.println("05.Tangdi Kabab\t\t\t\t\t180");
                    System.out.println("06.Murg Tandoori\t\t\t\t190");
                    System.out.println("07.Fish Ajwani Tikka\t\t\t\t190");
                    System.out.println("08.Chilli Chicken\t\t\t\t160");
                    System.out.println("09.Drums of Heaven\t\t\t\t180");
                    System.out.println("10.Shanghai Chicken\t\t\t\t180");
                    choise="Y";
                    while(choise.equalsIgnoreCase("Y"))
                    {
                        System.out.println();
                        System.out.println("Choose your order by entering number:");
                        nvstr=br.nextInt();
                        System.out.println("Enter the quantity:");
                        tnvstr=br.nextInt();
                        if(nvstr==1||nvstr==2)
                        amt=tnvstr*170;
                        if(nvstr==3||nvstr==8)
                        amt=tnvstr*160;
                        if(nvstr==4||nvstr==5||nvstr==9||nvstr==10)
                        amt=tnvstr*180;
                        if(nvstr==6||nvstr==7)
                        amt=tnvstr*190;
                        tamt=tamt+amt;
                        System.out.println("Do you want to place more order? Enter Y/N");
                        choise=br.next();
                    }
                }
                break;
                case 2:
                System.out.println("Welcome to Main Course!!!:");
                System.out.println("Enter 'V' for Indian Veg Dishes, 'NV' for Indian Non Veg Dishes and 'C' for Chinese Dishes");
                str=br.next();
                System.out.println();
                if(str.equalsIgnoreCase("V"))
                {
                    System.out.println("Welocme to Indian Veg Dishes");
                    System.out.println();
                    System.out.println("Indian Veg Dishes\t\t\t\t   Price in Rs.");
                    System.out.println("01.Shahi Paneer\t\t\t\t\t\t180");
                    System.out.println("02.Navratan Korma\t\t\t\t\t180");
                    System.out.println("03.Kadhai paneer\t\t\t\t\t150");
                    System.out.println("04.Malai Kofta\t\t\t\t\t\t140");
                    System.out.println("05.Kadhai Vegetable\t\t\t\t\t140");
                    System.out.println("06.Vegetable Pakeeza\t\t\t\t\t140");
                    System.out.println("07.Shabnam Curry\t\t\t\t\t150");
                    System.out.println("08.Makai Corn Palak\t\t\t\t\t150");
                    System.out.println("09.Veg Pulao\t\t\t\t\t\t110");
                    System.out.println("10.Kashmiri Pulao\t\t\t\t\t140");
                    System.out.println("11.Butter Naan\t\t\t\t\t\t40");
                    System.out.println("12.Stuffed Kulcha\t\t\t\t\t60");
                    choise="Y";
                    while(choise.equalsIgnoreCase("Y"))
                    {
                        System.out.println();
                        System.out.println("Choose your order by entering number:");
                        vfd=br.nextInt();
                        System.out.println("Enter the quantity");
                        tvfd=br.nextInt();
                        if(vfd==1||vfd==2)
                        amt=tvfd*180;
                        if(vfd==3||vfd==7||vfd==8)
                        amt=tvfd*150;
                        if(vfd==4||vfd==5||vfd==6||vfd==10)
                        amt=tvfd*140;
                        if(vfd==9)
                        amt=tvfd*110;
                        if(vfd==11)
                        amt=tvfd*40;
                        if(vfd==12)
                        amt=tvfd*60;
                        tamt1=tamt1+amt;
                        System.out.println("Do you want to place more order? Enter Y/N");
                        choise=br.next();
                    }
                }
                if(str.equalsIgnoreCase("NV"))
                {
                    System.out.println("Welcome to Indian Non Veg Dishes");
                    System.out.println();
                    System.out.println("Indian Non Veg Dishes\t\t\t\t   Price in Rs.");
                    System.out.println("01.Chicken Tikka Masala\t\t\t\t\t180");
                    System.out.println("02.Chicken Tikka Labadar\t\t\t\t180");
                    System.out.println("03.Chicken Bharta\t\t\t\t\t150");
                    System.out.println("04.Kadhai Chicken\t\t\t\t\t160");
                    System.out.println("05.Mughlai Chicken\t\t\t\t\t160");
                    System.out.println("06.Murg Navratan Korma\t\t\t\t\t160");
                    System.out.println("07.Chicken Do Pyaza\t\t\t\t\t170");
                    System.out.println("08.Murg Masalla\t\t\t\t\t\t170");
                    System.out.println("09.Mutton Rogan Gosht\t\t\t\t\t190");
                    System.out.println("10.Prawn Malai Curry\t\t\t\t\t190");
                    System.out.println("11.Fish Sarsowala\t\t\t\t\t140");
                    System.out.println("12.Fish Dhaniawala\t\t\t\t\t160");
                    choise="Y";
                    while(choise.equalsIgnoreCase("Y"))
                    {
                        System.out.println();
                        System.out.println("Choose your order by entering number:");
                        nvfd=br.nextInt();
                        System.out.println("Enter the quantity");
                        tnvfd=br.nextInt();
                        if(nvfd==1||nvfd==2)
                        amt=tnvfd*180;
                        if(nvfd==3)
                        amt=tnvfd*150;
                        if(nvfd==4||nvfd==5||nvfd==6||nvfd==12)
                        amt=tnvfd*160;
                        if(nvfd==7||nvfd==8)
                        amt=tnvfd*170;
                        if(nvfd==9||nvfd==10)
                        amt=tnvfd*190;
                        if(nvfd==11)
                        amt=tnvfd*140;
                        tamt1=tamt1+amt;
                        System.out.println("Do you want to place more order? EnterY/N");
                        choise=br.next();
                    }
                }
                if(str.equalsIgnoreCase("C"))
                {
                    System.out.println("Welcome to Chinese Dishes");
                    System.out.println();
                    System.out.println("Chinese Dishes\t\t\t\t   Price in Rs.");
                    System.out.println("01.Schezwan Fried Rice\t\t\t\t240");
                    System.out.println("02.Schezwan Chicken\t\t\t\t280");
                    System.out.println("03.Chilly Chicken\t\t\t\t280");
                    System.out.println("04.Chicken Noodle\t\t\t\t210");
                    System.out.println("05.Veg Hakka Noodle\t\t\t\t210");
                    System.out.println("06.Chciken Manchurian\t\t\t\t190");
                    System.out.println("07.Paneer Manchurian\t\t\t\t190");
                    System.out.println("08.Chilly Paneer\t\t\t\t190");
                    System.out.println("09.Sanghai Fried Rice\t\t\t\t240");
                    System.out.println("10.Veg Fried Rice\t\t\t\t210");
                    System.out.println("11.Chicken Fried Rice\t\t\t\t210");
                    System.out.println("12.Kimchi Rice Veg\t\t\t\t210");
                    choise="Y";
                    while(choise.equalsIgnoreCase("Y"))
                    {
                        System.out.println();
                        System.out.println("Choose your order by entering number:");
                        fd=br.nextInt();
                        System.out.println("Enter the quantity");
                        tfd=br.nextInt();
                        if(fd==1||fd==9)
                        amt=tfd*240;
                        if(fd==2||fd==3)
                        amt=tfd*280;
                        if(fd==4||fd==5||fd==10||fd==11||fd==12)
                        amt=tfd*210;
                        if(fd==6||fd==7||fd==8)
                        amt=tfd*190;
                        tamt1=tamt1+amt;
                        System.out.println("Do you want to place more order? EnterY/N");
                        choise=br.next();
                    }
                }
                break;
                case 3:
                System.out.println("Welcome to Dessert Menu!!!:");
                System.out.println();
                System.out.println("Desserts\t\t\t\t   Price in Rs.");
                System.out.println("01.Softy Pineapple\t\t\t\t110");
                System.out.println("02.Softy Crunchy Chocolate\t\t\t110");
                System.out.println("03.Chocolate Walnut Brownie\t\t\t90");
                System.out.println("04.Chocolate Doughnut\t\t\t\t90");
                System.out.println("05.Marble Cake\t\t\t\t\t70");
                System.out.println("06.Mocha Magic\t\t\t\t\t90");
                System.out.println("07.Black Forest\t\t\t\t\t90");
                System.out.println("08.Mango Shake\t\t\t\t\t80");
                System.out.println("09.Pineapple Shake\t\t\t\t80");
                System.out.println("10.Tooty Fruity\t\t\t\t\t120");
                choise="Y";
                while(choise.equalsIgnoreCase("Y"))
                {
                    System.out.println();
                    System.out.println("Choose your order by entering number:");
                    d=br.nextInt();
                    System.out.println("Enter the quantity");
                    td=br.nextInt();
                    if(d==1||d==2)
                    damt=td*110;
                    if(d==3||d==4||d==6||d==7)
                    damt=td*90;
                    if(d==5)
                    damt=td*70;
                    if(d==8||d==9)
                    damt=td*80;
                    if(d==10)
                    damt=td*120;
                    tamt2=tamt2+damt;
                    System.out.println("Do you want to place more order? EnterY/N");
                    choise=br.next();
                }
                break;
                default:
                System.out.println("You have entered wrong choise!!");
            }
            System.out.println("Enter 'M' to go to Main Menu!!\nEnter 'B' for the bill!!");
            choise1=br.next();
        }
        System.out.println("------------------------------------------------------------");
        System.out.println();
        System.out.println("        **********MULTI CUISINE RESTAURANT**********        ");
        System.out.println();
        System.out.println("                **********STARTERS**********                ");
        System.out.println("              Total Cost of Starters = Rs."+tamt             );
        System.out.println();
        System.out.println("              **********MAIN COURSES**********              ");
        System.out.println("             Total cost of Main Course = Rs."+tamt1          );
        System.out.println();
        System.out.println("                **********DESSERTS**********                ");
        System.out.println("              Total cost of Desserts = Rs."+tamt2            );
        System.out.println();
        tot=tamt+tamt1+tamt2;
        gst=tot*18.0/100.0;
        System.out.println("                        GST = Rs."+gst                       );
        gtotal=tot+gst;
        System.out.println("                Amount to be paid = Rs."+gtotal              );
        System.out.println();
        System.out.println("      Thanks for visiting Multi Cuisine Restaurant!!!!"      );
        System.out.println("                Your Pleasure Our Comfort!!!"                );
        System.out.println("                       Visit Again!!!"                       );
        System.out.println();
        System.out.println("------------------------------------------------------------");
    }
    public static void cls()
    {
        try
        {
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        }catch(Exception E)
        {
            System.out.println(E);
        }
    }
}