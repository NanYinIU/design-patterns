package com.nanyin.pattern.builder;

import org.junit.jupiter.api.Test;

public class App {
    @Test
    public void testBuildCharacter(){
        Characters characters = new CharacterBuilder()
                .buildBasicAttributes("jack",18,"man")
                .buildSkill("Emission laser")
                .billdWeapon("Laser Cannon")
                .build();
        characters.showCharacterBoard();
    }
}
