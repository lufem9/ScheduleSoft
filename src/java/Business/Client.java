package Business;

import java.sql.*;

public class Client
{

    //============== Properties===============
    private String Id;
    private String Password;
    private String FirstName;
    private String LastName;
    private String Email;
    private String Address;
    public AppointmentList aList = new AppointmentList();

    //============== Behaviour===============
    public void setId(String id){this.Id = id;}
    public String getId(){return Id;}

    public void setPassword(String pw){ this.Password = pw;}
    public String getPassword(){return Password;}

    public void setFirstName(String fn){ this.FirstName = fn;}
    public String getFirstName(){return FirstName;}

    public void setLastName(String ln){ this.LastName = ln;}
    public String getLastName(){return LastName;}

    public void setEmail(String em){this.Email = em;}
    public String getEmail(){return Email;}

    private void setAddress(String add){ this.Address = add;}
    public String getAddress(){return Address;}

    public String sql;
    public void getaList(){  this.sql = "SELECT AId FROM appointment WHERE CId = '" + getId() +"'";}


    //=============Customer default constructor=================
    public Client(){
        Id = " " ;
        Password = " ";
        FirstName = " ";
        LastName = " ";
        Email = " ";
        Address = " ";
    }//End of Person default Constructor

    //=============Customer constructor with Arguments=================
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Client(String id, String pw, String fn, String ln, String em, String add )
    {
        setId(id);
        setPassword(pw);
        setFirstName(fn);
        setLastName(ln);
        setEmail(em);
        setAddress(add);
    }//End of Customer constructor with arguments

    public void SelectDB(String SID){
        Id = SID;
        String sqlQuery = "SELECT * FROM client WHERE CId = " + "'" + getId()+"'";

        try
        {
            //Loading Driver
             Class.forName("com.mysql.jdbc.Driver");
               //estaerblish connection
           // Connection con= DBconnect.initializeDatabase();
            Connection con = DriverManager.getConnection(
                   "jdbc:mysql://127.0.0.1/ScheduleSoftdb",
                    "root",
                    "");
            System.out.println("Connected Successfully");

            //Using SQL SELECT Query
            PreparedStatement stmt = con.prepareStatement(sqlQuery);

            System.out.println(sqlQuery);
            ResultSet rs = stmt.executeQuery(sqlQuery);

            //Processing result set.

            while(rs.next()){
                setId(rs.getString(1));
                setPassword(rs.getString(2));
                setFirstName(rs.getString(3));
                setLastName(rs.getString(4));
                setAddress(rs.getString(5));
                setEmail(rs.getString(6));
            }
            // a1.SelectDB(Id);
            System.out.println("================Business.Client Business.Appointment list======================");
            getaList();
            String an;
            Appointment a1;
            System.out.println(this.sql);
           ResultSet rs1 = stmt.executeQuery(this.sql);
            while(rs1.next()){
                an = rs1.getString(1);
                //System.out.println(an);
                a1 = new Appointment();
                 a1.SelectDB(an);
                 aList.addAppointment(a1);
            }
            
            //Closing DataBase
            stmt.close();

        }
        catch(ClassNotFoundException |SQLException es)
        {
            System.out.println(es);
        } 
    } //End of SelectDB


    //=============InsertDB method=================
    public void insertDB( String id, String pw, String fn, String ln, String em, String add){
        setId(id);
        setPassword(pw);
        setFirstName(fn);
        setLastName(ln);
        setEmail(em);
        setAddress(add);
        String sqlQuery = "INSERT into client values('" + getId() +"',"
                + "'" + getPassword() +"',"
                + "'" + getFirstName() +"',"
                + "'" + getLastName() +"',"
                + "'" + getEmail() +"',"
                + "'" + getAddress() +"')";

        connect.insertDB(sqlQuery);
    }//end of InsertDB

    //=============UpdateDB method=================
    public void updateDB(){

        String sqlQuery =  "update client  set password = "
                + "'" + getPassword() +"', "
                + "F_Name = '" + getFirstName() +"',"
                + "L_Name = '" + getLastName() +"', "
                + "Email = '" + getEmail() +"', "
                + "Address = '" + getAddress() +"' " +
                "WHERE CId = '" + Id +"' ";

        connect.updateDB(sqlQuery);
    }//end of UpdateDB

    //=============DeleteDB method=================
    public void deleteDB( ){

        String sqlQuery = "DELETE FROM client WHERE CID = "
                + "'" + getId() +"'";
        connect.deleteDB(sqlQuery);
    }//end of DeleteDB

    //=============display method=================
    public void display(){
        System.out.println(" Customer ID = " + getId()
                + "\n Password  = " + getPassword()
                + "\n first Name = " + getFirstName()
                + "\n Last Name = " + getLastName()
                + "\n Email = " + getEmail()
                + "\n Address = " + getAddress());
    }//End of display method

}//End of Class
