package lab.lab4.zad3;

public enum UsersBase {
    Test1("1234"),
    ADMIN("qwerty"),
    UserName1("qgbxzxv"),
    UserName2("rdd");
    private String password;

    UsersBase(String pass) {
        this.password = pass;
    }

    public String getPassword(){
        return this.password;
    }
}
