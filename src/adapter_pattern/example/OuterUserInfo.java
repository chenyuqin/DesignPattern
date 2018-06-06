package adapter_pattern.example;

import java.util.Map;

public class OuterUserInfo extends OuterUser implements IUserInfo {

    private Map baseInfo = super.getUserBaseInfo();
    private Map homeInfo = super.getUserHomeInfo();
    private Map officeInfo = super.getUserOfficeInfo();

    @Override
    public String getUserName() {
        String userName = (String)this.baseInfo.get("userName");
        System.out.println(userName);
        return userName;
    }

    @Override
    public String getHomeAddress() {
        return null;
    }

    @Override
    public String getMobileNumber() {
        return null;
    }

    @Override
    public String getOfficeTelNumber() {
        return null;
    }

    @Override
    public String getJobPosition() {
        return null;
    }

    @Override
    public String getHomeTelNumber() {
        return null;
    }
}
