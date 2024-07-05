package fr.sirine.ma_cuisine_maison.email;

import lombok.Getter;

@Getter
public enum EmailTemplateName {

    ACTIVATE_ACCOUNT("activate_account");
    private final String name;


    EmailTemplateName(String name) {
        this.name = name;
    }
}
