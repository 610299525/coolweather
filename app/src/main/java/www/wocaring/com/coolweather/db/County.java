package www.wocaring.com.coolweather.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {

    private int id;

    //县名字
    private String countyName;

    //对应天气的编号
    private String weatherId;

    //县所属市的编号
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
