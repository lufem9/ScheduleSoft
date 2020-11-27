package Business;

public class Test {
    public static void main(String[] args)
    {
        Client c2 = new Client();
        //c2.insertDB( "1025","5678","Peter","Mardison","Mpeter@yahoo.com","8231 Turner Avenue windsor");
        c2.SelectDB("1021");
        /*c2.deleteDB();
        c2.setPassword("1234");
        c2.setFirstName("Abdul");
        c2.setLastName("Smith");
        c2.setEmail("ASmith@yahoo.com");
        c2.setAddress("2134 huron Church windsor");
        c2.updateDB();*/
        //c2.display();

       entity e1 = new entity();
       //e1.insertDB( "4015","Uwindsor","info@uwindsor.ca",226589772,"1080 Sunset Avenue Windsor");
       e1.SelectDB("4015");
       // e1.setPhone(266366901);
       // e1.updateDB();
       /* c2.deleteDB();
        c2.setPassword("1234");
        c2.setFirstName("Abdul");
        c2.setLastName("Smith");
        c2.setEmail("ASmith@yahoo.com");
        c2.setAddress("2134 huron Church windsor");
        c2.updateDB();*/
        //e1.display();
       //Business.Client c1 = new Business.Client();
       // c1.SelectDB("1021");
        //Business.entity e2 = new Business.entity();
        //e2.insertDB( "4011","Star","info@star.ca",519311678,"2728 Tecumseh Windsor");
        //e2.SelectDB("4011");
        //e2.display();
         Appointment a1 = new Appointment();
        //Business.Appointment a2 = new Business.Appointment();
        a1.insertDB("2016","2021-01-07","12:15","13:45", c2.getId(), e1.getId());
        //a2.insertDB("2012","2021-01-05","08:00","09:30", c1.getId(), e2.getId());
        //a2.SelectDB("2012");
        //a2.setAppDy("2021-02-02");
        //a2.updateDB();
        //a2.display();
        //a2.deleteDB();

       // c2.SelectDB("1022");
        //System.out.println("================Business.Client Details======================");
        //c2.display();
        //a1.SelectDB("2012");
    }
}
