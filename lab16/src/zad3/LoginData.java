package zad3;

public class LoginData {
    private String service;
    private String name;
    private String password;

    public LoginData(String service, String name, String password) {
        this.service = service;
        this.name = name;
        this.password = password;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoginData that = (LoginData) o;
        return service.equals(that.service) &&
                name.equals(that.name) &&
                password.equals(that.password);
    }
}
