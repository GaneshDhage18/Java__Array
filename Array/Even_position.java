// Create an array string and store city names. print all the city names present in even position.

public class Even_position 
{
    public static void main(String[] args) 
    {
        String[] city = {"Banglore","Delhi","Mumbai","Mysore","Noide"};

        for(int i=0; i <= city.length-1; i++)
        {
             if(i % 2 == 0)
             {
                System.out.println(city[i]);
             }
        }
    }
}
