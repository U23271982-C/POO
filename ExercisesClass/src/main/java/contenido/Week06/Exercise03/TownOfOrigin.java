package contenido.Week06.Exercise03;

public class TownOfOrigin {
    private String department;
    private String province;
    private String district;

    public TownOfOrigin(String department, String province, String district) {

        this.department = department;
        this.province = province;
        this.district = district;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
}
