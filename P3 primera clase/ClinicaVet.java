public static void main (String[]Args){
mascota mascota1 = new mascota ("Boby", "Biralata", 4 , 13.6);
mascota mascota2 = new mascota ("chivi","chihuahua", 8 , 20.1);
mascota mascota3 = new mascota ("Puca", "Pastor Aleman",6 , 40);


System.out.println("Mascota 1");   
mascota1.Mostrar_Datos();
mascota1.ClasificarPeso();
    System.out.println("Mascota 2");
    mascota2.Mostrar_Datos();
    mascota2.ClasificarPeso();
    System.out.println("Mascota 3");
mascota3.Mostrar_Datos();
   mascota3.ClasificarPeso();
   
   
}