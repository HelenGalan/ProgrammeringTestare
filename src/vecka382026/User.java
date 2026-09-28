package vecka382026;



public class User {

    private String userName;
    private String password;
    private String typeOfUser;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.typeOfUser = "normal";
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String newUserName) {
        if (newUserName.length() >= 4) {
            this.userName = newUserName;
        }
    }

    public String getTypeOfUser() {
        return typeOfUser;
    }

    public void setTypeOfUser(String newTypeOfUser) {
        this.typeOfUser = newTypeOfUser;
    }
}
