public class Player2 {
   private int health;
   private String name ;
   private String weapon;
   private boolean armour= true;
   
     public Player2(String name , String weapon , int health, boolean armour){
      this.name = name;
      this.weapon = weapon;
      this.health = health;
      this.armour = armour;
     }
   public void damageByGun1(){
    if (armour) {
          this.health = health-20;
         if (this.health <=0)  {
            this.health =0;
         }
         System.out.println("Armour is on health is reduce by 20 "+
         "New health is "+this.health);
        }
        if (!armour) {
            this.health = health-30;
            if (this.health <=0)  {
               this.health =0;
            }
            System.out.println("Armour is on health is reduce by 30 "+
            "New health is "+this.health);
            
        }
        if(this.health ==0){
            System.out.println(getName()+" is dead");
        }
   }

    public void damageByGun2(){
        if (armour) {
            this.health = health-40;
           if (this.health <=0)  {
              this.health =0;
           }
           System.out.println("Armour is on health is reduce by 40 "+
           "New health is "+this.health);
          }
          if (!armour) {
              this.health = health-50;
              if (this.health <=0)  {
                 this.health =0;
              }
              System.out.println("Armour is on health is reduce by 50 "+
              "New health is "+this.health);
              
          }
          if(this.health ==0){
              System.out.println(getName()+" is dead");
          }
    }


    public void heal(){
        if (this.health <=0) {
            System.out.println(getName()+" is dead Heal is not possible");

        }
        else{
            this.health = health+50;
            System.out.println(getName()+" new health will be "+ this.health);
        }
    }




    public String getName(){
        return name;
     }
     public void setName(String name){
       this.name = name;
     }
    
     public String getWeapon(){
        return weapon;
     }
     public void setWeapon(String weapon){
       this.weapon = weapon;
     }
     
     public int getHealth(){
        return health;
     }
     public void setHealth(int health){
       this.health = health;
     }
     
    




}
