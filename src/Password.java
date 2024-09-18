public class Password {
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private boolean login = false;

    public void setLogin(boolean login) {
        this.login = login;
    }

    public boolean isLogin() {
        return login;
    }

    public boolean checkPassword(String data){
        if(data.length()>=8){
            boolean up = false, down = false;
            for (char c : data.toCharArray()){
                if (Character.isUpperCase(c)) {
                    up = true;
                } else if (Character.isLowerCase(c)) {
                    down = true;
                }
            }
            if (up == true && down == true){
                boolean digit = false, specsym = false;
                for (char c : data.toCharArray()){
                    if (Character.isDigit(c)) {
                        digit = true;
                    } else if (!Character.isLetterOrDigit(c)) {
                        specsym = true;
                    }
                }
                if (digit && specsym){
                    setPassword(data);
                    return true;
                } else {
                    System.out.println("Password must have digit and special symbol");
                    return false;
                }
            } else {
                System.out.println("Password must have Upper and Lower case");
                return false;
            }
        } else {
            System.out.println("Password must have more 8 symbol");
            return false;
        }
    }
}
