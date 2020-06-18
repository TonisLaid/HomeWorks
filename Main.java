package AmirEric0613.dogAndCat;

// c) Create simple array of type Animal, that will contain one object of type Dog and
// one object of type Cat

// d) Using for each loop show which animal gives what kind of voice.

// How to print a name of an object?
/** This seems impossible */


public class Main {

    public static void main (String[]args){
            Animal[] animal = new Animal[2];
            animal[0] = new Cat();
            animal[1] = new Dog();
 //       System.out.println(Arrays.toString(animal));

            for (int i = 0; i<animal.length; i++){
                animal[i].yieldVoice();

            Dog dog = new Dog();

            }
        }
    }

