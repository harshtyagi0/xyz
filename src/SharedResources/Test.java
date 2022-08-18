package SharedResources;

import java.io.*;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Test {
	final static PipedOutputStream pipedOut = new PipedOutputStream();
	final static PipedInputStream pipedIn = new PipedInputStream();

	class PipedOutputThread implements Runnable
	{
		@Override
		public void run()
		{
			for (int i = 1; i <= 5; i++)
			{
				try
				{
					pipedOut.write(("Hello " + (i*(byte)25) + "\n").getBytes());
					Thread.sleep(1000);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

	class PipedInputThread implements Runnable
	{
		@Override
		public void run()
		{
			try
			{
				int i = 0;
				StringBuffer sb = new StringBuffer();
				while ((i = pipedIn.read()) != -1)
				{
					System.out.print((char)i);
					sb.append((char) i);
				}
				System.out.println("While ended"+sb.length());
				if(sb.toString().endsWith("100"))
					System.out.println(sb.toString());
				else {
					System.out.println("Chota ya bada");
				}
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args)
	{
		try
		{
			pipedOut.connect(pipedIn);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		ExecutorService service = Executors.newFixedThreadPool(2);
		Test pipedWriteReadDemo=new Test();
		service.execute(pipedWriteReadDemo.new PipedOutputThread());
		service.execute(pipedWriteReadDemo.new PipedInputThread());	
	}

	
//	public static void main(String[] args) throws IOException, InterruptedException {
//		
//		HashMap<String, Integer> result = new HashMap();
//
//		final PipedInputStream pipedInputStream = new PipedInputStream();
//		final PipedOutputStream pipedOutputStream = new PipedOutputStream();
//
//		/* Connect pipe */
//		pipedInputStream.connect(pipedOutputStream);
//
//		Thread pipeWriter = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
////				pipedOutputStream.write(byteArrayOutputStream.write(null));
////				pipedOutputStream.write(null);
//				
//				byte b = 100;
//				try {
//					pipedOutputStream.write(("abcd "+b).getBytes());
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
////				result.put("Harsh Tyagi", 95);
////				result.put("Harsh Nath", 100);
////				result.put("Prajkta", 100);
////				result.put("Saurabh", 100);
////				result.put("Sreepriya", 95);
////				result.put("Amita", 95);
//				
//			}
//		});
//
//		/* Thread for reading data from pipe */
//		Thread pipeReader = new Thread(new Runnable() {
//			@Override
//			public void run() {
////				ArrayList<String> name = new ArrayList();
////				name.addAll(Result.printCenturian(result));
////				for(String s:name) {
////					System.out.println(s);
////				}
//				
//				try
//				{
//					int i = 0;
//					StringBuffer sb = new StringBuffer();
//					while ((i = pipedInputStream.read()) != -1)
//					{
//						sb.append((char)i);
//					}
//					if(sb.toString().endsWith("100")) {
//						int index= sb.toString().indexOf("0");
//						System.out.println(sb.toString().split(" ", index-1));
//					}
//				}
//				catch (IOException e)
//				{
//					e.printStackTrace();
//				}
//			}
//		});
//
//		/* Start thread */
//		pipeWriter.start();
//		pipeReader.start();
//
//		/* Join Thread */
//		pipeWriter.join();
//		pipeReader.join();
//
//		/* Close stream */
//		pipedOutputStream.close();
//		pipedInputStream.close();
//
//	}

}
