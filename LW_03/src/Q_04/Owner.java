package Q_04;

public class Owner {
    private String ownerName;
    private String phoneNo;

    public Owner(String ownerName, String phoneNo){
        this.ownerName = ownerName;
        this.phoneNo = phoneNo;
    }

    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String name) {
        ownerName = name;
    }
    public String getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(String num) {
        phoneNo = num;
    }

}
