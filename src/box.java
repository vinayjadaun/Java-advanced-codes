// Generic class
 class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public static void main(String[] args) {
        // Using the generic class with Integer type
        Box<Integer> intBox = new Box<>();
        intBox.setItem(123);
        System.out.println("Integer Value: " + intBox.getItem());

        // Using the generic class with String type
        Box<String> strBox = new Box<>();
        strBox.setItem("Hello");
        System.out.println("String Value: " + strBox.getItem());
    }
}
