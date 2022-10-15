package L1;

class Producer extends Thread
{
	//Producer Producing the data in String buffer
	StringBuffer sB;
	
	//variable 
	boolean dataProvider = false;
	@Override
	public void run() {

		for (int i = 0; i <= 10; i++) {
			sB.append(i+ " : ");
			try 
			{
				Thread.sleep(100);
				System.out.println("appending");
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
////////////////////////////////////////////////////
class Consumer extends Thread
{
	Producer producer;
	
	public Consumer(Producer producer) {
		super();
		this.producer = producer;
	}


	@Override
	public void run() {
		while (producer.dataProvider == false) {
			
			try 
			{
				Thread.sleep(10);
			} 
			catch (InterruptedException e) 
			{
				
				e.printStackTrace();
			}
		}
		
		//Consumer the Data
		System.out.println(producer.sB);
	}
}


public class Communication 
{

	public static void main(String[] args) 
	{
		Producer obj1 = new Producer();
		Consumer obj2 = new Consumer(obj1);
		
		
		
		Thread t1 = new Thread(obj1); //producer thread
		Thread t2 = new Thread(obj2); //consumer thread
		
		t1.start();  // producer start
		t2.start(); // Consumer wait

	}

}

2:35
