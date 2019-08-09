package OpenRPG;

public class Modifier {

    private float modifierValue;

    Modifier(){
        modifierValue = 1;
    }

    Modifier(float modifier){
        modifierValue = modifier;
    }


    int modify(int base){
     return (int)((float)base * modifierValue);
    }
}
