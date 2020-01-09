package com.tiger.totem.model;

/**
 * @Author tiger_xi
 * @Date 2020/1/4
 * @Description: ...
 **/
public class UserVO {
    /**主键**/
    private Integer id;
    /**姓名**/
    private String name;
    /**年龄**/
    private String age;
    /**电话**/
    private String telephone;
    /**性别 0男 1女**/
    private String gender;
    /**身份证**/
    private String idNumber;
    /**住址**/
    private String address;
    /**学历 0学士 1硕士 2博士 3博士以上 4其他**/
    private String eduBg;
    /**帐号**/
    private String account;
    /**密码**/
    private String password;
    /**创建时间**/
    private String createDate;
    /**修改时间**/
    private String modDate;
    /**状态 1在用 0停用**/
    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEduBg() {
        return eduBg;
    }

    public void setEduBg(String eduBg) {
        this.eduBg = eduBg;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getModDate() {
        return modDate;
    }

    public void setModDate(String modDate) {
        this.modDate = modDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", telephone='" + telephone + '\'' +
                ", gender='" + gender + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", address='" + address + '\'' +
                ", eduBg='" + eduBg + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", createDate='" + createDate + '\'' +
                ", modDate='" + modDate + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
