public class Account {

    private String password;

    public void setPassword(String password){
        boolean isCorrect = false;

        if (password.length() >= 8){
            if ((password.matches(".*[0-9].*")) && password.matches(".*[a-z].*")
                    && password.matches(".*[A-Z].*")){
                    isCorrect = true;
            }
        }
        if (isCorrect){
            this.password = password;
        }else {
            this.password = "Your password is not safety, please try again";
        }
    }
    public String getPassword(){
        return this.password;
    }
}
