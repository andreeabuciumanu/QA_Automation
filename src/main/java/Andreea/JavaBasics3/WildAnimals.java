package Andreea.JavaBasics3;

public interface WildAnimals {

 void goHunt();
 void lickWounds();
 default boolean hasEyes(){
     return true;
 }
default Object returnObject(){
     return new Object();

}
}
