package day_35_Encapsulation;

public class Credentials {

    private String username, password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if ( !(isStrongPassWord(password))  ){
            System.err.println("Your password must be strong");
            System.exit(0);
        }
        this.password = password;
    }
    public boolean isStrongPassWord(String password){
        boolean result= true;
        if (password.length()<8||password.contains(" ")){
            result = false;
            return result;
        }
        int letter = 0, digit = 0, specialChar = 0;
        for (char each : password.toCharArray()){
            if (Character.isLetter(each)){
                letter += 1;
            }else if (Character.isDigit(each)){
                digit += 1;
            }else{
                specialChar += 1;
            }
        }
        if (letter<1||digit<1||specialChar<1){
            result = false;
            return result;
        }
        return result;
    }

    public Credentials(String username, String password) {
       setUsername(username);
       setPassword(password);
    }

    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

