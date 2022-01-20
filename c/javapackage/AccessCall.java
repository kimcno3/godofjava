package c.javapackage;

import c.javapackage.sub.AccessModifier;

public class AccessCall{
    public static void main(String[] args){
        AccessModifier accessModifier = new AccessModifier();
        accessModifier.publicMethod();
        accessModifier.protectedMEthod();
        accessModifier.packagePrivateMethod();
        accessModifier.privateMethod();
    }
}