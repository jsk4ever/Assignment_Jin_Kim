import java.util.*;
import java.text.*;

/**
* Pokemon Object

* @author <Jin Kim>, kimjin@hawaii.edu

* @since <01/25/2017>

*/

public class Pokemon
{
   // instance variables
   private String sSpecies = "";
   private String sName = "";
   private int iNum = 0;
   private String sType1 = "";
   private String sType2 = "";
   private int iHP = 0;
   private int iCP = 0;
   
   // constructor#1 start
   public Pokemon(String pokeSpecies, String pokeName, int pokeNumber, String pokeType1, String pokeType2)
   {
      this.setSpecies(pokeSpecies);
      this.setName(pokeName);
      this.setNumber(pokeNumber);
      this.setType1(pokeType1);
      this.setType2(pokeType2);
      this.setHP(this.iHP);
      this.setCP(this.iCP);
   }
   // constructor#1 end
   
   // constructor#2 start
   public Pokemon(String pokeSpecies, int pokeNumber, String pokeType1, String pokeType2)
   {
      this.setSpecies(pokeSpecies);
      this.setNumber(pokeNumber);
      this.setType1(pokeType1);
      this.setType2(pokeType2);
      this.setHP(this.iHP);
      this.setCP(this.iCP);  
   }
   // constructor#2 end   
   
   // get method start
   public String getSpecies()
   {
      return this.sSpecies;
   }
   
   public String getName()
   {
      return this.sName;
   }
   
   public double getNumber()
   {
      return this.iNum;
   }
   
   public String getType1()
   {
      return this.sType1;
   }
   
   public String getType2()
   {
      return this.sType2;
   }
   
   public int getHitPnts()
   {
      return this.iHP;
   }
   
   public int getComPwr()
   {
      return this.iCP;
   }
   // get method end
   
   // set method start
   public void setSpecies(String newSpecies)
   {
      this.sSpecies = newSpecies;
   }
   
   public void setName(String newName)
   {
      if(newName.length() == 0)
      {
         this.sName = getSpecies();
      }
      else
      {
         this.sName = newName;
      }
   }
   
   public void setNumber(int newNum)
   {
      this.iNum = newNum;
   }
   
   public void setType1(String newType1)
   {
      this.sType1 = newType1;
   }
   
   public void setType2(String newType2)
   {
      this.sType2 = newType2;
   }

   public void setHP(int newHP)
   {   
      Random rn = new Random();
      newHP = rn.nextInt(140) + 10;
      this.iHP = newHP;
   }
   
   public void setCP(int newCP)
   {
      double min = 1.00;
      double max = 3.00;
      double mult = 0.00;
      Random randGen = new Random();
      mult = min + (max - min)*randGen.nextDouble();
      newCP = (int)(this.iHP * mult);
      this.iCP = newCP;
   }
   // set method end
   
   // powerUp method start
   public void powerUp()
   {
      int oldHP = getHitPnts();
      int oldCP = getComPwr();
      double HP = 0;
      double CP = 0;
      
      HP = oldHP + 1.15 + (0.2*oldHP);
      CP = oldCP + 1.15 + (0.2*oldCP);
      this.iHP = (int)HP;
      this.iCP = (int)CP;
   }
   // powerUp method end
   
   // toString
   public String toString()
   {
      String s = "";
      s = "Species: " + this.sSpecies;
      if(this.sName.length() > 0)
      {
         s = s + "\nName: " + this.sName;
      }
      s = s + "\nNumber: " + String.format("%03d", this.iNum);
      s = s + "\nType: " + this.sType1;  
      if(this.sType2.length() > 0)
      {
         s = s + " | " + this.sType2; 
      }
      s = s + "\nHP: " + this.iHP;
      s = s + "\nCP: " + this.iCP + "\n";
      
      return s;
   }
   // toString end
}