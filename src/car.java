public class car { 
    int id1;
    String name1;
    int year1;
    String model1;
    int engineSize1;
    

    public car(int id, String name, int year, String model, int engineSize) {

        id1 = id;
        name1 = name;
        year1 = year;
        model1 = model;
        engineSize1 = engineSize;
        
    }

    public static void main(String [] args ){
 car car1=new car (121, "Toyota" , 2017, "Corolla", 1);
 car car2=new car (122, "Toyota" , 2022, "Camry", 2);
 car car3=new car (123, "Audi" , 2015, "A4", 2);
 car car4=new car (124, "Skoda" , 2021, "Kodiaq", 2);
 car car5=new car (125, "Tesla" , 2020, "Model S", 0);

 System.out.println(task3(car1.year1, car2.year1, car3.year1, car4.year1,  car5.year1));
        System.out.println(task3(car1.engineSize1,  car2.engineSize1, car3.engineSize1, car4.engineSize1, car5.engineSize1));
      
    }
    public static double task3(int... num) {
        int sum = 0;
        for (int i : num)
            sum += i ;
        return sum;
    }

 

 


 
}
    

