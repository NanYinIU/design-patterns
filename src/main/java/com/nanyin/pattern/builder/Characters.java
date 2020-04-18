package com.nanyin.pattern.builder;

/**
 * 角色构造器
 *
 * @Author nanyin
 * @Date 22:18 2019-06-01
 **/
public class Characters {
    // 角色构造器内有多个角色属性
    private String name;
    private int age;
    private String sex;
    private String skill;
    private String weapon;

    public Characters(CharacterBuilder builder) {
        this.name = builder.getName();
        this.age = builder.getAge();
        this.sex = builder.getSex();
        this.skill = builder.getSkill();
        this.weapon = builder.getWeapon();
    }

    public void showCharacterBoard(){
        System.out.println(" 人物 ： " + this.name + "\n 年龄 ：" + this.age + "\n 性别：" + this.sex + "\n 技能：" +this.skill + "\n 武器：" + this.weapon);
    }
}
