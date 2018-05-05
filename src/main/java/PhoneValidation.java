import lombok.ToString;

@ToString
public class PhoneValidation {
    private String phoneNumber;

    public PhoneValidation(String phoneNumber) {

        phoneNumber = prepareNumber(phoneNumber);
        checkNumber(phoneNumber);

    }

    private String prepareNumber(String phoneNumber){
        phoneNumber = phoneNumber.replaceAll("\\D", "");
        phoneNumber = "+" + phoneNumber;
        return phoneNumber;
    }

    private String checkNumber(String phoneNumber) throws RuntimeException{
        if(phoneNumber.contains("+0"))  throw new RuntimeException();
    }
}
