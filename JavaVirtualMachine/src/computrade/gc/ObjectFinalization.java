package computrade.gc;

public class ObjectFinalization {

    // id is used to identify the object
    private int id;

    // Constructor which takes the id as argument
    public ObjectFinalization(int id){
            this.id = id;
    }

    
    @Override
    // The JVM will call this method, before the object is garbage collected
    public void finalize(){
            // Print a message indicating which object is being garbage collected.
            if (id % 10000 == 0) {
                System.out.println ("finalize() called for " + id ) ;
            }
    }

    public static void main(String[] args) throws InterruptedException {
            // Create 500,000 objects of the Finalizer class
            for(int i = 1; i <= 500000; i++){
                 // Do not store reference to the new object
                 new ObjectFinalization(i);
            }

            // Invoke the garbage collector
            System.gc();
            Thread.sleep(2000);
    }
}
