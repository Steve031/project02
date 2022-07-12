package GroupProject02;

    public class Registration {

        String email;
        String userName;
        String password;

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }


    }

    class RegistrationTester{
        public static void main(String[] args) {
            Registration reg=new Registration();
            reg.setEmail("Stevealba@yahoo.com");
            System.out.println("email: "+(reg.getEmail()));
            reg.setUserName("steve1234");
            System.out.println("username: "+reg.getUserName());
            reg.setPassword("alba4321");
            System.out.println("password: "+reg.getPassword());

        }
    }


