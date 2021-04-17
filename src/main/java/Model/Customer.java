package Model;

public class Customer {
    private String name;
    private String surname;
    private String gender;
    private String birthday;
    private String city;
    private String province;
    private int zipcode;
    private String address;
    private int codid;
    private String email;
    private long telephone;
    private String webPage;


    public Customer(String name, String surname, String gender, String birthday,
                    String city, String province, int zipcode, String address,
                    int codid, String email, long telephone, String webPage) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthday = birthday;
        this.city = city;
        this.province = province;
        this.zipcode = zipcode;
        this.address = address;
        this.codid = codid;
        this.email = email;
        this.telephone = telephone;
        this.webPage = webPage;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

    public int getZipcode() {
        return zipcode;
    }

    public String getAddress() {
        return address;
    }

    public int getCodid() {
        return codid;
    }

    public String getEmail() {
        return email;
    }

    public String getWebPage() {
        return webPage;
    }

    public long getTelephone() {
        return telephone;
    }
}
