package com.nanyin.pattern.builder;
/**
 * 角色构造器
 * @Author nanyin
 * @Date 22:18 2019-06-01
 **/
public class CharacterBuilder {
    // 角色构造器内有多个角色属性
    private String name;
    private int age;
    private String sex;
    private String skill;
    private String weapon;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getSkill() {
        return skill;
    }

    public String getWeapon() {
        return weapon;
    }

    public CharacterBuilder buildBasicAttributes(String name , int age, String sex){
        if(name == null || "".equals(name)){
            throw new IllegalArgumentException("name can not be empty ");
        }else {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
        return this;
    }

    public CharacterBuilder buildSkill(String skill){
        this.skill = skill;
        return this;
    }

    public CharacterBuilder billdWeapon(String weapon){
        this.weapon = weapon;
        return this;
    }

    public Characters build(){
        return new Characters(this);
    }

}
