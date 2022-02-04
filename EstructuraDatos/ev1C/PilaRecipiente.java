package ev1C;

public class PilaRecipiente {
    private Recipiente data[];
    private int top;

    public PilaRecipiente(int capacidad) {
        data = new Recipiente[capacidad];
        top = -1;
    }

    public void push(Recipiente dato) {
        if (top + 1 < data.length) {
            data[++top] = dato;
        }
    }

    public Recipiente pop() {
        if (top == -1) {
            return null;
        } else {
            return data[top--];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }
}