package tugas;

/**
 *
 * @author IRGY
 */
public class T1EncapDemo1841720143Irgy 
{
    private String name;
    private int age;
    
    public String getNameIrgy()
    {
        return name;
    }
    public void setNameIrgy(String newName)
    {
        name = newName;
    }
      public int getAgeIrgy() {
        return age;
    }

    public void setAgeIrgy(int newAge) 
    {
        if (newAge < 18 && newAge > 30) 
        {
            age = 30;
            age = newAge;
        }
    }
}
     
    

    
    

