public class Array {
    public int length =0;
    public String[] data;

    public Array() {
        this.data = new String[10];  // Initial capacity of 10, for example
    }
    
    public String get(int index){
        return this.data[index];
    }
    public int push(String item){
        this.data[this.length] = item;  // No need for String.valueOf(item)
        this.length++;
        return this.length;
    }
    public String pop(){
        if (this.length == 0) {
            throw new IllegalStateException("Cannot pop from an empty array.");
        }

        String lastItem = this.data[this.length - 1];
        this.data[this.length - 1] = null;  // Clearing the reference to help garbage collection
        this.length--;

        return lastItem;
    }

    public static void main ( String[] args ) {
        Array arr = new Array();
        arr.push("hi");
        arr.push("you");
        arr.push("!");
        arr.pop();
        arr.pop();
        System.out.println(arr.get(0));

    }
}
