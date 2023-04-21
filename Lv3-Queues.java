Queue<String> queue = new LinkedList<String>();

	queue.offer("Karen"); //head
	queue.offer("Chad");
	queue.offer("Steve");
	queue.offer("Harold");//Tail

	queue.poll();//removes Karen cause the element is at Head
	queue.poll(); // removes Chad

System.out.println(queue);
// [Karen, Chad, Steve, Harold]

//PRIORITY QUEUES
public static void main(String args[]) {
	Queue<Double> queue = new PriorityQueue<>();

//if you want reverse order:
//Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

		queue.offer(3.0);
		queue.offer(2.5);
		queue.offer(4.0);
		queue.offer(1.5);
		queue.offer(2.0);

	while(!queue.isEmpty()) {
		System.out.println(queue.poll());
		}
	}

//This will arrange elements in numerical order
public static void main(String args[]) {
	Queue<String> queue = new PriorityQueue<>(); 

//if you want reverse order:
//Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

		queue.offer("A");
		queue.offer("C");
		queue.offer("B");
		queue.offer("F");
		queue.offer("D");
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}


//will organize alphabetical order
