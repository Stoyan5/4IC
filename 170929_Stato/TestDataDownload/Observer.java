import java.util.concurrent.TimeUnit;


class Observer extends Thread {
    private Thread t;  
    Observer(Thread t, String name){
        super(name);
        this.t = t;
    }
    @Override
    public void run() {
        for(int i=0; i<10; i++){
            try {
                Reload();
                TimeUnit.MILLISECONDS.sleep(500);
            }catch(InterruptedException e) {
                System.out.println("it doesn't work");
            }
        }
    }	
    public void Reload(){
	System.out.println("The state of "+t.getName()+" is "+t.getState());
    }
}