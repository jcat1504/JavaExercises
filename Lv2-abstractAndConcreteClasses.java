
// **Java Abstraction vs. Concrete Classes**

// - Not all Java types implement all their methods
// - **Abstraction**: Allows us to think in more general terms about the domain we’re trying to model. It refers to the **concept of hiding the implementation details of an object and exposing only the necessary information or functionality to the outside world**
//     - it is key principle of OOP and implemented through various mechanisms such as: *abstract classes, interfaces and encapsulation*
//     - It allows developers to focus on essential features of an object and ignore the details that are not relevant for its use, *leading to simpler and more maintainable code*
// - In Java, we can achieve abstraction through using interfaces and abstract classes
// - **Interface**: Blueprint for a class — or other words, collection of unimplemented method signatures

interface Drivable {
	void honk();
	void drive();
}

// - Because Drivable has unimplemented methods, we can’t instantiate it with *new* keyword
//     - But! Concreate classes like Car can implement these methods

// **Abstract Classes**

// - **It is a class that has unimplemented classes**, though can actually have both

public abstract class Vehicle {
	public abstract String honk();
	public String drive() {
		return "zooom!";
	}
}

// If we wanted to have several types of file readers, we might create an abstract class that encapsulates what’s common to file reading:
public abstract class BaseFileReader {
	protected Path filePath;
	protected BaseFileReader(Path filePath) {
		this.filePath = filePath;
		}

	public Path getFilePath() {
		return filePath;
		}
	public List<String> readFile() throws IOException {
		return Files.lines(filePath)
		.map(this.mapFileLine).collect(Collectors.toList());
		}
	protected abstract String mapFileLine(String line);
}

// **Defining Subclasses**

// A natural implementation is probably one that converts a file's contents to lowercase:

public class LowercaseFileReader(Path filePath) {
	public LowercaseFileReader(Path filePath) {
		super(filePath);
	}

@Override
public String mapFileLine(String line) {
	return line.toLowerCase();
		}
}

//This one converts file’s contents to uppercase

public class UppercaseFileReader extends BaseFileReader {
	public UppercaseFileReader(Path filePath) {
		super(filePath);
	}

@Override
public String mapFileLine(String line) {
	return line.toUpperCase();
	}
}


//Using a Subclass
@Test
public void givenLowercaseFileReaderInstance_whenCalledreadFile_thenCorrect() throws Exception {
    URL location = getClass().getClassLoader().getResource("files/test.txt")
    Path path = Paths.get(location.toURI());
    BaseFileReader lowercaseFileReader = new LowercaseFileReader(path);
        
    assertThat(lowercaseFileReader.readFile()).isInstanceOf(List.class);
}