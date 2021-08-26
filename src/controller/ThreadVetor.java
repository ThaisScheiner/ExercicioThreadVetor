package controller;

public class ThreadVetor extends Thread
{
	private int vetThread[] = new int [1000];
	private  int num;
	
	public ThreadVetor( int vetThread[]) {
		this.vetThread = vetThread;
	}
	
	@Override
	public void run() {
		vetTempo();
	}
	
	public void vetTempo()
	{
		double tempoInicial = System.nanoTime();
		
		if(num % 2 == 0)
		{
			for(int i = 0; i < vetThread.length; i++ )
			{
				
			}
			
		}
		else 
		{
			for(int j : vetThread)
			{
				j = j + 0;
			}
		}
		
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		
		tempoTotal = tempoTotal / Math.pow(10, 9);
		
		System.out.println("TID #"+ getId() + " tempo ==> " + tempoTotal + "s.");
	}
	
	
	
}
