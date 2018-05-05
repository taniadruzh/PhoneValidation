import lombok.ToString;

@ToString
public class PhoneValidation {
    private String phoneNumber;

    public PhoneValidation(String phoneNumber) {

        this.phoneNumber = checkNumber(phoneNumber);
    }

    private String checkNumber(String phoneNumber){
        phoneNumber = phoneNumber.replaceAll("\\D", "");
        phoneNumber = "+" + phoneNumber;
        return phoneNumber;
    }
}
