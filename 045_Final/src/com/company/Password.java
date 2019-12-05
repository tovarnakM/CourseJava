package com.company;

public class Password {

    private static final int key = 74455458;
    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encryptDecrypt(password);
    }

    private int encryptDecrypt(int password){
        return password ^ key;
    }

    public final void storePassword(){
        System.out.println("Storing password as " + this.encryptedPassword);
    }

    public boolean letMeIn(int password){
        if (encryptDecrypt(password) == this.encryptedPassword){
            System.out.println("Welcome");
            return true;
        }else {
            System.out.println("Something wrong");
            return false;
        }
    }
}
