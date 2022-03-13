public class MainDao {
    public static void main(String[] args) {

        User user1 = new User();
        User user2 = new User();
        User user3 = new User();

        UserDao userDao1 = new UserDao();
        UserDao userDao2 = new UserDao();


        user1.setUsername("fabian3l");
        user1.setEmail("zaq@wp.pl");
        user1.setPassword("xyz");

        user2.setUsername("dinozaurPimpus");
        user2.setEmail("dinozaurPimpus693@gmail.com");
        user2.setPassword("diamentowaplytwaopowiescizdolinysmokow");

        user3.setUsername("User3");
        user3.setEmail("user3@gmail.com");
        user3.setPassword("users3");

        userDao1.create(user3);

//        User read = userDao1.read(1);
//        System.out.println(read);

/*
        User userToUpdate = userDao1.read(1);
        userToUpdate.setUsername("Faba");
        userToUpdate.setEmail("testUpdate@gmal.com");
        userToUpdate.setPassword("test123");
        userDao1.update(userToUpdate);*/

//        System.out.println(userDao1.read(1));
//
//        userDao1.delete(1);

        User[] all = userDao1.findAll();

        for (User u : all){
            System.out.println(u);
        }



    }
}
