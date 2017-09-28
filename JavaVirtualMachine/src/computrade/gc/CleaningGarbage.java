package computrade.gc;

public class CleaningGarbage {

        public static void main(String[] args) throws InterruptedException {
        	
                long mAfterObjectCreation, mAfterGC;

                // Get a runtime instance
                Runtime rt = Runtime.getRuntime();
                System.out.println("Maximum memory is:" + rt.maxMemory()/1024/1024 +"M");
                System.out.println("Total memory is:" + rt.totalMemory()/1024/1024 +"M");
                System.out.println("Free memory is:" + rt.freeMemory()/1024 +"K");
 
                // Create some objects
                createObjects(100000);

                // Get free memory
                mAfterObjectCreation =  rt.freeMemory();
                System.out.println("Free memory after creating 100,000 objects is:"
                                    + mAfterObjectCreation/1024 +"K");    

                // Invoke garbage collection
                System.gc();
                Thread.sleep(1000);
                // Get free memory after GC
                mAfterGC =  rt.freeMemory();
                System.out.println("Free memory after GC:"
                        + mAfterGC/1024 +"K");
                System.out.println("Memory freed by gc()=" + (mAfterGC - mAfterObjectCreation)/1024 + "K");

        }

        public static void createObjects(int count) {
                for(int i = 0; i < count; i++) {
                        // Object's references are not stored, so they are
                        // immediately eligible for garbage collection.
                        new Object();
                }
        }
}


