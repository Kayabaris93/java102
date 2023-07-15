package MyList;

public class MyList <T> {
    private int capacity;
    private T[] genericArray;
    private int sizeCount ;


    public MyList(){
        setCapacity(10);
        setGenericArray(new Object [getCapacity()]);
    }

    public MyList(int capacity) {
        setCapacity(capacity);
        setGenericArray(new Object[getCapacity()]);
    }


    public String toString(){

        String str = "";

        for (int i=0; i<size(); i++){
            if (getGenericArray()[i] instanceof Integer) {
                T num = getGenericArray()[i];
                str = str + Integer.toString((Integer)num)+" ";
            } else if (getGenericArray()[i] instanceof String) {
                str = str + getGenericArray()[i] + " ";
                
            }
        }

        return str;
    }


    public void add(T data){
        if (size()>getCapacity()){
            DoubleCapacity();
        }
        this.getGenericArray()[size()] = data;
        }



    public void DoubleCapacity(){
        setCapacity(getCapacity()*2);
    }


    public void remove(int index) {
        if (getGenericArray()[index] != null)
        {
            getGenericArray()[index] = null;
            for (int i = index + 1; i <= size(); i++) {
                getGenericArray()[i - 1] = getGenericArray()[i];
            }
        }
        else
            System.out.println("null");
    }


    public void set(int index, T data) {
        if (getGenericArray()[index] == null)
        {
            System.out.println("null");
        }
        getGenericArray()[index] = data;
    }


    public int size(){
        int count = 0;
        for (int i=0; i<getCapacity(); i++){
            if (getGenericArray()[i]!=null) {
                count++;
            }
        }
        return count;
    }








    public int getCapacity() {return capacity;}

    public void setCapacity(int capacity) { this.capacity = capacity; }

    public T[] getGenericArray() { return genericArray; }

    public void setGenericArray(Object[] array ) { this.genericArray = (T[]) array; }

    public int getSizeCount() { return sizeCount; }

    public void setSizeCount(int sizeCount) { this.sizeCount = sizeCount; }
}
