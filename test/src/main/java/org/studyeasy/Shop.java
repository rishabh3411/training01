package org.studyeasy;

public class Shop {
    Lock lock =new Lock();

    public Lock getLock() {
        return lock;
    }

    public void shopstatus(){
        if (lock.isLocking()){
            System.out.println("shop is closed");
        }else {
            System.out.println("shop is open");
        }

    }

     public class Lock{
         public boolean locking = true;

         public boolean isLocking() {
             return locking;
         }

         public void setLocking(boolean locking) {
             this.locking = locking;
         }
     }
}
