/**
 * The class ArrayList
 *
 * @author  Jake Tawney
 * @version 3/10/2019
 */

public class ArrayList{
    private int[] data;
    private int last; //index of the last element
    
    //set initial capacity to 10
    public ArrayList(){
        data = new int[10];
        last = -1;  //fix
    }

    //returns the number of elements in the list (not the capacity)
    public int size(){
        return last+1; 
    }

    //Precondition: 0 <= index <= last
    //return the element at that index
    public int get(int index){
        return data [index];
    }

    //Precondition:  0 <= index <= last
    //sets the value at index to the newValue
    public void set(int index, int newValue){
        data [index] = newValue;
    }

    //Precondition:  0 <= index <= last
    //value at index is removed from the list – all elements shift down
    //returns removed value
    public int remove(int index){
       int j=data[index];
        for (int i=index; i<last; i++){
            
            data[i]= data[i+1];
        }
        last= last-1;
        return j;
    }
    //Precondition:  0 <= index <= last+1
    //Inserts newValue at index.  Everything from index on gets shifted up
     public void add(int index, int newValue){
        if (last==data.length-1){
            resize ();
        }
        for (int i=last+1; i>index; i--){
            data[i]=data[i-1];
        }
        data[index]=newValue;
        last=last+1;
    }
   
    //adds newValue to the end of the list
    public void add(int newValue){
        this.add(last+1,newValue); 
    }

    //private method means "not accessible outside the class"
    //This is intentional.
    //This method should double the capacity
    private void resize(){
        int newSize= data.length*2;
        int [] temp = new int [newSize]; 
        for (int i=0; i<data.length; i++){
            temp [i]= data [i];
        }
        data=temp;
    }

    //returns, for example, "[3, 6, 7, 9]"
    //This will be helpful for your debugging
    public String toString(){
        String dataString="[" ;
        for (int i=0; i<last; i++){
            dataString= dataString +  data[i] +", " ;
        }
        if (last==-1){
            return dataString + "]";
        }
        return dataString +data [last] +"]";
    }

    //returns true if two lists have exactly the same elements
    //in exactly the same order
    public boolean equals(ArrayList otherList){
        if (otherList.size()!=this.size()){
            return false;
        }
        else{
           for (int i=0; i<otherList.size(); i++){
               if (otherList.get(i)!= this.get(i)){
                   return false;
               }
            
            }
           return true;
        }
    }
}
