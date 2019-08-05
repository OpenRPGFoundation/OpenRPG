package OpenRPG;

class DamageModifier {

    private float modifierValue;

    DamageModifier(){
        modifierValue = 0;
    }

    DamageModifier(float modifier){
        modifierValue = modifier;
    }


    int modify(int base){
     return (int)((float)base * modifierValue);
    }
}
