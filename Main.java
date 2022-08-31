class Main{
    public static void main(String[] args) {
        Player1 player = new Player1("Abhay","Sward",100);
        Player2 player2 = new Player2("Rohit" , "AWM" ,100,false);
         // System.out.println(p.getName());
        // System.out.println(p.getHealth());
        // System.out.println(p.getWeapon()); 
    player.damageByGun1();
    player.damageByGun1();
    player.damageByGun1();
    player.heal();
    player2.damageByGun2();
    player2.damageByGun2();
    player2.heal();
    player2.damageByGun2();




    }
}