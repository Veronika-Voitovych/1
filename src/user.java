public class user {
    int id1;
    int age1;
    String name1;
    String surname1;
    int weight1;
    int height1;

    public user(int id, int age, String name, String surname, int weight, int height) {
        id1 = id;
        age1 = age;
        name1 = name;
        surname1 = surname;
        weight1 = weight;
        height1 = height;
    }

    public static void main(String [] args ){
 user user1=new user (121, 19, "Vira", "Bas", 56, 153 );
 user user2=new user (122, 20, "Ira", "Kvitka", 52, 155 );
 user user3=new user (123, 21, "Lira", "Gloster", 66, 168 );
 user user4=new user (124, 22, "Kira", "Kogut", 58, 158 );
 user user5=new user (125, 23, "Mira", "Gava", 51, 161);


 System.out.println(task3(user1.age1, user2.age1, user3.age1, user4.age1, user5.age1));
 System.out.println(task3(user1.weight1, user2.weight1, user3.weight1, user4.weight1, user5.weight1));
        System.out.println(task3(user1.height1, user2.height1, user3.height1, user4.height1, user5.height1));

    }
    public static double task3(int... num) {
        int sum = num[0] * 2;
        for (int i : num)
            sum += i;
        return sum;
    }

}



