package adapter_pattern.example;

public class UserInfo implements IUserInfo {
    @Override
    public String getUserName() {
        System.out.println("姓名");
        return null;
    }

    @Override
    public String getHomeAddress() {
        System.out.println("家庭地址");
        return null;
    }

    @Override
    public String getMobileNumber() {
        System.out.println("手机");
        return null;
    }

    @Override
    public String getOfficeTelNumber() {
        System.out.println("座机");
        return null;
    }

    @Override
    public String getJobPosition() {
        System.out.println("职位");
        return null;
    }

    @Override
    public String getHomeTelNumber() {
        System.out.println("家庭电话");
        return null;
    }
}
