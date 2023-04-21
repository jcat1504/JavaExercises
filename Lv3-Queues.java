Queue<String> queue = new LinkedList<String>();

	queue.offer("Karen"); //head
	queue.offer("Chad");
	queue.offer("Steve");
	queue.offer("Harold");//Tail

	queue.poll();//removes Karen cause the element is at Head
	queue.poll(); // removes Chad

System.out.println(queue);
// [Karen, Chad, Steve, Harold]