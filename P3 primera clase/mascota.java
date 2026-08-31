public class mascota {
    private String name;
    private String species;
    private int age;
    private double weight;

    public mascota(String name, String species, int age, double weight){
        this.name= name;
        this.species= species;
        this.age= age;
        this.weight=weight;


    }
        public void Mostrar_Datos(){
            System.out.println(name);
            System.out.println(species);
            System.out.println(age);
            System.out.println(weight);



        }

        public void ClasificarPeso(){
            if(weight<2){
                System.out.println("Bajo Peso");
            


            } else if(weight>=2 && weight <=10){
                System.out.println("Peso Normal");
            } else {
                System.out.println("Sobre Peso");
                

            }



        }
}
