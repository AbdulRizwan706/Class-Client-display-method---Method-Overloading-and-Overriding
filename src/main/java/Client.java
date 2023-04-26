import java.util.Stack;
// We can pass all data-types that supports looping over its data
// Write the code to print individual items of the passed data over separate lines
// Syntax requirements on display method
// display method should be static
// display method’s return type should be void
// display method will take one parameter of appropriate type that allows it to loop over data
public class Client {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);

        // Make a call to display method as per question requirements here
        display(st);

    }

    // Write the display method as per requirements of question here
    public static void display(Iterable<?> data) {
        for (Object item : data) {
            System.out.println(item);
        }
    }
    

}