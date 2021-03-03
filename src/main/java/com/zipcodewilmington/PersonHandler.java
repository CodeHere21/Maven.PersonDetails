package com.zipcodewilmington;

//import com.sun.org.apache.xpath.internal.operations.String;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        StringBuilder stringRepresentation = new StringBuilder();
        int counter = 0;
        while (counter < personArray.length){
            Person currentPerson =personArray[counter];
            stringRepresentation.append(currentPerson);
            counter ++;
        }
        String output = stringRepresentation.toString();
        // create a `counter`
        // while `counter` is less than length of array
            // begin loop

                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

            // end loop
        return output;
    }

    public String forLoop() {
        StringBuilder stringRepresentation = new StringBuilder();
        int counter = 0;
        for(counter=0; counter< personArray.length;counter++)
        {
            Person currentPerson= personArray[counter];
            stringRepresentation.append(currentPerson);
        }
        String output=stringRepresentation.toString();
        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return output;
    }



    public String forEachLoop() {
        StringBuilder stringRepresentation = new StringBuilder();
        int counter = 0;
        for(counter=0;counter< personArray.length;counter++){
            Person currentPerson=personArray[counter];
            stringRepresentation.append(currentPerson);
        }
        String output=stringRepresentation.toString();
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return output;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
