package StacksandQueues;

public class Stackdynamic extends Ownstack {
    public Stackdynamic() {
        super();
    }

    public Stackdynamic(int size) {
        super();
    }

    @Override
    public boolean push(int item) {
        if (isFull()) {
            int temp[] = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.push(item);
    }
}
