public class CONDICIONALES {
    public static void main (String [] args){
     int edad= 20;
    int a = 10; 
     double b = 20.5;
     int c = 55;
     int Dia = 4;





     if (edad >=18){
        System.out.println("Es mayor de edad");
       
     } else{
            System.out.println("Es menor de edad");
        }

     if (a>b){
        System.out.println( a + " Es mayor que " + b);
     } else{  System.out.println( b + " Es mayor que " + a);

     }
     if (a > 0){
         System.out.println( a + " Es Positivo ");

     } else if(a == 0){
         System.out.println( a + "Es Cero ");
     } else{
         System.out.println( a + " Es negativo " );
     } 
      if(b % 2 == 0) {
         System.out.println( b + "es par");

      } else {

         System.out.println( b + " Es impar ");
      }  

      if(a > 1 & a <101)
        {
        System.out.println("Se encuentra en el rango de 100");
    }
        else {
             System.out.println( "No se encuentra en el rango de 100");
        }
         
      
 switch(Dia){
    case 1 :
        System.out.println("Es Lunes");
        break;
    case 2 :
        System.out.println("Es Martes");
        break;
    case 3 :
        System.out.println("Es Miercoles");
        break;
    case 4 :
        System.out.println("Es Jueves");
        break;
    case 5 :
        System.out.println("Es Viernes");
        break;
    case 6 :
        System.out.println("Es Sabado");
        break;
    case 7 :
        System.out.println("Es Domingo");
        break;


 }
      

    

}
}
