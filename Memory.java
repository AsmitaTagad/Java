public class Memory {

    class Person { // non-static inner class
        String name = "Asmita";
        int age = 27;

        void intro() {
            System.out.println("My Name is " + this.name + " and age of " + this.age);
        }
    }

    public static void main(String[] arg) {

        // First create outer class instance
        Memory m = new Memory();                       

        // Then create inner class instance
        Person p = m.new Person();

        p.intro();
    }
}


// how this will work?

// 1. instance created of class Memory (object) & then reference of memory in stack and then create place in heap ( object memory).
// 2. then person reference p stored in the stack and refere to the object person stored the the heap now this person object will contain key values like age:27, name:Asmita and will create function in method area.
//Ex : m --> memory object
//p ---> person={
    // age : 27
    //name: "Asmita"
    // outer-this = reference to @A123 (Memory object)  --> Methods in Method Area
// }

