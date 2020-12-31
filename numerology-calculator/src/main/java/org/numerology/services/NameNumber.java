package org.numerology.services;


import static org.numerology.NumberUtils.convertIntoSingleDigit;

public class NameNumber {

    public int getFullNameCompoundValue(String full_name){
        String[] names = full_name.split(" ");
        int resutl = 0;
        for(String aName : names){
            resutl+= convertIntoSingleDigit(getNameValue(aName));
        }
       return resutl;
    }


    public int getNameValue(String name){
        int result=0;

        for(int i=0; i<name.length();i++){
            result+=getCharValue(name.charAt(i));
        }

        return result;
    }

    private int getCharValue(char charAt) {
        if (charAt=='A'||charAt=='I'||charAt=='J'||charAt=='Q'||charAt=='Y'||charAt=='a'||charAt=='i'||charAt=='j'||charAt=='q'||charAt=='y'){
            return 1;
        }
        else if(charAt=='B'||charAt=='b'||charAt=='K'||charAt=='k'||charAt=='R'||charAt=='r'){
            return 2;
        }
        else if(charAt=='C'||charAt=='c'||charAt=='L'||charAt=='l'||charAt=='S'||charAt=='s'||charAt=='G'||charAt=='g'){
            return 3;
        }
        else if(charAt=='D'||charAt=='d'||charAt=='M'||charAt=='m'||charAt=='T'||charAt=='t'){
            return 4;
        }
        else if(charAt=='e'||charAt=='E'||charAt=='H'||charAt=='h'||charAt=='N'||charAt=='n'||charAt=='X'||charAt=='x'){
            return 5;
        }
        else if(charAt=='U'||charAt=='u'||charAt=='V'||charAt=='v'||charAt=='W'||charAt=='w'){
            return 6;
        }
        else if(charAt=='O'||charAt=='o'||charAt=='Z'||charAt=='z'){
            return 7;
        }
        else if(charAt=='F'||charAt=='f'||charAt=='P'||charAt=='p'){
            return 8;
        }
        else
            return 0;
    }


}
